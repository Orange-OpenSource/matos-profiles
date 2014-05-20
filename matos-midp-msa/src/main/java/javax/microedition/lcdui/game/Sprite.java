package javax.microedition.lcdui.game;

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
    public static final int TRANS_NONE = 0;
    public static final int TRANS_ROT90 = 5;
    public static final int TRANS_ROT180 = 3;
    public static final int TRANS_ROT270 = 6;
    public static final int TRANS_MIRROR = 2;
    public static final int TRANS_MIRROR_ROT90 = 7;
    public static final int TRANS_MIRROR_ROT180 = 1;
    public static final int TRANS_MIRROR_ROT270 = 4;
    public Sprite(javax.microedition.lcdui.Image a0){}
    public Sprite(javax.microedition.lcdui.Image a0,int a1,int a2){}
    public Sprite(Sprite a0){}
    public void defineReferencePixel(int a0,int a1){ return; }
    public void setRefPixelPosition(int a0,int a1){ return; }
    public int getRefPixelX(){ return 0;}
    public int getRefPixelY(){ return 0;}
    public void setFrame(int a0){ return; }
    public final int getFrame(){ return 0;}
    public int getRawFrameCount(){ return 0;}
    public int getFrameSequenceLength(){ return 0;}
    public void nextFrame(){ return; }
    public void prevFrame(){ return; }
    public final void paint(javax.microedition.lcdui.Graphics a0){ return; }
    public void setFrameSequence(int[] a0){ return; }
    public void setImage(javax.microedition.lcdui.Image a0,int a1,int a2){ return; }
    public void defineCollisionRectangle(int a0,int a1,int a2,int a3){ return; }
    public void setTransform(int a0){ return; }
    public final boolean collidesWith(Sprite a0,boolean a1){ return true;}
    public final boolean collidesWith(TiledLayer a0,boolean a1){ return true;}
    public final boolean collidesWith(javax.microedition.lcdui.Image a0,int a1,int a2,boolean a3){ return true;}
}

