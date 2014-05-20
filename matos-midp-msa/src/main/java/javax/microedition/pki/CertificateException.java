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

import com.francetelecom.rd.stubs.annotation.ClassDone;

@ClassDone
public class CertificateException extends java.io.IOException {
    public static final byte BAD_EXTENSIONS = 1;
    public static final byte CERTIFICATE_CHAIN_TOO_LONG = 2;
    public static final byte EXPIRED = 3;
    public static final byte UNAUTHORIZED_INTERMEDIATE_CA = 4;
    public static final byte MISSING_SIGNATURE = 5;
    public static final byte NOT_YET_VALID = 6;
    public static final byte SITENAME_MISMATCH = 7;
    public static final byte UNRECOGNIZED_ISSUER = 8;
    public static final byte UNSUPPORTED_SIGALG = 9;
    public static final byte INAPPROPRIATE_KEY_USAGE = 10;
    public static final byte BROKEN_CHAIN = 11;
    public static final byte ROOT_CA_EXPIRED = 12;
    public static final byte UNSUPPORTED_PUBLIC_KEY_TYPE = 13;
    public static final byte VERIFICATION_FAILED = 14;
    private Certificate c;
    private byte r;
    public CertificateException(Certificate a0,byte a1){c = a0; r = a1;}
    public CertificateException(String a0,Certificate a1,byte a2){c = a1; r=a2;}
    public Certificate getCertificate() { return c; }
    public byte getReason(){ return r;}
}

