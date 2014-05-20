package dalvik.system.profiler;

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


public final class SamplingProfiler
{
  // Classes
  @com.francetelecom.rd.stubs.annotation.Real("com.francetelecom.rd.fakeandroid.SamplingProfilerThreadSetImplem")
  public static interface ThreadSet
  {
    // Methods

    public java.lang.Thread [] threads();
  }
  // Constructors

  public SamplingProfiler(int arg1, SamplingProfiler.ThreadSet arg2){
  }
  // Methods

  public void shutdown(){
  }
  public void start(int arg1){
  }
  public void stop(){
  }
  public HprofData getHprofData(){
    return (HprofData) null;
  }
  public static SamplingProfiler.ThreadSet newThreadGroupTheadSet(java.lang.ThreadGroup arg1){
    return (SamplingProfiler.ThreadSet) null;
  }
  public static SamplingProfiler.ThreadSet newArrayThreadSet(java.lang.Thread [] arg1){
    return (SamplingProfiler.ThreadSet) null;
  }
}
