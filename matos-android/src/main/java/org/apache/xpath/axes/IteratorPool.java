package org.apache.xpath.axes;

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


public final class IteratorPool
  implements java.io.Serializable
{
  // Constructors

  public IteratorPool(org.apache.xml.dtm.DTMIterator arg1){
  }
  // Methods

  public synchronized org.apache.xml.dtm.DTMIterator getInstance(){
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public synchronized void freeInstance(org.apache.xml.dtm.DTMIterator arg1){
  }
  public synchronized org.apache.xml.dtm.DTMIterator getInstanceOrThrow() throws java.lang.CloneNotSupportedException{
    return (org.apache.xml.dtm.DTMIterator) null;
  }
}
