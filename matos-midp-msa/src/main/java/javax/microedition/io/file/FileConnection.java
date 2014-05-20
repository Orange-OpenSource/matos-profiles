package javax.microedition.io.file;

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
@Real("com.francetelecom.rd.fakemidp.jsr075.FileConnectionImplem")
public interface FileConnection extends javax.microedition.io.StreamConnection{
// Fields
// Methods
    public abstract boolean isOpen();
    public abstract java.io.InputStream openInputStream()
		throws java.io.IOException;
    public abstract java.io.DataInputStream openDataInputStream()
		throws java.io.IOException;
    public abstract java.io.OutputStream openOutputStream()
		throws java.io.IOException;
    public abstract java.io.DataOutputStream openDataOutputStream()
		throws java.io.IOException;
    public abstract java.io.OutputStream openOutputStream(long arg1)
		throws java.io.IOException;
    public abstract long totalSize();
    public abstract long availableSize();
    public abstract long usedSize();
    public abstract long directorySize(boolean arg1)
		throws java.io.IOException;
    public abstract long fileSize()
		throws java.io.IOException;
    public abstract boolean canRead();
    public abstract boolean canWrite();
    public abstract boolean isHidden();
    public abstract void setReadable(boolean arg1)
		throws java.io.IOException;
    public abstract void setWritable(boolean arg1)
		throws java.io.IOException;
    public abstract void setHidden(boolean arg1)
		throws java.io.IOException;
    public abstract java.util.Enumeration list()
		throws java.io.IOException;
    public abstract java.util.Enumeration list(String arg1, boolean arg2)
		throws java.io.IOException;
    @ArgsRule(value="FileConnection.create",pos={0})
    public abstract void create()
		throws java.io.IOException;
    @ArgsRule(value="FileConnection.mkdir",pos={0})
    public abstract void mkdir()
		throws java.io.IOException;
    public abstract boolean exists();
    public abstract boolean isDirectory();
    public abstract void delete()
		throws java.io.IOException;
    @ArgsRule(value="FileConnection.rename",pos={0,1})
    public abstract void rename(String arg1)
		throws java.io.IOException;
    public abstract void truncate(long arg1)
		throws java.io.IOException;
    @ArgsRule(value="FileConnection.setFileConnection",pos={0,1})
    public abstract void setFileConnection(String arg1)
		throws java.io.IOException;
    public abstract String getName();
    public abstract String getPath();
    public abstract String getURL();
    public abstract long lastModified();
}
