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
public class TiledLayer extends Layer {
    public TiledLayer(int a1,int a2,javax.microedition.lcdui.Image a3,int a4,int a5) throws NullPointerException, java.lang.IllegalArgumentException , java.lang.OutOfMemoryError { }
    public int createAnimatedTile(int a) throws IndexOutOfBoundsException, java.lang.IllegalArgumentException {return 0;}
    public void fillCells(int a1, int a2, int a3, int a4, int a5) throws IndexOutOfBoundsException { }
    public int getAnimatedTile(int a) throws IndexOutOfBoundsException {return 0;}
    public int getCell(int a1, int a2) throws IndexOutOfBoundsException{return 0;}
    public final int getCellHeight() {return 0;}
    public final int getCellWidth() {return 0;}
    public final int getColumns() {return 0;}
    public final int getRows() {return 0;}
    public final void paint(javax.microedition.lcdui.Graphics a) throws NullPointerException { }
    public void setAnimatedTile(int a1, int a2) { }
    public void setCell(int a1, int a2, int a3) throws IndexOutOfBoundsException { }
    public void setStaticTileSet(javax.microedition.lcdui.Image a1, int a2, int a3) throws NullPointerException, java.lang.IllegalArgumentException { }
}
