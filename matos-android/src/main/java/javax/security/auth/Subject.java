package javax.security.auth;

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


public final class Subject
  implements java.io.Serializable
{
  // Constructors

  public Subject(){
  }
  public Subject(boolean arg1, java.util.Set<? extends java.security.Principal> arg2, java.util.Set<?> arg3, java.util.Set<?> arg4){
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
  public java.util.Set<java.security.Principal> getPrincipals(){
    return (java.util.Set) null;
  }
  public <T extends java.security.Principal>java.util.Set<T> getPrincipals(java.lang.Class<T> arg1){
    return (java.util.Set) null;
  }
  public void setReadOnly(){
  }
  public boolean isReadOnly(){
    return false;
  }
  public static Subject getSubject(java.security.AccessControlContext arg1){
    return (Subject) null;
  }
  public static <T>T doAs(Subject arg1, java.security.PrivilegedAction<T> arg2){
    return null;
  }
  public static <T>T doAs(Subject arg1, java.security.PrivilegedExceptionAction<T> arg2) throws java.security.PrivilegedActionException{
    return null;
  }
  public static <T>T doAsPrivileged(Subject arg1, java.security.PrivilegedAction<T> arg2, java.security.AccessControlContext arg3){
    return null;
  }
  public static <T>T doAsPrivileged(Subject arg1, java.security.PrivilegedExceptionAction<T> arg2, java.security.AccessControlContext arg3) throws java.security.PrivilegedActionException{
    return null;
  }
  public java.util.Set<java.lang.Object> getPrivateCredentials(){
    return (java.util.Set) null;
  }
  public <T>java.util.Set<T> getPrivateCredentials(java.lang.Class<T> arg1){
    return (java.util.Set) null;
  }
  public java.util.Set<java.lang.Object> getPublicCredentials(){
    return (java.util.Set) null;
  }
  public <T>java.util.Set<T> getPublicCredentials(java.lang.Class<T> arg1){
    return (java.util.Set) null;
  }
}
