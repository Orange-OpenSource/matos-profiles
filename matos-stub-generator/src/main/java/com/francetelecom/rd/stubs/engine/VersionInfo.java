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

import java.awt.Color;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import com.francetelecom.rd.stubs.engine.Node.ELEMENT_VERSION_COLORS;
import com.francetelecom.rd.stubs.engine.Node.PACKAGE_VERSION_COLORS;

/**
 * @author Laurent Sebag et piac6784
 *
 * All that is necessary to handle version informations in nodes. Implemented as two concrete classes tied
 * by an abstract class.
 */
public abstract class VersionInfo {
	

	/**
	 * VersionInfo for anything but a package.
	 */
	public static class ElementVersionInfo extends VersionInfo {
		private List<String> versionsInfo;

		/**
		 * Constructor for a reflexive field
		 * @param f
		 */
		public ElementVersionInfo(Field f) {
			versionsInfo = JClassView.database.missingVersionsOf(f);
		}
		
		/**
		 * Constructor for a reflexive constructor
		 * @param f
		 */
		public ElementVersionInfo(Constructor<?> co) {
			versionsInfo = JClassView.database.missingVersionsOf(co);
		}

		/**
		 * Constructor for a reflexive method
		 * @param f
		 */
		public ElementVersionInfo(Method m) {
			versionsInfo = JClassView.database.missingVersionsOf(m);
		}

		/**
		 * Constructor for a reflexive class
		 * @param f
		 */
		public ElementVersionInfo(Class <?> c) {
			versionsInfo = JClassView.database.missingVersionsOf(c);
		}

		@Override
		public Color getColor(String v) {
			// Node is an element
			List<String> missingVersions = (List<String>) versionsInfo;
			if(!missingVersions.contains(VersionDatabase.VISIBLE_PREFIX+v)) {
				return ELEMENT_VERSION_COLORS.visible;
			} else if(!missingVersions.contains(VersionDatabase.HIDDEN_PREFIX+v)) {
				return ELEMENT_VERSION_COLORS.hidden;
			} else {
				return ELEMENT_VERSION_COLORS.notPresent;
			}
		}

		@Override
		public Map<String, Integer> getPackageVersionsInfo() {
			return null;
		}

	}
	
	/**
	 * Version info for a package
	 */
	public static class PackageVersionInfo extends VersionInfo {

		private Map<String, Integer> versionsInfo;

		/**
		 * Constructor 
		 *
		 */
		public PackageVersionInfo() {
			versionsInfo = null; 
		}

		/**
		 * Adds a version stats maps, provided the new map is either the first or has the same keys.
		 * @param map the map
		 */
		public void add(final Map<String, Integer> map) {
			if(versionsInfo == null) {
				versionsInfo = map; 
			} else if(map==null || map.isEmpty()) {
			} else {
				for(String key : versionsInfo.keySet()) {
					versionsInfo.put(key, versionsInfo.get(key)+ map.get(key) );
				}
			}
		}

		@Override
		public Color getColor(String v) {
			if (versionsInfo == null) return Color.black;
			
			Map<String,Integer> stats = (Map<String, Integer>) versionsInfo;
			Integer visInt =stats.get(VersionDatabase.VISIBLE_PREFIX+v); 
			int visibles = visInt == null ? 0 : visInt;
			Integer hidInt = stats.get(VersionDatabase.HIDDEN_PREFIX+v);
			int hiddens = hidInt == null ? 0 : hidInt;
			int total = stats.get("total");

			if( visibles==total ) {
				// all elements are present and visible
				return PACKAGE_VERSION_COLORS.allPresentandVisible;
			} else if( hiddens==total ) {
				if( visibles!=0 ) {
					// all elements are present but some are hidden
					return PACKAGE_VERSION_COLORS.allPresentSomeHidden;
				} else {
					// all elements are present and all hidden
					return PACKAGE_VERSION_COLORS.allPresentAndHidden;
				}
			} else if( visibles==0 && hiddens==0 ) {
				// all elements are absent
				return PACKAGE_VERSION_COLORS.noElementsPresent;
			} 
			else {
				if( visibles>=hiddens ) {
					// some elements are not present but all of them are visible
					return PACKAGE_VERSION_COLORS.someElementsNotPresentButAllVisible;
				} else if( visibles==0 ) {
					// some elements are not present but all of them are hidden
					return PACKAGE_VERSION_COLORS.someElementsNotPresentButAllHidden;
				} else {
					// some elements are not present
					return PACKAGE_VERSION_COLORS.someElementsNotPresent;
				}
			}
		}


		@Override
		public Map<String, Integer> getPackageVersionsInfo() {
			return versionsInfo;
		}

	}

	/**
	 * Gives back a color corresponding to the support for this level.
	 * @param v
	 * @return
	 */
	public abstract Color getColor(String v);

	/**
	 * Gives back a map of presence for versions.
	 * @return
	 */
	public abstract Map<String, Integer> getPackageVersionsInfo();
}
