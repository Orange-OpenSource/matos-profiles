package javax.crypto.spec;

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


public class PBEKeySpec
  implements java.security.spec.KeySpec
{
  // Constructors

  public PBEKeySpec(char [] arg1){
  }
  public PBEKeySpec(char [] arg1, byte [] arg2, int arg3, int arg4){
  }
  public PBEKeySpec(char [] arg1, byte [] arg2, int arg3){
  }
  // Methods

  public final char [] getPassword(){
    return (char []) null;
  }
  public final byte [] getSalt(){
    return (byte []) null;
  }
  public final int getIterationCount(){
    return 0;
  }
  public final void clearPassword(){
  }
  public final int getKeyLength(){
    return 0;
  }
}
