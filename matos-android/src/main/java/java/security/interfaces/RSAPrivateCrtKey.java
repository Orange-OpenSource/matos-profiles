package java.security.interfaces;

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


public interface RSAPrivateCrtKey
  extends RSAPrivateKey
{
  // Fields

  public static final long serialVersionUID = -5682214253527700368l;

  // Methods

  public java.math.BigInteger getPublicExponent();
  public java.math.BigInteger getPrimeP();
  public java.math.BigInteger getPrimeQ();
  public java.math.BigInteger getPrimeExponentP();
  public java.math.BigInteger getPrimeExponentQ();
  public java.math.BigInteger getCrtCoefficient();
}
