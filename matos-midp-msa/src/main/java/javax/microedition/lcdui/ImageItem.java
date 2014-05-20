package javax.microedition.lcdui;

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
public class ImageItem extends Item {
    public static final int LAYOUT_DEFAULT = 0;
    public static final int LAYOUT_LEFT = 1;
    public static final int LAYOUT_RIGHT = 2;
    public static final int LAYOUT_CENTER = 3;
    public static final int LAYOUT_NEWLINE_BEFORE = 256;
    public static final int LAYOUT_NEWLINE_AFTER = 512;
    
    public ImageItem(@FieldSet("this.label")String a0,@FieldSet("image")Image a1,int a2,@FieldSet("text")java.lang.String a3){
    }
    public ImageItem(@FieldSet("this.label")String a0,@FieldSet("image")Image a1,int a2,@FieldSet("text")java.lang.String a3,int a4){
    }
    @FieldGet("image")
    public Image getImage() { return null; }
    public void setImage(@FieldSet("image") Image a0){  }
    @FieldGet("text")
    public String getAltText(){ return null;}
    public void setAltText(@FieldSet("text")String a0){ }
    public int getLayout(){ return 0;}
    public void setLayout(int a0){ return; }
    public int getAppearanceMode(){ return 0;}
}

