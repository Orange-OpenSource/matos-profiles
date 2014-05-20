package javax.obex;

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

import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;

@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr082.ClientSessionImplem")
public interface ClientSession extends javax.microedition.io.Connection{
// Fields
// Methods
    public abstract void setAuthenticator(@CallBackRegister("authenticator") javax.obex.Authenticator arg1);
    public abstract javax.obex.HeaderSet createHeaderSet();
    public abstract void setConnectionID(long arg1);
    public abstract long getConnectionID();
    public abstract javax.obex.HeaderSet connect(javax.obex.HeaderSet arg1)
		throws java.io.IOException;
    public abstract javax.obex.HeaderSet disconnect(javax.obex.HeaderSet arg1)
		throws java.io.IOException;
    public abstract javax.obex.HeaderSet setPath(javax.obex.HeaderSet arg1, boolean arg2, boolean arg3)
		throws java.io.IOException;
    public abstract javax.obex.HeaderSet delete(javax.obex.HeaderSet arg1)
		throws java.io.IOException;
    public abstract javax.obex.Operation get(javax.obex.HeaderSet arg1)
		throws java.io.IOException;
    public abstract javax.obex.Operation put(javax.obex.HeaderSet arg1)
		throws java.io.IOException;
}
