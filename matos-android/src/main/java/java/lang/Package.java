package java.lang;

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


public class Package
  implements java.lang.reflect.AnnotatedElement
{
  // Constructors

  Package(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, java.net.URL arg8){
  }
  // Methods

  public String toString(){
    return (String) null;
  }
  public int hashCode(){
    return 0;
  }
  public String getName(){
    return (String) null;
  }
  public <A extends java.lang.annotation.Annotation>A getAnnotation(Class<A> arg1){
    return null;
  }
  public java.lang.annotation.Annotation [] getAnnotations(){
    return (java.lang.annotation.Annotation []) null;
  }
  public java.lang.annotation.Annotation [] getDeclaredAnnotations(){
    return (java.lang.annotation.Annotation []) null;
  }
  public static Package getPackage(String arg1){
    return (Package) null;
  }
  public boolean isAnnotationPresent(Class<? extends java.lang.annotation.Annotation> arg1){
    return false;
  }
  public static Package [] getPackages(){
    return (Package []) null;
  }
  public boolean isSealed(){
    return false;
  }
  public boolean isSealed(java.net.URL arg1){
    return false;
  }
  public String getImplementationTitle(){
    return (String) null;
  }
  public String getImplementationVendor(){
    return (String) null;
  }
  public String getImplementationVersion(){
    return (String) null;
  }
  public String getSpecificationTitle(){
    return (String) null;
  }
  public String getSpecificationVendor(){
    return (String) null;
  }
  public String getSpecificationVersion(){
    return (String) null;
  }
  public boolean isCompatibleWith(String arg1) throws NumberFormatException{
    return false;
  }
}
