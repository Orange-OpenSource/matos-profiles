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
import com.francetelecom.rd.stubs.annotation.Accumulator;
import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;
@ClassDone
@Accumulator("items")
public abstract class Item {
    public static final int LAYOUT_DEFAULT = 0;
    public static final int LAYOUT_LEFT = 1;
    public static final int LAYOUT_RIGHT = 2;
    public static final int LAYOUT_CENTER = 3;
    public static final int LAYOUT_TOP = 16;
    public static final int LAYOUT_BOTTOM = 32;
    public static final int LAYOUT_VCENTER = 48;
    public static final int LAYOUT_NEWLINE_BEFORE = 256;
    public static final int LAYOUT_NEWLINE_AFTER = 512;
    public static final int LAYOUT_SHRINK = 1024;
    public static final int LAYOUT_EXPAND = 2048;
    public static final int LAYOUT_VSHRINK = 4096;
    public static final int LAYOUT_VEXPAND = 8192;
    public static final int LAYOUT_2 = 16384;
    public static final int PLAIN = 0;
    public static final int HYPERLINK = 1;
    public static final int BUTTON = 2;
    
    public void setLabel(@FieldSet("label")String a0){ }
    @FieldGet("label")
    public String getLabel(){ return null;}
    public int getLayout(){ return 0;}
    public void setLayout(int a0){ return; }
    // public void addCommand(Command a0){ return; }
    // public void removeCommand(Command a0){ return; }
    // public void setItemCommandListener(ItemCommandListener a0){ return; }
    public int getPreferredWidth(){ return 0;}
    public int getPreferredHeight(){ return 0;}
    public void setPreferredSize(int a0,int a1){ return; }
    public int getMinimumWidth(){ return 0;}
    public int getMinimumHeight(){ return 0;}
    public void setDefaultCommand(Command a0){ return; }
    public void notifyStateChanged(){ return; }
    
    public void addCommand(@FieldSet("command") Command a0){ }
    public void removeCommand(Command a0){ }
    
    public void setItemCommandListener(@CallBackRegister("item")ItemCommandListener a0)
    { }

}

