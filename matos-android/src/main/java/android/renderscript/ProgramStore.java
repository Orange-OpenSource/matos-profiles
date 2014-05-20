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
public class ProgramStore
  extends BaseObj{
  // Classes

  public static enum DepthFunc
  {
    // Enum Constants

    ALWAYS(0)
, LESS(0)
, LESS_OR_EQUAL(0)
, GREATER(0)
, GREATER_OR_EQUAL(0)
, EQUAL(0)
, NOT_EQUAL(0)
;
    // Fields

    // Constructors

    private DepthFunc(int arg1){
    }
    // Methods

  }
  public static enum BlendSrcFunc
  {
    // Enum Constants

    ZERO(0)
, ONE(0)
, DST_COLOR(0)
, ONE_MINUS_DST_COLOR(0)
, SRC_ALPHA(0)
, ONE_MINUS_SRC_ALPHA(0)
, DST_ALPHA(0)
, ONE_MINUS_DST_ALPHA(0)
, SRC_ALPHA_SATURATE(0)
;
    // Fields

    // Constructors

    private BlendSrcFunc(int arg1){
    }
    // Methods

  }
  public static enum BlendDstFunc
  {
    // Enum Constants

    ZERO(0)
, ONE(0)
, SRC_COLOR(0)
, ONE_MINUS_SRC_COLOR(0)
, SRC_ALPHA(0)
, ONE_MINUS_SRC_ALPHA(0)
, DST_ALPHA(0)
, ONE_MINUS_DST_ALPHA(0)
;
    // Fields

    // Constructors

    private BlendDstFunc(int arg1){
    }
    // Methods

  }
  public static class Builder
  {
    // Constructors

    public Builder(RenderScript arg1){
    }
    // Methods

    public ProgramStore create(){
      return (ProgramStore) null;
    }
    public ProgramStore.Builder setDepthFunc(ProgramStore.DepthFunc arg1){
      return (ProgramStore.Builder) null;
    }
    public ProgramStore.Builder setDepthMaskEnabled(boolean arg1){
      return (ProgramStore.Builder) null;
    }
    public ProgramStore.Builder setColorMaskEnabled(boolean arg1, boolean arg2, boolean arg3, boolean arg4){
      return (ProgramStore.Builder) null;
    }
    public ProgramStore.Builder setBlendFunc(ProgramStore.BlendSrcFunc arg1, ProgramStore.BlendDstFunc arg2){
      return (ProgramStore.Builder) null;
    }
    public ProgramStore.Builder setDitherEnabled(boolean arg1){
      return (ProgramStore.Builder) null;
    }
  }
  // Constructors

  ProgramStore(int arg1, RenderScript arg2){
    super(0, (RenderScript) null);
  }
  // Methods

  public static ProgramStore BLEND_NONE_DEPTH_TEST(RenderScript arg1){
    return (ProgramStore) null;
  }
  public static ProgramStore BLEND_NONE_DEPTH_NONE(RenderScript arg1){
    return (ProgramStore) null;
  }
  public static ProgramStore BLEND_ALPHA_DEPTH_TEST(RenderScript arg1){
    return (ProgramStore) null;
  }
  public static ProgramStore BLEND_ALPHA_DEPTH_NONE(RenderScript arg1){
    return (ProgramStore) null;
  }
}
