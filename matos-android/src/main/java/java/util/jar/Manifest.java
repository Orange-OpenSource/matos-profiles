package java.util.jar;

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


public class Manifest
  implements java.lang.Cloneable
{
  // Constructors

  public Manifest(){
  }
  public Manifest(java.io.InputStream arg1) throws java.io.IOException{
  }
  public Manifest(Manifest arg1){
  }
  Manifest(java.io.InputStream arg1, boolean arg2) throws java.io.IOException{
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public void clear(){
  }
  public void write(java.io.OutputStream arg1) throws java.io.IOException{
  }
  public void read(java.io.InputStream arg1) throws java.io.IOException{
  }
  public Attributes getAttributes(java.lang.String arg1){
    return (Attributes) null;
  }
  public Attributes getMainAttributes(){
    return (Attributes) null;
  }
  public java.util.Map<java.lang.String, Attributes> getEntries(){
    return (java.util.Map) null;
  }
}
