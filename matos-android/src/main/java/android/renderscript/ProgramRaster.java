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
public class ProgramRaster
  extends BaseObj{
  // Classes

  public static enum CullMode
  {
    // Enum Constants

    BACK(0)
, FRONT(0)
, NONE(0)
;
    // Fields

    // Constructors

    private CullMode(int arg1){
    }
    // Methods

  }
  public static class Builder
  {
    // Constructors

    public Builder(RenderScript arg1){
    }
    // Methods

    public ProgramRaster create(){
      return (ProgramRaster) null;
    }
    public ProgramRaster.Builder setPointSpriteEnabled(boolean arg1){
      return (ProgramRaster.Builder) null;
    }
    public ProgramRaster.Builder setCullMode(ProgramRaster.CullMode arg1){
      return (ProgramRaster.Builder) null;
    }
  }
  // Constructors

  ProgramRaster(int arg1, RenderScript arg2){
    super(0, (RenderScript) null);
  }
  // Methods

  public static ProgramRaster CULL_BACK(RenderScript arg1){
    return (ProgramRaster) null;
  }
  public static ProgramRaster CULL_FRONT(RenderScript arg1){
    return (ProgramRaster) null;
  }
  public static ProgramRaster CULL_NONE(RenderScript arg1){
    return (ProgramRaster) null;
  }
}
