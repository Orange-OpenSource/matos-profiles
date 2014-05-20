package org.apache.harmony.security.asn1;

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
public abstract class ASN1TypeCollection
  extends ASN1Constructed{
  // Fields

  public final ASN1Type [] type = (ASN1Type []) null;

  public final boolean [] OPTIONAL = (boolean []) null;

  public final java.lang.Object [] DEFAULT = (java.lang.Object []) null;

  // Constructors

  protected ASN1TypeCollection(int arg1, ASN1Type [] arg2){
    super(0);
  }
  // Methods

  protected final void setDefault(java.lang.Object arg1, int arg2){
  }
  protected void getValues(java.lang.Object arg1, java.lang.Object [] arg2){
  }
  protected final void setOptional(int arg1){
  }
}
