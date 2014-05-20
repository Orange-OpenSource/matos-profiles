package com.siemens.mp.game;

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
import javax.microedition.lcdui.Image;

import com.francetelecom.rd.stubs.annotation.ClassDone;
@ClassDone
public class ExtendedImage extends com.siemens.mp.misc.NativeMem {
    public ExtendedImage(javax.microedition.lcdui.Image i1) throws IllegalArgumentException {};
    public void setPixel(int i1, int i2, byte b) {};
    public void setPixels(byte[] b, int i1, int i2, int i3, int i4) {};
    public int getPixel(int i1, int i2) { return 0;};
    public void getPixelBytes(byte[] b, int i1, int i2, int i3, int i4) {};
    public void clear(byte b) {};
    public void blitToScreen(int i1, int i2) {};
    public javax.microedition.lcdui.Image getImage() { return Image.createImage( (Image) null); };
}
