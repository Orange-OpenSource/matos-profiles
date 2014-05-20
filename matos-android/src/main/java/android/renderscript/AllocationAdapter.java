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


public class AllocationAdapter
  extends Allocation{
  // Constructors

  AllocationAdapter(int arg1, RenderScript arg2, Allocation arg3){
    super(0, (RenderScript) null, (Type) null, 0);
  }
  // Methods

  public synchronized void resize(int arg1){
  }
  public void setY(int arg1){
  }
  public void subData(int arg1, FieldPacker arg2){
  }
  public void subElementData(int arg1, int arg2, FieldPacker arg3){
  }
  public void subData1D(int arg1, int arg2, int [] arg3){
  }
  public void subData1D(int arg1, int arg2, short [] arg3){
  }
  public void subData1D(int arg1, int arg2, byte [] arg3){
  }
  public void subData1D(int arg1, int arg2, float [] arg3){
  }
  public void subData2D(int arg1, int arg2, int arg3, int arg4, int [] arg5){
  }
  public void subData2D(int arg1, int arg2, int arg3, int arg4, float [] arg5){
  }
  public void readData(int [] arg1){
  }
  public void readData(float [] arg1){
  }
  public void setLOD(int arg1){
  }
  public void setFace(Type.CubemapFace arg1){
  }
  public void setZ(int arg1){
  }
  public static AllocationAdapter create1D(RenderScript arg1, Allocation arg2){
    return (AllocationAdapter) null;
  }
  public static AllocationAdapter create2D(RenderScript arg1, Allocation arg2){
    return (AllocationAdapter) null;
  }
}
