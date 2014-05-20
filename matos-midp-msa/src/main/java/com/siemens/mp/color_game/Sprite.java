package com.siemens.mp.color_game;

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
public class Sprite extends Layer {
    public Sprite(javax.microedition.lcdui.Image a) throws NullPointerException { }
    public Sprite(javax.microedition.lcdui.Image c,int a,int b) throws NullPointerException, java.lang.IllegalArgumentException { }
    public Sprite(Sprite a) throws NullPointerException { }
    public boolean collidesWith(Sprite a, boolean b) { return true; }
    public boolean collidesWith(javax.microedition.lcdui.Image a, int b, int c, boolean d) {return true; }
    public final int getFrame() { return 0;}
    public int getFrameSequenceLength(){return 0;}
    public int getRawFrameCount() { return 0; }
    public void nextFrame() { return; }
    public final void paint(javax.microedition.lcdui.Graphics a) throws NullPointerException { return; }
    public void prevFrame() { return; }
    public void setCollisionRectangle(int a, int b, int c, int d) throws IllegalArgumentException { return; }
    public void setFrame(int a) throws IndexOutOfBoundsException { return; }
    public void setFrameSequence(int[] a) throws ArrayIndexOutOfBoundsException, java.lang.IllegalArgumentException { return; }
    public void setImage(javax.microedition.lcdui.Image a, int b, int c) throws NullPointerException, java.lang.IllegalArgumentException { return; }
}
