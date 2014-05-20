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
import com.francetelecom.rd.stubs.annotation.Field;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;
import com.francetelecom.rd.stubs.annotation.Fields;
@ClassDone
@Fields( {
		@Field(value="vertex",type="javax.microedition.m3g.VertexBuffer",modifier=4),
		@Field(value="app",type="javax.microedition.m3g.Appearance",modifier=4),
		@Field(value="tri",type="javax.microedition.m3g.IndexBuffer",modifier=4)
})

public class Mesh extends javax.microedition.m3g.Node{
// Fields
    static javax.microedition.m3g.Mesh mesh ;
// Methods
    protected Mesh() {}
    @Code("app=arg3[0];tri=arg2[0];")
    public  Mesh(@FieldSet("this.vertex")javax.microedition.m3g.VertexBuffer vertices, javax.microedition.m3g.IndexBuffer[] triangles, javax.microedition.m3g.Appearance[] appearances){
        return;
    }
    public  Mesh(@FieldSet("this.vertex") javax.microedition.m3g.VertexBuffer vertices, @FieldSet("this.tri") javax.microedition.m3g.IndexBuffer triangles, @FieldSet("this.app") javax.microedition.m3g.Appearance appearance){
        return;
    }
    public int getSubmeshCount(){
        return 0;
    }
    @FieldGet("vertex")
    public javax.microedition.m3g.VertexBuffer getVertexBuffer(){
        return new javax.microedition.m3g.VertexBuffer();
    }
    @FieldGet("tri")
    public javax.microedition.m3g.IndexBuffer getIndexBuffer(int index){
        return new javax.microedition.m3g.TriangleStripArray(new int[1], new int[1]);
    }
    @FieldGet("app")
    public javax.microedition.m3g.Appearance getAppearance(int index){
        return new javax.microedition.m3g.Appearance();
    }
    public void setAppearance(int index, @FieldSet("this.app") javax.microedition.m3g.Appearance Appearance){
        return;
    }
}
