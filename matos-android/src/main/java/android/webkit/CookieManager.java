package android.webkit;

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
public final class CookieManager
{
  // Constructors

  private CookieManager(){
  }
  // Methods

  protected java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public static synchronized CookieManager getInstance(){
    return (CookieManager) null;
  }
  public java.lang.String getCookie(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getCookie(java.lang.String arg1, boolean arg2){
    return (java.lang.String) null;
  }
  public synchronized java.lang.String getCookie(android.net.WebAddress arg1){
    return (java.lang.String) null;
  }
  public void removeSessionCookie(){
  }
  public void removeExpiredCookie(){
  }
  public void removeAllCookie(){
  }
  public synchronized boolean hasCookies(){
    return false;
  }
  public synchronized boolean hasCookies(boolean arg1){
    return false;
  }
  public synchronized boolean acceptCookie(){
    return false;
  }
  public void waitForCookieOperationsToComplete(){
  }
  public synchronized void setAcceptCookie(boolean arg1){
  }
  public void setCookie(java.lang.String arg1, java.lang.String arg2){
  }
  public void setCookie(java.lang.String arg1, java.lang.String arg2, boolean arg3){
  }
  public synchronized void setCookie(android.net.WebAddress arg1, java.lang.String arg2){
  }
  public static boolean allowFileSchemeCookies(){
    return false;
  }
  public static void setAcceptFileSchemeCookies(boolean arg1){
  }
}
