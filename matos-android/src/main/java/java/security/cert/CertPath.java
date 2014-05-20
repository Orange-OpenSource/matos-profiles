package java.security.cert;

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


public abstract class CertPath
  implements java.io.Serializable
{
  // Classes

  protected static class CertPathRep
    implements java.io.Serializable
  {
    // Constructors

    protected CertPathRep(java.lang.String arg1, byte [] arg2){
    }
    // Methods

    protected java.lang.Object readResolve() throws java.io.ObjectStreamException{
      return (java.lang.Object) null;
    }
  }
  // Constructors

  protected CertPath(java.lang.String arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public abstract java.util.List<? extends Certificate> getCertificates();
  public java.lang.String getType(){
    return (java.lang.String) null;
  }
  public abstract byte [] getEncoded() throws CertificateEncodingException;
  public abstract byte [] getEncoded(java.lang.String arg1) throws CertificateEncodingException;
  protected java.lang.Object writeReplace() throws java.io.ObjectStreamException{
    return (java.lang.Object) null;
  }
  public abstract java.util.Iterator<java.lang.String> getEncodings();
}
