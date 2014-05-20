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
public class KeyframeSequence extends javax.microedition.m3g.Object3D{
// Fields
    public static final int LINEAR = 176;
    public static final int SLERP = 177;
    public static final int SPLINE = 178;
    public static final int SQUAD = 179;
    public static final int STEP = 180;
    public static final int CONSTANT = 192;
    public static final int LOOP = 193;
    static javax.microedition.m3g.KeyframeSequence keyframesequence ;
// Methods
    public  KeyframeSequence(int numKeyframes, int numComponents, int interpolation){
        return;
    }
    public int getDuration(){
        return 0;
    }
    public int getRepeatMode(){
        return 0;
    }
    public void setDuration(int arg1){
        return;
    }
    public void setRepeatMode(int arg1){
        return;
    }
    public void setKeyframe(int arg1, int arg2, float[] arg3){
        return;
    }
    public void setValidRange(int arg1, int arg2){
        return;
    }
}
