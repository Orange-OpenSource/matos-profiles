package android.opengl;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2010 - 2014 Orange SA
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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public abstract class Object3D
{
  // Constructors

  public Object3D(){
  }
  // Methods

  public void load(java.lang.String arg1) throws java.io.IOException{
  }
  public void draw(javax.microedition.khronos.opengles.GL10 arg1){
  }
  public abstract java.io.InputStream readFile(java.lang.String arg1) throws java.io.IOException;
  public Material getMaterial(java.lang.String arg1){
    return (Material) null;
  }
  public Texture getTexture(java.lang.String arg1){
    return (Texture) null;
  }
  public java.nio.IntBuffer getVertexBuffer(){
    return (java.nio.IntBuffer) null;
  }
  public java.nio.IntBuffer getNormalBuffer(){
    return (java.nio.IntBuffer) null;
  }
  public java.nio.IntBuffer getTexcoordBuffer(){
    return (java.nio.IntBuffer) null;
  }
  public int getNumTriangles(){
    return 0;
  }
  public boolean hasTexcoords(){
    return false;
  }
  public float getBoundsMinX(){
    return 0.0f;
  }
  public float getBoundsMaxX(){
    return 0.0f;
  }
  public float getBoundsMinY(){
    return 0.0f;
  }
  public float getBoundsMaxY(){
    return 0.0f;
  }
  public float getBoundsMinZ(){
    return 0.0f;
  }
  public float getBoundsMaxZ(){
    return 0.0f;
  }
  public void loadTexture(java.lang.String arg1) throws java.io.IOException{
  }
}
