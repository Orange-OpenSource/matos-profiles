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
final public class StringComparator extends java.lang.Object{
// Fields
    public static final int LEVEL1 = 1;
    public static final int LEVEL2 = 2;
    public static final int LEVEL3 = 3;
    public static final int IDENTICAL = 15;
// Methods
    public  StringComparator(){
        return;
    }
    public  StringComparator(String locale){
        return;
    }
    public  StringComparator(String locale, int level)
		throws javax.microedition.global.UnsupportedLocaleException, java.lang.IllegalArgumentException{
        return;
    }
    public static String[] getSupportedLocales(){
    	java.lang.String[] str = new java.lang.String[1];
    	str[0] = "" + "StringCompare";
        return str;
    }
    public int compare(String s1, String s2){
        return 0;
    }
    public boolean equals(String s1, String s2){
        return true;
    }
    public int getLevel(){
        return 0;
    }
    public String getLocale(){
        return "" + "StringCompare";
    }
}
