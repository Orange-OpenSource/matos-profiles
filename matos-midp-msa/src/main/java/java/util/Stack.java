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

import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;

public class Stack extends Vector{
    public Stack(){}
    @FieldGet("content")
    public Object push(@FieldSet("this.content") Object a0) { return null; }
    @FieldGet("content")
    public synchronized Object pop() { return null; }
    @FieldGet("content")
    public synchronized Object peek() { return null; }
    public boolean empty(){ return true;}
    public synchronized int search(Object a0){ return lastIndexOf(a0);}
}

