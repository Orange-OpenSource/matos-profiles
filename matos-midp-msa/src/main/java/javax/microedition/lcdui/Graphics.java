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
public class Graphics extends Object {
    public static final int HCENTER = 1;
    public static final int VCENTER = 2;
    public static final int LEFT = 4;
    public static final int RIGHT = 8;
    public static final int TOP = 16;
    public static final int BOTTOM = 32;
    public static final int BASELINE = 64;
    public static final int SOLID = 0;
    public static final int DOTTED = 1;
    public void translate(int a0,int a1){ return; }
    public int getTranslateX(){ return 0;}
    public int getTranslateY(){ return 0;}
    public int getColor(){ return 0;}
    public int getRedComponent(){ return 0;}
    public int getGreenComponent(){ return 0;}
    public int getBlueComponent(){ return 0;}
    public int getGrayScale(){ return 0;}
    public void setColor(int a0,int a1,int a2){ return; }
    public void setColor(int a0){ return; }
    public void setGrayScale(int a0){ return; }
    public Font getFont() { return new Font(); }
    public void setStrokeStyle(int a0){ return; }
    public int getStrokeStyle(){ return 0;}
    public void setFont(Font a0){ return; }
    public int getClipX(){ return 0;}
    public int getClipY(){ return 0;}
    public int getClipWidth(){ return 0;}
    public int getClipHeight(){ return 0;}
    public void clipRect(int a0,int a1,int a2,int a3){ return; }
    public void setClip(int a0,int a1,int a2,int a3){ return; }
    public void drawLine(int a0,int a1,int a2,int a3){ return; }
    public void fillRect(int a0,int a1,int a2,int a3){ return; }
    public void drawRect(int a0,int a1,int a2,int a3){ return; }
    public void drawRoundRect(int a0,int a1,int a2,int a3,int a4,int a5){ return; }
    public void fillRoundRect(int a0,int a1,int a2,int a3,int a4,int a5){ return; }
    public void fillArc(int a0,int a1,int a2,int a3,int a4,int a5){ return; }
    public void drawArc(int a0,int a1,int a2,int a3,int a4,int a5){ return; }
    public void drawString(String a0,int a1,int a2,int a3){ return; }
    public void drawSubstring(String a0,int a1,int a2,int a3,int a4,int a5){ return; }
    public void drawChar(char a0,int a1,int a2,int a3){ return; }
    public void drawChars(char[] a0,int a1,int a2,int a3,int a4,int a5){ return; }
    public void drawImage(Image a0,int a1,int a2,int a3){ return; }
    public void drawRegion(Image a0,int a1,int a2,int a3,int a4,int a5,int a6,int a7,int a8){ return; }
    public void copyArea(int a0,int a1,int a2,int a3,int a4,int a5,int a6){ return; }
    public void fillTriangle(int a0,int a1,int a2,int a3,int a4,int a5){ return; }
    public void drawRGB(int[] a0,int a1,int a2,int a3,int a4,int a5,int a6,boolean a7){ return; }
    public int getDisplayColor(int a0){ return 0;}
}

