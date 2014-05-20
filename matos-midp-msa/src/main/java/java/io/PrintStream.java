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
public class PrintStream extends OutputStream {
    public PrintStream(OutputStream a0){}
    public void flush(){ return; }
    public void close(){ return; }
    public boolean checkError(){ return true;}
    protected void setError(){ return; }
    public void write(int a0){ return; }
    public void write(byte[] a0,int a1,int a2){ return; }
    public void print(boolean a0){ return; }
    public void print(char a0){ return; }
    public void print(int a0){ return; }
    public void print(long a0){ return; }
    public void print(char[] a0){ return; }
    public void print(String a0){ return; }
    public void print(float a0){ return; }
    public void print(double a0){ return; }
    public void print(Object a0){ return; }
    public void println(){ return; }
    public void println(boolean a0){ return; }
    public void println(char a0){ return; }
    public void println(int a0){ return; }
    public void println(long a0){ return; }
    public void println(char[] a0){ return; }
    public void println(String a0){ return; }
    public void println(float a0){ return; }
    public void println(double a0){ return; }
    public void println(Object a0){ return; }
}

