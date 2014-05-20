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
public class Image2D extends javax.microedition.m3g.Object3D{
// Fields
    public static final int ALPHA = 96;
    public static final int LUMINANCE = 97;
    public static final int LUMINANCE_ALPHA = 98;
    public static final int RGB = 99;
    public static final int RGBA = 100;
    static javax.microedition.m3g.Image2D image2d ;
// Methods
    public  Image2D(int format, int width, int height, byte[] image){
        return;
    }
    public  Image2D(int format, int width, int height, byte[] image, byte[] palette){
        return;
    }
    public  Image2D(int format, int width, int height){
        return;
    }
    public  Image2D(int format, Object image){
        return;
    }
    public int getFormat(){
        return 0;
    }
    public int getWidth(){
        return 0;
    }
    public int getHeight(){
        return 0;
    }
    public boolean isMutable(){
        return true;
    }
    public void set(int arg1, int arg2, int arg3, int arg4, byte[] arg5){
        return;
    }
}
