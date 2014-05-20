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


public class ChildTestIterator
  extends BasicTestIterator{
  // Fields

  protected org.apache.xml.dtm.DTMAxisTraverser m_traverser;

  // Constructors

  ChildTestIterator(org.apache.xpath.compiler.Compiler arg1, int arg2, int arg3) throws javax.xml.transform.TransformerException{
    super();
  }
  public ChildTestIterator(org.apache.xml.dtm.DTMAxisTraverser arg1){
    super();
  }
  // Methods

  public void detach(){
  }
  public void setRoot(int arg1, java.lang.Object arg2){
  }
  public org.apache.xml.dtm.DTMIterator cloneWithReset() throws java.lang.CloneNotSupportedException{
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public int getAxis(){
    return 0;
  }
  protected int getNextNode(){
    return 0;
  }
}
