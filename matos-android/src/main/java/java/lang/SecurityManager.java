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


public class SecurityManager
{
  // Fields

  protected boolean inCheck;

  // Constructors

  public SecurityManager(){
  }
  // Methods

  public void checkPackageAccess(String arg1){
  }
  public void checkMemberAccess(Class<?> arg1, int arg2){
  }
  public void checkPermission(java.security.Permission arg1){
  }
  public void checkPermission(java.security.Permission arg1, Object arg2){
  }
  public void checkCreateClassLoader(){
  }
  public void checkPropertiesAccess(){
  }
  public void checkPropertyAccess(String arg1){
  }
  public ThreadGroup getThreadGroup(){
    return (ThreadGroup) null;
  }
  public void checkAccess(Thread arg1){
  }
  public void checkAccess(ThreadGroup arg1){
  }
  public void checkExit(int arg1){
  }
  public void checkLink(String arg1){
  }
  public void checkDelete(String arg1){
  }
  public void checkExec(String arg1){
  }
  public void checkRead(java.io.FileDescriptor arg1){
  }
  public void checkRead(String arg1){
  }
  public void checkRead(String arg1, Object arg2){
  }
  public void checkWrite(java.io.FileDescriptor arg1){
  }
  public void checkWrite(String arg1){
  }
  public void checkConnect(String arg1, int arg2){
  }
  public void checkConnect(String arg1, int arg2, Object arg3){
  }
  public void checkSetFactory(){
  }
  public void checkAccept(String arg1, int arg2){
  }
  public void checkAwtEventQueueAccess(){
  }
  public void checkListen(int arg1){
  }
  public void checkMulticast(java.net.InetAddress arg1){
  }
  public void checkMulticast(java.net.InetAddress arg1, byte arg2){
  }
  public void checkPackageDefinition(String arg1){
  }
  public void checkPrintJobAccess(){
  }
  public void checkSecurityAccess(String arg1){
  }
  public void checkSystemClipboardAccess(){
  }
  public boolean checkTopLevelWindow(Object arg1){
    return false;
  }
  protected int classDepth(String arg1){
    return 0;
  }
  protected int classLoaderDepth(){
    return 0;
  }
  protected ClassLoader currentClassLoader(){
    return (ClassLoader) null;
  }
  protected Class<?> currentLoadedClass(){
    return (Class) null;
  }
  protected Class [] getClassContext(){
    return (Class []) null;
  }
  public boolean getInCheck(){
    return false;
  }
  public Object getSecurityContext(){
    return (Object) null;
  }
  protected boolean inClass(String arg1){
    return false;
  }
  protected boolean inClassLoader(){
    return false;
  }
}
