package libcore.net.http;

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
public final class RawHeaders
{
  // Constructors

  public RawHeaders(){
  }
  public RawHeaders(RawHeaders arg1){
  }
  // Methods

  public void add(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("value") java.lang.String arg2){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public java.lang.String get(java.lang.String arg1){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public java.lang.String getValue(int arg1){
    return (java.lang.String) null;
  }
  public int length(){
    return 0;
  }
  public void addAll(java.lang.String arg1, java.util.List<java.lang.String> arg2){
  }
  public void set(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("value") java.lang.String arg2){
  }
  public void removeAll(java.lang.String arg1){
  }
  public int getResponseCode(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("statusLine")
  public java.lang.String getStatusLine(){
    return (java.lang.String) null;
  }
  public void setStatusLine(@com.francetelecom.rd.stubs.annotation.FieldSet("statusLine") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.Code({"return this;"})
  public RawHeaders getAll(java.util.Set<java.lang.String> arg1){
    return (RawHeaders) null;
  }
  public java.lang.String getResponseMessage(){
    return (java.lang.String) null;
  }
  public java.lang.String getFieldName(int arg1){
    return (java.lang.String) null;
  }
  public static RawHeaders fromMultimap(java.util.Map<java.lang.String, java.util.List<java.lang.String>> arg1){
    return (RawHeaders) null;
  }
  public java.util.Map<java.lang.String, java.util.List<java.lang.String>> toMultimap(){
    return (java.util.Map) null;
  }
  public int getHttpMinorVersion(){
    return 0;
  }
  public void addLine(java.lang.String arg1){
  }
  public java.lang.String toHeaderString(){
    return (java.lang.String) null;
  }
}
