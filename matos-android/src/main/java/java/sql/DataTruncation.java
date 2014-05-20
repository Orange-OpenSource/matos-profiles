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


public class DataTruncation
  extends SQLWarning  implements java.io.Serializable
{
  // Constructors

  public DataTruncation(int arg1, boolean arg2, boolean arg3, int arg4, int arg5){
    super();
  }
  public DataTruncation(int arg1, boolean arg2, boolean arg3, int arg4, int arg5, java.lang.Throwable arg6){
    super();
  }
  // Methods

  public int getIndex(){
    return 0;
  }
  public boolean getParameter(){
    return false;
  }
  public int getDataSize(){
    return 0;
  }
  public boolean getRead(){
    return false;
  }
  public int getTransferSize(){
    return 0;
  }
}
