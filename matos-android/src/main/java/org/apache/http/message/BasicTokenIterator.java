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
public class BasicTokenIterator
  implements org.apache.http.TokenIterator
{
  // Fields

  public static final java.lang.String HTTP_SEPARATORS = " ,;=()<>@:\\\"/[]?{}\t";

  protected final org.apache.http.HeaderIterator headerIt = (org.apache.http.HeaderIterator) null;

  protected java.lang.String currentHeader;

  protected java.lang.String currentToken;

  protected int searchPos;

  // Constructors

  public BasicTokenIterator(org.apache.http.HeaderIterator arg1){
  }
  // Methods

  public boolean hasNext(){
    return false;
  }
  public final java.lang.Object next() throws java.util.NoSuchElementException, org.apache.http.ParseException{
    return (java.lang.Object) null;
  }
  public final void remove() throws java.lang.UnsupportedOperationException{
  }
  protected boolean isWhitespace(char arg1){
    return false;
  }
  public java.lang.String nextToken() throws java.util.NoSuchElementException, org.apache.http.ParseException{
    return (java.lang.String) null;
  }
  protected int findNext(int arg1) throws org.apache.http.ParseException{
    return 0;
  }
  protected int findTokenStart(int arg1){
    return 0;
  }
  protected int findTokenEnd(int arg1){
    return 0;
  }
  protected boolean isTokenChar(char arg1){
    return false;
  }
  protected java.lang.String createToken(java.lang.String arg1, int arg2, int arg3){
    return (java.lang.String) null;
  }
  protected int findTokenSeparator(int arg1){
    return 0;
  }
  protected boolean isTokenSeparator(char arg1){
    return false;
  }
  protected boolean isHttpSeparator(char arg1){
    return false;
  }
}
