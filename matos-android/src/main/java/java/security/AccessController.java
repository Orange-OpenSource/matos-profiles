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
public final class AccessController
{
  // Constructors

  private AccessController(){
  }
  // Methods

  public static void checkPermission(Permission arg1) throws AccessControlException{
  }
  @com.francetelecom.rd.stubs.annotation.Code("try { return arg1.run(); } catch (Exception e) { return null; }")
  public static <T>T doPrivileged(PrivilegedAction<T> arg1){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("try { return arg1.run(); } catch (Exception e) { return null; }")
  public static <T>T doPrivileged(PrivilegedAction<T> arg1, AccessControlContext arg2){
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("try { return arg1.run(); } catch (Exception e) { return null; }")
  public static <T>T doPrivileged(PrivilegedExceptionAction<T> arg1) throws PrivilegedActionException{
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("try { return arg1.run(); } catch (Exception e) { return null; }")
  public static <T>T doPrivileged(PrivilegedExceptionAction<T> arg1, AccessControlContext arg2) throws PrivilegedActionException{
    return null;
  }
  public static AccessControlContext getContext(){
    return (AccessControlContext) null;
  }
  public static <T>T doPrivilegedWithCombiner(PrivilegedAction<T> arg1){
    return null;
  }
  public static <T>T doPrivilegedWithCombiner(PrivilegedExceptionAction<T> arg1) throws PrivilegedActionException{
    return null;
  }
}
