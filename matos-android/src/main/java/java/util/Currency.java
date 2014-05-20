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


public final class Currency
  implements java.io.Serializable
{
  // Constructors

  private Currency(java.lang.String arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public static Currency getInstance(java.lang.String arg1){
    return (Currency) null;
  }
  public static Currency getInstance(Locale arg1){
    return (Currency) null;
  }
  public java.lang.String getDisplayName(){
    return (java.lang.String) null;
  }
  public java.lang.String getDisplayName(Locale arg1){
    return (java.lang.String) null;
  }
  public static Set<Currency> getAvailableCurrencies(){
    return (Set) null;
  }
  public java.lang.String getCurrencyCode(){
    return (java.lang.String) null;
  }
  public java.lang.String getSymbol(){
    return (java.lang.String) null;
  }
  public java.lang.String getSymbol(Locale arg1){
    return (java.lang.String) null;
  }
  public int getDefaultFractionDigits(){
    return 0;
  }
}
