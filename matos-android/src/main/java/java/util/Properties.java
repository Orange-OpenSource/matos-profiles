package java.util;

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


public class Properties
  extends Hashtable<java.lang.Object, java.lang.Object>{
  // Fields

  protected Properties defaults;

  // Constructors

  public Properties(){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.Code({"key = arg1.key;", "value = arg1.value;"})
  public Properties(Properties arg1){
    super();
  }
  // Methods

  public java.lang.Object setProperty(@com.francetelecom.rd.stubs.annotation.FieldSet("key") java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("value") java.lang.String arg2){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public java.lang.String getProperty(java.lang.String arg1){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public java.lang.String getProperty(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"key = \"Property from network\";", "value = \"Property from network\";"})
  public synchronized void load(java.io.InputStream arg1) throws java.io.IOException{
  }
  public synchronized void load(java.io.Reader arg1) throws java.io.IOException{
  }
  public void list(java.io.PrintStream arg1){
  }
  public void list(java.io.PrintWriter arg1){
  }
  @com.francetelecom.rd.stubs.annotation.Code({"key = \"Property from network\";", "value = \"Property from network\";"})
  public synchronized void loadFromXML(java.io.InputStream arg1) throws java.io.IOException, InvalidPropertiesFormatException{
  }
  @com.francetelecom.rd.stubs.annotation.Code("return new EnumerationImplem<String>(key);")
  public Enumeration<?> propertyNames(){
    return (Enumeration) null;
  }
  public void save(java.io.OutputStream arg1, java.lang.String arg2){
  }
  public synchronized void store(java.io.OutputStream arg1, java.lang.String arg2) throws java.io.IOException{
  }
  public synchronized void store(java.io.Writer arg1, java.lang.String arg2) throws java.io.IOException{
  }
  public void storeToXML(java.io.OutputStream arg1, java.lang.String arg2) throws java.io.IOException{
  }
  public synchronized void storeToXML(java.io.OutputStream arg1, java.lang.String arg2, java.lang.String arg3) throws java.io.IOException{
  }
  public Set<java.lang.String> stringPropertyNames(){
    return (Set) null;
  }
}
