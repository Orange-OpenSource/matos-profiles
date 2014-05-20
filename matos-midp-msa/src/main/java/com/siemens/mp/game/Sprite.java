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

import com.francetelecom.rd.stubs.annotation.ClassDone;

@ClassDone
public class Sprite extends GraphicObject {
    public Sprite(javax.microedition.lcdui.Image im1, javax.microedition.lcdui.Image im2, int i) throws IllegalArgumentException {};
    public Sprite(ExtendedImage im1,ExtendedImage im2,int j) throws IllegalArgumentException {};
    public Sprite(byte [] t1,int i1, int i2, int i3, byte[] t2, int i4, int i5) throws IllegalArgumentException {};
    public void setPosition(int i1, int i2) {};
    public int getXPosition() { return 0; };
    public int getYPosition() { return 0; };
    public void setCollisionRectangle(int i1, int i2, int i3, int i4) {};
    public boolean isCollidingWith(Sprite s) { return true; };
    public boolean isCollidingWithPos(int i, int j) { return true; };
    public void setFrame(int i) {};
    public int getFrame() { return 0; };
}
