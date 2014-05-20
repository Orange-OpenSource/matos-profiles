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


public final class URL
  implements java.io.Serializable
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "net.URL-1", pos = {0, 1}, report = "-")
  public URL(java.lang.String arg1) throws MalformedURLException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "net.URL-2", pos = {0, 1, 2}, report = "-")
  public URL(URL arg1, java.lang.String arg2) throws MalformedURLException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "net.URL-3", pos = {0, 1, 2}, report = "-")
  public URL(URL arg1, java.lang.String arg2, URLStreamHandler arg3) throws MalformedURLException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "net.URL-4", pos = {0, 1, 2, 3}, report = "-")
  public URL(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws MalformedURLException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "net.URL-5", pos = {0, 1, 2, 3, 4}, report = "-")
  public URL(java.lang.String arg1, java.lang.String arg2, int arg3, java.lang.String arg4) throws MalformedURLException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "net.URL-6", pos = {0, 1, 2, 3, 4}, report = "-")
  public URL(java.lang.String arg1, java.lang.String arg2, int arg3, java.lang.String arg4, URLStreamHandler arg5) throws MalformedURLException{
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "URL.openStream", pos = {0, -1}, report = "-")
  public final java.io.InputStream openStream() throws java.io.IOException{
    return (java.io.InputStream) null;
  }
  protected void set(java.lang.String arg1, java.lang.String arg2, int arg3, java.lang.String arg4, java.lang.String arg5){
  }
  protected void set(java.lang.String arg1, java.lang.String arg2, int arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8){
  }
  public java.lang.String getAuthority(){
    return (java.lang.String) null;
  }
  public java.lang.String getPath(){
    return (java.lang.String) null;
  }
  public java.lang.String getQuery(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "URL.toURI", pos = {0, -1}, report = "-")
  public URI toURI() throws URISyntaxException{
    return (URI) null;
  }
  public java.lang.String getFile(){
    return (java.lang.String) null;
  }
  public java.lang.String getHost(){
    return (java.lang.String) null;
  }
  public java.lang.String getProtocol(){
    return (java.lang.String) null;
  }
  public URLConnection openConnection() throws java.io.IOException{
    return (URLConnection) null;
  }
  public URLConnection openConnection(Proxy arg1) throws java.io.IOException{
    return (URLConnection) null;
  }
  public final java.lang.Object getContent() throws java.io.IOException{
    return (java.lang.Object) null;
  }
  public final java.lang.Object getContent(java.lang.Class [] arg1) throws java.io.IOException{
    return (java.lang.Object) null;
  }
  public int getDefaultPort(){
    return 0;
  }
  public int getPort(){
    return 0;
  }
  public java.lang.String getRef(){
    return (java.lang.String) null;
  }
  public java.lang.String getUserInfo(){
    return (java.lang.String) null;
  }
  public boolean sameFile(URL arg1){
    return false;
  }
  public static synchronized void setURLStreamHandlerFactory(URLStreamHandlerFactory arg1){
  }
  public java.lang.String toExternalForm(){
    return (java.lang.String) null;
  }
  public int getEffectivePort(){
    return 0;
  }
  public URI toURILenient() throws URISyntaxException{
    return (URI) null;
  }
}
