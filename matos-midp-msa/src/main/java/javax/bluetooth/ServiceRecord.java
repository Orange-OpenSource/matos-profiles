package javax.bluetooth;

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
@Real("com.francetelecom.rd.fakemidp.jsr082.ServiceRecordImplem")
public interface ServiceRecord{
// Fields
    public static final int NOAUTHENTICATE_NOENCRYPT = 0;
    public static final int AUTHENTICATE_NOENCRYPT = 1;
    public static final int AUTHENTICATE_ENCRYPT = 2;
// Methods
    public abstract javax.bluetooth.DataElement getAttributeValue(int arg1);
    public abstract javax.bluetooth.RemoteDevice getHostDevice();
    public abstract int[] getAttributeIDs();
    public abstract boolean populateRecord(int[] arg1)
		throws java.io.IOException;
    public abstract String getConnectionURL(int arg1, boolean arg2);
    public abstract void setDeviceServiceClasses(int arg1);
    public abstract boolean setAttributeValue(int arg1, javax.bluetooth.DataElement arg2);
}
