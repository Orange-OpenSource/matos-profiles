package com.francetelecom.rd.stubs.engine;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2008 - 2014 Orange SA
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Interface with a database containing all the versions of Android.
 * @author Pierre Cregut
 *
 */
/**
 * @author Pierre Cregut
 *
 */
public class VersionDatabase {
	/**
	 * URL Schema to open a database with the sqlite back-end
	 */
	final static String JDBC_SCHEME = "jdbc:sqlite:";

	/**
	 * Name of the class to load to use the sqlite back-end
	 */
	final static String JDBC_CLASS = "org.sqlite.JDBC";

	final static String SUFFIX = "";

	final static String [] CREATION = {
		"CREATE TABLE package (package_id INTEGER PRIMARY KEY, package_name VARCHAR(100) UNIQUE)",
		"CREATE TABLE version (version_id INTEGER PRIMARY KEY, version_name VARCHAR(20) UNIQUE)",
		"CREATE TABLE class (class_id INTEGER PRIMARY KEY, class_name VARCHAR(100), package_id INTEGER)",
		"CREATE TABLE class_version (class_id INTEGER, version_id INTEGER)",
		"CREATE TABLE element (element_id INTEGER PRIMARY KEY, element_name VARCHAR(30), class_id INTEGER, type_id INTEGER)",
		"CREATE TABLE element_version (element_id INTEGER, version_id INTEGER)",
		"CREATE TABLE type (type_id INTEGER PRIMARY KEY, type VARCHAR(1000) UNIQUE)",
		"CREATE INDEX package_index ON package(package_name)",
		"CREATE INDEX class_index ON class(package_id, class_name)",
		"CREATE UNIQUE INDEX class_version_index ON class_version(class_id, version_id)",
		"CREATE INDEX element_index ON element(class_id, element_name, type_id)",
		"CREATE UNIQUE INDEX element_version_index ON element_version(element_id, version_id)",
		"CREATE INDEX type_index ON type (type)"
	};

	final static String INSERT_PACKAGE = "INSERT OR IGNORE INTO package (package_name) VALUES (?);";
	final static String INSERT_VERSION = "INSERT OR IGNORE INTO version (version_name) VALUES (?);";
	final static String INSERT_TYPE = "INSERT OR IGNORE INTO type (type) VALUES (?);";
	final static String INSERT_CLASS = "INSERT INTO class (class_name,package_id) SELECT ?,?  WHERE NOT EXISTS (SELECT 1 FROM class WHERE class_name=? AND package_id = ?);";
	final static String INSERT_ELEMENT = "INSERT INTO element (element_name,class_id,type_id) SELECT ?,?,?  WHERE NOT EXISTS (SELECT 1 FROM element WHERE element_name=? AND class_id = ? AND type_id = ?);";

	final static String FIND_PACKAGE = "SELECT package_id FROM package WHERE package_name = ?;";
	final static String FIND_VERSION = "SELECT version_id FROM version WHERE version_name = ?;";
	final static String FIND_TYPE = "SELECT type_id FROM type WHERE type = ?;";
	final static String FIND_CLASS = "SELECT class_id FROM class WHERE class_name = ? and package_id = ?;";
	final static String FIND_ELEMENT = "SELECT element_id FROM element WHERE element_name = ? and class_id = ? and type_id = ?;";

	final static String INSERT_CLASS_VERSION = "INSERT OR IGNORE INTO class_version (class_id, version_id) VALUES (?,?);";
	final static String INSERT_ELEMENT_VERSION = "INSERT OR IGNORE INTO element_version (element_id, version_id) VALUES (?,?);";
	final static String FIND_CLASS_VERSION = "SELECT version_name FROM version WHERE version_id NOT IN (SELECT version_id FROM class_version WHERE class_id = ?);";
	final static String FIND_ELEMENT_VERSION = "SELECT version_name FROM version WHERE version_id NOT IN (SELECT version_id FROM element_version WHERE element_id = ?);";

	final static String FIND_VERSION_LIST = "SELECT version_name FROM version;";
	final static String FIND_PACKAGE_VERSIONS_STATS = "SELECT version_name, count(class.class_id) FROM class, class_version, version WHERE class.class_id=class_version.class_id AND class_version.version_id=version.version_id AND package_id=? GROUP BY version_name;";
	final static String FIND_PACKAGE_TOTAL_CLASSES = "SELECT count(class_id) FROM class WHERE package_id=?;";

