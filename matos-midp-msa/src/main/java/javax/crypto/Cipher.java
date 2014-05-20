package javax.crypto;

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
public class Cipher extends java.lang.Object{
// Fields
    public static final int ENCRYPT_MODE = 1;
    public static final int DECRYPT_MODE = 2;
// Methods
    public static final javax.crypto.Cipher getInstance(String transformation)
		throws java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException{
        return new Cipher();
    }
    public final void init(int opmode, java.security.Key key)
		throws java.security.InvalidKeyException{
        return;
    }
    public final void init(int opmode, java.security.Key key, java.security.spec.AlgorithmParameterSpec params)
		throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException{
        return;
    }
    public final int update(byte[] input, int inputOffset, int inputLen, byte[] output, int outputOffset)
		throws java.lang.IllegalStateException, javax.crypto.ShortBufferException{
        return 0;
    }
    public final int doFinal(byte[] input, int inputOffset, int inputLen, byte[] output, int outputOffset)
		throws java.lang.IllegalStateException, javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException{
        return 0;
    }
    public final byte[] getIV(){ return null; }
// Default constructor
    public Cipher(){ super(); }
}
