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
public class PolygonMode extends javax.microedition.m3g.Object3D{
// Fields
    public static final int CULL_BACK = 160;
    public static final int CULL_FRONT = 161;
    public static final int CULL_NONE = 162;
    public static final int SHADE_FLAT = 164;
    public static final int SHADE_SMOOTH = 165;
    public static final int WINDING_CCW = 168;
    public static final int WINDING_CW = 169;
    static javax.microedition.m3g.PolygonMode polygonmode ;
// Methods
    public  PolygonMode(){
        return;
    }
    public int getCulling(){
        return 0;
    }
    public int getShading(){
        return 0;
    }
    public int getWinding(){
        return 0;
    }
    public boolean isTwoSidedLightingEnabled(){
        return true;
    }
    public void setCulling(int arg1){
        return;
    }
    public void setShading(int arg1){
        return;
    }
    public void setWinding(int arg1){
        return;
    }
    public void setLocalCameraLightingEnable(boolean arg1){
        return;
    }
    public void setPerspectiveCorrectionEnable(boolean arg1){
        return;
    }
    public void setTwoSidedLightingEnable(boolean arg1){
        return;
    }
}
