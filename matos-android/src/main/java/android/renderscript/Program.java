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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class Program
  extends BaseObj{
  // Classes

  public static enum TextureType
  {
    // Enum Constants

    TEXTURE_2D(0)
, TEXTURE_CUBE(0)
;
    // Fields

    // Constructors

    private TextureType(int arg1){
    }
    // Methods

  }
  public static class BaseProgramBuilder
  {
    // Constructors

    protected BaseProgramBuilder(RenderScript arg1){
    }
    // Methods

    protected void initProgram(Program arg1){
    }
    public Program.BaseProgramBuilder setShader(java.lang.String arg1){
      return (Program.BaseProgramBuilder) null;
    }
    public Program.BaseProgramBuilder setShader(android.content.res.Resources arg1, int arg2){
      return (Program.BaseProgramBuilder) null;
    }
    public int getCurrentConstantIndex(){
      return 0;
    }
    public int getCurrentTextureIndex(){
      return 0;
    }
    public Program.BaseProgramBuilder addConstant(Type arg1) throws java.lang.IllegalStateException{
      return (Program.BaseProgramBuilder) null;
    }
    public Program.BaseProgramBuilder addTexture(Program.TextureType arg1) throws java.lang.IllegalArgumentException{
      return (Program.BaseProgramBuilder) null;
    }
  }
  // Constructors

  Program(int arg1, RenderScript arg2){
    super(0, (RenderScript) null);
  }
  // Methods

  public void bindConstants(Allocation arg1, int arg2){
  }
  public void bindTexture(Allocation arg1, int arg2) throws java.lang.IllegalArgumentException{
  }
  public void bindSampler(Sampler arg1, int arg2) throws java.lang.IllegalArgumentException{
  }
}
