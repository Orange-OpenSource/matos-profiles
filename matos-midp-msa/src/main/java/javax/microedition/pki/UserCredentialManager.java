package javax.microedition.pki;

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
final public class UserCredentialManager extends java.lang.Object{
// Fields
    public static final String ALGORITHM_RSA = "1.2.840.113549.1.1";
    public static final String ALGORITHM_DSA = "1.2.840.10040.4.1";
    public static final int KEY_USAGE_AUTHENTICATION = 0;
    public static final int KEY_USAGE_NON_REPUDIATION = 1;
// Methods
    public static final byte[] generateCSR(String nameInfo, String algorithm, int keyLen, int keyUsage, String securityElementID, String securityElementPrompt, boolean forceKeyGen)
		throws javax.microedition.pki.UserCredentialManagerException, javax.microedition.securityservice.CMSMessageSignatureServiceException{
		byte[] bytes = new byte[1];
		bytes[0] = 0;
        return bytes;
    }
    @ArgsRule(value="UserCredentialManager.addCredential",pos={1,2,3})
    public static final boolean addCredential(String certDisplayName, byte[] pkiPath, String uri)
		throws javax.microedition.pki.UserCredentialManagerException{
        return true;
    }
    @ArgsRule(value="UserCredentialManager.removeCredential",pos={1,2,3,4})
    public static final boolean removeCredential(String certDisplayName, byte[] issuerAndSerialNumber, String securityElementID, String securityElementPrompt)
		throws javax.microedition.pki.UserCredentialManagerException{
        return true;
    }
// Default constructor
    public UserCredentialManager(){ super(); }
}
