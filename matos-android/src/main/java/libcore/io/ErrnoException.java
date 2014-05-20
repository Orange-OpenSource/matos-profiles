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
public final class ErrnoException
  extends java.lang.Exception{
  // Fields

  public final int errno = 0;

  // Constructors

  public ErrnoException(java.lang.String arg1, int arg2){
    super();
  }
  public ErrnoException(java.lang.String arg1, int arg2, java.lang.Throwable arg3){
    super();
  }
  // Methods

  public java.lang.String getMessage(){
    return (java.lang.String) null;
  }
  public java.io.IOException rethrowAsIOException() throws java.io.IOException{
    return (java.io.IOException) null;
  }
  public java.net.SocketException rethrowAsSocketException() throws java.net.SocketException{
    return (java.net.SocketException) null;
  }
}
