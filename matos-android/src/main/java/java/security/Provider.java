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
public abstract class Provider
  extends java.util.Properties{
  // Classes

  public static class Service
  {
    // Constructors

    public Service(@com.francetelecom.rd.stubs.annotation.FieldSet("mProvider") Provider arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mType") java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("mAlgorithm") java.lang.String arg3, @com.francetelecom.rd.stubs.annotation.FieldSet("mClassName") java.lang.String arg4, java.util.List<java.lang.String> arg5, java.util.Map<java.lang.String, java.lang.String> arg6){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public java.lang.Object newInstance(java.lang.Object arg1) throws NoSuchAlgorithmException{
      return (java.lang.Object) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mType")
	  public final java.lang.String getType(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mClassName")
	  public final java.lang.String getClassName(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("mAlgorithm")
	  public final java.lang.String getAlgorithm(){
      return (java.lang.String) null;
    }
    public final java.lang.String getAttribute(java.lang.String arg1){
      return (java.lang.String) null;
    }
    public final Provider getProvider(){
      return (Provider) null;
    }
    public boolean supportsParameter(java.lang.Object arg1){
      return false;
    }
  }
  // Constructors

  protected Provider(@com.francetelecom.rd.stubs.annotation.FieldSet("mName") java.lang.String arg1, double arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("mInfo") java.lang.String arg3){
    super();
  }
  // Methods

  public synchronized java.lang.Object put(java.lang.Object arg1, java.lang.Object arg2){
    return (java.lang.Object) null;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.util.Collection<java.lang.Object> values(){
    return (java.util.Collection) null;
  }
  public synchronized void clear(){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mName")
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public synchronized java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> entrySet(){
    return (java.util.Set) null;
  }
  public synchronized void putAll(java.util.Map<?, ?> arg1){
  }
  public synchronized void load(java.io.InputStream arg1) throws java.io.IOException{
  }
  public synchronized java.lang.Object remove(java.lang.Object arg1){
    return (java.lang.Object) null;
  }
  public java.util.Set<java.lang.Object> keySet(){
    return (java.util.Set) null;
  }
  public double getVersion(){
    return 0.0d;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mService")
  public synchronized Provider.Service getService(java.lang.String arg1, java.lang.String arg2){
    return (Provider.Service) null;
  }
  public java.lang.String getInfo(){
    return (java.lang.String) null;
  }
  public synchronized java.util.Set<Provider.Service> getServices(){
    return (java.util.Set) null;
  }
  protected synchronized void putService(@com.francetelecom.rd.stubs.annotation.FieldSet("mService") Provider.Service arg1){
  }
  protected synchronized void removeService(Provider.Service arg1){
  }
}
