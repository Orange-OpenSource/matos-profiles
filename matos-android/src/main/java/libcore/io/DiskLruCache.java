package libcore.io;

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
public final class DiskLruCache
  implements java.io.Closeable
{
  // Classes

  public static final class Snapshot
    implements java.io.Closeable
  {
    // Constructors

    private Snapshot(@com.francetelecom.rd.stubs.annotation.FieldSet("input") java.io.InputStream [] arg1){
    }
    // Methods

    public void close(){
    }
    @com.francetelecom.rd.stubs.annotation.Code({"return input[0];"})
    public java.io.InputStream getInputStream(int arg1){
      return (java.io.InputStream) null;
    }
    public java.lang.String getString(int arg1) throws java.io.IOException{
      return (java.lang.String) null;
    }
  }
  public final class Editor
  {
    // Fields

    // Constructors

    public Editor(){
    }
    // Methods

    public void set(int arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("value") java.lang.String arg2) throws java.io.IOException{
    }
    @com.francetelecom.rd.stubs.annotation.FieldGet("value")
	  public java.lang.String getString(int arg1) throws java.io.IOException{
      return (java.lang.String) null;
    }
    public void abort() throws java.io.IOException{
    }
    public void commit() throws java.io.IOException{
    }
    public java.io.OutputStream newOutputStream(int arg1) throws java.io.IOException{
      return (java.io.OutputStream) null;
    }
    public java.io.InputStream newInputStream(int arg1) throws java.io.IOException{
      return (java.io.InputStream) null;
    }
  }
  // Constructors

  private DiskLruCache(java.io.File arg1, int arg2, int arg3, long arg4){
  }
  // Methods

  public synchronized DiskLruCache.Snapshot get(java.lang.String arg1) throws java.io.IOException{
    return (DiskLruCache.Snapshot) null;
  }
  public synchronized long size(){
    return 0l;
  }
  public synchronized boolean remove(java.lang.String arg1) throws java.io.IOException{
    return false;
  }
  public synchronized void close() throws java.io.IOException{
  }
  public synchronized void flush() throws java.io.IOException{
  }
  public void delete() throws java.io.IOException{
  }
  public static DiskLruCache open(java.io.File arg1, int arg2, int arg3, long arg4) throws java.io.IOException{
    return (DiskLruCache) null;
  }
  public boolean isClosed(){
    return false;
  }
  public long maxSize(){
    return 0l;
  }
  public synchronized DiskLruCache.Editor edit(java.lang.String arg1) throws java.io.IOException{
    return (DiskLruCache.Editor) null;
  }
  public java.io.File getDirectory(){
    return (java.io.File) null;
  }
}
