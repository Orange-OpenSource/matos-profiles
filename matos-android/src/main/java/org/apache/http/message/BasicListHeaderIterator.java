package org.apache.http.message;

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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class BasicListHeaderIterator
  implements org.apache.http.HeaderIterator
{
  // Fields

  protected final java.util.List allHeaders = (java.util.List) null;

  protected int currentIndex;

  protected int lastIndex;

  protected java.lang.String headerName;

  // Constructors

  public BasicListHeaderIterator(java.util.List arg1, java.lang.String arg2){
  }
  // Methods

  public boolean hasNext(){
    return false;
  }
  public final java.lang.Object next() throws java.util.NoSuchElementException{
    return (java.lang.Object) null;
  }
  public void remove() throws java.lang.UnsupportedOperationException{
  }
  protected int findNext(int arg1){
    return 0;
  }
  protected boolean filterHeader(int arg1){
    return false;
  }
  public org.apache.http.Header nextHeader() throws java.util.NoSuchElementException{
    return (org.apache.http.Header) null;
  }
}
