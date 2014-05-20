package android.renderscript;

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


public class Mesh
  extends BaseObj{
  // Classes

  public static enum Primitive
  {
    // Enum Constants

    POINT(0)
, LINE(0)
, LINE_STRIP(0)
, TRIANGLE(0)
, TRIANGLE_STRIP(0)
, TRIANGLE_FAN(0)
;
    // Fields

    // Constructors

    private Primitive(int arg1){
    }
    // Methods

  }
  public static class Builder
  {
    // Constructors

    public Builder(RenderScript arg1, int arg2){
    }
    // Methods

    public Mesh create(){
      return (Mesh) null;
    }
    public Mesh.Builder addIndexSetType(Type arg1, Mesh.Primitive arg2){
      return (Mesh.Builder) null;
    }
    public Mesh.Builder addIndexSetType(Mesh.Primitive arg1){
      return (Mesh.Builder) null;
    }
    public Mesh.Builder addIndexSetType(Element arg1, int arg2, Mesh.Primitive arg3){
      return (Mesh.Builder) null;
    }
    public int getCurrentVertexTypeIndex(){
      return 0;
    }
    public int getCurrentIndexSetIndex(){
      return 0;
    }
    public Mesh.Builder addVertexType(Type arg1) throws java.lang.IllegalStateException{
      return (Mesh.Builder) null;
    }
    public Mesh.Builder addVertexType(Element arg1, int arg2) throws java.lang.IllegalStateException{
      return (Mesh.Builder) null;
    }
  }
  public static class AllocationBuilder
  {
    // Constructors

    public AllocationBuilder(RenderScript arg1){
    }
    // Methods

    public Mesh create(){
      return (Mesh) null;
    }
    public Mesh.AllocationBuilder addIndexSetType(Mesh.Primitive arg1){
      return (Mesh.AllocationBuilder) null;
    }
    public int getCurrentVertexTypeIndex(){
      return 0;
    }
    public int getCurrentIndexSetIndex(){
      return 0;
    }
    public Mesh.AllocationBuilder addVertexAllocation(Allocation arg1) throws java.lang.IllegalStateException{
      return (Mesh.AllocationBuilder) null;
    }
    public Mesh.AllocationBuilder addIndexSetAllocation(Allocation arg1, Mesh.Primitive arg2){
      return (Mesh.AllocationBuilder) null;
    }
  }
  public static class TriangleMeshBuilder
  {
    // Fields

    public static final int COLOR = 1;

    public static final int NORMAL = 2;

    public static final int TEXTURE_0 = 256;

    // Constructors

    public TriangleMeshBuilder(RenderScript arg1, int arg2, int arg3){
    }
    // Methods

    public Mesh create(boolean arg1){
      return (Mesh) null;
    }
    public Mesh.TriangleMeshBuilder setColor(float arg1, float arg2, float arg3, float arg4){
      return (Mesh.TriangleMeshBuilder) null;
    }
    public Mesh.TriangleMeshBuilder addVertex(float arg1, float arg2){
      return (Mesh.TriangleMeshBuilder) null;
    }
    public Mesh.TriangleMeshBuilder addVertex(float arg1, float arg2, float arg3){
      return (Mesh.TriangleMeshBuilder) null;
    }
    public Mesh.TriangleMeshBuilder setTexture(float arg1, float arg2){
      return (Mesh.TriangleMeshBuilder) null;
    }
    public Mesh.TriangleMeshBuilder setNormal(float arg1, float arg2, float arg3){
      return (Mesh.TriangleMeshBuilder) null;
    }
    public Mesh.TriangleMeshBuilder addTriangle(int arg1, int arg2, int arg3){
      return (Mesh.TriangleMeshBuilder) null;
    }
  }
  // Constructors

  Mesh(int arg1, RenderScript arg2){
    super(0, (RenderScript) null);
  }
  // Methods

  public Allocation getVertexAllocation(int arg1){
    return (Allocation) null;
  }
  public Allocation getIndexSetAllocation(int arg1){
    return (Allocation) null;
  }
  public int getVertexAllocationCount(){
    return 0;
  }
  public int getPrimitiveCount(){
    return 0;
  }
  public Mesh.Primitive getPrimitive(int arg1){
    return (Mesh.Primitive) null;
  }
}
