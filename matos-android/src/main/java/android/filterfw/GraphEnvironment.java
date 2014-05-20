package android.filterfw;

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


public class GraphEnvironment
  extends MffEnvironment{
  // Fields

  public static final int MODE_ASYNCHRONOUS = 1;

  public static final int MODE_SYNCHRONOUS = 2;

  // Constructors

  public GraphEnvironment(){
    super((android.filterfw.core.FrameManager) null);
  }
  public GraphEnvironment(android.filterfw.core.FrameManager arg1, android.filterfw.io.GraphReader arg2){
    super((android.filterfw.core.FrameManager) null);
  }
  // Methods

  public android.filterfw.core.FilterGraph getGraph(int arg1){
    return (android.filterfw.core.FilterGraph) null;
  }
  public int addGraph(android.filterfw.core.FilterGraph arg1){
    return 0;
  }
  public android.filterfw.io.GraphReader getGraphReader(){
    return (android.filterfw.io.GraphReader) null;
  }
  public void addReferences(java.lang.Object [] arg1){
  }
  public int loadGraph(android.content.Context arg1, int arg2){
    return 0;
  }
  public android.filterfw.core.GraphRunner getRunner(int arg1, int arg2){
    return (android.filterfw.core.GraphRunner) null;
  }
}
