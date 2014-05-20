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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ClassLoaderImpl", superClass = "")
public abstract class ClassLoader
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ClassLoader-1", pos = 0, report = "-")
  protected ClassLoader(){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ClassLoader-2", pos = 0, report = "-")
  protected ClassLoader(ClassLoader arg1){
  }
  ClassLoader(ClassLoader arg1, boolean arg2){
  }
  // Methods

  public Class<?> loadClass(String arg1) throws ClassNotFoundException{
    return (Class) null;
  }
  protected Class<?> loadClass(String arg1, boolean arg2) throws ClassNotFoundException{
    return (Class) null;
  }
  public static ClassLoader getSystemClassLoader(){
    return (ClassLoader) null;
  }
  protected Package getPackage(String arg1){
    return (Package) null;
  }
  public java.net.URL getResource(String arg1){
    return (java.net.URL) null;
  }
  public java.io.InputStream getResourceAsStream(String arg1){
    return (java.io.InputStream) null;
  }
  public static java.net.URL getSystemResource(String arg1){
    return (java.net.URL) null;
  }
  public static java.io.InputStream getSystemResourceAsStream(String arg1){
    return (java.io.InputStream) null;
  }
  protected final void setSigners(Class<?> arg1, Object [] arg2){
  }
  public void clearAssertionStatus(){
  }
  protected final Class<?> defineClass(byte [] arg1, int arg2, int arg3) throws ClassFormatError{
    return (Class) null;
  }
  protected final Class<?> defineClass(String arg1, byte [] arg2, int arg3, int arg4) throws ClassFormatError{
    return (Class) null;
  }
  protected final Class<?> defineClass(String arg1, byte [] arg2, int arg3, int arg4, java.security.ProtectionDomain arg5) throws ClassFormatError{
    return (Class) null;
  }
  protected final Class<?> defineClass(String arg1, java.nio.ByteBuffer arg2, java.security.ProtectionDomain arg3) throws ClassFormatError{
    return (Class) null;
  }
  protected Package definePackage(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, java.net.URL arg8) throws IllegalArgumentException{
    return (Package) null;
  }
  protected Class<?> findClass(String arg1) throws ClassNotFoundException{
    return (Class) null;
  }
  protected String findLibrary(String arg1){
    return (String) null;
  }
  protected final Class<?> findLoadedClass(String arg1){
    return (Class) null;
  }
  protected java.net.URL findResource(String arg1){
    return (java.net.URL) null;
  }
  protected java.util.Enumeration<java.net.URL> findResources(String arg1) throws java.io.IOException{
    return (java.util.Enumeration) null;
  }
  protected final Class<?> findSystemClass(String arg1) throws ClassNotFoundException{
    return (Class) null;
  }
  protected Package [] getPackages(){
    return (Package []) null;
  }
  public final ClassLoader getParent(){
    return (ClassLoader) null;
  }
  public java.util.Enumeration<java.net.URL> getResources(String arg1) throws java.io.IOException{
    return (java.util.Enumeration) null;
  }
  public static java.util.Enumeration<java.net.URL> getSystemResources(String arg1) throws java.io.IOException{
    return (java.util.Enumeration) null;
  }
  protected final void resolveClass(Class<?> arg1){
  }
  public void setClassAssertionStatus(String arg1, boolean arg2){
  }
  public void setDefaultAssertionStatus(boolean arg1){
  }
  public void setPackageAssertionStatus(String arg1, boolean arg2){
  }
}
