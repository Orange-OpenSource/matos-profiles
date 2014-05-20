package android.filterfw.io;

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


public abstract class GraphReader
{
  // Fields

  protected android.filterfw.core.KeyValueMap mReferences;

  // Constructors

  public GraphReader(){
  }
  // Methods

  public abstract android.filterfw.core.KeyValueMap readKeyValueAssignments(java.lang.String arg1) throws GraphIOException;
  public abstract android.filterfw.core.FilterGraph readGraphString(java.lang.String arg1) throws GraphIOException;
  public android.filterfw.core.FilterGraph readGraphResource(android.content.Context arg1, int arg2) throws GraphIOException{
    return (android.filterfw.core.FilterGraph) null;
  }
  public void addReference(java.lang.String arg1, java.lang.Object arg2){
  }
  public void addReferencesByMap(android.filterfw.core.KeyValueMap arg1){
  }
  public void addReferencesByKeysAndValues(java.lang.Object [] arg1){
  }
}
