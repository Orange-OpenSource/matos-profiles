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


public class ReverseAxesWalker
  extends AxesWalker{
  // Fields

  protected org.apache.xml.dtm.DTMAxisIterator m_iterator;

  // Constructors

  ReverseAxesWalker(LocPathIterator arg1, int arg2){
    super((LocPathIterator) null, 0);
  }
  // Methods

  public void detach(){
  }
  public int getLastPos(org.apache.xpath.XPathContext arg1){
    return 0;
  }
  public void setRoot(int arg1){
  }
  public boolean isDocOrdered(){
    return false;
  }
  protected int getProximityPosition(int arg1){
    return 0;
  }
  protected void countProximityPosition(int arg1){
  }
  public boolean isReverseAxes(){
    return false;
  }
  protected int getNextNode(){
    return 0;
  }
}