	final PreparedStatement insert_package_statement;
	final PreparedStatement insert_version_statement;
	final PreparedStatement insert_type_statement;
	final PreparedStatement insert_class_statement;
	final PreparedStatement insert_element_statement;

	final PreparedStatement find_package_statement;
	final PreparedStatement find_version_statement;
	final PreparedStatement find_type_statement;
	final PreparedStatement find_class_statement;
	final PreparedStatement find_element_statement;

	final PreparedStatement insert_class_version_statement;
	final PreparedStatement insert_element_version_statement;
	final PreparedStatement find_class_version_statement;
	final PreparedStatement find_element_version_statement;

	final PreparedStatement find_version_list_statement;
	final PreparedStatement find_package_version_stats_statement;
	final PreparedStatement find_package_total_classes_statement;

	final static int MASK = Modifier.PUBLIC | Modifier.PROTECTED;

	private HashMap<Class<?>, Integer> classmap = new HashMap<Class<?>, Integer>();
	private HashMap<String, Integer> packagemap = new HashMap<String, Integer>();
	private HashMap<String, Integer> typemap = new HashMap<String, Integer>();

	/**
	 * Prefix added to version number for hidden element.
	 */
	public final static String HIDDEN_PREFIX = "h";

	/**
	 * Prefix added to version number for visible element.
	 */
	public final static String VISIBLE_PREFIX = "v";

	/**
	 * Database connection.
	 */
	Connection con;
	/**
	 * Meta-data access on the connection and the database.
	 */
	DatabaseMetaData metadata;

	/**
	 * Relocator
	 */
	final private ReflexUtil rf;

	/**
	 * Current version to add
	 */
	int versionId;

	/**
	 * @param dbName The name of the database file to open
	 * @param rf a relocator.
	 * @throws SQLException 
	 */
	public VersionDatabase(String dbName, ReflexUtil rf) throws SQLException {
		this.rf = rf;
		try { Class.forName(JDBC_CLASS);	} 
		catch (ClassNotFoundException e) { assert false; }
		con = DriverManager.getConnection(JDBC_SCHEME + dbName + SUFFIX);
		metadata = con.getMetaData();
		init();

		insert_package_statement = con.prepareStatement(INSERT_PACKAGE);
		insert_class_statement = con.prepareStatement(INSERT_CLASS);
		insert_element_statement = con.prepareStatement(INSERT_ELEMENT);
		insert_version_statement = con.prepareStatement(INSERT_VERSION);
		insert_type_statement = con.prepareStatement(INSERT_TYPE);
		insert_class_version_statement = con.prepareStatement(INSERT_CLASS_VERSION);
		insert_element_version_statement = con.prepareStatement(INSERT_ELEMENT_VERSION);

		find_package_statement = con.prepareStatement(FIND_PACKAGE);
		find_class_statement = con.prepareStatement(FIND_CLASS);
		find_element_statement = con.prepareStatement(FIND_ELEMENT);
		find_version_statement = con.prepareStatement(FIND_VERSION);
		find_type_statement = con.prepareStatement(FIND_TYPE);
		find_class_version_statement = con.prepareStatement(FIND_CLASS_VERSION);
		find_element_version_statement = con.prepareStatement(FIND_ELEMENT_VERSION);

		find_version_list_statement = con.prepareStatement(FIND_VERSION_LIST);
		find_package_version_stats_statement = con.prepareStatement(FIND_PACKAGE_VERSIONS_STATS);
		find_package_total_classes_statement = con.prepareStatement(FIND_PACKAGE_TOTAL_CLASSES);
	}

