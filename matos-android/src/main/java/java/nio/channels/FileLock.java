package java.nio.channels;

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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.FileLockImpl", superClass = "")
public abstract class FileLock
{
  // Constructors

  protected FileLock(FileChannel arg1, long arg2, long arg3, boolean arg4){
  }
  // Methods

  public final java.lang.String toString(){
    return (java.lang.String) null;
  }
  public final long size(){
    return 0l;
  }
  public final long position(){
    return 0l;
  }
  public abstract void release() throws java.io.IOException;
  public final FileChannel channel(){
    return (FileChannel) null;
  }
  public final boolean isShared(){
    return false;
  }
  public abstract boolean isValid();
  public final boolean overlaps(long arg1, long arg2){
    return false;
  }
}
