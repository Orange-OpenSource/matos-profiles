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
public class VertexBuffer extends javax.microedition.m3g.Object3D{
// Fields
    static javax.microedition.m3g.VertexBuffer vertexbuffer ;
// Methods
    public  VertexBuffer(){
        return;
    }
    public javax.microedition.m3g.VertexArray getNormals(){
        return null;
    }
    public javax.microedition.m3g.VertexArray getColors(){
        return null;
    }
    public int getDefaultColor(){
        return 0;
    }
    public int getVertexCount(){
        return 0;
    }
    public void setNormals(javax.microedition.m3g.VertexArray Normals){
        return;
    }
    public void setColors(javax.microedition.m3g.VertexArray Colors){
        return;
    }
    public void setDefaultColor(int arg1){
        return;
    }
    public javax.microedition.m3g.VertexArray getPositions(float[] scaleBias){
        return null;
    }
    public void setPositions(javax.microedition.m3g.VertexArray positions, float scale, float[] bias){
        return;
    }
    public javax.microedition.m3g.VertexArray getTexCoords(int index, float[] scaleBias){
        return null;
    }
    public void setTexCoords(int index, javax.microedition.m3g.VertexArray texCoords, float scale, float[] bias){
        return;
    }
}
