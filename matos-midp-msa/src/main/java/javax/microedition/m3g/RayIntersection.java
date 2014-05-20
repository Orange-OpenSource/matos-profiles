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
public class RayIntersection extends java.lang.Object{
// Fields
    int swerveHandle;
// Methods
    public  RayIntersection(){
        return;
    }
    public float getDistance(){
        return 0.0f;
    }
    public javax.microedition.m3g.Node getIntersected(){
         return null;
        
    }
    public int getSubmeshIndex(){
        return 0;
    }
    public float getNormalX(){
        return 0.0f;
    }
    public float getNormalY(){
        return 0.0f;
    }
    public float getNormalZ(){
        return 0.0f;
    }
    public float getTextureS(int arg1){
        return 0.0f;
    }
    public float getTextureT(int arg1){
        return 0.0f;
    }
    public void getRay(float[] arg1){
        return;
    }
}
