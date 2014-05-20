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
public class Light extends javax.microedition.m3g.Node{
// Fields
    public static final int AMBIENT = 128;
    public static final int DIRECTIONAL = 129;
    public static final int OMNI = 130;
    public static final int SPOT = 131;
    static javax.microedition.m3g.Light light ;
// Methods
    public  Light(){
        return;
    }
    public int getMode(){
        return 0;
    }
    public int getColor(){
        return 0;
    }
    public float getIntensity(){
        return 0.0f;
    }
    public float getSpotAngle(){
        return 0.0f;
    }
    public float getSpotExponent(){
        return 0.0f;
    }
    public float getConstantAttenuation(){
        return 0.0f;
    }
    public float getLinearAttenuation(){
        return 0.0f;
    }
    public float getQuadraticAttenuation(){
        return 0.0f;
    }
    public void setMode(int arg1){
        return;
    }
    public void setColor(int arg1){
        return;
    }
    public void setIntensity(float arg1){
        return;
    }
    public void setSpotAngle(float arg1){
        return;
    }
    public void setSpotExponent(float arg1){
        return;
    }
    public void setAttenuation(float arg1, float arg2, float arg3){
        return;
    }
}
