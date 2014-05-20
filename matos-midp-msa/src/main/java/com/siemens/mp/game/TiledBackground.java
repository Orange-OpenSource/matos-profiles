package com.siemens.mp.game;

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
public class TiledBackground extends GraphicObject {
    public TiledBackground(javax.microedition.lcdui.Image i1, javax.microedition.lcdui.Image i2, byte[] t, int i3, int i4) throws IllegalArgumentException { };
    public TiledBackground(ExtendedImage i1, ExtendedImage i2, byte[] b, int i3, int i4) throws IllegalArgumentException { };
    public TiledBackground(byte[] t1, byte[] t2, byte[] t3, int i1, int i2) throws IllegalArgumentException {};
    public void setPositionInMap(int i1, int i2) {};
}
