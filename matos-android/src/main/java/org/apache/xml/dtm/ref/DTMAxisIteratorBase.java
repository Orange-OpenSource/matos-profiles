package org.apache.xml.dtm.ref;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.DTMAxisIteratorBaseImplem", superClass = "")
public abstract class DTMAxisIteratorBase
  implements org.apache.xml.dtm.DTMAxisIterator
{
  // Fields

  protected int _last;

  protected int _position;

  protected int _markedNode;

  protected int _startNode;

  protected boolean _includeSelf;

  protected boolean _isRestartable;

  // Constructors

  public DTMAxisIteratorBase(){
  }
  // Methods

  public org.apache.xml.dtm.DTMAxisIterator reset(){
    return (org.apache.xml.dtm.DTMAxisIterator) null;
  }
  public boolean isDocOrdered(){
    return false;
  }
  public int getAxis(){
    return 0;
  }
  public int getPosition(){
    return 0;
  }
  protected final org.apache.xml.dtm.DTMAxisIterator resetPosition(){
    return (org.apache.xml.dtm.DTMAxisIterator) null;
  }
  protected final int returnNode(int arg1){
    return 0;
  }
  public int getStartNode(){
    return 0;
  }
  public org.apache.xml.dtm.DTMAxisIterator includeSelf(){
    return (org.apache.xml.dtm.DTMAxisIterator) null;
  }
  public int getLast(){
    return 0;
  }
  public boolean isReverse(){
    return false;
  }
  public org.apache.xml.dtm.DTMAxisIterator cloneIterator(){
    return (org.apache.xml.dtm.DTMAxisIterator) null;
  }
  public void setRestartable(boolean arg1){
  }
  public int getNodeByPosition(int arg1){
    return 0;
  }
}
