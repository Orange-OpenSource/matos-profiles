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


public interface DTMIterator
{
  // Fields

  public static final short FILTER_ACCEPT = 1;

  public static final short FILTER_REJECT = 2;

  public static final short FILTER_SKIP = 3;

  // Methods

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException;
  public int getLength();
  public void reset();
  public int nextNode();
  public void detach();
  public int getRoot();
  public int getWhatToShow();
  public boolean getExpandEntityReferences();
  public int previousNode();
  public DTM getDTM(int arg1);
  public int getCurrentNode();
  public int item(int arg1);
  public DTMManager getDTMManager();
  public void setRoot(int arg1, java.lang.Object arg2);
  public int getCurrentPos();
  public void setShouldCacheNodes(boolean arg1);
  public boolean isMutable();
  public void setCurrentPos(int arg1);
  public void setItem(int arg1, int arg2);
  public boolean isFresh();
  public void allowDetachToRelease(boolean arg1);
  public DTMIterator cloneWithReset() throws java.lang.CloneNotSupportedException;
  public void runTo(int arg1);
  public boolean isDocOrdered();
  public int getAxis();
}
