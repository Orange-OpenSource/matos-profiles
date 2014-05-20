package org.javia.arity;

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
public class Symbols
{
  // Constructors

  public Symbols(){
  }
  // Methods

  public synchronized Function compile(java.lang.String arg1) throws SyntaxException{
    return (Function) null;
  }
  public synchronized void pushFrame(){
  }
  public synchronized double eval(java.lang.String arg1) throws SyntaxException{
    return 0.0d;
  }
  public synchronized Complex evalComplex(java.lang.String arg1) throws SyntaxException{
    return (Complex) null;
  }
  public synchronized FunctionAndName compileWithName(java.lang.String arg1) throws SyntaxException{
    return (FunctionAndName) null;
  }
  public synchronized void define(java.lang.String arg1, Function arg2){
  }
  public synchronized void define(FunctionAndName arg1){
  }
  public synchronized void define(java.lang.String arg1, double arg2){
  }
  public synchronized void define(java.lang.String arg1, Complex arg2){
  }
  public synchronized void popFrame(){
  }
  public static boolean isDefinition(java.lang.String arg1){
    return false;
  }
  public Symbol [] getTopFrame(){
    return (Symbol []) null;
  }
  public Symbol [] getAllSymbols(){
    return (Symbol []) null;
  }
  public java.lang.String [] getDictionary(){
    return (java.lang.String []) null;
  }
}
