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
import com.francetelecom.rd.stubs.annotation.ClassDone;
@ClassDone
final public class CMSMessageSignatureServiceException extends java.lang.Exception{
// Fields
    public static final byte CRYPTO_FAILURE = 1;
    public static final byte CRYPTO_FORMAT_ERROR = 2;
    public static final byte CRYPTO_NO_DETACHED_SIG = 3;
    public static final byte CRYPTO_NO_OPAQUE_SIG = 4;
    public static final byte SE_BUSY = 5;
    public static final byte SE_FAILURE = 6;
    public static final byte SE_CRYPTO_FAILURE = 7;
    public static final byte CRYPTO_NO_CERTIFICATE = 8;
// Methods
    public  CMSMessageSignatureServiceException(byte code){
        return;
    }
    public byte getReason(){
        return (byte) 0;
    }
// Default constructor
    public CMSMessageSignatureServiceException(){ super(); }
}
