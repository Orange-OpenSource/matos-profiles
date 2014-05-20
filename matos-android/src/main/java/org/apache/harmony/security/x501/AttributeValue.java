package org.apache.harmony.security.x501;

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
public final class AttributeValue
{
  // Fields

  public final boolean wasEncoded = false;

  public java.lang.String escapedString;

  public byte [] encoded;

  public byte [] bytes;

  public boolean hasQE;

  public java.lang.String rawString;

  // Constructors

  public AttributeValue(java.lang.String arg1, boolean arg2){
  }
  public AttributeValue(java.lang.String arg1, byte [] arg2){
  }
  public AttributeValue(java.lang.String arg1, byte [] arg2, int arg3){
  }
  // Methods

  public int getTag(){
    return 0;
  }
  public java.lang.String getHexString(){
    return (java.lang.String) null;
  }
  public void appendQEString(java.lang.StringBuilder arg1){
  }
  public java.lang.String makeCanonical(){
    return (java.lang.String) null;
  }
}
