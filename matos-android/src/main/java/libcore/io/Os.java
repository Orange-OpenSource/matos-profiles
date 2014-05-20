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
public interface Os
{
  // Methods

  public void shutdown(java.io.FileDescriptor arg1, int arg2) throws ErrnoException;
  public java.lang.String getenv(java.lang.String arg1);
  public void remove(java.lang.String arg1) throws ErrnoException;
  public int write(java.io.FileDescriptor arg1, java.nio.ByteBuffer arg2) throws ErrnoException;
  public int write(java.io.FileDescriptor arg1, byte [] arg2, int arg3, int arg4) throws ErrnoException;
  public boolean access(java.lang.String arg1, int arg2) throws ErrnoException;
  public void close(java.io.FileDescriptor arg1) throws ErrnoException;
  public int poll(StructPollfd [] arg1, int arg2) throws ErrnoException;
  public int read(java.io.FileDescriptor arg1, java.nio.ByteBuffer arg2) throws ErrnoException;
  public int read(java.io.FileDescriptor arg1, byte [] arg2, int arg3, int arg4) throws ErrnoException;
  public java.io.FileDescriptor accept(java.io.FileDescriptor arg1, java.net.InetSocketAddress arg2) throws ErrnoException;
  public void mkdir(java.lang.String arg1, int arg2) throws ErrnoException;
  public void rename(java.lang.String arg1, java.lang.String arg2) throws ErrnoException;
  public java.io.FileDescriptor open(java.lang.String arg1, int arg2, int arg3) throws ErrnoException;
  public void connect(java.io.FileDescriptor arg1, java.net.InetAddress arg2, int arg3) throws ErrnoException;
  public void bind(java.io.FileDescriptor arg1, java.net.InetAddress arg2, int arg3) throws ErrnoException;
  public void chmod(java.lang.String arg1, int arg2) throws ErrnoException;
  public java.io.FileDescriptor dup(java.io.FileDescriptor arg1) throws ErrnoException;
  public java.io.FileDescriptor dup2(java.io.FileDescriptor arg1, int arg2) throws ErrnoException;
  public java.lang.String [] environ();
  public int fcntlVoid(java.io.FileDescriptor arg1, int arg2) throws ErrnoException;
  public int fcntlLong(java.io.FileDescriptor arg1, int arg2, long arg3) throws ErrnoException;
  public int fcntlFlock(java.io.FileDescriptor arg1, int arg2, StructFlock arg3) throws ErrnoException;
  public void fdatasync(java.io.FileDescriptor arg1) throws ErrnoException;
  public StructStat fstat(java.io.FileDescriptor arg1) throws ErrnoException;
  public StructStatFs fstatfs(java.io.FileDescriptor arg1) throws ErrnoException;
  public void fsync(java.io.FileDescriptor arg1) throws ErrnoException;
  public void ftruncate(java.io.FileDescriptor arg1, long arg2) throws ErrnoException;
  public java.lang.String gai_strerror(int arg1);
  public java.net.InetAddress [] getaddrinfo(java.lang.String arg1, StructAddrinfo arg2) throws GaiException;
  public int getegid();
  public int geteuid();
  public int getgid();
  public java.lang.String getnameinfo(java.net.InetAddress arg1, int arg2) throws GaiException;
  public int getpid();
  public int getppid();
  public StructPasswd getpwnam(java.lang.String arg1) throws ErrnoException;
  public StructPasswd getpwuid(int arg1) throws ErrnoException;
  public java.net.SocketAddress getsockname(java.io.FileDescriptor arg1) throws ErrnoException;
  public int getsockoptByte(java.io.FileDescriptor arg1, int arg2, int arg3) throws ErrnoException;
  public java.net.InetAddress getsockoptInAddr(java.io.FileDescriptor arg1, int arg2, int arg3) throws ErrnoException;
  public int getsockoptInt(java.io.FileDescriptor arg1, int arg2, int arg3) throws ErrnoException;
  public StructLinger getsockoptLinger(java.io.FileDescriptor arg1, int arg2, int arg3) throws ErrnoException;
  public StructTimeval getsockoptTimeval(java.io.FileDescriptor arg1, int arg2, int arg3) throws ErrnoException;
  public int getuid();
  public java.lang.String if_indextoname(int arg1);
  public java.net.InetAddress inet_pton(int arg1, java.lang.String arg2);
  public java.net.InetAddress ioctlInetAddress(java.io.FileDescriptor arg1, int arg2, java.lang.String arg3) throws ErrnoException;
  public int ioctlInt(java.io.FileDescriptor arg1, int arg2, libcore.util.MutableInt arg3) throws ErrnoException;
  public boolean isatty(java.io.FileDescriptor arg1);
  public void kill(int arg1, int arg2) throws ErrnoException;
  public void listen(java.io.FileDescriptor arg1, int arg2) throws ErrnoException;
  public long lseek(java.io.FileDescriptor arg1, long arg2, int arg3) throws ErrnoException;
  public StructStat lstat(java.lang.String arg1) throws ErrnoException;
  public void mincore(long arg1, long arg2, byte [] arg3) throws ErrnoException;
  public void mlock(long arg1, long arg2) throws ErrnoException;
  public long mmap(long arg1, long arg2, int arg3, int arg4, java.io.FileDescriptor arg5, long arg6) throws ErrnoException;
  public void msync(long arg1, long arg2, int arg3) throws ErrnoException;
  public void munlock(long arg1, long arg2) throws ErrnoException;
  public void munmap(long arg1, long arg2) throws ErrnoException;
  public java.io.FileDescriptor [] pipe() throws ErrnoException;
  public int pread(java.io.FileDescriptor arg1, java.nio.ByteBuffer arg2, long arg3) throws ErrnoException;
  public int pread(java.io.FileDescriptor arg1, byte [] arg2, int arg3, int arg4, long arg5) throws ErrnoException;
  public int pwrite(java.io.FileDescriptor arg1, java.nio.ByteBuffer arg2, long arg3) throws ErrnoException;
  public int pwrite(java.io.FileDescriptor arg1, byte [] arg2, int arg3, int arg4, long arg5) throws ErrnoException;
  public int readv(java.io.FileDescriptor arg1, java.lang.Object [] arg2, int [] arg3, int [] arg4) throws ErrnoException;
  public int recvfrom(java.io.FileDescriptor arg1, java.nio.ByteBuffer arg2, int arg3, java.net.InetSocketAddress arg4) throws ErrnoException;
  public int recvfrom(java.io.FileDescriptor arg1, byte [] arg2, int arg3, int arg4, int arg5, java.net.InetSocketAddress arg6) throws ErrnoException;
  public long sendfile(java.io.FileDescriptor arg1, java.io.FileDescriptor arg2, libcore.util.MutableLong arg3, long arg4) throws ErrnoException;
  public int sendto(java.io.FileDescriptor arg1, java.nio.ByteBuffer arg2, int arg3, java.net.InetAddress arg4, int arg5) throws ErrnoException;
  public int sendto(java.io.FileDescriptor arg1, byte [] arg2, int arg3, int arg4, int arg5, java.net.InetAddress arg6, int arg7) throws ErrnoException;
  public void setegid(int arg1) throws ErrnoException;
  public void seteuid(int arg1) throws ErrnoException;
  public void setgid(int arg1) throws ErrnoException;
  public void setsockoptByte(java.io.FileDescriptor arg1, int arg2, int arg3, int arg4) throws ErrnoException;
  public void setsockoptIfreq(java.io.FileDescriptor arg1, int arg2, int arg3, java.lang.String arg4) throws ErrnoException;
  public void setsockoptInt(java.io.FileDescriptor arg1, int arg2, int arg3, int arg4) throws ErrnoException;
  public void setsockoptIpMreqn(java.io.FileDescriptor arg1, int arg2, int arg3, int arg4) throws ErrnoException;
  public void setsockoptGroupReq(java.io.FileDescriptor arg1, int arg2, int arg3, StructGroupReq arg4) throws ErrnoException;
  public void setsockoptLinger(java.io.FileDescriptor arg1, int arg2, int arg3, StructLinger arg4) throws ErrnoException;
  public void setsockoptTimeval(java.io.FileDescriptor arg1, int arg2, int arg3, StructTimeval arg4) throws ErrnoException;
  public void setuid(int arg1) throws ErrnoException;
  public java.io.FileDescriptor socket(int arg1, int arg2, int arg3) throws ErrnoException;
  public StructStat stat(java.lang.String arg1) throws ErrnoException;
  public StructStatFs statfs(java.lang.String arg1) throws ErrnoException;
  public java.lang.String strerror(int arg1);
  public void symlink(java.lang.String arg1, java.lang.String arg2) throws ErrnoException;
  public long sysconf(int arg1);
  public StructUtsname uname();
  public int waitpid(int arg1, libcore.util.MutableInt arg2, int arg3) throws ErrnoException;
  public int writev(java.io.FileDescriptor arg1, java.lang.Object [] arg2, int [] arg3, int [] arg4) throws ErrnoException;
}
