package javax.microedition.m3g;

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
public class Group extends javax.microedition.m3g.Node{
// Fields
    static javax.microedition.m3g.Group group ;
// Methods
    public  Group(){
        return;
    }
    public int getChildCount(){
        return 0;
    }
    public javax.microedition.m3g.Node getChild(int index){
    	return null;
    }
    public void addChild(javax.microedition.m3g.Node child){
        return;
    }
    public void removeChild(javax.microedition.m3g.Node arg1){
        return;
    }
    public boolean pick(int scope, float ox, float oy, float oz, float dx, float dy, float dz, javax.microedition.m3g.RayIntersection ri){
        return true;
    }
    public boolean pick(int scope, float x, float y, javax.microedition.m3g.Camera camera, javax.microedition.m3g.RayIntersection ri){
        return true;
    }
}
