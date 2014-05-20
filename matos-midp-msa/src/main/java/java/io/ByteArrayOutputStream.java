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
public class ByteArrayOutputStream extends OutputStream {
    protected byte[] buf;
    protected int count;
    public ByteArrayOutputStream(){}
    public ByteArrayOutputStream(int a0){}
    public synchronized void write(int a0){ return; }
    public synchronized void write(byte[] a0,int a1,int a2){ return; }
    public synchronized void reset(){ return; }
    public synchronized byte[] toByteArray(){ return new byte[0];}
    public int size(){ return 0;}
    public String toString(){ return "" + "ByteArrayOutputStream";}
    public synchronized void close() throws IOException{ return; }
}

