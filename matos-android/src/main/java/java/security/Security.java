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

import java.lang.reflect.Modifier;

import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.Field;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;
import com.francetelecom.rd.stubs.annotation.Fields;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)

public final class Security
{
  // Constructors

  private Security(){
  }
  // Methods

  public static void setProperty(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("mProperty") java.lang.String arg2){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mProperty")
  public static java.lang.String getProperty(java.lang.String arg1){
    return (java.lang.String) null;
  }
  @FieldGet("provider")
  public static synchronized Provider getProvider(java.lang.String arg1){
    return (Provider) null;
  }
  @Code("return new Provider[] {provider};")
  public static synchronized Provider [] getProviders(){
    return (Provider []) null;
  }
  @Code("return new Provider[] {provider};")
  public static Provider [] getProviders(java.lang.String arg1){
    return (Provider []) null;
  }
  @Code("return new Provider[] {provider};")
  public static synchronized Provider [] getProviders(java.util.Map<java.lang.String, java.lang.String> arg1){
    return (Provider []) null;
  }
  
  public static int addProvider(@FieldSet("provider") Provider arg1){
    return 0;
  }
  public static java.lang.String getAlgorithmProperty(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  
  public static synchronized int insertProviderAt(@FieldSet("provider") Provider arg1, int arg2){
    return 0;
  }
  public static synchronized void removeProvider(java.lang.String arg1){
  }
  public static java.util.Set<java.lang.String> getAlgorithms(java.lang.String arg1){
    return (java.util.Set) null;
  }
}
