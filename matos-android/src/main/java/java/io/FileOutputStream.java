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


public class FileOutputStream
  extends OutputStream  implements Closeable
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "FileOutputStream-1", pos = {0, 1}, report = "-")
  public FileOutputStream(File arg1) throws FileNotFoundException{
    super();
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "FileOutputStream-2", pos = {0, 1}, report = "-")
  public FileOutputStream(File arg1, boolean arg2) throws FileNotFoundException{
    super();
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "FileOutputStream-3", pos = {0, 1}, report = "-")
  public FileOutputStream(FileDescriptor arg1){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "FileOutputStream-4", pos = {0, 1}, report = "-")
  public FileOutputStream(java.lang.String arg1) throws FileNotFoundException{
    super();
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "FileOutputStream-5", pos = {0, 1}, report = "-")
  public FileOutputStream(java.lang.String arg1, boolean arg2) throws FileNotFoundException{
    super();
  }
  // Methods

  protected void finalize() throws IOException{
  }
  public void write(byte [] arg1, int arg2, int arg3) throws IOException{
  }
  public void write(int arg1) throws IOException{
  }
  public void close() throws IOException{
  }
  public java.nio.channels.FileChannel getChannel(){
    return (java.nio.channels.FileChannel) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "FileOutputStream.getFD", pos = {0, -1}, report = "-")
  public final FileDescriptor getFD() throws IOException{
    return (FileDescriptor) null;
  }
}
