package java.security;

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

import com.francetelecom.rd.stubs.annotation.Code;


public class AlgorithmParameters
{
  // Constructors

  protected AlgorithmParameters(AlgorithmParametersSpi arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mProvider") Provider arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("mAlgorithm") java.lang.String arg3){
  }
  // Methods

  public final java.lang.String toString(){
    return (java.lang.String) null;
  }
  @Code("return new AlgorithmParameters(null,null,arg1);")
  public static AlgorithmParameters getInstance(java.lang.String arg1) throws NoSuchAlgorithmException{
    return (AlgorithmParameters) null;
  }
  @Code("return new AlgorithmParameters(null,null,arg1);")
  public static AlgorithmParameters getInstance(java.lang.String arg1, java.lang.String arg2) throws NoSuchAlgorithmException, NoSuchProviderException{
    return (AlgorithmParameters) null;
  }
  @Code("return new AlgorithmParameters(null,arg2,arg1);")
  public static AlgorithmParameters getInstance(java.lang.String arg1, Provider arg2) throws NoSuchAlgorithmException{
    return (AlgorithmParameters) null;
  }
  public final void init(java.security.spec.AlgorithmParameterSpec arg1) throws java.security.spec.InvalidParameterSpecException{
  }
  public final void init(byte [] arg1) throws java.io.IOException{
  }
  public final void init(byte [] arg1, java.lang.String arg2) throws java.io.IOException{
  }
  public final byte [] getEncoded() throws java.io.IOException{
    return (byte []) null;
  }
  public final byte [] getEncoded(java.lang.String arg1) throws java.io.IOException{
    return (byte []) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mAlgorithm")
  public final java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mProvider")
  public final Provider getProvider(){
    return (Provider) null;
  }
  public final <T extends java.security.spec.AlgorithmParameterSpec>T getParameterSpec(java.lang.Class<T> arg1) throws java.security.spec.InvalidParameterSpecException{
    return null;
  }
}
