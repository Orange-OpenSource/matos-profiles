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


public final class URI
  implements java.lang.Comparable<URI>, java.io.Serializable
{
  // Constructors

  private URI(){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "URI-1", pos = {0, 1}, report = "-")
  public URI(java.lang.String arg1) throws URISyntaxException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "URI-2", pos = {0, 1, 2, 3}, report = "-")
  public URI(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws URISyntaxException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "URI-3", pos = {0, 1, 2, 3, 4, 5, 6, 7}, report = "-")
  public URI(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, int arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7) throws URISyntaxException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "URI-4", pos = {0, 1, 2, 3, 4}, report = "-")
  public URI(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws URISyntaxException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "URI-5", pos = {0, 1, 2, 3, 4, 5}, report = "-")
  public URI(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) throws URISyntaxException{
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
  public int compareTo(URI arg1){
    return 0;
  }
  public boolean isAbsolute(){
    return false;
  }
  public static URI create(java.lang.String arg1){
    return (URI) null;
  }
  public java.lang.String getAuthority(){
    return (java.lang.String) null;
  }
  public java.lang.String getFragment(){
    return (java.lang.String) null;
  }
  public java.lang.String getPath(){
    return (java.lang.String) null;
  }
  public java.lang.String getQuery(){
    return (java.lang.String) null;
  }
  public java.lang.String getScheme(){
    return (java.lang.String) null;
  }
  public boolean isOpaque(){
    return false;
  }
  public URI normalize(){
    return (URI) null;
  }
  public URI resolve(URI arg1){
    return (URI) null;
  }
  public URI resolve(java.lang.String arg1){
    return (URI) null;
  }
  public URL toURL() throws MalformedURLException{
    return (URL) null;
  }
  public java.lang.String getHost(){
    return (java.lang.String) null;
  }
  public int getPort(){
    return 0;
  }
  public java.lang.String getUserInfo(){
    return (java.lang.String) null;
  }
  public java.lang.String getSchemeSpecificPart(){
    return (java.lang.String) null;
  }
  public int getEffectivePort(){
    return 0;
  }
  public static int getEffectivePort(java.lang.String arg1, int arg2){
    return 0;
  }
  public java.lang.String toASCIIString(){
    return (java.lang.String) null;
  }
  public java.lang.String getRawQuery(){
    return (java.lang.String) null;
  }
  public java.lang.String getRawSchemeSpecificPart(){
    return (java.lang.String) null;
  }
  public java.lang.String getRawAuthority(){
    return (java.lang.String) null;
  }
  public java.lang.String getRawUserInfo(){
    return (java.lang.String) null;
  }
  public java.lang.String getRawPath(){
    return (java.lang.String) null;
  }
  public java.lang.String getRawFragment(){
    return (java.lang.String) null;
  }
  public URI parseServerAuthority() throws URISyntaxException{
    return (URI) null;
  }
  public URI relativize(URI arg1){
    return (URI) null;
  }
}
