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
@ClassDone
public class Coordinates extends java.lang.Object{
// Fields
    public static final int DD_MM_SS = 1;
    public static final int DD_MM = 2;
// Methods
    public  Coordinates(double latitude, double longitude, float altitude){
        return;
    }
    public double getLatitude(){
        return 0.0;
    }
    public double getLongitude(){
        return 0.0;
    }
    public float getAltitude(){
        return 0.0f;
    }
    public void setAltitude(float altitude){
        return;
    }
    public void setLatitude(double latitude){
        return;
    }
    public void setLongitude(double longitude){
        return;
    }
    public static double convert(String coordinate){
        return 0.0;
    }
    public static String convert(double coordinate, int outputType){
        return "" + "Coordinates.convert";
    }
    public float azimuthTo(javax.microedition.location.Coordinates to){
        return 0.0f;
    }
    public float distance(javax.microedition.location.Coordinates to){
        return 0.0f;
    }
// Default constructor
    public Coordinates(){ super(); }
}
