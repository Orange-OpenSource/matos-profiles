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
public class Camera extends javax.microedition.m3g.Node{
// Fields
    public static final int GENERIC = 48;
    public static final int PARALLEL = 49;
    public static final int PERSPECTIVE = 50;
    static javax.microedition.m3g.Camera camera ;
// Methods
    public  Camera(){
        return;
    }
    public int getProjection(float[] params){
        return 0;
    }
    public int getProjection(javax.microedition.m3g.Transform transform){
        return 0;
    }
    public void setGeneric(javax.microedition.m3g.Transform arg1){
        return;
    }
    public void setParallel(float arg1, float arg2, float arg3, float arg4){
        return;
    }
    public void setPerspective(float arg1, float arg2, float arg3, float arg4){
        return;
    }
}
