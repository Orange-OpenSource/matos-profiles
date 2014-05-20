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
public class Sampler
  extends BaseObj{
  // Classes

  public static enum Value
  {
    // Enum Constants

    NEAREST(0)
, LINEAR(0)
, LINEAR_MIP_LINEAR(0)
, LINEAR_MIP_NEAREST(0)
, WRAP(0)
, CLAMP(0)
;
    // Fields

    // Constructors

    private Value(int arg1){
    }
    // Methods

  }
  public static class Builder
  {
    // Constructors

    public Builder(RenderScript arg1){
    }
    // Methods

    public Sampler create(){
      return (Sampler) null;
    }
    public void setMinification(Sampler.Value arg1){
    }
    public void setMagnification(Sampler.Value arg1){
    }
    public void setWrapS(Sampler.Value arg1){
    }
    public void setWrapT(Sampler.Value arg1){
    }
    public void setAnisotropy(float arg1){
    }
  }
  // Constructors

  Sampler(int arg1, RenderScript arg2){
    super(0, (RenderScript) null);
  }
  // Methods

  public static Sampler CLAMP_NEAREST(RenderScript arg1){
    return (Sampler) null;
  }
  public static Sampler CLAMP_LINEAR(RenderScript arg1){
    return (Sampler) null;
  }
  public static Sampler CLAMP_LINEAR_MIP_LINEAR(RenderScript arg1){
    return (Sampler) null;
  }
  public static Sampler WRAP_NEAREST(RenderScript arg1){
    return (Sampler) null;
  }
  public static Sampler WRAP_LINEAR(RenderScript arg1){
    return (Sampler) null;
  }
  public static Sampler WRAP_LINEAR_MIP_LINEAR(RenderScript arg1){
    return (Sampler) null;
  }
}
