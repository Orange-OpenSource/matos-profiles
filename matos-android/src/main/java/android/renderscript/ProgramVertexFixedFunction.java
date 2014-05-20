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


public class ProgramVertexFixedFunction
  extends ProgramVertex{
  // Classes

  public static class Builder
  {
    // Constructors

    public Builder(RenderScript arg1){
    }
    // Methods

    public ProgramVertexFixedFunction create(){
      return (ProgramVertexFixedFunction) null;
    }
    public ProgramVertexFixedFunction.Builder setTextureMatrixEnable(boolean arg1){
      return (ProgramVertexFixedFunction.Builder) null;
    }
  }
  public static class Constants
  {
    // Constructors

    public Constants(RenderScript arg1){
    }
    // Methods

    public void destroy(){
    }
    public void setTexture(Matrix4f arg1){
    }
    public void setProjection(Matrix4f arg1){
    }
    public void setModelview(Matrix4f arg1){
    }
  }
  // Constructors

  ProgramVertexFixedFunction(int arg1, RenderScript arg2){
    super(0, (RenderScript) null);
  }
  // Methods

  public void bindConstants(ProgramVertexFixedFunction.Constants arg1){
  }
}
