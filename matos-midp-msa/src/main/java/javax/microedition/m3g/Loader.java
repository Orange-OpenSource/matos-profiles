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

import com.francetelecom.rd.stubs.annotation.ArgsRule;
import com.francetelecom.rd.stubs.annotation.ClassDone;
@ClassDone
public class Loader extends java.lang.Object{
// Fields
    
    static final int ERROR_NONE = -1;
    static final int ERROR_ABORT = -2;
    static final int ERROR_NOTFOUND = -3;
    static final int ERROR_READ = -4;
    static final int ERROR_UNABLETOCREATE = -5;
    static final int ERROR_UNABLETOFREE = -6;
    static final int ERROR_INVALIDHEADER = -7;
    static final int ERROR_INVALIDBODY = -8;
    static final int ERROR_INVALIDCHECKSUM = -9;
    static final int ERROR_UNKNOWN = -10;
    static final int ERROR_DATAPASTEOF = -11;
    static int m3gIdentifierLength;
    static int BLOCK_SIZE;
// Methods
    public static javax.microedition.m3g.Object3D[] load(byte[] data, int offset)
		throws java.io.IOException{
    	javax.microedition.m3g.Object3D[] o3d = new javax.microedition.m3g.Object3D[1];
    	o3d[0] = new javax.microedition.m3g.Image2D(0,10,20);
        return o3d;
    }
    @ArgsRule(value = "m3g.Loader.load", pos={1})
    public static javax.microedition.m3g.Object3D[] load(String name)
		throws java.io.IOException{
    	javax.microedition.m3g.Object3D[] o3d = new javax.microedition.m3g.Object3D[1];
    	o3d[0] = new javax.microedition.m3g.Image2D(0,10,20);
        return o3d;
    }
// Default constructor
    public Loader(){ super(); }
}
