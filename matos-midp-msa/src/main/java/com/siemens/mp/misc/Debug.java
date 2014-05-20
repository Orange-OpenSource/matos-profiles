package com.siemens.mp.misc;

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
public class Debug extends Object {
    public static final boolean on = true;
    public static void on() { }
    public static void off() { }
    public static void set(int a) { }
    public static void outln(String a) { }
    public static void out(String a) { }
    public static void outln(int b, String a) { }
    public static void out(int b, String a) { }
    public static void breakpoint() { }
    //    public static void assert(boolean b, String a) { }
}