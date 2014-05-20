package org.apache.xml.utils;

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


public class URI
  implements java.io.Serializable
{
  // Classes

  public static class MalformedURIException
    extends java.io.IOException  {
    // Constructors

    public MalformedURIException(){
      super();
    }
    public MalformedURIException(java.lang.String arg1){
      super();
    }
  }
  // Constructors

  public URI(){
  }
  public URI(URI arg1){
  }
  public URI(java.lang.String arg1) throws URI.MalformedURIException{
  }
  public URI(URI arg1, java.lang.String arg2) throws URI.MalformedURIException{
  }
  public URI(java.lang.String arg1, java.lang.String arg2) throws URI.MalformedURIException{
  }
  public URI(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5) throws URI.MalformedURIException{
  }
  public URI(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, int arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7) throws URI.MalformedURIException{
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("fragment")
  public java.lang.String getFragment(){
    return (java.lang.String) null;
  }
  public java.lang.String getPath(boolean arg1, boolean arg2){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("path")
  public java.lang.String getPath(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("scheme")
  public java.lang.String getScheme(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("host")
  public java.lang.String getHost(){
    return (java.lang.String) null;
  }
  public int getPort(){
    return 0;
  }
  public void setPath(@com.francetelecom.rd.stubs.annotation.FieldSet("path") java.lang.String arg1) throws URI.MalformedURIException{
  }
  public void setFragment(@com.francetelecom.rd.stubs.annotation.FieldSet("fragment") java.lang.String arg1) throws URI.MalformedURIException{
  }
  public void setScheme(@com.francetelecom.rd.stubs.annotation.FieldSet("scheme") java.lang.String arg1) throws URI.MalformedURIException{
  }
  public void setHost(@com.francetelecom.rd.stubs.annotation.FieldSet("host") java.lang.String arg1) throws URI.MalformedURIException{
  }
  public java.lang.String getSchemeSpecificPart(){
    return (java.lang.String) null;
  }
  public void setPort(int arg1) throws URI.MalformedURIException{
  }
  public void appendPath(java.lang.String arg1) throws URI.MalformedURIException{
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("userInfo")
  public java.lang.String getUserinfo(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("queryString")
  public java.lang.String getQueryString(){
    return (java.lang.String) null;
  }
  public void setUserinfo(@com.francetelecom.rd.stubs.annotation.FieldSet("userInfo") java.lang.String arg1) throws URI.MalformedURIException{
  }
  public void setQueryString(@com.francetelecom.rd.stubs.annotation.FieldSet("queryString") java.lang.String arg1) throws URI.MalformedURIException{
  }
  public boolean isGenericURI(){
    return false;
  }
  public static boolean isConformantSchemeName(java.lang.String arg1){
    return false;
  }
  public static boolean isWellFormedAddress(java.lang.String arg1){
    return false;
  }
}
