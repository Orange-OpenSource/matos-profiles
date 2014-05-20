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
abstract public class Node extends javax.microedition.m3g.Transformable{
// Fields
    public static final int NONE = 144;
    public static final int ORIGIN = 145;
    public static final int X_AXIS = 146;
    public static final int Y_AXIS = 147;
    public static final int Z_AXIS = 148;
// Methods
    public javax.microedition.m3g.Node getParent(){
    	return null;
    }
    public float getAlphaFactor(){
        return 0.0f;
    }
    public boolean isRenderingEnabled(){
        return true;
    }
    public boolean isPickingEnabled(){
        return true;
    }
    public int getScope(){
        return 0;
    }
    public void setAlphaFactor(float arg1){
        return;
    }
    public void setRenderingEnable(boolean arg1){
        return;
    }
    public void setPickingEnable(boolean arg1){
        return;
    }
    public void setScope(int arg1){
        return;
    }
    public boolean getTransformTo(javax.microedition.m3g.Node arg1, javax.microedition.m3g.Transform arg2){
        return true;
    }
    public void setAlignment(javax.microedition.m3g.Node zReference, int zTarget, javax.microedition.m3g.Node yReference, int yTarget){
        return;
    }
    public final void align(javax.microedition.m3g.Node arg1){
        return;
    }
}
