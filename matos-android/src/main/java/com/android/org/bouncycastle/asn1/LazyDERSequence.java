package com.android.org.bouncycastle.asn1;

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


public class LazyDERSequence
  extends DERSequence{
  // Constructors

  LazyDERSequence(byte [] arg1) throws java.io.IOException{
    super();
  }
  // Methods

  public int size(){
    return 0;
  }
  public synchronized DEREncodable getObjectAt(int arg1){
    return (DEREncodable) null;
  }
  public synchronized java.util.Enumeration getObjects(){
    return (java.util.Enumeration) null;
  }
}
