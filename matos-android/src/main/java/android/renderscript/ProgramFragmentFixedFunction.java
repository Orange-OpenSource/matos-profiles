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


public class ProgramFragmentFixedFunction
  extends ProgramFragment{
  // Classes

  public static class Builder
  {
    // Classes

    public static enum EnvMode
    {
      // Enum Constants

      REPLACE(0)
, MODULATE(0)
, DECAL(0)
;
      // Fields

      // Constructors

      private EnvMode(int arg1){
      }
      // Methods

    }
    public static enum Format
    {
      // Enum Constants

      ALPHA(0)
, LUMINANCE_ALPHA(0)
, RGB(0)
, RGBA(0)
;
      // Fields

      // Constructors

      private Format(int arg1){
      }
      // Methods

    }
    // Fields

    public static final int MAX_TEXTURE = 2;

    // Constructors

    public Builder(RenderScript arg1){
    }
    // Methods

    public ProgramFragmentFixedFunction create(){
      return (ProgramFragmentFixedFunction) null;
    }
    public ProgramFragmentFixedFunction.Builder setTexture(ProgramFragmentFixedFunction.Builder.EnvMode arg1, ProgramFragmentFixedFunction.Builder.Format arg2, int arg3) throws java.lang.IllegalArgumentException{
      return (ProgramFragmentFixedFunction.Builder) null;
    }
    public ProgramFragmentFixedFunction.Builder setPointSpriteTexCoordinateReplacement(boolean arg1){
      return (ProgramFragmentFixedFunction.Builder) null;
    }
    public ProgramFragmentFixedFunction.Builder setVaryingColor(boolean arg1){
      return (ProgramFragmentFixedFunction.Builder) null;
    }
  }
  // Constructors

  ProgramFragmentFixedFunction(int arg1, RenderScript arg2){
    super(0, (RenderScript) null);
  }
}
