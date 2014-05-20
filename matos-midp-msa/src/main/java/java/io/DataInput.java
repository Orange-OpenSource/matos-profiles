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
public interface DataInput{
    public abstract void readFully(byte[] a0) throws IOException;
    public abstract void readFully(byte[] a0,int a1,int a2) throws IOException;
    public abstract int skipBytes(int a0) throws IOException;
    public abstract boolean readBoolean() throws IOException;
    public abstract byte readByte() throws IOException;
    public abstract int readUnsignedByte() throws IOException;
    public abstract short readShort() throws IOException;
    public abstract int readUnsignedShort() throws IOException;
    public abstract char readChar() throws IOException;
    public abstract int readInt() throws IOException;
    public abstract long readLong() throws IOException;
    public abstract float readFloat() throws IOException;
    public abstract double readDouble() throws IOException;
    public abstract String readUTF() throws IOException;
}

