package java.lang;

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
import com.francetelecom.rd.stubs.annotation.UseRule;
@ClassDone
public final class System extends Object {
    public static final java.io.PrintStream out=null;
    public static final java.io.PrintStream err=null;
    @UseRule("System.currentTimeMillis")
    public static long currentTimeMillis(){ return 0L;}
    public static void arraycopy(Object a0,int a1,Object a2,int a3,int a4){ return; }
    public static int identityHashCode(Object a0){ return 0;}
    @ArgsRule(value="System.getProperty", pos={1})
    public static String getProperty(String a0){ return "" + "System";}
    public static void exit(int a0){ return; }
    public static void gc(){ return; }
}

