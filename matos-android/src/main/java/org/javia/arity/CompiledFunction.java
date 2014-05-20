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
public class CompiledFunction
  extends ContextFunction{
  // Constructors

  CompiledFunction(int arg1, byte [] arg2, double [] arg3, double [] arg4, Function [] arg5){
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int arity(){
    return 0;
  }
  public double eval(double [] arg1, EvalContext arg2){
    return 0.0d;
  }
  public Complex eval(Complex [] arg1, EvalContext arg2){
    return (Complex) null;
  }
}
