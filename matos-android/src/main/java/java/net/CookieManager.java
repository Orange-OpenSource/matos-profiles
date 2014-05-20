package java.net;

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


public class CookieManager
  extends CookieHandler{
  // Constructors

  public CookieManager(){
    super();
  }
  public CookieManager(CookieStore arg1, CookiePolicy arg2){
    super();
  }
  // Methods

  public java.util.Map<java.lang.String, java.util.List<java.lang.String>> get(URI arg1, java.util.Map<java.lang.String, java.util.List<java.lang.String>> arg2) throws java.io.IOException{
    return (java.util.Map) null;
  }
  public void put(URI arg1, java.util.Map<java.lang.String, java.util.List<java.lang.String>> arg2) throws java.io.IOException{
  }
  public CookieStore getCookieStore(){
    return (CookieStore) null;
  }
  public void setCookiePolicy(CookiePolicy arg1){
  }
}
