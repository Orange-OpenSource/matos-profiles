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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class HttpAuthHeader
{
  // Fields

  public static final java.lang.String BASIC_TOKEN = "Basic";

  public static final java.lang.String DIGEST_TOKEN = "Digest";

  public static final int UNKNOWN = 0;

  public static final int BASIC = 1;

  public static final int DIGEST = 2;

  // Constructors

  public HttpAuthHeader(java.lang.String arg1){
  }
  // Methods

  public int getScheme(){
    return 0;
  }
  public boolean isProxy(){
    return false;
  }
  public java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
  public java.lang.String getRealm(){
    return (java.lang.String) null;
  }
  public java.lang.String getQop(){
    return (java.lang.String) null;
  }
  public java.lang.String getNonce(){
    return (java.lang.String) null;
  }
  public void setUsername(java.lang.String arg1){
  }
  public java.lang.String getOpaque(){
    return (java.lang.String) null;
  }
  public java.lang.String getUsername(){
    return (java.lang.String) null;
  }
  public void setPassword(java.lang.String arg1){
  }
  public java.lang.String getPassword(){
    return (java.lang.String) null;
  }
  public boolean getStale(){
    return false;
  }
  public void setProxy(){
  }
  public boolean isDigest(){
    return false;
  }
  public boolean isSupportedScheme(){
    return false;
  }
  public boolean isBasic(){
    return false;
  }
}
