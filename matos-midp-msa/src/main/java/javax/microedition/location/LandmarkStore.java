package javax.microedition.location;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2004 - 2014 Orange SA
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
import java.util.Vector;

import com.francetelecom.rd.stubs.annotation.ArgsRule;
import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.UseRule;
@ClassDone
public class LandmarkStore extends java.lang.Object{
// Fields
// Methods
	private static LandmarkStore lms = new LandmarkStore();
	private Vector lm = new Vector();
	private Vector cats = new Vector();
	
    public static synchronized javax.microedition.location.LandmarkStore getInstance(String storeName){
        return lms;
    }
    @ArgsRule(value="LandmarkStore.createLandmarkStore", pos={1})
    public static void createLandmarkStore(String storeName)
		throws java.io.IOException, javax.microedition.location.LandmarkException{
        return;
    }
    @ArgsRule(value="LandmarkStore.deleteLandmarkStore", pos={1})
    public static void deleteLandmarkStore(String storeName)
		throws java.io.IOException, javax.microedition.location.LandmarkException{
        return;
    }
    @UseRule("LandmarkStore.listLandmarkStore")
    public static String[] listLandmarkStores()
		throws java.io.IOException{
    	java.lang.String [] str = new java.lang.String[1];
    	str[0] = new java.lang.String();
        return str;
    }
    @ArgsRule(value="LandmarkStore.addLandmark", pos={1,2})
    public void addLandmark(javax.microedition.location.Landmark landmark, String category)
		throws java.io.IOException{
    	lm.addElement(landmark);
        return;
    }
    @ArgsRule(value="LandmarkStore.getLandmarks-1", pos={1,2})
    public java.util.Enumeration getLandmarks(String category, String name)
		throws java.io.IOException{
    	return lm.elements();
    }
    @UseRule("LandmarkStore.getLandmarks-2")
    public java.util.Enumeration getLandmarks()
		throws java.io.IOException{
    	return lm.elements();
    }
    @ArgsRule(value="LandmarkStore.getLandmarks-3", pos={1})
    public java.util.Enumeration getLandmarks(String category, double minLatitude, double maxLatitude, double minLongitude, double maxLongitude)
		throws java.io.IOException{
    	return lm.elements();
    }
    public void removeLandmarkFromCategory(javax.microedition.location.Landmark lm, String category)
		throws java.io.IOException{
        return;
    }
    public void updateLandmark(javax.microedition.location.Landmark lm)
		throws java.io.IOException, javax.microedition.location.LandmarkException{
        return;
    }
    public void deleteLandmark(javax.microedition.location.Landmark lm)
		throws java.io.IOException, javax.microedition.location.LandmarkException{
        return;
    }
    public java.util.Enumeration getCategories(){
        return cats.elements();
    }
    public void addCategory(String categoryName)
		throws java.io.IOException, javax.microedition.location.LandmarkException{
    	cats.addElement(categoryName);
        return;
    }
    public void deleteCategory(String categoryName)
		throws java.io.IOException, javax.microedition.location.LandmarkException{
        return;
    }
// Default constructor
    public LandmarkStore(){ 
    	super(); 
    	lm.addElement(new Landmark());
    	cats.addElement(new String());
    }
// Subclass javax/microedition/location/LandmarkStore$LandmarkEnumeration.class
    public class LandmarkEnumeration extends java.lang.Object implements java.util.Enumeration{
// Fields
// Methods
        public Object nextElement(){
            return new java.lang.Object();
        }
        public boolean hasMoreElements(){
            return true;
        }
        public boolean matches(byte[] candidate){
            return true;
        }
// Default constructor
        public LandmarkEnumeration(){ super(); }
    }
}
