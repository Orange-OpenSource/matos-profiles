package java.util.concurrent.locks;

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


public abstract class AbstractOwnableSynchronizer
  implements java.io.Serializable
{
  // Constructors

  protected AbstractOwnableSynchronizer(){
  }
  // Methods

  protected final void setExclusiveOwnerThread(java.lang.Thread arg1){
  }
  protected final java.lang.Thread getExclusiveOwnerThread(){
    return (java.lang.Thread) null;
  }
}
