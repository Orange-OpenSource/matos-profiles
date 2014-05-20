package android.net;

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
public class LocalSocketAddress
{
  // Classes

  public static enum Namespace
  {
    // Enum Constants

    ABSTRACT(0)
, RESERVED(0)
, FILESYSTEM(0)
;
    // Fields

    // Constructors

    private Namespace(int arg1){
    }
    // Methods

  }
  // Constructors

  public LocalSocketAddress(java.lang.String arg1, LocalSocketAddress.Namespace arg2){
  }
  public LocalSocketAddress(java.lang.String arg1){
  }
  // Methods

  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public LocalSocketAddress.Namespace getNamespace(){
    return (LocalSocketAddress.Namespace) null;
  }
}
