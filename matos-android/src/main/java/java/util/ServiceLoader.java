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


public final class ServiceLoader<S>
  implements java.lang.Iterable<S>
{
  // Constructors

  private ServiceLoader(java.lang.Class<S> arg1, java.lang.ClassLoader arg2){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public Iterator<S> iterator(){
    return (Iterator) null;
  }
  public static <S>ServiceLoader<S> load(java.lang.Class<S> arg1, java.lang.ClassLoader arg2){
    return (ServiceLoader) null;
  }
  public static <S>ServiceLoader<S> load(java.lang.Class<S> arg1){
    return (ServiceLoader) null;
  }
  public void reload(){
  }
  public static <S>S loadFromSystemProperty(java.lang.Class<S> arg1){
    return null;
  }
  public static <S>ServiceLoader<S> loadInstalled(java.lang.Class<S> arg1){
    return (ServiceLoader) null;
  }
}
