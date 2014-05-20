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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class AlgorithmParameterGenerator
{
  // Constructors

  protected AlgorithmParameterGenerator(AlgorithmParameterGeneratorSpi arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mProvider") Provider arg2, java.lang.String arg3){
  }
  // Methods

  public static AlgorithmParameterGenerator getInstance(java.lang.String arg1) throws NoSuchAlgorithmException{
    return (AlgorithmParameterGenerator) null;
  }
  public static AlgorithmParameterGenerator getInstance(java.lang.String arg1, java.lang.String arg2) throws NoSuchAlgorithmException, NoSuchProviderException{
    return (AlgorithmParameterGenerator) null;
  }
  public static AlgorithmParameterGenerator getInstance(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mProvider") Provider arg2) throws NoSuchAlgorithmException{
    return (AlgorithmParameterGenerator) null;
  }
  public final void init(int arg1){
  }
  public final void init(int arg1, SecureRandom arg2){
  }
  public final void init(java.security.spec.AlgorithmParameterSpec arg1) throws InvalidAlgorithmParameterException{
  }
  public final void init(java.security.spec.AlgorithmParameterSpec arg1, SecureRandom arg2) throws InvalidAlgorithmParameterException{
  }
  public final java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mProvider")
  public final Provider getProvider(){
    return (Provider) null;
  }
  public final AlgorithmParameters generateParameters(){
    return (AlgorithmParameters) null;
  }
}
