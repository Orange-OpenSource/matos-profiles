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
public class DataInputStream extends InputStream implements DataInput{
    protected InputStream in;
    public DataInputStream(InputStream a0){}
    public int read() throws IOException{ return 0;}
    public final int read(byte[] a0) throws IOException{ return 0;}
    public final int read(byte[] a0,int a1,int a2) throws IOException{ return 0;}
    public final void readFully(byte[] a0) throws IOException{ return; }
    public final void readFully(byte[] a0,int a1,int a2) throws IOException{ return; }
    public final int skipBytes(int a0) throws IOException{ return 0;}
    public final boolean readBoolean() throws IOException{ return true;}
    public final byte readByte() throws IOException{ return (byte)0;}
    public final int readUnsignedByte() throws IOException{ return 0;}
    public final short readShort() throws IOException{ return 0;}
    public final int readUnsignedShort() throws IOException{ return 0;}
    public final char readChar() throws IOException{ return (char)0;}
    public final int readInt() throws IOException{ return 0;}
    public final long readLong() throws IOException{ return 0L;}
    public final float readFloat() throws IOException{ return 0.0f;}
    public final double readDouble() throws IOException{ return 0.0;}
    public final String readUTF() throws IOException{ return "" + "DataInputSteam.readUTF";}
    public static final String readUTF(DataInput a0) throws IOException{ return "" + "DataInputStream.readUTF";}
    public long skip(long a0) throws IOException{ return 0L;}
    public int available() throws IOException{ return 0;}
    public void close() throws IOException{ return; }
    public synchronized void mark(int a0){ return; }
    public synchronized void reset() throws IOException{ return; }
    public boolean markSupported(){ return true;}
}

