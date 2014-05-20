package javax.microedition.media.protocol;

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
import com.francetelecom.rd.stubs.annotation.Real;

@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr135.SourceStreamlImplem")
public interface SourceStream extends javax.microedition.media.Controllable {
    public static final int NOT_SEEKABLE = 0;
    public static final int SEEKABLE_TO_START = 1;
    public static final int RANDOM_ACCESSIBLE = 2;
    public abstract ContentDescriptor getContentDescriptor();
    public abstract long getContentLength();
    public abstract int read(byte[] a0,int a1,int a2) throws java.io.IOException;
    public abstract int getTransferSize();
    public abstract long seek(long a0) throws java.io.IOException;
    public abstract long tell();
    public abstract int getSeekType();
}

