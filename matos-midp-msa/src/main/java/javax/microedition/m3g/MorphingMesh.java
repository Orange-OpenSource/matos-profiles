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
public class MorphingMesh extends javax.microedition.m3g.Mesh{
// Fields
    static javax.microedition.m3g.MorphingMesh morphingmesh ;
// Methods
    @Code("tri=arg3[0];app=arg4[0];")
    public  MorphingMesh(@FieldSet("this.vertex")javax.microedition.m3g.VertexBuffer vertices, javax.microedition.m3g.VertexBuffer[] targets, javax.microedition.m3g.IndexBuffer[] triangles, javax.microedition.m3g.Appearance[] appearances){
       super(new javax.microedition.m3g.VertexBuffer(), new javax.microedition.m3g.IndexBuffer[1], new javax.microedition.m3g.Appearance[1]);
        return;
    }
    public  MorphingMesh(@FieldSet("this.vertex")javax.microedition.m3g.VertexBuffer vertices, javax.microedition.m3g.VertexBuffer[] targets, @FieldSet("this.tri") javax.microedition.m3g.IndexBuffer triangles, @FieldSet("this.app")javax.microedition.m3g.Appearance appearance){
       super(new javax.microedition.m3g.VertexBuffer(), new javax.microedition.m3g.IndexBuffer[1], new javax.microedition.m3g.Appearance[1]);
        return;
    }
    public int getMorphTargetCount(){
        return 0;
    }
    
    public javax.microedition.m3g.VertexBuffer getMorphTarget(int index){
        return new javax.microedition.m3g.VertexBuffer();
    }
    public void getWeights(float[] arg1){
        return;
    }
    public void setWeights(float[] arg1){
        return;
    }
//other constructor
    public MorphingMesh(){
       super(new javax.microedition.m3g.VertexBuffer(), new javax.microedition.m3g.IndexBuffer[1], new javax.microedition.m3g.Appearance[1]);
    }
}
