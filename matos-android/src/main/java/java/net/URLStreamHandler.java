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


public abstract class URLStreamHandler
{
  // Constructors

  public URLStreamHandler(){
  }
  // Methods

  protected boolean equals(URL arg1, URL arg2){
    return false;
  }
  protected int hashCode(URL arg1){
    return 0;
  }
  protected abstract URLConnection openConnection(URL arg1) throws java.io.IOException;
  protected URLConnection openConnection(URL arg1, Proxy arg2) throws java.io.IOException{
    return (URLConnection) null;
  }
  protected int getDefaultPort(){
    return 0;
  }
  protected InetAddress getHostAddress(URL arg1){
    return (InetAddress) null;
  }
  protected void parseURL(URL arg1, java.lang.String arg2, int arg3, int arg4){
  }
  protected boolean sameFile(URL arg1, URL arg2){
    return false;
  }
  protected java.lang.String toExternalForm(URL arg1){
    return (java.lang.String) null;
  }
  protected boolean hostsEqual(URL arg1, URL arg2){
    return false;
  }
  protected void setURL(URL arg1, java.lang.String arg2, java.lang.String arg3, int arg4, java.lang.String arg5, java.lang.String arg6){
  }
  protected void setURL(URL arg1, java.lang.String arg2, java.lang.String arg3, int arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9){
  }
}
