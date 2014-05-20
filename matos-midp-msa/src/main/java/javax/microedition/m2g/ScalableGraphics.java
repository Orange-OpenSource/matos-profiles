package javax.microedition.m2g;

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
public class ScalableGraphics extends java.lang.Object{
// Fields
 

    public static final int RENDERING_QUALITY_LOW = 1;
    public static final int RENDERING_QUALITY_HIGH = 2;
// Methods
    public void bindTarget(Object target){
        return;
    }
    public void releaseTarget(){
        return;
    }
    public void render(int x, int y, javax.microedition.m2g.ScalableImage image){
        return;
    }
    public void setRenderingQuality(int mode){
        return;
    }
    public void setTransparency(float alpha){
        return;
    }
    public static javax.microedition.m2g.ScalableGraphics createInstance(){
        return new ScalableGraphics();
    }
}
