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

import com.francetelecom.rd.stubs.annotation.ArgsRule;
import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;

@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr180.SipClientConnectionImplem")
public interface SipClientConnection extends javax.microedition.sip.SipConnection{
// Fields
// Methods
    public abstract void initRequest(String arg1, javax.microedition.sip.SipConnectionNotifier arg2)
		throws java.lang.IllegalArgumentException, javax.microedition.sip.SipException;
    public abstract void setRequestURI(String arg1)
		throws java.lang.IllegalArgumentException, javax.microedition.sip.SipException;
    public abstract void initAck()
		throws javax.microedition.sip.SipException;
    public abstract javax.microedition.sip.SipClientConnection initCancel()
		throws javax.microedition.sip.SipException;
    public abstract boolean receive(long arg1)
		throws javax.microedition.sip.SipException, java.io.IOException;
    public abstract void setListener(@CallBackRegister("sip")javax.microedition.sip.SipClientConnectionListener arg1)
		throws java.io.IOException;
    public abstract int enableRefresh(@CallBackRegister("refresh")javax.microedition.sip.SipRefreshListener arg1)
		throws javax.microedition.sip.SipException;
    @ArgsRule(value="SipClientConnection.setCredentials",pos={1,2,3})
    public abstract void setCredentials(String arg1, String arg2, String arg3)
		throws javax.microedition.sip.SipException;
}
