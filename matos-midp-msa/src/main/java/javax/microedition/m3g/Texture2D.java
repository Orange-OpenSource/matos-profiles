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
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;
@ClassDone
public class Texture2D extends javax.microedition.m3g.Transformable{
// Fields
    public static final int FILTER_BASE_LEVEL = 208;
    public static final int FILTER_LINEAR = 209;
    public static final int FILTER_NEAREST = 210;
    public static final int FUNC_ADD = 224;
    public static final int FUNC_BLEND = 225;
    public static final int FUNC_DECAL = 226;
    public static final int FUNC_MODULATE = 227;
    public static final int FUNC_REPLACE = 228;
    public static final int WRAP_CLAMP = 240;
    public static final int WRAP_REPEAT = 241;
    static javax.microedition.m3g.Texture2D texture2d ;
// Methods
    public  Texture2D(javax.microedition.m3g.Image2D image){
        return;
    }
    @FieldGet("image")
    public javax.microedition.m3g.Image2D getImage(){
        return new javax.microedition.m3g.Image2D(0, new java.lang.Object());
    }
    public int getBlending(){
        return 0;
    }
    public int getBlendColor(){
        return 0;
    }
    public void setImage(@FieldSet("image")javax.microedition.m3g.Image2D Image){
        return;
    }
    public void setBlending(int arg1){
        return;
    }
    public void setBlendColor(int arg1){
        return;
    }
    public int getWrappingS(){
        return 0;
    }
    public int getWrappingT(){
        return 0;
    }
    public void setWrapping(int arg1, int arg2){
        return;
    }
    public void setFiltering(int arg1, int arg2){
        return;
    }
}
