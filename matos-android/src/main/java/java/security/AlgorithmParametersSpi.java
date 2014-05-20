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
public abstract class AlgorithmParametersSpi
{
  // Constructors

  public AlgorithmParametersSpi(){
  }
  // Methods

  protected abstract void engineInit(java.security.spec.AlgorithmParameterSpec arg1) throws java.security.spec.InvalidParameterSpecException;
  protected abstract void engineInit(byte [] arg1) throws java.io.IOException;
  protected abstract void engineInit(byte [] arg1, java.lang.String arg2) throws java.io.IOException;
  protected abstract <T extends java.security.spec.AlgorithmParameterSpec>T engineGetParameterSpec(java.lang.Class<T> arg1) throws java.security.spec.InvalidParameterSpecException;
  protected abstract byte [] engineGetEncoded() throws java.io.IOException;
  protected abstract byte [] engineGetEncoded(java.lang.String arg1) throws java.io.IOException;
  protected abstract java.lang.String engineToString();
}
