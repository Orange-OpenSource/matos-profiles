package java.sql;

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


public class BatchUpdateException
  extends SQLException  implements java.io.Serializable
{
  // Constructors

  public BatchUpdateException(){
    super();
  }
  public BatchUpdateException(java.lang.Throwable arg1){
    super();
  }
  public BatchUpdateException(int [] arg1, java.lang.Throwable arg2){
    super();
  }
  public BatchUpdateException(java.lang.String arg1, int [] arg2, java.lang.Throwable arg3){
    super();
  }
  public BatchUpdateException(java.lang.String arg1, java.lang.String arg2, int [] arg3, java.lang.Throwable arg4){
    super();
  }
  public BatchUpdateException(java.lang.String arg1, java.lang.String arg2, int arg3, int [] arg4, java.lang.Throwable arg5){
    super();
  }
  public BatchUpdateException(int [] arg1){
    super();
  }
  public BatchUpdateException(java.lang.String arg1, int [] arg2){
    super();
  }
  public BatchUpdateException(java.lang.String arg1, java.lang.String arg2, int [] arg3){
    super();
  }
  public BatchUpdateException(java.lang.String arg1, java.lang.String arg2, int arg3, int [] arg4){
    super();
  }
  // Methods

  public int [] getUpdateCounts(){
    return (int []) null;
  }
}
