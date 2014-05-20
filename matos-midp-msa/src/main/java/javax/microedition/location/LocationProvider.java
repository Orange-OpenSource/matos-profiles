package javax.microedition.location;

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
import com.francetelecom.rd.stubs.annotation.Real;
@Real("com.francetelecom.rd.fakemidp.jsr179.LocationProviderImplem")
@ClassDone
abstract public class LocationProvider {
// Fields
    public static final int AVAILABLE = 1;
    public static final int TEMPORARILY_UNAVAILABLE = 2;
    public static final int OUT_OF_SERVICE = 3;
// Methods
    protected  LocationProvider(){
        return;
    }
    public abstract int getState();
    public static javax.microedition.location.LocationProvider getInstance(javax.microedition.location.Criteria criteria)
		throws javax.microedition.location.LocationException{
        return null;
    }
    public abstract javax.microedition.location.Location getLocation(int arg1)
		throws javax.microedition.location.LocationException, java.lang.InterruptedException;
    public abstract void setLocationListener(@CallBackRegister("location")LocationListener arg1, int arg2, int arg3, int arg4);
    public abstract void reset();
    public static javax.microedition.location.Location getLastKnownLocation(){
        return null;
    }
    public static void addProximityListener(@CallBackRegister("proximity") ProximityListener listener, javax.microedition.location.Coordinates coordinates, float proximityRadius)
		throws javax.microedition.location.LocationException{
    }
    public static void removeProximityListener(javax.microedition.location.ProximityListener listener){
        return;
    }
}
