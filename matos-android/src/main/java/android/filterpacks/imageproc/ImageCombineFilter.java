package android.filterpacks.imageproc;

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


public abstract class ImageCombineFilter
  extends android.filterfw.core.Filter{
  // Fields

  protected android.filterfw.core.Program mProgram;

  protected java.lang.String [] mInputNames;

  protected java.lang.String mOutputName;

  protected java.lang.String mParameterName;

  protected int mCurrentTarget;

  // Constructors

  public ImageCombineFilter(java.lang.String arg1, java.lang.String [] arg2, java.lang.String arg3, java.lang.String arg4){
    super((java.lang.String) null);
  }
  // Methods

  public void process(android.filterfw.core.FilterContext arg1){
  }
  public void setupPorts(){
  }
  public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String arg1, android.filterfw.core.FrameFormat arg2){
    return (android.filterfw.core.FrameFormat) null;
  }
  protected abstract android.filterfw.core.Program getNativeProgram(android.filterfw.core.FilterContext arg1);
  protected abstract android.filterfw.core.Program getShaderProgram(android.filterfw.core.FilterContext arg1);
  protected void updateProgramWithTarget(int arg1, android.filterfw.core.FilterContext arg2){
  }
}
