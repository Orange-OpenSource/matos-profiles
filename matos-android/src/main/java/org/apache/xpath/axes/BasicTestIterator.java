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


public abstract class BasicTestIterator
  extends LocPathIterator{
  // Constructors

  protected BasicTestIterator(){
    super();
  }
  protected BasicTestIterator(org.apache.xml.utils.PrefixResolver arg1){
    super();
  }
  protected BasicTestIterator(org.apache.xpath.compiler.Compiler arg1, int arg2, int arg3) throws javax.xml.transform.TransformerException{
    super();
  }
  protected BasicTestIterator(org.apache.xpath.compiler.Compiler arg1, int arg2, int arg3, boolean arg4) throws javax.xml.transform.TransformerException{
    super();
  }
  // Methods

  public int nextNode(){
    return 0;
  }
  public org.apache.xml.dtm.DTMIterator cloneWithReset() throws java.lang.CloneNotSupportedException{
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  protected abstract int getNextNode();
}
