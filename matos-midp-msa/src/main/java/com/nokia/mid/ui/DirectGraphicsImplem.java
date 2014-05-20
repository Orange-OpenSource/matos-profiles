package com.nokia.mid.ui;

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
public class DirectGraphicsImplem implements DirectGraphics
{
    public void setARGBColor(int i) {};
    public void drawImage(javax.microedition.lcdui.Image im, int i1, int i2, int i3, int i4) {};
    public  void drawTriangle(int i1, int i2, int i3, int i4, int i5, int i6, int i7) {};
    public  void fillTriangle(int i1, int i2, int i3, int i4, int i5, int i6, int i7) {};
    public  void drawPolygon(int[] t1, int i1, int[] t2, int i2, int i3, int i4) {};
    public  void fillPolygon(int[] t1, int i1, int[] t2, int i3, int i4, int i5) {};
    public  void drawPixels(int[] t , boolean b, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {};
    public  void drawPixels(byte[] b1, byte[] b2, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {};
    public  void drawPixels(short[] t, boolean b, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {};
    public  void getPixels(int[] b, int i1, int i2, int i3, int i4, int i5, int i6, int i7) {};
    public  void getPixels(byte[] b1, byte[] b2, int i1, int i2, int i3, int i4, int i5, int i6, int i7) {};
    public  void getPixels(short[] b, int i1, int i2, int i3, int i4, int i5, int i6, int i7) {};
    public  int getNativePixelFormat() { return 0; };
    public  int getAlphaComponent() { return 0; };
}
