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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.FileChannelImpl", superClass = "")
public abstract class FileChannel
  extends java.nio.channels.spi.AbstractInterruptibleChannel  implements ScatteringByteChannel, ByteChannel, GatheringByteChannel
{
  // Classes

  public static class MapMode
  {
    // Fields

    public static final FileChannel.MapMode PRIVATE = null;

    public static final FileChannel.MapMode READ_ONLY = null;

    public static final FileChannel.MapMode READ_WRITE = null;

    // Constructors

    private MapMode(java.lang.String arg1){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  // Constructors

  protected FileChannel(){
    super();
  }
  // Methods

  public final FileLock lock() throws java.io.IOException{
    return (FileLock) null;
  }
  public abstract FileLock lock(long arg1, long arg2, boolean arg3) throws java.io.IOException;
  public abstract long size() throws java.io.IOException;
  public abstract long position() throws java.io.IOException;
  public abstract FileChannel position(long arg1) throws java.io.IOException;
  public abstract int write(java.nio.ByteBuffer arg1) throws java.io.IOException;
  public abstract int write(java.nio.ByteBuffer arg1, long arg2) throws java.io.IOException;
  public final long write(java.nio.ByteBuffer [] arg1) throws java.io.IOException{
    return 0l;
  }
  public abstract long write(java.nio.ByteBuffer [] arg1, int arg2, int arg3) throws java.io.IOException;
  public abstract int read(java.nio.ByteBuffer arg1) throws java.io.IOException;
  public abstract int read(java.nio.ByteBuffer arg1, long arg2) throws java.io.IOException;
  public final long read(java.nio.ByteBuffer [] arg1) throws java.io.IOException{
    return 0l;
  }
  public abstract long read(java.nio.ByteBuffer [] arg1, int arg2, int arg3) throws java.io.IOException;
  public abstract java.nio.MappedByteBuffer map(FileChannel.MapMode arg1, long arg2, long arg3) throws java.io.IOException;
  public final FileLock tryLock() throws java.io.IOException{
    return (FileLock) null;
  }
  public abstract FileLock tryLock(long arg1, long arg2, boolean arg3) throws java.io.IOException;
  public abstract FileChannel truncate(long arg1) throws java.io.IOException;
  public abstract void force(boolean arg1) throws java.io.IOException;
  public abstract long transferFrom(ReadableByteChannel arg1, long arg2, long arg3) throws java.io.IOException;
  public abstract long transferTo(long arg1, long arg2, WritableByteChannel arg3) throws java.io.IOException;
}
