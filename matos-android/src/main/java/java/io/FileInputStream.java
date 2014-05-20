package java.io;

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


public class FileInputStream
  extends InputStream  implements Closeable
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "FileInputStream-1", pos = {0, 1}, report = "-")
  public FileInputStream(File arg1) throws FileNotFoundException{
    super();
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "FileInputStream-2", pos = {0, 1}, report = "-")
  public FileInputStream(FileDescriptor arg1){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "FileInputStream-3", pos = {0, 1}, report = "-")
  public FileInputStream(java.lang.String arg1) throws FileNotFoundException{
    super();
  }
  // Methods

  protected void finalize() throws IOException{
  }
  public void close() throws IOException{
  }
  public int read() throws IOException{
    return 0;
  }
  public int read(byte [] arg1, int arg2, int arg3) throws IOException{
    return 0;
  }
  public int available() throws IOException{
    return 0;
  }
  public java.nio.channels.FileChannel getChannel(){
    return (java.nio.channels.FileChannel) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "FileInputStream.getFD", pos = {0, -1}, report = "-")
  public final FileDescriptor getFD() throws IOException{
    return (FileDescriptor) null;
  }
  public long skip(long arg1) throws IOException{
    return 0l;
  }
}
