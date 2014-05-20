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
public final class Font extends Object {
    public static final int STYLE_PLAIN = 0;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_UNDERLINED = 4;
    public static final int SIZE_SMALL = 8;
    public static final int SIZE_MEDIUM = 0;
    public static final int SIZE_LARGE = 16;
    public static final int FACE_SYSTEM = 0;
    public static final int FACE_MONOSPACE = 32;
    public static final int FACE_PROPORTIONAL = 64;
    public static final int FONT_STATIC_TEXT = 0;
    public static final int FONT_INPUT_TEXT = 1;
    private static Font defaultfont = new Font();
    public static Font getFont(int a0) { return new Font(); }
    public static Font getDefaultFont() { return defaultfont; }
    public static Font getFont(int a0,int a1,int a2) { return new Font(); }
    public int getStyle(){ return 0;}
    public int getSize(){ return 0;}
    public int getFace(){ return 0;}
    public boolean isPlain(){ return true;}
    public boolean isBold(){ return true;}
    public boolean isItalic(){ return true;}
    public boolean isUnderlined(){ return true;}
    public int getHeight(){ return 0;}
    public int getBaselinePosition(){ return 0;}
    public int charWidth(char a0){ return 0;}
    public int charsWidth(char[] a0,int a1,int a2){ return 0;}
    public int stringWidth(String a0){ return 0;}
    public int substringWidth(String a0,int a1,int a2){ return 0;}
}

