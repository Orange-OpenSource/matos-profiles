
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

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Properties;
import java.util.Set;

/**
 * Main entry point for the stub generator. The options are:
 * <ul>
 * -jars for the paths to the jar to translate. The classpath must be specified
 * with the classic separator char.
 * <li>-d for the path to the directory where the java code is produced.
 * </ul>
 * 
 * @author piac6784
 */
public class Main {
    final static String OTHER_PREFIX = "aNnOtPrEfIxOrAnGe";

    final static String PREFIX = "oLaBsTuBs";

    final private static String PREFIX_DB = "oXaXsTxBs";
    
    final static String ANNOTATION_PACKAGE = "com.francetelecom.rd.stubs.annotation";

    final static int MODE_EMPTY_STUB = 1;

    final static int MODE_STAT = 2;

    final static int MODE_GEN_STUB = 3;

    final static int MODE_XML = 4;

    final static int MODE_VERSION = 5;

    final static int MODE_WITNESS = 6;

    final static int WIDTH = 600, HEIGHT = 600;

    

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String[] jars = new String[0];
        String[] annotJars = null;
        String outDir = "out";
        String outFile = null;
        String dbName = null;
        String versionName = null;
        String sideFile = null;
        String configName = null;
        int mode = MODE_EMPTY_STUB;
        String sdkPath = null;
        VersionDatabase database;

        for (int i = 0; i < args.length; i++) {
            String arg = args[i].trim();
            if (arg.equals("-a")) {
                annotJars = args[++i].split(File.pathSeparator);
            } else if (arg.equals("-d")) {
                outDir = args[++i];
            } else if (arg.equals("-db")) {
                dbName = args[++i];
            } else if (arg.equals("-jars")) {
                String[] newJars = args[++i].split(File.pathSeparator);
                int length = jars.length;
                if (length == 0)
                    jars = newJars;
                else {
                    jars = Arrays.copyOf(jars, length + newJars.length);
                    System.arraycopy(newJars, 0, jars, length, newJars.length);
                }
            } else if (arg.equals("-r")) {
                mode = MODE_GEN_STUB;
                configName = args[++i];
            } else if (arg.equals("-s")) {
                mode = MODE_STAT;
                configName = args[++i];
            } else if (arg.equals("-v")) {
                mode = MODE_VERSION;
                versionName = args[++i];
            } else if (arg.equals("-w")) {
                sideFile = args[++i];
            } else if (arg.equals("-x")) {
                mode = MODE_XML;
                outFile = args[++i];
            } else if (arg.equals("-W")) {
                mode = MODE_WITNESS;
            } else if (arg.equals("-SDK")) {
                sdkPath = args[++i];
            } else {
                System.err.println("I do not know what to do with " + arg);
            }
        }

        if (sdkPath != null) {
            System.exit(buildDatabase(sdkPath, dbName));
        }
        Hierarchy hierarchy = new Hierarchy();
        RelocatingClassLoader loader = new RelocatingClassLoader(jars, PREFIX);

        AlternativeImplementation altImplem = null;
        Properties properties = null;
        ReflexUtil rf = null;

        if (configName != null) {
            InputStream is = new FileInputStream(configName);
            properties = new Properties();
            properties.loadFromXML(is);
            is.close();
        }

        if (annotJars != null) {
            RelocatingClassLoader annotLoader = new RelocatingClassLoader(annotJars, OTHER_PREFIX);
            annotLoader.setSilent();
            annotLoader.initLookup();
            rf = new ReflexUtil(PREFIX, OTHER_PREFIX, ANNOTATION_PACKAGE);
            altImplem = new AlternativeImplementation(annotLoader, OTHER_PREFIX, PREFIX);
        } else {
            rf = new ReflexUtil(mode == MODE_VERSION ? PREFIX_DB : PREFIX, null, ANNOTATION_PACKAGE);
        }
        populate(hierarchy, loader);
        hierarchy.count();

