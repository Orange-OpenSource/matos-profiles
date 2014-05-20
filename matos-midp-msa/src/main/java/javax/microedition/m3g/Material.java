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
public class Material extends javax.microedition.m3g.Object3D{
// Fields
    public static final int AMBIENT = 1024;
    public static final int DIFFUSE = 2048;
    public static final int EMISSIVE = 4096;
    public static final int SPECULAR = 8192;
    static javax.microedition.m3g.Material material ;
// Methods
    public  Material(){
        return;
    }
    public float getShininess(){
        return 0.0f;
    }
    public boolean isVertexColorTrackingEnabled(){
        return true;
    }
    public void setShininess(float arg1){
        return;
    }
    public void setVertexColorTrackingEnable(boolean arg1){
        return;
    }
    public int getColor(int arg1){
        return 0;
    }
    public void setColor(int arg1, int arg2){
        return;
    }
}
