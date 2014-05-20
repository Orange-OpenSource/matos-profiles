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
@Real("com.francetelecom.rd.fakemidp.midp.SocketConnectionImplem")

public interface SocketConnection extends StreamConnection {
    public static final byte DELAY = 0;
    public static final byte LINGER = 1;
    public static final byte KEEPALIVE = 2;
    public static final byte RCVBUF = 3;
    public static final byte SNDBUF = 4;
    @ArgsRule(value="SocketConnection.setSocketOption", pos={0,1,2})
    public abstract void setSocketOption(byte a0,int a1) throws IllegalArgumentException, java.io.IOException;
    public abstract int getSocketOption(byte a0) throws IllegalArgumentException, java.io.IOException;
    public abstract String getLocalAddress() throws java.io.IOException;
    public abstract int getLocalPort() throws java.io.IOException;
    public abstract String getAddress() throws java.io.IOException;
    public abstract int getPort() throws java.io.IOException;
}

