package java.lang.reflect;

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


public class Proxy
  implements java.io.Serializable
{
  // Fields

  protected InvocationHandler h;

  // Constructors

  private Proxy(){
  }
  @com.francetelecom.rd.stubs.annotation.Code("try { arg1.invoke(new java.lang.Object(), new Method(com.francetelecom.rd.stubs.Generator.token), new java.lang.Object[]{new java.lang.Object()}); } catch (Throwable exc) { }")
  protected Proxy(InvocationHandler arg1){
  }
  // Methods

  public static boolean isProxyClass(java.lang.Class<?> arg1){
    return false;
  }
  public static java.lang.Class<?> getProxyClass(java.lang.ClassLoader arg1, java.lang.Class<?> [] arg2) throws java.lang.IllegalArgumentException{
    return (java.lang.Class) null;
  }
  public static java.lang.Object newProxyInstance(java.lang.ClassLoader arg1, java.lang.Class<?> [] arg2, InvocationHandler arg3) throws java.lang.IllegalArgumentException{
    return (java.lang.Object) null;
  }
  public static InvocationHandler getInvocationHandler(java.lang.Object arg1) throws java.lang.IllegalArgumentException{
    return (InvocationHandler) null;
  }
}
