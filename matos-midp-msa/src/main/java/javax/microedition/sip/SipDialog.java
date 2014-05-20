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

import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;

@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr180.SipDialogImplem")
public interface SipDialog{
// Fields
    public static final byte TERMINATED = 0;
    public static final byte EARLY = 1;
    public static final byte CONFIRMED = 2;
// Methods
    public abstract javax.microedition.sip.SipClientConnection getNewClientConnection(String arg1)
		throws java.lang.IllegalArgumentException, javax.microedition.sip.SipException;
    public abstract boolean isSameDialog(javax.microedition.sip.SipConnection arg1);
    public abstract byte getState();
    public abstract String getDialogID();
}
