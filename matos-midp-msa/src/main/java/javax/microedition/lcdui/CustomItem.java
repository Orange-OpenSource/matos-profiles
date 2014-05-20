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
import com.francetelecom.rd.stubs.annotation.CallBack;
import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.FieldSet;
@ClassDone
public abstract class CustomItem extends Item {
    protected static final int TRAVERSE_HORIZONTAL = 1;
    protected static final int TRAVERSE_VERTICAL = 2;
    protected static final int KEY_PRESS = 4;
    protected static final int KEY_RELEASE = 8;
    protected static final int KEY_REPEAT = 16;
    protected static final int POINTER_PRESS = 32;
    protected static final int POINTER_RELEASE = 64;
    protected static final int POINTER_DRAG = 128;
    protected static final int NONE = 0;
    @CallBackRegister("custom")
    protected CustomItem(@FieldSet("this.label") String a0){}


    public int getGameAction(int a0){ return 0;}
    @CallBack("custom")
    protected final int getInteractionModes(){ return 0;}
    @CallBack("custom")
    protected abstract int getMinContentWidth();
    @CallBack("custom")
    protected abstract int getMinContentHeight();
    @CallBack("custom")
    protected abstract int getPrefContentWidth(int a0);
    @CallBack("custom")
    protected abstract int getPrefContentHeight(int a0);
    @CallBack("custom")
    protected void sizeChanged(int a0,int a1){ return; }
    protected final void invalidate(){ return; }
    protected final void repaint(){ return; }
    protected final void repaint(int a0,int a1,int a2,int a3){ return; }
    @CallBack("custom")
    protected boolean traverse(int a0,int a1,int a2,int[] a3){ return true;}
    @CallBack("custom")
    protected void traverseOut(){ return; }
    @CallBack("custom")
    protected abstract void paint(Graphics a0,int a1,int a2);
    @CallBack("custom")
    protected void keyPressed(int a0){ return; }
    @CallBack("custom")
    protected void keyReleased(int a0){ return; }
    @CallBack("custom")
    protected void keyRepeated(int a0){ return; }
    @CallBack("custom")
    protected void pointerPressed(int a0,int a1){ return; }
    @CallBack("custom")
    protected void pointerReleased(int a0,int a1){ return; }
    @CallBack("custom")
    protected void pointerDragged(int a0,int a1){ return; }
    @CallBack("custom")
    protected void showNotify(){ return; }
    @CallBack("custom")
    protected void hideNotify(){ return; }

}

