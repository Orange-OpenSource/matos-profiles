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


public abstract class URLConnection
{
  // Fields

  protected URL url;

  protected long ifModifiedSince;

  protected boolean useCaches;

  protected boolean connected;

  protected boolean doOutput;

  protected boolean doInput;

  protected boolean allowUserInteraction;

  // Constructors

  protected URLConnection(URL arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public URL getURL(){
    return (URL) null;
  }
  public java.security.Permission getPermission() throws java.io.IOException{
    return (java.security.Permission) null;
  }
  public java.lang.Object getContent() throws java.io.IOException{
    return (java.lang.Object) null;
  }
  public java.lang.Object getContent(java.lang.Class [] arg1) throws java.io.IOException{
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "URLConnection.getInputStream", pos = {0, -1}, report = "-")
  public java.io.InputStream getInputStream() throws java.io.IOException{
    return (java.io.InputStream) null;
  }
  public abstract void connect() throws java.io.IOException;
  public long getDate(){
    return 0l;
  }
  public void setRequestProperty(java.lang.String arg1, java.lang.String arg2){
  }
  public int getContentLength(){
    return 0;
  }
  public static FileNameMap getFileNameMap(){
    return (FileNameMap) null;
  }
  public java.lang.String getHeaderField(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getHeaderField(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getHeaderFieldKey(int arg1){
    return (java.lang.String) null;
  }
  public long getLastModified(){
    return 0l;
  }
  public void addRequestProperty(java.lang.String arg1, java.lang.String arg2){
  }
  public java.lang.String getContentType(){
    return (java.lang.String) null;
  }
  public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getRequestProperties(){
    return (java.util.Map) null;
  }
  public java.lang.String getRequestProperty(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String guessContentTypeFromName(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String guessContentTypeFromStream(java.io.InputStream arg1) throws java.io.IOException{
    return (java.lang.String) null;
  }
  public boolean getAllowUserInteraction(){
    return false;
  }
  public int getConnectTimeout(){
    return 0;
  }
  public java.lang.String getContentEncoding(){
    return (java.lang.String) null;
  }
  public static boolean getDefaultAllowUserInteraction(){
    return false;
  }
  public static java.lang.String getDefaultRequestProperty(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public boolean getDefaultUseCaches(){
    return false;
  }
  public boolean getDoInput(){
    return false;
  }
  public boolean getDoOutput(){
    return false;
  }
  public long getExpiration(){
    return 0l;
  }
  public long getHeaderFieldDate(java.lang.String arg1, long arg2){
    return 0l;
  }
  public int getHeaderFieldInt(java.lang.String arg1, int arg2){
    return 0;
  }
  public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaderFields(){
    return (java.util.Map) null;
  }
  public long getIfModifiedSince(){
    return 0l;
  }
  public java.io.OutputStream getOutputStream() throws java.io.IOException{
    return (java.io.OutputStream) null;
  }
  public int getReadTimeout(){
    return 0;
  }
  public boolean getUseCaches(){
    return false;
  }
  public void setAllowUserInteraction(boolean arg1){
  }
  public void setConnectTimeout(int arg1){
  }
  public static synchronized void setContentHandlerFactory(@com.francetelecom.rd.stubs.annotation.CallBackRegister("ContentHandlerFactory") ContentHandlerFactory arg1){
  }
  public static void setDefaultAllowUserInteraction(boolean arg1){
  }
  public static void setDefaultRequestProperty(java.lang.String arg1, java.lang.String arg2){
  }
  public void setDefaultUseCaches(boolean arg1){
  }
  public void setDoInput(boolean arg1){
  }
  public void setDoOutput(boolean arg1){
  }
  public static void setFileNameMap(FileNameMap arg1){
  }
  public void setIfModifiedSince(long arg1){
  }
  public void setReadTimeout(int arg1){
  }
  public void setUseCaches(boolean arg1){
  }
}
