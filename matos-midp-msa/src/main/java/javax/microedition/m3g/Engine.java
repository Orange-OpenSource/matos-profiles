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
public class Engine extends java.lang.Object{
// Fields
    static final int ANIMATIONCONTROLLER = 0;
    static final int ANIMATIONTRACK = 1;
    static final int APPEARANCE = 2;
    static final int BACKGROUND = 3;
    static final int CAMERA = 4;
    static final int COMPOSITINGMODE = 5;
    static final int FOG = 6;
    static final int GRAPHICS3D = 7;
    static final int GROUP = 8;
    static final int IMAGE2D = 9;
    static final int KEYFRAMESEQUENCE = 10;
    static final int LIGHT = 11;
    static final int LOADER = 12;
    static final int MATERIAL = 13;
    static final int MESH = 14;
    static final int MORPHINGMESH = 15;
    static final int PLASMAIMAGE = 16;
    static final int POLYGONMODE = 17;
    static final int RAYINTERSECTION = 18;
    static final int SKINNEDMESH = 19;
    static final int SPRITE3D = 20;
    static final int STAGESET = 21;
    static final int TEXTURE2D = 22;
    static final int TRANSFORM = 23;
    static final int TRIANGLESTRIPARRAY = 24;
    static final int VERTEXARRAY = 25;
    static final int VERTEXBUFFER = 26;
    static final int WORLD = 27;
    static final int UNKNOWN = 28;
    static final int OBJECT3D_FID = 0;
    static final int GRAPHICS3D_FID = 1;
    static final int LOADER_FID = 2;
    static final int RAYINTERSECTION_FID = 3;
    static final int TRANSFORM_FID = 4;
    static java.util.Hashtable peerTable;
    static javax.microedition.m3g.Object3D[] XOT;
    static int XOTlength;
// Methods
// Default constructor
    public Engine(){ super(); }
}
