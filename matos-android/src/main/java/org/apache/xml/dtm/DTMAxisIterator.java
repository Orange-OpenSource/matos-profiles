package org.apache.xml.dtm;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.DTMAxisIteratorImplem", superClass = "")
public interface DTMAxisIterator
  extends java.lang.Cloneable
{
  // Fields

  public static final int END = -1;

  // Methods

  public int next();
  public DTMAxisIterator reset();
  public DTMAxisIterator setStartNode(int arg1);
  public void setMark();
  public void gotoMark();
  public int getPosition();
  public int getStartNode();
  public int getLast();
  public boolean isReverse();
  public DTMAxisIterator cloneIterator();
  public void setRestartable(boolean arg1);
  public int getNodeByPosition(int arg1);
}
