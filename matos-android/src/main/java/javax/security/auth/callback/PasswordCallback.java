package javax.security.auth.callback;

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


public class PasswordCallback
  implements Callback, java.io.Serializable
{
  // Constructors

  public PasswordCallback(java.lang.String arg1, boolean arg2){
  }
  // Methods

  public void setPassword(char [] arg1){
  }
  public char [] getPassword(){
    return (char []) null;
  }
  public java.lang.String getPrompt(){
    return (java.lang.String) null;
  }
  public void clearPassword(){
  }
  public boolean isEchoOn(){
    return false;
  }
}
