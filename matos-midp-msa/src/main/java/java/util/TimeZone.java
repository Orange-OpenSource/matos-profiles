package java.util;

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
import com.francetelecom.rd.stubs.annotation.Real;

@Real("com.francetelecom.rd.fakemidp.cldc.TimeZoneImplem")
@ClassDone
public abstract class TimeZone extends Object {
    public TimeZone(){}
    public abstract int getOffset(int a0,int a1,int a2,int a3,int a4,int a5);
    public abstract int getRawOffset();
    public abstract boolean useDaylightTime();
    public String getID(){ return "" + "TimeZone.";}
    public static synchronized TimeZone getTimeZone(String a0) { return null; }
    public static synchronized TimeZone getDefault() { return null; }
    public static String[] getAvailableIDs(){ return new String[0];}
}

