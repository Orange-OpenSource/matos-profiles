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
import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;
@ClassDone

public class Display {
    
    public static final int LIST_ELEMENT = 1;
    public static final int CHOICE_GROUP_ELEMENT = 2;
    public static final int ALERT = 3;
    public static final int COLOR_BACKGROUND = 0;
    public static final int COLOR_FOREGROUND = 1;
    public static final int COLOR_HIGHLIGHTED_BACKGROUND = 2;
    public static final int COLOR_HIGHLIGHTED_FOREGROUND = 3;
    public static final int COLOR_BORDER = 4;
    public static final int COLOR_HIGHLIGHTED_BORDER = 5;
    private Display() {}
    public static Display getDisplay(javax.microedition.midlet.MIDlet a0) {
    	return null;
    }
    public int getColor(int a0){ return 0;}
    public int getBorderStyle(boolean a0){ return 0;}
    public boolean isColor(){ return true;}
    public int numColors(){ return 0;}
    public int numAlphaLevels(){ return 0;}
    public boolean flashBacklight(int a0){ return true;}
    public boolean vibrate(int a0){ return true;}
    public int getBestImageWidth(int a0){ return 0;}
    public int getBestImageHeight(int a0){ return 0;}

    @FieldGet("current")
    public Displayable getCurrent() { return null;}
    
    public void setCurrent(@FieldSet("current") Displayable a0){ }
    @Code("current=arg1; current=arg2;")
    public void setCurrent( Alert a0, Displayable a1){ }
    public void callSerially(@CallBackRegister("runnable") Runnable a0){ }
    public void setCurrentItem(Item a0){  }

}

