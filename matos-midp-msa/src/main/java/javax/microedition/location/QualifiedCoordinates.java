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
public class QualifiedCoordinates extends javax.microedition.location.Coordinates{
// Fields
// Methods
    public  QualifiedCoordinates(double latitude, double longitude, float altitude, float horizontalAccuracy, float verticalAccuracy){
       super(0.0, 0.0, 0.0f);
        return;
    }
    public float getHorizontalAccuracy(){
        return 0.0f;
    }
    public float getVerticalAccuracy(){
        return 0.0f;
    }
    public void setHorizontalAccuracy(float horizontalAccuracy){
        return;
    }
    public void setVerticalAccuracy(float verticalAccuracy){
        return;
    }
//other constructor
    public QualifiedCoordinates(){
       super(0.0, 0.0, 0.0f);
    }
}
