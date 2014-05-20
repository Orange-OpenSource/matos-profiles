package javax.microedition.io;

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
import com.francetelecom.rd.stubs.annotation.ArgsRule;
import com.francetelecom.rd.stubs.annotation.ClassDone;
@ClassDone
public class PushRegistry extends Object {
	@ArgsRule(value="PushRegistry.registerConnection",pos={1,2,3})
    public static void registerConnection(String a0,String a1,String a2) throws ClassNotFoundException, java.io.IOException{ return; }
    public static boolean unregisterConnection(String a0){ return true;}
    public static String[] listConnections(boolean a0){ return new String[0];}
    public static String getMIDlet(java.lang.String a0){ return "" + "PushRegistry.";}
    public static String getFilter(java.lang.String a0){ return "" + "PushRegistry.";}
    @ArgsRule(value="PushRegistry.registerAlarm",pos={1,2})
    public static long registerAlarm(String a0,long a1) throws ClassNotFoundException, ConnectionNotFoundException{ return 0L;}
}

