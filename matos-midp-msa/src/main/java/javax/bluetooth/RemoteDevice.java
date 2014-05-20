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
@ClassDone
public class RemoteDevice extends java.lang.Object{
// Fields
// Methods
    protected  RemoteDevice(String address){
        return;
    }
    public boolean isTrustedDevice(){
        return true;
    }
    public String getFriendlyName(boolean alwaysAsk)
		throws java.io.IOException{
        return "" + "RemoteDevice.";
    }
    public final String getBluetoothAddress(){
        return "" + "RemoteDevice.";
    }
    public boolean equals(Object obj){
        return true;
    }
    public int hashCode(){
        return 0;
    }
    public static javax.bluetooth.RemoteDevice getRemoteDevice(javax.microedition.io.Connection conn)
		throws java.io.IOException{
        return new RemoteDevice();
    }
    public boolean authenticate()
		throws java.io.IOException{
        return true;
    }
    public boolean authorize(javax.microedition.io.Connection conn)
		throws java.io.IOException{
        return true;
    }
    public boolean encrypt(javax.microedition.io.Connection conn, boolean on)
		throws java.io.IOException{
        return true;
    }
    public boolean isAuthenticated(){
        return true;
    }
    public boolean isAuthorized(javax.microedition.io.Connection conn)
		throws java.io.IOException{
        return true;
    }
    public boolean isEncrypted(){
        return true;
    }
// Default constructor
    public RemoteDevice(){ super(); }
}
