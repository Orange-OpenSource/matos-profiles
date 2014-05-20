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
import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.ClassDone;
@ClassDone
public class DiscoveryAgent extends java.lang.Object{
// Fields
    public static final int NOT_DISCOVERABLE = 0;
    public static final int GIAC = 10390323;
    public static final int LIAC = 10390272;
    public static final int CACHED = 0;
    public static final int PREKNOWN = 1;
// Methods
    public javax.bluetooth.RemoteDevice[] retrieveDevices(int option){
    	javax.bluetooth.RemoteDevice[] rd = new javax.bluetooth.RemoteDevice[1];
    	rd[0] = new javax.bluetooth.RemoteDevice();
        return rd;
    }
    public boolean startInquiry(int accessCode, @CallBackRegister("discovery") javax.bluetooth.DiscoveryListener listener)
		throws javax.bluetooth.BluetoothStateException{
        return true;
    }
    public boolean cancelInquiry(javax.bluetooth.DiscoveryListener listener){
        return true;
    }
    public int searchServices(int[] attrSet, javax.bluetooth.UUID[] uuidSet, javax.bluetooth.RemoteDevice btDev, @CallBackRegister("discoveryService") javax.bluetooth.DiscoveryListener discListener)
		throws javax.bluetooth.BluetoothStateException{
        return 0;
    }
    public boolean cancelServiceSearch(int transID){
        return true;
    }
    public String selectService(javax.bluetooth.UUID uuid, int security, boolean master)
		throws javax.bluetooth.BluetoothStateException{
        return "" + "DiscoveryAgent.";
    }
// Default constructor
    public DiscoveryAgent(){ super(); }
}
