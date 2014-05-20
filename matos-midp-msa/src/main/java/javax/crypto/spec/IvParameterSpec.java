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
public class IvParameterSpec extends java.lang.Object implements java.security.spec.AlgorithmParameterSpec{
// Fields
// Methods
    public  IvParameterSpec(byte[] iv, int offset, int len){
        return;
    }
    public byte[] getIV(){
		byte[] bytes = new byte[1];
		bytes[0] = 0;
        return bytes;
    }
// Default constructor
    public IvParameterSpec(){ super(); }
}
