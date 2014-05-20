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
public class BlockGuardOs
  extends ForwardingOs{
  // Constructors

  public BlockGuardOs(Os arg1){
    super((Os) null);
  }
  // Methods

  public int write(java.io.FileDescriptor arg1, java.nio.ByteBuffer arg2) throws ErrnoException{
    return 0;
  }
  public int write(java.io.FileDescriptor arg1, byte [] arg2, int arg3, int arg4) throws ErrnoException{
    return 0;
  }
  public void close(java.io.FileDescriptor arg1) throws ErrnoException{
  }
  public int poll(StructPollfd [] arg1, int arg2) throws ErrnoException{
    return 0;
  }
  public int read(java.io.FileDescriptor arg1, java.nio.ByteBuffer arg2) throws ErrnoException{
    return 0;
  }
  public int read(java.io.FileDescriptor arg1, byte [] arg2, int arg3, int arg4) throws ErrnoException{
    return 0;
  }
  public java.io.FileDescriptor accept(java.io.FileDescriptor arg1, java.net.InetSocketAddress arg2) throws ErrnoException{
    return (java.io.FileDescriptor) null;
  }
  public java.io.FileDescriptor open(java.lang.String arg1, int arg2, int arg3) throws ErrnoException{
    return (java.io.FileDescriptor) null;
  }
  public void connect(java.io.FileDescriptor arg1, java.net.InetAddress arg2, int arg3) throws ErrnoException{
  }
  public void fdatasync(java.io.FileDescriptor arg1) throws ErrnoException{
  }
  public void fsync(java.io.FileDescriptor arg1) throws ErrnoException{
  }
  public void ftruncate(java.io.FileDescriptor arg1, long arg2) throws ErrnoException{
  }
  public int pread(java.io.FileDescriptor arg1, java.nio.ByteBuffer arg2, long arg3) throws ErrnoException{
    return 0;
  }
  public int pread(java.io.FileDescriptor arg1, byte [] arg2, int arg3, int arg4, long arg5) throws ErrnoException{
    return 0;
  }
  public int pwrite(java.io.FileDescriptor arg1, java.nio.ByteBuffer arg2, long arg3) throws ErrnoException{
    return 0;
  }
  public int pwrite(java.io.FileDescriptor arg1, byte [] arg2, int arg3, int arg4, long arg5) throws ErrnoException{
    return 0;
  }
  public int readv(java.io.FileDescriptor arg1, java.lang.Object [] arg2, int [] arg3, int [] arg4) throws ErrnoException{
    return 0;
  }
  public int recvfrom(java.io.FileDescriptor arg1, java.nio.ByteBuffer arg2, int arg3, java.net.InetSocketAddress arg4) throws ErrnoException{
    return 0;
  }
  public int recvfrom(java.io.FileDescriptor arg1, byte [] arg2, int arg3, int arg4, int arg5, java.net.InetSocketAddress arg6) throws ErrnoException{
    return 0;
  }
  public int sendto(java.io.FileDescriptor arg1, java.nio.ByteBuffer arg2, int arg3, java.net.InetAddress arg4, int arg5) throws ErrnoException{
    return 0;
  }
  public int sendto(java.io.FileDescriptor arg1, byte [] arg2, int arg3, int arg4, int arg5, java.net.InetAddress arg6, int arg7) throws ErrnoException{
    return 0;
  }
  public java.io.FileDescriptor socket(int arg1, int arg2, int arg3) throws ErrnoException{
    return (java.io.FileDescriptor) null;
  }
  public int writev(java.io.FileDescriptor arg1, java.lang.Object [] arg2, int [] arg3, int [] arg4) throws ErrnoException{
    return 0;
  }
}
