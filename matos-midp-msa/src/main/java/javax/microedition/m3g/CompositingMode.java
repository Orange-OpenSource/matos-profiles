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
public class CompositingMode extends javax.microedition.m3g.Object3D{
// Fields
    public static final int ALPHA = 64;
    public static final int ALPHA_ADD = 65;
    public static final int MODULATE = 66;
    public static final int MODULATE_X2 = 67;
    public static final int REPLACE = 68;
    static javax.microedition.m3g.CompositingMode compositingmode ;
// Methods
    public  CompositingMode(){
        return;
    }
    public float getAlphaThreshold(){
        return 0.0f;
    }
    public int getBlending(){
        return 0;
    }
    public boolean isColorWriteEnabled(){
        return true;
    }
    public boolean isAlphaWriteEnabled(){
        return true;
    }
    public boolean isDepthWriteEnabled(){
        return true;
    }
    public boolean isDepthTestEnabled(){
        return true;
    }
    public float getDepthOffsetFactor(){
        return 0.0f;
    }
    public float getDepthOffsetUnits(){
        return 0.0f;
    }
    public void setAlphaThreshold(float arg1){
        return;
    }
    public void setBlending(int arg1){
        return;
    }
    public void setColorWriteEnable(boolean arg1){
        return;
    }
    public void setAlphaWriteEnable(boolean arg1){
        return;
    }
    public void setDepthWriteEnable(boolean arg1){
        return;
    }
    public void setDepthTestEnable(boolean arg1){
        return;
    }
    public void setDepthOffset(float arg1, float arg2){
        return;
    }
}
