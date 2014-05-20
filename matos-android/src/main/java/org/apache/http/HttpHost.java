package org.apache.http;

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
public final class HttpHost
  implements java.lang.Cloneable
{
  // Fields

  public static final java.lang.String DEFAULT_SCHEME_NAME = "http";

  protected final java.lang.String hostname = (java.lang.String) null;

  protected final java.lang.String lcHostname = (java.lang.String) null;

  protected final int port = 0;

  protected final java.lang.String schemeName = (java.lang.String) null;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "HttpHost-1", pos = {0, 1, 2, 3}, report = "-")
  public HttpHost(java.lang.String arg1, int arg2, java.lang.String arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "HttpHost-2", pos = {0, 1, 2}, report = "-")
  public HttpHost(java.lang.String arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "HttpHost-3", pos = {0, 1}, report = "-")
  public HttpHost(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "HttpHost-4", pos = {0, 1}, report = "-")
  public HttpHost(HttpHost arg1){
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
  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "HttpHost.toURI", pos = {0, -1}, report = "-")
  public java.lang.String toURI(){
    return (java.lang.String) null;
  }
  public java.lang.String getHostName(){
    return (java.lang.String) null;
  }
  public int getPort(){
    return 0;
  }
  public java.lang.String getSchemeName(){
    return (java.lang.String) null;
  }
  public java.lang.String toHostString(){
    return (java.lang.String) null;
  }
}
