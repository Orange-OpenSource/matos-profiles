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
public class Background extends javax.microedition.m3g.Object3D{
// Fields
    public static final int BORDER = 32;
    public static final int REPEAT = 33;
    static javax.microedition.m3g.Background background ;
// Methods
    public  Background(){
        return;
    }
    public int getColor(){
        return 0;
    }
    @FieldGet("image")
    public javax.microedition.m3g.Image2D getImage(){
        return new javax.microedition.m3g.Image2D(0, new java.lang.Object());
    }
    public int getImageModeX(){
        return 0;
    }
    public int getImageModeY(){
        return 0;
    }
    public int getCropX(){
        return 0;
    }
    public int getCropY(){
        return 0;
    }
    public int getCropWidth(){
        return 0;
    }
    public int getCropHeight(){
        return 0;
    }
    public boolean isColorClearEnabled(){
        return true;
    }
    public boolean isDepthClearEnabled(){
        return true;
    }
    public void setColor(int arg1){
        return;
    }
    public void setImage(@FieldSet("image") javax.microedition.m3g.Image2D Image){
        return;
    }
    public void setColorClearEnable(boolean arg1){
        return;
    }
    public void setDepthClearEnable(boolean arg1){
        return;
    }
    public void setImageMode(int arg1, int arg2){
        return;
    }
    public void setCrop(int arg1, int arg2, int arg3, int arg4){
        return;
    }
}
