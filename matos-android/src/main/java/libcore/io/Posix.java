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
public final class Posix
  implements Os
{
  // Constructors

  Posix(){
  }
  // Methods

  public void shutdown(java.io.FileDescriptor arg1, int arg2) throws ErrnoException{
  }
  public java.lang.String getenv(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void remove(java.lang.String arg1) throws ErrnoException{
  }
  public int write(java.io.FileDescriptor arg1, java.nio.ByteBuffer arg2) throws ErrnoException{
    return 0;
  }
  public int write(java.io.FileDescriptor arg1, byte [] arg2, int arg3, int arg4) throws ErrnoException{
    return 0;
  }
  public boolean access(java.lang.String arg1, int arg2) throws ErrnoException{
    return false;
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
  public void mkdir(java.lang.String arg1, int arg2) throws ErrnoException{
  }
  public void rename(java.lang.String arg1, java.lang.String arg2) throws ErrnoException{
  }
  public java.io.FileDescriptor open(java.lang.String arg1, int arg2, int arg3) throws ErrnoException{
    return (java.io.FileDescriptor) null;
  }
  public void connect(java.io.FileDescriptor arg1, java.net.InetAddress arg2, int arg3) throws ErrnoException{
  }
  public void bind(java.io.FileDescriptor arg1, java.net.InetAddress arg2, int arg3) throws ErrnoException{
  }
  public void chmod(java.lang.String arg1, int arg2) throws ErrnoException{
  }
  public java.io.FileDescriptor dup(java.io.FileDescriptor arg1) throws ErrnoException{
    return (java.io.FileDescriptor) null;
  }
  public java.io.FileDescriptor dup2(java.io.FileDescriptor arg1, int arg2) throws ErrnoException{
    return (java.io.FileDescriptor) null;
  }
  public java.lang.String [] environ(){
    return (java.lang.String []) null;
  }
  public int fcntlVoid(java.io.FileDescriptor arg1, int arg2) throws ErrnoException{
    return 0;
  }
  public int fcntlLong(java.io.FileDescriptor arg1, int arg2, long arg3) throws ErrnoException{
    return 0;
  }
  public int fcntlFlock(java.io.FileDescriptor arg1, int arg2, StructFlock arg3) throws ErrnoException{
    return 0;
  }
  public void fdatasync(java.io.FileDescriptor arg1) throws ErrnoException{
  }
  public StructStat fstat(java.io.FileDescriptor arg1) throws ErrnoException{
    return (StructStat) null;
  }
  public StructStatFs fstatfs(java.io.FileDescriptor arg1) throws ErrnoException{
    return (StructStatFs) null;
  }
  public void fsync(java.io.FileDescriptor arg1) throws ErrnoException{
  }
  public void ftruncate(java.io.FileDescriptor arg1, long arg2) throws ErrnoException{
  }
  public java.lang.String gai_strerror(int arg1){
    return (java.lang.String) null;
  }
  public java.net.InetAddress [] getaddrinfo(java.lang.String arg1, StructAddrinfo arg2) throws GaiException{
    return (java.net.InetAddress []) null;
  }
  public int getegid(){
    return 0;
  }
  public int geteuid(){
    return 0;
  }
  public int getgid(){
    return 0;
  }
  public java.lang.String getnameinfo(java.net.InetAddress arg1, int arg2) throws GaiException{
    return (java.lang.String) null;
  }
  public int getpid(){
    return 0;
  }
  public int getppid(){
    return 0;
  }
  public StructPasswd getpwnam(java.lang.String arg1) throws ErrnoException{
    return (StructPasswd) null;
  }
  public StructPasswd getpwuid(int arg1) throws ErrnoException{
    return (StructPasswd) null;
  }
  public java.net.SocketAddress getsockname(java.io.FileDescriptor arg1) throws ErrnoException{
    return (java.net.SocketAddress) null;
  }
  public int getsockoptByte(java.io.FileDescriptor arg1, int arg2, int arg3) throws ErrnoException{
    return 0;
  }
  public java.net.InetAddress getsockoptInAddr(java.io.FileDescriptor arg1, int arg2, int arg3) throws ErrnoException{
    return (java.net.InetAddress) null;
  }
  public int getsockoptInt(java.io.FileDescriptor arg1, int arg2, int arg3) throws ErrnoException{
    return 0;
  }
  public StructLinger getsockoptLinger(java.io.FileDescriptor arg1, int arg2, int arg3) throws ErrnoException{
    return (StructLinger) null;
  }
  public StructTimeval getsockoptTimeval(java.io.FileDescriptor arg1, int arg2, int arg3) throws ErrnoException{
    return (StructTimeval) null;
  }
  public int getuid(){
    return 0;
  }
  public java.lang.String if_indextoname(int arg1){
    return (java.lang.String) null;
  }
  public java.net.InetAddress inet_pton(int arg1, java.lang.String arg2){
    return (java.net.InetAddress) null;
  }
  public java.net.InetAddress ioctlInetAddress(java.io.FileDescriptor arg1, int arg2, java.lang.String arg3) throws ErrnoException{
    return (java.net.InetAddress) null;
  }
  public int ioctlInt(java.io.FileDescriptor arg1, int arg2, libcore.util.MutableInt arg3) throws ErrnoException{
    return 0;
  }
  public boolean isatty(java.io.FileDescriptor arg1){
    return false;
  }
  public void kill(int arg1, int arg2) throws ErrnoException{
  }
  public void listen(java.io.FileDescriptor arg1, int arg2) throws ErrnoException{
  }
  public long lseek(java.io.FileDescriptor arg1, long arg2, int arg3) throws ErrnoException{
    return 0l;
  }
  public StructStat lstat(java.lang.String arg1) throws ErrnoException{
    return (StructStat) null;
  }
  public void mincore(long arg1, long arg2, byte [] arg3) throws ErrnoException{
  }
  public void mlock(long arg1, long arg2) throws ErrnoException{
  }
  public long mmap(long arg1, long arg2, int arg3, int arg4, java.io.FileDescriptor arg5, long arg6) throws ErrnoException{
    return 0l;
  }
  public void msync(long arg1, long arg2, int arg3) throws ErrnoException{
  }
  public void munlock(long arg1, long arg2) throws ErrnoException{
  }
  public void munmap(long arg1, long arg2) throws ErrnoException{
  }
  public java.io.FileDescriptor [] pipe() throws ErrnoException{
    return (java.io.FileDescriptor []) null;
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
  public long sendfile(java.io.FileDescriptor arg1, java.io.FileDescriptor arg2, libcore.util.MutableLong arg3, long arg4) throws ErrnoException{
    return 0l;
  }
  public int sendto(java.io.FileDescriptor arg1, java.nio.ByteBuffer arg2, int arg3, java.net.InetAddress arg4, int arg5) throws ErrnoException{
    return 0;
  }
  public int sendto(java.io.FileDescriptor arg1, byte [] arg2, int arg3, int arg4, int arg5, java.net.InetAddress arg6, int arg7) throws ErrnoException{
    return 0;
  }
  public void setegid(int arg1) throws ErrnoException{
  }
  public void seteuid(int arg1) throws ErrnoException{
  }
  public void setgid(int arg1) throws ErrnoException{
  }
  public void setsockoptByte(java.io.FileDescriptor arg1, int arg2, int arg3, int arg4) throws ErrnoException{
  }
  public void setsockoptIfreq(java.io.FileDescriptor arg1, int arg2, int arg3, java.lang.String arg4) throws ErrnoException{
  }
  public void setsockoptInt(java.io.FileDescriptor arg1, int arg2, int arg3, int arg4) throws ErrnoException{
  }
  public void setsockoptIpMreqn(java.io.FileDescriptor arg1, int arg2, int arg3, int arg4) throws ErrnoException{
  }
  public void setsockoptGroupReq(java.io.FileDescriptor arg1, int arg2, int arg3, StructGroupReq arg4) throws ErrnoException{
  }
  public void setsockoptLinger(java.io.FileDescriptor arg1, int arg2, int arg3, StructLinger arg4) throws ErrnoException{
  }
  public void setsockoptTimeval(java.io.FileDescriptor arg1, int arg2, int arg3, StructTimeval arg4) throws ErrnoException{
  }
  public void setuid(int arg1) throws ErrnoException{
  }
  public java.io.FileDescriptor socket(int arg1, int arg2, int arg3) throws ErrnoException{
    return (java.io.FileDescriptor) null;
  }
  public StructStat stat(java.lang.String arg1) throws ErrnoException{
    return (StructStat) null;
  }
  public StructStatFs statfs(java.lang.String arg1) throws ErrnoException{
    return (StructStatFs) null;
  }
  public java.lang.String strerror(int arg1){
    return (java.lang.String) null;
  }
  public void symlink(java.lang.String arg1, java.lang.String arg2) throws ErrnoException{
  }
  public long sysconf(int arg1){
    return 0l;
  }
  public StructUtsname uname(){
    return (StructUtsname) null;
  }
  public int waitpid(int arg1, libcore.util.MutableInt arg2, int arg3) throws ErrnoException{
    return 0;
  }
  public int writev(java.io.FileDescriptor arg1, java.lang.Object [] arg2, int [] arg3, int [] arg4) throws ErrnoException{
    return 0;
  }
}
