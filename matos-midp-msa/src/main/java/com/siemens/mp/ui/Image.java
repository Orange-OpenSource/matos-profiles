package com.siemens.mp.ui;

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
public class Image extends com.siemens.mp.misc.NativeMem {
    public static final int COLOR_BMP_8BIT = 0;
    public Image(int a,int b) {};
    public Image(Image a) {};
    public Image(byte[] a,int b,int c) {};
    public Image(byte[] a,int b,int c,boolean d) {};
    public Image(String a,boolean b) throws java.io.IOException {};
    public Image(byte[] a)  {};
    public Image(byte[] a,int b,int c,int d) throws java.io.IOException {};
    public int getHeight() {return 0;};
    public int getWidth() {return 0;};
    public static javax.microedition.lcdui.Image createImageWithScaling(String a) throws java.io.IOException { return javax.microedition.lcdui.Image.createImage (0,0); }
    public static javax.microedition.lcdui.Image createImageWithoutScaling(String a) throws java.io.IOException { return javax.microedition.lcdui.Image.createImage (0,0); }
    public static javax.microedition.lcdui.Image createImageFromBitmap(byte[] a, int b, int c) { return javax.microedition.lcdui.Image.createImage (0,0); }
    public static javax.microedition.lcdui.Image createRGBImage(byte[] a, int b, int c, int d) throws ArrayIndexOutOfBoundsException, java.io.IOException { return javax.microedition.lcdui.Image.createImage (0,0); }
    public static javax.microedition.lcdui.Image createTransparentImageFromBitmap(byte[] a, int b, int c) { return javax.microedition.lcdui.Image.createImage (0,0); }
    public static void mirrorImageHorizontally(javax.microedition.lcdui.Image a) {};
    public static void mirrorImageVertically(javax.microedition.lcdui.Image a) {};
}
