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
public class AnimationController extends javax.microedition.m3g.Object3D{
// Fields
    static javax.microedition.m3g.AnimationController animationcontroller ;
// Methods
    public  AnimationController(){
        return;
    }
    public float getWeight(){
        return 0.0f;
    }
    public int getActiveIntervalStart(){
        return 0;
    }
    public int getActiveIntervalEnd(){
        return 0;
    }
    public float getSpeed(){
        return 0.0f;
    }
    public void setWeight(float arg1){
        return;
    }
    public void setActiveInterval(int arg1, int arg2){
        return;
    }
    public float getPosition(int arg1){
        return 0.0f;
    }
    public void setPosition(float arg1, int arg2){
        return;
    }
    public void setSpeed(float arg1, int arg2){
        return;
    }
}
