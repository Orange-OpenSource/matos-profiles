package javax.microedition.sip;

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
@Real("com.francetelecom.rd.fakemidp.jsr180.SipConnectionNotifierImplem")
public interface SipConnectionNotifier extends javax.microedition.io.Connection{
// Fields
// Methods
    public abstract javax.microedition.sip.SipServerConnection acceptAndOpen()
		throws java.io.IOException, javax.microedition.sip.SipException;
    public abstract void setListener(@CallBackRegister("sipserver") javax.microedition.sip.SipServerConnectionListener arg1)
		throws java.io.IOException;
    public abstract String getLocalAddress()
		throws java.io.IOException;
    public abstract int getLocalPort()
		throws java.io.IOException;
}
