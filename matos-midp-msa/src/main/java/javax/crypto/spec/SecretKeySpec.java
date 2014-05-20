package javax.crypto.spec;

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
public class SecretKeySpec extends java.lang.Object implements java.security.spec.KeySpec, java.security.Key{
// Fields
// Methods
    public  SecretKeySpec(byte[] key, int offset, int len, String algorithm){
        return;
    }
    public String getAlgorithm(){
        return "" + "SecretKeySpec.";
    }
    public String getFormat(){
        return "" + "SecretKeySpec.";
    }
    public byte[] getEncoded(){ return null; }
// Default constructor
    public SecretKeySpec(){ super(); }
}
