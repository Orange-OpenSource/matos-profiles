package java.security;

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
public class KeyRep
  implements java.io.Serializable
{
  // Classes

  public static enum Type
  {
    // Enum Constants

    SECRET()
, PUBLIC()
, PRIVATE()
;
    // Fields

    // Constructors

    private Type(){
    }
    // Methods

  }
  // Constructors

  public KeyRep(KeyRep.Type arg1, java.lang.String arg2, java.lang.String arg3, byte [] arg4){
  }
  // Methods

  protected java.lang.Object readResolve() throws java.io.ObjectStreamException{
    return (java.lang.Object) null;
  }
}
