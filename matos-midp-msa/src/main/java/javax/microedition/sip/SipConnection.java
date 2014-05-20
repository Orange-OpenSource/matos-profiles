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
import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;

@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr180.SipConnectionImplem")
public interface SipConnection extends javax.microedition.io.Connection{
// Fields
// Methods
    public abstract void send()
		throws java.io.IOException, javax.microedition.sip.SipException;
    public abstract void setHeader(String arg1, String arg2)
		throws javax.microedition.sip.SipException, java.lang.IllegalArgumentException;
    public abstract void addHeader(String arg1, String arg2)
		throws javax.microedition.sip.SipException, java.lang.IllegalArgumentException;
    public abstract void removeHeader(String arg1)
		throws javax.microedition.sip.SipException;
    public abstract String[] getHeaders(String arg1);
    public abstract String getHeader(String arg1);
    public abstract String getMethod();
    public abstract String getRequestURI();
    public abstract int getStatusCode();
    public abstract String getReasonPhrase();
    public abstract javax.microedition.sip.SipDialog getDialog();
    @ArgsRule(value="SipConnection.openContentInputStream", pos={0,-1})
    public abstract java.io.InputStream openContentInputStream()
		throws java.io.IOException, javax.microedition.sip.SipException;
    @ArgsRule(value="SipConnection.openContentOutputStream", pos={0,-1})
    public abstract java.io.OutputStream openContentOutputStream()
		throws java.io.IOException, javax.microedition.sip.SipException;
}
