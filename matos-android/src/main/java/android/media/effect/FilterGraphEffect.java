package android.media.effect;

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


public class FilterGraphEffect
  extends FilterEffect{
  // Fields

  protected java.lang.String mInputName;

  protected java.lang.String mOutputName;

  protected android.filterfw.core.GraphRunner mRunner;

  protected android.filterfw.core.FilterGraph mGraph;

  protected java.lang.Class mSchedulerClass;

  // Constructors

  public FilterGraphEffect(EffectContext arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.Class arg6){
    super((EffectContext) null, (java.lang.String) null);
  }
  // Methods

  public void release(){
  }
  public void setParameter(java.lang.String arg1, java.lang.Object arg2){
  }
  public void apply(int arg1, int arg2, int arg3, int arg4){
  }
}
