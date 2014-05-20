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
public interface DirectGraphics 
{
    public static final int FLIP_HORIZONTAL = 0;
    public static final int FLIP_VERTICAL = 0;
    public static final int ROTATE_90 = 0;
    public static final int ROTATE_180 = 0;
    public static final int ROTATE_270 = 0;
    public static final int TYPE_BYTE_1_GRAY = 0;
    public static final int TYPE_BYTE_1_GRAY_VERTICAL = 0;
    public static final int TYPE_BYTE_2_GRAY = 0;
    public static final int TYPE_BYTE_4_GRAY = 0;
    public static final int TYPE_BYTE_8_GRAY = 0;
    public static final int TYPE_BYTE_332_RGB = 0;
    public static final int TYPE_USHORT_4444_ARGB = 0;
    public static final int TYPE_USHORT_444_RGB = 0;
    public static final int TYPE_USHORT_555_RGB = 0;
    public static final int TYPE_USHORT_1555_ARGB = 0;
    public static final int TYPE_USHORT_565_RGB = 0;
    public static final int TYPE_INT_888_RGB = 0;
    public static final int TYPE_INT_8888_ARGB = 0;
    public abstract void setARGBColor(int i1);
    public abstract void drawImage(javax.microedition.lcdui.Image a, int b, int c, int d, int e);
    public abstract void drawTriangle(int a, int b, int c, int d, int e, int f, int g);
    public abstract void fillTriangle(int a, int b, int c, int d, int e, int f, int g);
    public abstract void drawPolygon(int[] a, int b, int[] c, int d, int e, int f);
    public abstract void fillPolygon(int[] a, int b , int[] c, int d, int e, int f);
    public abstract void drawPixels(int[] a1 , boolean a2, int a, int b, int c, int d, int e, int f, int g, int h);
    public abstract void drawPixels(byte[] a1, byte[] a2, int a, int b, int c, int d, int e, int f, int g, int h);
    public abstract void drawPixels(short[] a1, boolean a2, int a, int b, int c, int d, int e, int f, int g, int h);
    public abstract void getPixels(int[] a1, int a, int b, int c, int d, int e, int f, int g);
    public abstract void getPixels(byte[] a1, byte[] a2, int a, int b, int c, int d, int e, int f, int g);
    public abstract void getPixels(short[] a1, int a, int b, int c, int d, int e, int f, int g);
    public abstract int getNativePixelFormat();
    public abstract int getAlphaComponent();
}
