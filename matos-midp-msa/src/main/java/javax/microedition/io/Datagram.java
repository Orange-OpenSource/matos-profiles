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
import com.francetelecom.rd.stubs.annotation.Real;

@ClassDone
@Real("com.francetelecom.rd.fakemidp.cldc.DatagramImplem")
public interface Datagram extends java.io.DataInput,java.io.DataOutput {
    public abstract String getAddress();
    public abstract byte[] getData();
    public abstract int getLength();
    public abstract int getOffset();
    @ArgsRule(value="Datagram.setAddress", pos={0,1})
    public abstract void setAddress(String a0) throws java.io.IOException;
    @ArgsRule(value="Datagram.setAddress-2", pos={0,1})
    public abstract void setAddress(Datagram a0);
    public abstract void setLength(int a0);
    public abstract void setData(byte[] a0,int a1,int a2);
    public abstract void reset();
}

