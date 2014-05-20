package org.apache.http.protocol;

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
public final class BasicHttpProcessor
  implements HttpRequestInterceptorList, HttpProcessor, HttpResponseInterceptorList, java.lang.Cloneable
{
  // Fields

  protected java.util.List requestInterceptors;

  protected java.util.List responseInterceptors;

  // Constructors

  public BasicHttpProcessor(){
  }
  // Methods

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public BasicHttpProcessor copy(){
    return (BasicHttpProcessor) null;
  }
  public void process(org.apache.http.HttpRequest arg1, HttpContext arg2) throws java.io.IOException, org.apache.http.HttpException{
  }
  public void process(org.apache.http.HttpResponse arg1, HttpContext arg2) throws java.io.IOException, org.apache.http.HttpException{
  }
  public void addRequestInterceptor(@com.francetelecom.rd.stubs.annotation.CallBackRegister("process") org.apache.http.HttpRequestInterceptor arg1){
  }
  public void addRequestInterceptor(@com.francetelecom.rd.stubs.annotation.CallBackRegister("process") org.apache.http.HttpRequestInterceptor arg1, int arg2){
  }
  public int getRequestInterceptorCount(){
    return 0;
  }
  public org.apache.http.HttpRequestInterceptor getRequestInterceptor(int arg1){
    return (org.apache.http.HttpRequestInterceptor) null;
  }
  public void clearRequestInterceptors(){
  }
  public void removeRequestInterceptorByClass(java.lang.Class arg1){
  }
  public void setInterceptors(java.util.List arg1){
  }
  public void addResponseInterceptor(@com.francetelecom.rd.stubs.annotation.CallBackRegister("process") org.apache.http.HttpResponseInterceptor arg1, int arg2){
  }
  public void addResponseInterceptor(@com.francetelecom.rd.stubs.annotation.CallBackRegister("process") org.apache.http.HttpResponseInterceptor arg1){
  }
  public void removeResponseInterceptorByClass(java.lang.Class arg1){
  }
  public final void addInterceptor(@com.francetelecom.rd.stubs.annotation.CallBackRegister("process") org.apache.http.HttpRequestInterceptor arg1){
  }
  public final void addInterceptor(@com.francetelecom.rd.stubs.annotation.CallBackRegister("process") org.apache.http.HttpRequestInterceptor arg1, int arg2){
  }
  public final void addInterceptor(@com.francetelecom.rd.stubs.annotation.CallBackRegister("process") org.apache.http.HttpResponseInterceptor arg1){
  }
  public final void addInterceptor(@com.francetelecom.rd.stubs.annotation.CallBackRegister("process") org.apache.http.HttpResponseInterceptor arg1, int arg2){
  }
  public int getResponseInterceptorCount(){
    return 0;
  }
  public org.apache.http.HttpResponseInterceptor getResponseInterceptor(int arg1){
    return (org.apache.http.HttpResponseInterceptor) null;
  }
  public void clearResponseInterceptors(){
  }
  public void clearInterceptors(){
  }
  protected void copyInterceptors(BasicHttpProcessor arg1){
  }
}
