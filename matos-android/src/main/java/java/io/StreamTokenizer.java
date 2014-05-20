package java.io;

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


public class StreamTokenizer
{
  // Fields

  public double nval;

  public java.lang.String sval;

  public static final int TT_EOF = -1;

  public static final int TT_EOL = 10;

  public static final int TT_NUMBER = -2;

  public static final int TT_WORD = -3;

  public int ttype;

  // Constructors

  private StreamTokenizer(){
  }
  public StreamTokenizer(InputStream arg1){
  }
  public StreamTokenizer(Reader arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int nextToken() throws IOException{
    return 0;
  }
  public void resetSyntax(){
  }
  public void wordChars(int arg1, int arg2){
  }
  public void ordinaryChar(int arg1){
  }
  public void whitespaceChars(int arg1, int arg2){
  }
  public void quoteChar(int arg1){
  }
  public void slashStarComments(boolean arg1){
  }
  public void slashSlashComments(boolean arg1){
  }
  public void commentChar(int arg1){
  }
  public void eolIsSignificant(boolean arg1){
  }
  public int lineno(){
    return 0;
  }
  public void lowerCaseMode(boolean arg1){
  }
  public void ordinaryChars(int arg1, int arg2){
  }
  public void parseNumbers(){
  }
  public void pushBack(){
  }
}
