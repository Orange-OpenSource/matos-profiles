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
import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;

@ClassDone
public class SkinnedMesh extends javax.microedition.m3g.Mesh{
// Fields
    static javax.microedition.m3g.SkinnedMesh skinnedmesh ;
// Methods
    @Code("tri=arg2[0];app=arg3[0];")
    public  SkinnedMesh(@FieldSet("this.vertex")javax.microedition.m3g.VertexBuffer vertices, javax.microedition.m3g.IndexBuffer[] submeshes, javax.microedition.m3g.Appearance[] appearances, @FieldSet("skel") javax.microedition.m3g.Group skeleton){
       super(new javax.microedition.m3g.VertexBuffer(), new javax.microedition.m3g.IndexBuffer[1], new javax.microedition.m3g.Appearance[1]);
        return;
    }
    public  SkinnedMesh(@FieldSet("this.vertex")javax.microedition.m3g.VertexBuffer vertices, @FieldSet("this.tri") javax.microedition.m3g.IndexBuffer submesh, @FieldSet("this.app") javax.microedition.m3g.Appearance appearance, @FieldSet("skel")javax.microedition.m3g.Group skeleton){
       super(new javax.microedition.m3g.VertexBuffer(), new javax.microedition.m3g.IndexBuffer[1], new javax.microedition.m3g.Appearance[1]);
        return;
    }
    @FieldGet("skel")
    public javax.microedition.m3g.Group getSkeleton(){
        return new javax.microedition.m3g.Group();
    }
    public void addTransform(javax.microedition.m3g.Node bone, int weight, int firstVertex, int numVertices){
        return;
    }
//other constructor
    public SkinnedMesh(){
       super(new javax.microedition.m3g.VertexBuffer(), new javax.microedition.m3g.IndexBuffer[1], new javax.microedition.m3g.Appearance[1]);
    }
}
