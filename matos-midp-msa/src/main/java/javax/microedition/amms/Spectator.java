package javax.microedition.amms;

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
public class Spectator extends java.lang.Object implements javax.microedition.media.Controllable{
// Fields
// Methods
    public javax.microedition.media.Control getControl(String controlType){
    	return GlobalManager.getControl(controlType);
    }
    public javax.microedition.media.Control[] getControls(){
    	javax.microedition.media.Control[] ctrl = new javax.microedition.media.Control[1];
    	ctrl[0] = getControl(null);
        return ctrl;
    }
// Default constructor
    public Spectator(){ super(); }
}
