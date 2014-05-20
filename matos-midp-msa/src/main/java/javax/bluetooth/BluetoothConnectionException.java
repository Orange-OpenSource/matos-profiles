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
public class BluetoothConnectionException extends java.io.IOException{
// Fields
    public static final int UNKNOWN_PSM = 1;
    public static final int SECURITY_BLOCK = 2;
    public static final int NO_RESOURCES = 3;
    public static final int FAILED_NOINFO = 4;
    public static final int TIMEOUT = 5;
    public static final int UNACCEPTABLE_PARAMS = 6;
// Methods
    public  BluetoothConnectionException(int error){
        return;
    }
    public  BluetoothConnectionException(int error, String msg){
        return;
    }
    public int getStatus(){
        return 0;
    }
// Default constructor
    public BluetoothConnectionException(){ super(); }
}
