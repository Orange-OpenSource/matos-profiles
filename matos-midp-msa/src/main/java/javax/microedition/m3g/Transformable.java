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

import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;

abstract public class Transformable extends javax.microedition.m3g.Object3D{
// Fields
// Methods
    public void getTranslation(float[] arg1){
        return;
    }
    public void getScale(float[] arg1){
        return;
    }
    public void getOrientation(float[] arg1){
        return;
    }
    public void setTranslation(float arg1, float arg2, float arg3){
        return;
    }
    public void setScale(float arg1, float arg2, float arg3){
        return;
    }
    public void setOrientation(float arg1, float arg2, float arg3, float arg4){
        return;
    }
    public void translate(float arg1, float arg2, float arg3){
        return;
    }
    public void scale(float arg1, float arg2, float arg3){
        return;
    }
    public void preRotate(float arg1, float arg2, float arg3, float arg4){
        return;
    }
    public void postRotate(float arg1, float arg2, float arg3, float arg4){
        return;
    }
    @FieldGet("transform")
    public void getTransform(javax.microedition.m3g.Transform arg1){
        return;
    }
    public void getCompositeTransform(javax.microedition.m3g.Transform arg1){
        return;
    }
    
    public void setTransform(@FieldSet("transform") javax.microedition.m3g.Transform arg1){
        return;
    }
}
