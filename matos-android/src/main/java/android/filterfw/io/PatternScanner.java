package android.filterfw.io;

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


public class PatternScanner
{
  // Constructors

  public PatternScanner(java.lang.String arg1){
  }
  public PatternScanner(java.lang.String arg1, java.util.regex.Pattern arg2){
  }
  // Methods

  public boolean peek(java.util.regex.Pattern arg1){
    return false;
  }
  public void skip(java.util.regex.Pattern arg1){
  }
  public boolean atEnd(){
    return false;
  }
  public java.lang.String eat(java.util.regex.Pattern arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public java.lang.String tryEat(java.util.regex.Pattern arg1){
    return (java.lang.String) null;
  }
  public int lineNo(){
    return 0;
  }
  public java.lang.String unexpectedTokenMessage(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void updateLineCount(int arg1, int arg2){
  }
}
