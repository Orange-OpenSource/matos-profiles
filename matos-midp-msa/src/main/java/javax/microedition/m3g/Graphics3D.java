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
public class Graphics3D extends java.lang.Object{
// Fields
    int swerveHandle;
    public static final int ANTIALIAS = 2;
    public static final int DITHER = 4;
    public static final int TRUE_COLOR = 8;
    static final int SUPPORTANTIALIASING = 0;
    static final int SUPPORTTRUECOLOR = 0;
    static final int SUPPORTDITHERING = 0;
    static final int SUPPORTMIPMAP = 0;
    static final int SUPPORTPERSPECTIVECORRECTION = 1;
    static final int SUPPORTLOCALCAMERALIGHTING = 1;
    static final int MAXLIGHTS = 256;
    static final int MAXVIEWPORTDIMENSION = 1024;
    static final int MAXTEXTUREDIMENSION = 1024;
    static final int MAXSPRITECROPDIMENSION = 1024;
    static final int NUMTEXTUREUNITS = 2;
    static final int MAXTRANSFORMSPERVERTEX = 2;
// Methods
    private static Graphics3D instance = new Graphics3D();
    public static final javax.microedition.m3g.Graphics3D getInstance(){
        return instance;
    }
    public synchronized void bindTarget(Object target, boolean depthBuffer, int hints){
        return;
    }
    public synchronized void bindTarget(Object target){
        return;
    }
    public synchronized void releaseTarget(){
        return;
    }
    public void setViewport(int x, int y, int width, int height){
        return;
    }
    public void setDepthRange(float arg1, float arg2){
        return;
    }
    public synchronized void clear(javax.microedition.m3g.Background background){
        return;
    }
    public void render(javax.microedition.m3g.VertexBuffer vertices, javax.microedition.m3g.IndexBuffer triangles, javax.microedition.m3g.Appearance appearance, javax.microedition.m3g.Transform transform){
        return;
    }
    public synchronized void render(javax.microedition.m3g.VertexBuffer vertices, javax.microedition.m3g.IndexBuffer triangles, javax.microedition.m3g.Appearance appearance, javax.microedition.m3g.Transform transform, int scope){
        return;
    }
    public synchronized void render(javax.microedition.m3g.Node node, javax.microedition.m3g.Transform transform){
        return;
    }
    public synchronized void render(javax.microedition.m3g.World world){
        return;
    }
    public void setCamera(javax.microedition.m3g.Camera arg1, javax.microedition.m3g.Transform arg2){
        return;
    }
    public void setLight(int arg1, javax.microedition.m3g.Light arg2, javax.microedition.m3g.Transform arg3){
        return;
    }
    public int addLight(javax.microedition.m3g.Light arg1, javax.microedition.m3g.Transform arg2){
        return 0;
    }
    public void resetLights(){
        return;
    }
    public static final synchronized java.util.Hashtable getProperties(){
        return new java.util.Hashtable();
    }
// Default constructor
    public Graphics3D(){ super(); }
}
