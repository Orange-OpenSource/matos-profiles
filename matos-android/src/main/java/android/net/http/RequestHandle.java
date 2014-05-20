package android.net.http;

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

import com.francetelecom.rd.stubs.annotation.ArgsRule;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class RequestHandle
{
  // Fields

  public static final int MAX_REDIRECT_COUNT = 16;

  // Constructors

  public RequestHandle(){
  }
  // Methods

  public java.lang.String getMethod(){
    return (java.lang.String) null;
  }
  public void cancel(){
  }
  public void processRequest(){
  }
  public boolean setupRedirect(java.lang.String arg1, int arg2, java.util.Map<java.lang.String, java.lang.String> arg3){
    return false;
  }
  public void handleSslErrorResponse(boolean arg1){
  }
  public void pauseRequest(boolean arg1){
  }
  public boolean isRedirectMax(){
    return false;
  }
  public int getRedirectCount(){
    return 0;
  }
  public void setRedirectCount(int arg1){
  }
  @ArgsRule(value="RequestHandler.setupBasicAuthResponse", pos={2,3})
  public void setupBasicAuthResponse(boolean arg1, java.lang.String arg2, java.lang.String arg3){
  }
  @ArgsRule(value="RequestHandler.setupDigestAuthResponse", pos={2,3,4,5,6,7,8})
  public void setupDigestAuthResponse(boolean arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8){
  }
  public static java.lang.String computeBasicAuthResponse(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public void waitUntilComplete(){
  }
  public static java.lang.String authorizationHeader(boolean arg1){
    return (java.lang.String) null;
  }
}
