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
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;
@ClassDone
abstract public class Object3D extends java.lang.Object{
// Fields
    int swerveHandle;
    Object uo;
    boolean ii;
// Methods
    public int getUserID(){
        return 0;
    }
    public int getAnimationTrackCount(){
        return 0;
    }
    public void setUserID(int arg1){
        return;
    }
    @FieldGet("track")
    public javax.microedition.m3g.AnimationTrack getAnimationTrack(int index){
        return null;
    }
    public void addAnimationTrack(@FieldSet("track")javax.microedition.m3g.AnimationTrack animationTrack){
        return;
    }
    public void removeAnimationTrack(javax.microedition.m3g.AnimationTrack arg1){
        return;
    }
    public final int animate(int arg1){
        return 0;
    }
    public javax.microedition.m3g.Object3D find(int userID){
    	return null;
    }
    public int getReferences(javax.microedition.m3g.Object3D[] references){
        return 0;
    }
    public final javax.microedition.m3g.Object3D duplicate(){
    	return null;
    }
    public Object getUserObject(){
        return new java.lang.Object();
    }
    public void setUserObject(Object userObject){
        return;
    }
// Default constructor
    public Object3D(){ super(); }
}
