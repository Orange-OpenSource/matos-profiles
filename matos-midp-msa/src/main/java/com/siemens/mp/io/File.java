package com.siemens.mp.io;

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

public class File extends Object {
    public File() {};
    public static int debugWrite(String a, java.lang.String b) { return 0; };
    @ArgsRule(value="siemens.File.open", pos={1})
    public int open(String a) throws java.io.IOException { return 0; };
    @ArgsRule(value="siemens.File.exists", pos={1})
    public static int exists(String a) { return 0; };
    public int seek(int a, int b) throws java.io.IOException { return 0; };
    public int length(int a) throws java.io.IOException { return 0; };
    public int close(int a) throws java.io.IOException { return 0; };
    public int write(int a, byte[] b, int c, int d) throws java.io.IOException { return 0; };
    public int read(int a, byte[] b, int c, int d) throws java.io.IOException { return 0; };
    @ArgsRule(value="siemens.File.delete", pos={1})
    public static int delete(String a) throws java.io.IOException { return 0; };
    public static  int spaceAvailable() throws java.io.IOException  { return 0; };
    @ArgsRule(value="siemens.File.rename", pos={1,2})
    public static int rename(String a, java.lang.String b) throws java.io.IOException  { return 0; };
    @ArgsRule(value="siemens.File.copy", pos={1,2})
    public static int copy(String a, java.lang.String b) throws java.io.IOException  { return 0; };
    @ArgsRule(value="siemens.File.isDirectory", pos={1})
    public static boolean isDirectory(String a) throws java.io.IOException { return true; };
    public static String [] list(java.lang.String a) throws java.io.IOException {return new String [0]; };
    public static  void truncate(int a, int b) throws java.io.IOException {};
}
