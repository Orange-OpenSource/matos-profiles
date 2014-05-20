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


public class SelfIteratorNoPredicate
  extends LocPathIterator{
  // Constructors

  SelfIteratorNoPredicate(org.apache.xpath.compiler.Compiler arg1, int arg2, int arg3) throws javax.xml.transform.TransformerException{
    super();
  }
  public SelfIteratorNoPredicate() throws javax.xml.transform.TransformerException{
    super();
  }
  // Methods

  public int asNode(org.apache.xpath.XPathContext arg1) throws javax.xml.transform.TransformerException{
    return 0;
  }
  public int nextNode(){
    return 0;
  }
  public int getLastPos(org.apache.xpath.XPathContext arg1){
    return 0;
  }
}
