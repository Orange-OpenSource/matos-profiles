package javax.crypto.spec;

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


public class RC5ParameterSpec
  implements java.security.spec.AlgorithmParameterSpec
{
  // Constructors

  public RC5ParameterSpec(int arg1, int arg2, int arg3){
  }
  public RC5ParameterSpec(int arg1, int arg2, int arg3, byte [] arg4){
  }
  public RC5ParameterSpec(int arg1, int arg2, int arg3, byte [] arg4, int arg5){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public int getVersion(){
    return 0;
  }
  public byte [] getIV(){
    return (byte []) null;
  }
  public int getRounds(){
    return 0;
  }
  public int getWordSize(){
    return 0;
  }
}
