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


public abstract class Authenticator
{
  // Classes

  public static enum RequestorType
  {
    // Enum Constants

    PROXY()
, SERVER()
;
    // Fields

    // Constructors

    private RequestorType(){
    }
    // Methods

  }
  // Constructors

  public Authenticator(){
  }
  // Methods

  public static void setDefault(Authenticator arg1){
  }
  public static synchronized PasswordAuthentication requestPasswordAuthentication(InetAddress arg1, int arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5){
    return (PasswordAuthentication) null;
  }
  public static synchronized PasswordAuthentication requestPasswordAuthentication(java.lang.String arg1, InetAddress arg2, int arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6){
    return (PasswordAuthentication) null;
  }
  public static PasswordAuthentication requestPasswordAuthentication(java.lang.String arg1, InetAddress arg2, int arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, URL arg7, Authenticator.RequestorType arg8){
    return (PasswordAuthentication) null;
  }
  protected PasswordAuthentication getPasswordAuthentication(){
    return (PasswordAuthentication) null;
  }
  protected final int getRequestingPort(){
    return 0;
  }
  protected final InetAddress getRequestingSite(){
    return (InetAddress) null;
  }
  protected final java.lang.String getRequestingPrompt(){
    return (java.lang.String) null;
  }
  protected final java.lang.String getRequestingProtocol(){
    return (java.lang.String) null;
  }
  protected final java.lang.String getRequestingScheme(){
    return (java.lang.String) null;
  }
  protected final java.lang.String getRequestingHost(){
    return (java.lang.String) null;
  }
  protected URL getRequestingURL(){
    return (URL) null;
  }
  protected Authenticator.RequestorType getRequestorType(){
    return (Authenticator.RequestorType) null;
  }
}
