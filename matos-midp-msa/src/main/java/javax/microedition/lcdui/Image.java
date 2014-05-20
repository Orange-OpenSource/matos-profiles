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

@ClassDone
public class Image {
    public static Image createImage(int a0,int a1) { 
    	return new Image(); 
    }
    public static Image createImage(Image a0) { return new Image(); }
    public static Image createImage(String a0) throws java.io.IOException { 
    	return new Image();
    }
    public static Image createImage(byte[] a0,int a1,int a2) { 
    	return new Image();
    }

    public static Image createImageFromBitmap(byte[] a0, int a1, int a2) { 
    	return new Image();
    }
    public static Image createImage(Image a0,int a1,int a2,int a3,int a4,int a5) { return new Image(); }
    public Graphics getGraphics() { return new Graphics(); }
    public int getWidth(){ return 0;}
    public int getHeight(){ return 0;}
    public boolean isMutable(){ return true;}
    public static Image createImage(java.io.InputStream a0) throws java.io.IOException { 
    	return new Image();
    }
    public static Image createRGBImage(int[] a0,int a1,int a2,boolean a3) { return new Image();
    }
    public void getRGB(int[] a0,int a1,int a2,int a3,int a4,int a5,int a6){ return; }
}

