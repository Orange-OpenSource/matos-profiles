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


public final class HttpCookie
  implements java.lang.Cloneable
{
  // Constructors

  public HttpCookie(java.lang.String arg1, java.lang.String arg2){
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
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public java.lang.String getValue(){
    return (java.lang.String) null;
  }
  public void setValue(@com.francetelecom.rd.stubs.annotation.FieldSet("value") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("path")
  public java.lang.String getPath(){
    return (java.lang.String) null;
  }
  public static java.util.List<HttpCookie> parse(java.lang.String arg1){
    return (java.util.List) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("comment")
  public java.lang.String getComment(){
    return (java.lang.String) null;
  }
  public void setComment(@com.francetelecom.rd.stubs.annotation.FieldSet("comment") java.lang.String arg1){
  }
  public void setVersion(int arg1){
  }
  public int getVersion(){
    return 0;
  }
  public static boolean domainMatches(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("commentURL")
  public java.lang.String getCommentURL(){
    return (java.lang.String) null;
  }
  public boolean getDiscard(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("domain")
  public java.lang.String getDomain(){
    return (java.lang.String) null;
  }
  public long getMaxAge(){
    return 0l;
  }
  public java.lang.String getPortlist(){
    return (java.lang.String) null;
  }
  public boolean getSecure(){
    return false;
  }
  public boolean hasExpired(){
    return false;
  }
  public void setCommentURL(@com.francetelecom.rd.stubs.annotation.FieldSet("commentURL") java.lang.String arg1){
  }
  public void setDiscard(boolean arg1){
  }
  public void setDomain(@com.francetelecom.rd.stubs.annotation.FieldSet("domain") java.lang.String arg1){
  }
  public void setMaxAge(long arg1){
  }
  public void setPath(@com.francetelecom.rd.stubs.annotation.FieldSet("path") java.lang.String arg1){
  }
  public void setPortlist(@com.francetelecom.rd.stubs.annotation.FieldSet("portList") java.lang.String arg1){
  }
  public void setSecure(boolean arg1){
  }
}
