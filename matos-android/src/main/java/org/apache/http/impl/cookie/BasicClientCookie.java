package org.apache.http.impl.cookie;

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
public class BasicClientCookie
  implements org.apache.http.cookie.SetCookie, org.apache.http.cookie.ClientCookie, java.lang.Cloneable
{
  // Constructors

  public BasicClientCookie(java.lang.String arg1, java.lang.String arg2){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public java.lang.String getValue(){
    return (java.lang.String) null;
  }
  public void setValue(java.lang.String arg1){
  }
  public java.lang.String getPath(){
    return (java.lang.String) null;
  }
  public java.lang.String getComment(){
    return (java.lang.String) null;
  }
  public void setComment(java.lang.String arg1){
  }
  public java.lang.String getAttribute(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void setVersion(int arg1){
  }
  public int getVersion(){
    return 0;
  }
  public java.lang.String getCommentURL(){
    return (java.lang.String) null;
  }
  public java.lang.String getDomain(){
    return (java.lang.String) null;
  }
  public void setDomain(java.lang.String arg1){
  }
  public void setPath(java.lang.String arg1){
  }
  public void setSecure(boolean arg1){
  }
  public boolean isSecure(){
    return false;
  }
  public void setAttribute(java.lang.String arg1, java.lang.String arg2){
  }
  public boolean isPersistent(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("expirityDate")
  public java.util.Date getExpiryDate(){
    return (java.util.Date) null;
  }
  public int [] getPorts(){
    return (int []) null;
  }
  public boolean isExpired(java.util.Date arg1){
    return false;
  }
  public void setExpiryDate(@com.francetelecom.rd.stubs.annotation.FieldSet("expirityDate") java.util.Date arg1){
  }
  public boolean containsAttribute(java.lang.String arg1){
    return false;
  }
}