        switch (mode) {
            case MODE_STAT:
                if (dbName == null) {
                    System.err.println("Missing database argument for stats!");
                    System.exit(-1);
                }
                database = new VersionDatabase(dbName, rf);
                JClassView.viewStat(hierarchy, rf, properties, database);
                break;
            case MODE_EMPTY_STUB:
                AlternativeAnnotations altAnnot = new AlternativeReplacedAnnotations(altImplem);
                doDump(hierarchy, new ClassDumper(outDir, rf, altAnnot));
                break;
            case MODE_GEN_STUB:
                AnnotatingClassDumper acd = new AnnotatingClassDumper(outDir, rf, properties,
                        hierarchy);
                if (dbName != null) {
                    database = new VersionDatabase(dbName, rf);
                    acd.setVersionDatabase(database);
                }
                doDump(hierarchy, acd);
                break;
            case MODE_XML:
                RuleGenerator.generate(outFile, sideFile, rf, hierarchy);
                break;
            case MODE_WITNESS:
                WitnessIssuesDumper.dumpWitnessIssues(rf, hierarchy);
                break;
            case MODE_VERSION:
                doRegister(hierarchy, rf, dbName, versionName);
                break;
            default:
                System.out.println("Problem with mode");
        }
    }

    private static void populate(Hierarchy hierarchy, RelocatingClassLoader loader) throws IOException {
        Set<String> everyone = loader.initLookup();
        for (String name : everyone) {
            try {
                Class<?> clazz = loader.loadClass(name);
                hierarchy.register(clazz);
            } catch (Throwable e) {
                System.err.println("============== CANNOT HANDLE " + name + " =============");
                e.printStackTrace();
            }
        }
    }

    private static int buildDatabase(String sdkPath, String dbName) {
        ReflexUtil rf = new ReflexUtil(PREFIX, null, ANNOTATION_PACKAGE);
        try {
            if (dbName == null) {
                System.err.println("Needs a database with option -SDK");
                return 1;
            }

            File platformDir = new File(sdkPath, "platforms");
            if (!platformDir.exists()) {
                System.err.println("Cannot find the relevant dirs in SDK");
                return 1;
            }

            for (File dirfile : platformDir.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File arg0, String arg1) {
                    return arg1.startsWith("android-");
                }
            })) {
                Hierarchy h = new Hierarchy();
                String jar = new File(dirfile, "android.jar").getAbsolutePath();
                RelocatingClassLoader rcl = new RelocatingClassLoader(new String[] {
                    jar
                }, PREFIX);
                populate(h, rcl);
                String suffix = dirfile.getName().substring(8);
                if (suffix.equals("Honeycomb")) continue;
                if (suffix.equals("2.1")) suffix="7";
                String versionName = "v" + suffix;
                doRegister(h, rf, dbName, versionName);
            }
            return 0;
        } catch (IOException e) {
            e.printStackTrace();
            return 1;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return 1;

        }
    }

    private static void doRegister(Hierarchy hierarchy, ReflexUtil rf, String dbName,
            String versionName) {
        try {
            VersionDatabase db = new VersionDatabase(dbName, rf);
            db.open_transaction();
            db.setVersion(versionName);
            int count = 0;
            for (Class<?> clazz : hierarchy.getContents()) {
                if (clazz.getName().contains("$"))
                    continue;
                System.out.println(count++ + " - " + clazz);
                db.registerClass(clazz);
            }
            db.close_transaction();
            db.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void doDump(Hierarchy hierarchy, ClassDumper dumper) {
        int count = 0;
        for (Class<?> clazz : hierarchy.getContents()) {
            dumper.register(clazz);
        }
        dumper.dumpRegistered();
        for (Class<?> clazz : hierarchy.getContents()) {
            try {
                dumper.dumpClass(clazz);
            } catch (Throwable e) {
                System.err.println("============== CANNOT DUMP " + clazz + " =============");
                e.printStackTrace();
                count++;
            }
        }
        System.err.println("Errors = " + count + "/" + dumper.count);

    }
}
