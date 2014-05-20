package java.security;

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
@Real("com.francetelecom.rd.fakemidp.jsr177.MessageDigestImplem")
abstract public class MessageDigest extends java.lang.Object{
// Fields
    //com.sun.midp.ssl.MessageDigest messageDigest;
// Methods
    public static java.security.MessageDigest getInstance(String algorithm)
		throws java.security.NoSuchAlgorithmException{
        return null;
    }
    public void update(byte[] input, int offset, int len){
        return;
    }
    public int digest(byte[] buf, int offset, int len)
		throws java.security.DigestException{
        return 0;
    }
    public void reset(){
        return;
    }
// Default constructor
    public MessageDigest(){ super(); }
}
