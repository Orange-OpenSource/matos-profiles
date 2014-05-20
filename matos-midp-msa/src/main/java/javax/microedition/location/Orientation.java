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
import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.UseRule;
@ClassDone
public class Orientation extends java.lang.Object{
// Fields
// Methods
    public  Orientation(float azimuth, boolean isMagnetic, float pitch, float roll){
        return;
    }
    public float getCompassAzimuth(){
        return 0.0f;
    }
    public boolean isOrientationMagnetic(){
        return true;
    }
    public float getPitch(){
        return 0.0f;
    }
    public float getRoll(){
        return 0.0f;
    }
    @UseRule("Orientation.getOrientation")
    public static javax.microedition.location.Orientation getOrientation()
		throws javax.microedition.location.LocationException{
        return null;
    }
// Default constructor
    public Orientation(){ super(); }
}
