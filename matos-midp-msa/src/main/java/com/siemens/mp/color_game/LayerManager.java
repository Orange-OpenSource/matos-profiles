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

public class LayerManager extends Object {
    public LayerManager() { };
    public void append(Layer a) throws NullPointerException { };
    public Layer getLayerAt(int a) throws IndexOutOfBoundsException{ return null; };
    public int getSize(){ return 0;};
    public void insert(Layer a, int b) throws NullPointerException, java.lang.IndexOutOfBoundsException { };
    public void paint(javax.microedition.lcdui.Graphics a, int a1, int a2b) throws NullPointerException { };
    public void remove(Layer a){};
    public void removeLayer(com.siemens.mp.misc.NativeMem a, Layer a1) { };
    public void setViewWindow(int a, int a1, int a2, int a3) throws IllegalArgumentException { };
}
