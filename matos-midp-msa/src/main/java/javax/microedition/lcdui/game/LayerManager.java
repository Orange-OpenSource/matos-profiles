package javax.microedition.lcdui.game;

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
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;
@ClassDone
public class LayerManager
 
{

    public LayerManager(){}
    @FieldGet("layer")
    public Layer getLayerAt(int a0) { return null; }
    public int getSize(){ return 0;}
    public void remove(Layer a0){ return; }
    public void paint(javax.microedition.lcdui.Graphics a0,int a1,int a2){
    	return; 
    }
    public void setViewWindow(int a0,int a1,int a2,int a3){ return; }
    
    public void append(@FieldSet("layer")@CallBackRegister("layer") Layer a0){
    	return; 
    }
    public void insert(@FieldSet("layer")@CallBackRegister("layer") Layer a0,int a1){
    	return;
    }
}

