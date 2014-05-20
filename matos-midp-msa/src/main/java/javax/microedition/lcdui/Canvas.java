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
import com.francetelecom.rd.stubs.annotation.Code;
@ClassDone
public abstract class Canvas extends Displayable {
    public static final int UP = 1;
    public static final int DOWN = 6;
    public static final int LEFT = 2;
    public static final int RIGHT = 5;
    public static final int FIRE = 8;
    public static final int GAME_A = 9;
    public static final int GAME_B = 10;
    public static final int GAME_C = 11;
    public static final int GAME_D = 12;
    public static final int KEY_NUM0 = 48;
    public static final int KEY_NUM1 = 49;
    public static final int KEY_NUM2 = 50;
    public static final int KEY_NUM3 = 51;
    public static final int KEY_NUM4 = 52;
    public static final int KEY_NUM5 = 53;
    public static final int KEY_NUM6 = 54;
    public static final int KEY_NUM7 = 55;
    public static final int KEY_NUM8 = 56;
    public static final int KEY_NUM9 = 57;
    public static final int KEY_STAR = 42;
    public static final int KEY_POUND = 35;

    @Code({
    	"int x = com.francetelecom.rd.stubs.Generator.intValue();",
    	"keyPressed(x);",
    	"keyRepeated(x);",
    	"keyReleased(x);",
    	
    	"pointerPressed(x,x);",
    	"pointerReleased(x,x);",
    	"pointerDragged(x,x);",
    	"paint(new Graphics());",
    	"sizeChanged(x,x);",
    	"showNotify();",
    	"hideNotify();"
    })
    protected Canvas(){
    }

    public boolean isDoubleBuffered(){ return true;}
    public boolean hasPointerEvents(){ return true;}
    public boolean hasPointerMotionEvents(){ return true;}
    public boolean hasRepeatEvents(){ return true;}
    public int getKeyCode(int a0){ return 0;}
    public String getKeyName(int a0){ return "" + "Canvas.getKeyName";}
    public int getGameAction(int a0){ return 0;}
    public void setFullScreenMode(boolean a0){ return; }
    protected void keyPressed(int a0){ return; }
    protected void keyRepeated(int a0){ return; }
    protected void keyReleased(int a0){ return; }
    protected void pointerPressed(int a0,int a1){ return; }
    protected void pointerReleased(int a0,int a1){ return; }
    protected void pointerDragged(int a0,int a1){ return; }
    public final void repaint(int a0,int a1,int a2,int a3){ return; }
    public final void repaint(){ return; }
    public final void serviceRepaints(){ return; }
    protected void showNotify(){ return; }
    protected void hideNotify(){ return; }
    protected abstract void paint(Graphics a0);
    protected void sizeChanged(int a0,int a1){ return; }
}