	/**
	 * Start the asynchronous mode
	 */
	public void open_transaction() {
		try {
			con.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Commit in asynchronous mode.
	 */
	public void close_transaction() {
		try {
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private boolean hasTable(String tableName) {
		try {
			return 	metadata.getTables(null, null, tableName, null).next();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	private void init() throws SQLException {
		if (!hasTable("package")) {
			Statement stmt = con.createStatement();
			try {
				for (String line : CREATION) {
					stmt.executeUpdate(line);
				}
			} catch (SQLException e) {
				stmt.close();
				throw e;
			}
			stmt.close();
		}
	}

	private int addOrFindPackage(String name, boolean add) {
		Integer i = packagemap.get(name);
		int id;
		ResultSet rs = null;
		if (i != null) return i;
		try {
			if (add) {
				insert_package_statement.setString(1, name);
				insert_package_statement.execute();
			}
			find_package_statement.setString(1,name);
			rs = find_package_statement.executeQuery();
			id = (rs.next()) ? rs.getInt(1) : -1;
			packagemap.put(name, id);
		} catch (SQLException e) { 
			e.printStackTrace();
			id = -1; }
		if (rs != null) { try {rs.close();} catch (SQLException e) {ignore();}}
		return id;
	}

	private int addOrFindVersion(String name, boolean add) {
		int id;
		ResultSet rs = null;
		try {
			if (add) {
				insert_version_statement.setString(1, name);
				insert_version_statement.execute();
			}
			find_version_statement.setString(1,name);
			rs = find_version_statement.executeQuery();
			id = (rs.next()) ? rs.getInt(1) : -1;
			rs.close();

		} catch (SQLException e) { e.printStackTrace(); id = -1; }
		if (rs != null) { try {rs.close();} catch (SQLException e) {ignore();}}
		return id;
	}

	/**
	 * Set the current version value that will be used when we register classes (and their components) in the system.
	 * @param name
	 */
	public void setVersion(String name) {
		versionId = addOrFindVersion(name, true);
	}

	private int addOrFindType(String type, boolean add) {
		int id;
		ResultSet rs = null;
		Integer i = typemap.get(type);
		if (i != null) return i;
		try {
			if (add) {
				insert_type_statement.setString(1, type);
				insert_type_statement.execute();
			}
			find_type_statement.setString(1,type);
			rs = find_type_statement.executeQuery();
			id = (rs.next()) ? rs.getInt(1) : -1;
			typemap.put(type,id);
		} catch (SQLException e) { e.printStackTrace(); id = -1; }
		if (rs != null) { try {rs.close();} catch (SQLException e) {ignore();}};
		return id;
	}


	private int addOrFindClass(Class <?> clazz, boolean add) {
		int id;
		ResultSet rs = null;
		Integer i = classmap.get(clazz);
		if (i != null) return i;
		try {
			String packageName = packageName(clazz);
			String className = className(clazz);
			int packageId = addOrFindPackage(packageName, add);
			if (packageId == -1) return -1;
			if (add) {
				insert_class_statement.setString(1, className);
				insert_class_statement.setInt(2, packageId);
				insert_class_statement.setString(3, className);
				insert_class_statement.setInt(4, packageId);
				insert_class_statement.execute();
			}
			find_class_statement.setString(1,className);
			find_class_statement.setInt(2, packageId);
			rs = find_class_statement.executeQuery();
			id = (rs.next()) ? rs.getInt(1) : -1;
			classmap.put(clazz, id);
		} catch (SQLException e) { e.printStackTrace(); id = -1; }
		if (rs != null) { try {rs.close();} catch (SQLException e) {ignore();}};
		return id;
	}

	private int addOrFindElement(String name, String type, Class <?> clazz, boolean add) {
		int id;
		ResultSet rs = null;
		try {
			int clazzId = addOrFindClass(clazz, add);
			int typeId = addOrFindType(type, add);
			if (clazzId == -1 || typeId == -1) return -1;
			if (add) {
				insert_element_statement.setString(1, name);
				insert_element_statement.setInt(2, clazzId);
				insert_element_statement.setInt(3, typeId);
				insert_element_statement.setString(4, name);
				insert_element_statement.setInt(5, clazzId);
				insert_element_statement.setInt(6, typeId);
				insert_element_statement.execute();
			}
			find_element_statement.setString(1,name);
			find_element_statement.setInt(2, clazzId);
			find_element_statement.setInt(3, typeId);
			rs = find_element_statement.executeQuery();
			id = (rs.next()) ? rs.getInt(1) : -1;
		} catch (SQLException e) { e.printStackTrace(); id = -1; }
		if (rs != null) { try {rs.close();} catch (SQLException e) {ignore();}};
		return id;
	}

	private int addMethod(Method meth) {
		return addOrFindElement(meth.getName(), signature(meth), meth.getDeclaringClass(), true);
	}

	private int addMethod(Method meth, Class <?> target) {
		return addOrFindElement(meth.getName(), signature(meth), target, true);
	}

	private int addConstructor(Constructor <?> co) {
		return addOrFindElement("<init>", signature(co), co.getDeclaringClass(), true);
	}

	private int addConstructor(Constructor <?> co, Class <?> target) {
		return addOrFindElement("<init>", signature(co), target, true);
	}

	private int addField(Field fi) {
		return addOrFindElement(fi.getName(), signature(fi), fi.getDeclaringClass(), true);
	}

	private int addField(Field fi, Class <?> target) {
		return addOrFindElement(fi.getName(), signature(fi), target, true);
	}

	/**
	 * Add a class version info
	 * @param c
	 * @return
	 */
	private boolean addVersion(Class <?> c) {
		int classId = addOrFindClass(c, true);
		try {
			insert_class_version_statement.setInt(1, classId);
			insert_class_version_statement.setInt(2, versionId);
			insert_class_version_statement.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	private boolean addVersion(int elementId) {
		try {
			insert_element_version_statement.setInt(1, elementId);
			insert_element_version_statement.setInt(2, versionId);
			insert_element_version_statement.execute();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	/**
	 * Add a method version info
	 * @param meth
	 * @return
	 */
	private boolean addVersion(Method meth) {
		return addVersion(addMethod(meth));
	}

	private boolean addVersion(Method meth, Class <?> target) {
		return addVersion(addMethod(meth, target));
	}

	/**
	 * Add a constructor version info
	 * @param co
	 * @return
	 */
	private boolean addVersion(Constructor <?> co) {
		return addVersion(addConstructor(co));
	}

	private boolean addVersion(Constructor <?> co, Class<?> target) {
		return addVersion(addConstructor(co, target));
	}

	/**
	 * Add a field version info.
	 * @param fi
	 * @return
	 */
	private boolean addVersion(Field fi) {
		return addVersion(addField(fi));
	}

	private boolean addVersion(Field fi, Class<?> target) {
		return addVersion(addField(fi, target));
	}

	/**
	 * Register a class in the system (it should be a top level class). Versions are added for
	 * all the components according to the currently set version.
	 * @param clazz
	 */
	public void registerClass(Class <?> clazz) {
		addVersion(clazz);
		for(Field field: clazz.getDeclaredFields()) addVersion(field); 
		for (Class <?> subclass : clazz.getDeclaredClasses()) registerClass(subclass);
		for (Constructor <?> co : clazz.getDeclaredConstructors()) addVersion(co); 
		for (Method me : clazz.getDeclaredMethods()) addVersion(me);

		Class <?> superClass = clazz.getSuperclass();
		if (superClass != null) registerClass(superClass, clazz);
	}

	private void registerClass(Class <?> clazz, Class <?> target) {

		for(Field field: clazz.getDeclaredFields()) {
			if ((field.getModifiers() & MASK) != 0) addVersion(field,target); 
		}
		for (Constructor <?> co : clazz.getDeclaredConstructors()) {
			if ((co.getModifiers() & MASK) != 0) addVersion(co,target); 
		}
		for (Method me : clazz.getDeclaredMethods()) {
			if ((me.getModifiers() & MASK) != 0) addVersion(me,target);
		}

		Class <?> superClass = clazz.getSuperclass();
		if (superClass != null) registerClass(superClass, target);

	}

	private String packageName(Class <?> c) {
		return rf.restoreString(ReflexUtil.getPackageName(c));
	}

	private String className(Class <?> c) { 
		String fullname = c.getName();
		return fullname.substring(fullname.lastIndexOf('.') + 1);
	}

	private String signature(Field f) {
		return rf.restoreString (f.getType().toString());
	}

	private String signature(Method m) {
		return signature(m.getParameterTypes()) + rf.restoreString(m.getReturnType().toString()); 
	}

	private String signature(Constructor<?> co) {
		return signature(co.getParameterTypes());
	}

	private String signature(Class<?>[] args) {
		StringBuilder buf = new StringBuilder("(");
		boolean first = true;
		for (Class <?> arg : args) {
			if (first) first = false;
			else buf.append(",");
			buf.append(rf.restoreString(arg.toString()));
		}
		buf.append(")");
		return buf.toString();
	}

	/**
	 * Closes the database.
	 * @throws SQLException
	 */
	public void close() throws SQLException {
		con.close();
	}

	/**
	 * Gives back the list of defined version for a class or interface
	 * @param c
	 * @return
	 */
	public List <String> missingVersionsOf (Class <?> c) {
		ArrayList <String> result = new ArrayList<String>();
		ResultSet rs = null;
		try {
			int class_id = addOrFindClass(c, false);
			find_class_version_statement.setInt(1, class_id);
			rs = find_class_version_statement.executeQuery();
			while(rs.next()) {
				result.add(rs.getString(1));
			}
		} catch (SQLException e) { e.printStackTrace(); }
		if (rs != null) { try {rs.close();} catch (SQLException e){ignore();}}
		return result;
	}

	private List <String> missingVersionsOfElement (int element_id) {
		ArrayList <String> result = new ArrayList<String>();
		ResultSet rs = null;
		try {
			find_element_version_statement.setInt(1, element_id);
			rs = find_element_version_statement.executeQuery();
			while(rs.next()) {
				result.add(rs.getString(1));
			}
			rs.close();
		} catch (SQLException e) { e.printStackTrace(); }
		if (rs != null) { try {rs.close();} catch (SQLException e){ignore();}}
		return result;
	}

	/**
	 * Gives back the list of defined version for a method
	 * @param meth
	 * @return
	 */
	public List <String> missingVersionsOf(Method meth) {
		int id = addOrFindElement(meth.getName(), signature(meth), meth.getDeclaringClass(), false);
		return missingVersionsOfElement(id);
	}

	/**
	 * Gives back the list of defined version for a constructor
	 * @param co
	 * @return
	 */
	public List <String> missingVersionsOf(Constructor <?> co) {
		int id = addOrFindElement("<init>", signature(co), co.getDeclaringClass(), false);
		return missingVersionsOfElement(id);
	}

	/**
	 * Gives back the list of defined version for a field
	 * @param fi
	 * @return
	 */
	public List <String> missingVersionsOf(Field fi) {
		int id = addOrFindElement(fi.getName(), signature(fi), fi.getDeclaringClass(), false);
		return missingVersionsOfElement(id);
	}

	/**
	 * Returns a map with version_name as key and the number of elements 
	 * that are in a given version for the package. Additional key "total"
	 * associates the total number of elements in the package
	 * @param packageName
	 * @return null if package cannot be found, or a Map containing the stats
	 */
	public Map<String, Integer> getVersionStats(String packageName) {

		HashMap<String, Integer> stats = new HashMap<String, Integer>();
		int packageId = addOrFindPackage(packageName, false);
		if (packageId == -1) return null;
		ResultSet rs = null;
		try {
			find_package_version_stats_statement.setInt(1, packageId);
			rs = find_package_version_stats_statement.executeQuery();
			while(rs.next()) {
				stats.put(rs.getString(1), rs.getInt(2));
			}
			rs.close();
			List<String> versions = getVersion();
			for(String v : versions) {
				if(!stats.containsKey(v)) {
					stats.put(v, 0);
				}
			}
			find_package_total_classes_statement.setInt(1, packageId);
			rs = find_package_total_classes_statement.executeQuery();
			if(rs.next())
				stats.put("total", rs.getInt(1));
		} catch (SQLException e) {e.printStackTrace();}

		if (rs != null) { try {rs.close();} catch (SQLException e){ignore();}}
		return stats;
	}

	/**
	 * Gives the versions stored in the database
	 * @return a list of versions
	 */
	public List<String> getVersion() {
		ArrayList<String> versions = new ArrayList<String>();
		ResultSet rs = null;
		try {
			rs = find_version_list_statement.executeQuery();
			while(rs.next()) {
				versions.add(rs.getString(1));
			}
		} catch (SQLException e) {e.printStackTrace();}
		if (rs != null) { try {rs.close();} catch (SQLException e){ignore();}}
		return versions;
	}

	private void ignore() {}
}
