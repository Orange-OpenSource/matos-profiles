package javax.microedition.global;

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
import com.francetelecom.rd.stubs.annotation.ClassDone;
@ClassDone
public class ResourceManager extends java.lang.Object{
// Fields
    public static final String DEVICE = "";
// Methods
    static ResourceManager instance = new ResourceManager();
    
    public static final javax.microedition.global.ResourceManager getManager(String baseName)
		throws javax.microedition.global.ResourceException{
        return instance;
    }
    public static final javax.microedition.global.ResourceManager getManager(String baseName, String locale)
		throws javax.microedition.global.ResourceException{
        return instance;
    }
    public static final javax.microedition.global.ResourceManager getManager(String baseName, String[] locales){
        return instance;
    }
    public static String[] getSupportedLocales(String baseName){
    	java.lang.String[] str = new java.lang.String[1];
    	str[0] = "" + "ResourceManager.";
        return str;
    }
    public String getBaseName(){
        return "" + "ResourceManager.";
    }
    public String getLocale(){
        return "" + "ResourceManager.";
    }
    public byte[] getData(int id)
		throws javax.microedition.global.ResourceException{
		byte[] bytes = new byte[1];
		bytes[0] = 0;
        return bytes;
    }
    public String getString(int id)
		throws javax.microedition.global.ResourceException{
        return "" + "ResourceManager.";
    }
    public Object getResource(int id)
		throws javax.microedition.global.ResourceException{
        return new java.lang.Object();
    }
    public boolean isCaching(){
        return true;
    }
    public boolean isValidResourceID(int id){
        return true;
    }
// Default constructor
    public ResourceManager(){ super(); }
}
