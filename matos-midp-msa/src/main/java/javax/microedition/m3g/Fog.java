package javax.microedition.m3g;

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
public class Fog extends javax.microedition.m3g.Object3D{
// Fields
    public static final int EXPONENTIAL = 80;
    public static final int LINEAR = 81;
    static javax.microedition.m3g.Fog fog ;
// Methods
    public  Fog(){
        return;
    }
    public int getColor(){
        return 0;
    }
    public float getDensity(){
        return 0.0f;
    }
    public int getMode(){
        return 0;
    }
    public float getNearDistance(){
        return 0.0f;
    }
    public float getFarDistance(){
        return 0.0f;
    }
    public void setColor(int arg1){
        return;
    }
    public void setDensity(float arg1){
        return;
    }
    public void setMode(int arg1){
        return;
    }
    public void setLinear(float arg1, float arg2){
        return;
    }
}
