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

import com.francetelecom.rd.stubs.annotation.CallBack;
import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.ClassDone;
@ClassDone
public abstract class Layer extends Object {
	@CallBackRegister("layer")
	public Layer() {}
	@CallBack("layer")
    public final int getHeight() { return 0;};
    @CallBack("layer")
    public final int getWidth() { return 0; };
    @CallBack("layer")
    public final int getX() { return 0; };
    @CallBack("layer")
    public final int getY() { return 0; };
    @CallBack("layer")
    public final boolean isVisible() { return true; };
    public void move(int a, int b) { };
    @CallBack("layer")
    public abstract void paint(javax.microedition.lcdui.Graphics a) throws NullPointerException;
    public void setHeight(int a) throws IllegalArgumentException {};
    public void setPosition(int a, int b){};
    public void setVisible(boolean a){};
    public void setWidth(int a) throws IllegalArgumentException{};
}
