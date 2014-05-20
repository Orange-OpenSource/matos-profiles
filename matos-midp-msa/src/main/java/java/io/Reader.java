package java.io;

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
public abstract class Reader extends Object {
    protected Object lock;
    protected Reader(){}
    protected Reader(Object a0){}
    public int read() throws IOException{ return 0;}
    public int read(char[] a0) throws IOException{ return 0;}
    public abstract int read(char[] a0,int a1,int a2) throws IOException;
    public long skip(long a0) throws IOException{ return 0L;}
    public boolean ready() throws IOException{ return true;}
    public boolean markSupported(){ return true;}
    public void mark(int a0) throws IOException{ return; }
    public void reset() throws IOException{ return; }
    public abstract void close() throws IOException;
}

