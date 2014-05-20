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

import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;

@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr082.OperationImplem")
public interface Operation extends javax.microedition.io.ContentConnection{
// Fields
// Methods
    public abstract void abort()
		throws java.io.IOException;
    public abstract javax.obex.HeaderSet getReceivedHeaders()
		throws java.io.IOException;
    public abstract void sendHeaders(javax.obex.HeaderSet arg1)
		throws java.io.IOException;
    public abstract int getResponseCode()
		throws java.io.IOException;
}
