package javax.microedition.apdu;

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
@Real("com.francetelecom.rd.fakemidp.jsr177.APDUConnection")
public interface APDUConnection extends javax.microedition.io.Connection{
// Fields
// Methods
    public abstract byte[] exchangeAPDU(byte[] arg1)
		throws java.io.IOException;
    public abstract byte[] getATR();
    public abstract byte[] enterPin(int arg1)
		throws java.io.IOException;
    public abstract byte[] changePin(int arg1)
		throws java.io.IOException;
    public abstract byte[] disablePin(int arg1)
		throws java.io.IOException;
    public abstract byte[] enablePin(int arg1)
		throws java.io.IOException;
    public abstract byte[] unblockPin(int arg1, int arg2)
		throws java.io.IOException;
}
