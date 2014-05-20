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
public class Landmark extends java.lang.Object{
// Fields
// Methods
    public  Landmark(String name, String description, javax.microedition.location.QualifiedCoordinates coordinates, javax.microedition.location.AddressInfo addressInfo){
        return;
    }
    public String getName(){
        return "" + "Landmark.";
    }
    public String getDescription(){
        return "" + "Landmark.";
    }
    public javax.microedition.location.QualifiedCoordinates getQualifiedCoordinates(){
        return new javax.microedition.location.QualifiedCoordinates(0.0, 0.0, 0.0f, 0.0f, 0.0f);
    }
    public javax.microedition.location.AddressInfo getAddressInfo(){
        return new javax.microedition.location.AddressInfo();
    }
    public void setName(String name){
        return;
    }
    public void setDescription(String description){
        return;
    }
    public void setQualifiedCoordinates(javax.microedition.location.QualifiedCoordinates coordinates){
        return;
    }
    public void setAddressInfo(javax.microedition.location.AddressInfo addressInfo){
        return;
    }
    public boolean equals(Object o){
        return true;
    }
// Default constructor
    public Landmark(){ super(); }
}
