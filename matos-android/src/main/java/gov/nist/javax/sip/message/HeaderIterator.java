package gov.nist.javax.sip.message;

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


public class HeaderIterator
  implements java.util.ListIterator
{
  // Constructors

  protected HeaderIterator(SIPMessage arg1, gov.nist.javax.sip.header.SIPHeader arg2){
  }
  // Methods

  public void add(java.lang.Object arg1){
  }
  public boolean hasNext(){
    return false;
  }
  public java.lang.Object next() throws java.util.NoSuchElementException{
    return (java.lang.Object) null;
  }
  public void remove() throws java.lang.IllegalStateException{
  }
  public void set(java.lang.Object arg1){
  }
  public int nextIndex(){
    return 0;
  }
  public java.lang.Object previous() throws java.util.NoSuchElementException{
    return (java.lang.Object) null;
  }
  public boolean hasPrevious(){
    return false;
  }
  public int previousIndex(){
    return 0;
  }
}
