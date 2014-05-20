package javax.microedition.securityservice;

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

@ClassDone
final public class CMSMessageSignatureService extends java.lang.Object{
// Fields
    public static final int SIG_INCLUDE_CONTENT = 1;
    public static final int SIG_INCLUDE_CERTIFICATE = 2;
    static int mask;
// Methods
    @ArgsRule(value="CMSMessageSignatureService.sign", pos={1,2,3,4})
    public static final byte[] sign(String stringToSign, int options, String[] caNames, String securityElementPrompt)
		throws javax.microedition.securityservice.CMSMessageSignatureServiceException, javax.microedition.pki.UserCredentialManagerException{
		byte[] bytes = new byte[1];
		bytes[0] = 0;
        return bytes;
    }
    @ArgsRule(value="CMSMessageSignatureService.authenticate-1", pos={1,2,3,4})
    public static final byte[] authenticate(byte[] byteArrayToAuthenticate, int options, String[] caNames, String securityElementPrompt)
		throws javax.microedition.securityservice.CMSMessageSignatureServiceException, javax.microedition.pki.UserCredentialManagerException{
		byte[] bytes = new byte[1];
		bytes[0] = 0;
        return bytes;
    }
    @ArgsRule(value="CMSMessageSignatureService.authenticate-2", pos={1,2,3,4})
    public static final byte[] authenticate(String stringToAuthenticate, int options, String[] caNames, String securityElementPrompt)
		throws javax.microedition.securityservice.CMSMessageSignatureServiceException, javax.microedition.pki.UserCredentialManagerException{
		byte[] bytes = new byte[1];
		bytes[0] = 0;
        return bytes;
    }
// Default constructor
    public CMSMessageSignatureService(){ super(); }
}
