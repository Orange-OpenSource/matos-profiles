package android.content.res;

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
public final class AssetManager
{
  // Classes

  public final class AssetInputStream
    extends java.io.InputStream  {
    // Fields

    // Constructors

    private AssetInputStream(int arg1){
      super();
    }
    // Methods

    protected void finalize() throws java.lang.Throwable{
    }
    public final void close() throws java.io.IOException{
    }
    public final void mark(int arg1){
    }
    public final void reset() throws java.io.IOException{
    }
    public final int read() throws java.io.IOException{
      return 0;
    }
    public final int read(byte [] arg1) throws java.io.IOException{
      return 0;
    }
    public final int read(byte [] arg1, int arg2, int arg3) throws java.io.IOException{
      return 0;
    }
    public final int available() throws java.io.IOException{
      return 0;
    }
    public final long skip(long arg1) throws java.io.IOException{
      return 0l;
    }
    public final boolean markSupported(){
      return false;
    }
    public final int getAssetInt(){
      return 0;
    }
  }
  // Fields

  public static final int ACCESS_UNKNOWN = 0;

  public static final int ACCESS_RANDOM = 1;

  public static final int ACCESS_STREAMING = 2;

  public static final int ACCESS_BUFFER = 3;

  // Constructors

  public AssetManager(){
  }
  private AssetManager(boolean arg1){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public final java.lang.String [] list(java.lang.String arg1) throws java.io.IOException{
    return (java.lang.String []) null;
  }
  public void close(){
  }
  public final java.io.InputStream open(java.lang.String arg1) throws java.io.IOException{
    return (java.io.InputStream) null;
  }
  public final java.io.InputStream open(java.lang.String arg1, int arg2) throws java.io.IOException{
    return (java.io.InputStream) null;
  }
  public final void setLocale(java.lang.String arg1){
  }
  public static AssetManager getSystem(){
    return (AssetManager) null;
  }
  public final java.lang.String [] getLocales(){
    return (java.lang.String []) null;
  }
  public final java.io.InputStream openNonAsset(java.lang.String arg1) throws java.io.IOException{
    return (java.io.InputStream) null;
  }
  public final java.io.InputStream openNonAsset(java.lang.String arg1, int arg2) throws java.io.IOException{
    return (java.io.InputStream) null;
  }
  public final java.io.InputStream openNonAsset(int arg1, java.lang.String arg2) throws java.io.IOException{
    return (java.io.InputStream) null;
  }
  public final java.io.InputStream openNonAsset(int arg1, java.lang.String arg2, int arg3) throws java.io.IOException{
    return (java.io.InputStream) null;
  }
  public final AssetFileDescriptor openNonAssetFd(java.lang.String arg1) throws java.io.IOException{
    return (AssetFileDescriptor) null;
  }
  public final AssetFileDescriptor openNonAssetFd(int arg1, java.lang.String arg2) throws java.io.IOException{
    return (AssetFileDescriptor) null;
  }
  public final void setConfiguration(int arg1, int arg2, java.lang.String arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17){
  }
  public final int addAssetPath(java.lang.String arg1){
    return 0;
  }
  public final XmlResourceParser openXmlResourceParser(java.lang.String arg1) throws java.io.IOException{
    return (XmlResourceParser) null;
  }
  public final XmlResourceParser openXmlResourceParser(int arg1, java.lang.String arg2) throws java.io.IOException{
    return (XmlResourceParser) null;
  }
  public final boolean isUpToDate(){
    return false;
  }
  public final AssetFileDescriptor openFd(java.lang.String arg1) throws java.io.IOException{
    return (AssetFileDescriptor) null;
  }
  public final int [] addAssetPaths(java.lang.String [] arg1){
    return (int []) null;
  }
  public final java.lang.String getCookieName(int arg1){
    return (java.lang.String) null;
  }
  public static final int getGlobalAssetCount(){
    return 0;
  }
  public static final java.lang.String getAssetAllocations(){
    return (java.lang.String) null;
  }
  public static final int getGlobalAssetManagerCount(){
    return 0;
  }
}
