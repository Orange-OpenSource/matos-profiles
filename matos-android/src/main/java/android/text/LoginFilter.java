package android.text;

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
public abstract class LoginFilter
  implements InputFilter
{
  // Classes

  public static class UsernameFilterGMail
    extends LoginFilter  {
    // Constructors

    public UsernameFilterGMail(){
      super(false);
    }
    public UsernameFilterGMail(boolean arg1){
      super(false);
    }
    // Methods

    public boolean isAllowed(char arg1){
      return false;
    }
  }
  public static class UsernameFilterGeneric
    extends LoginFilter  {
    // Constructors

    public UsernameFilterGeneric(){
      super(false);
    }
    public UsernameFilterGeneric(boolean arg1){
      super(false);
    }
    // Methods

    public boolean isAllowed(char arg1){
      return false;
    }
  }
  public static class PasswordFilterGMail
    extends LoginFilter  {
    // Constructors

    public PasswordFilterGMail(){
      super(false);
    }
    public PasswordFilterGMail(boolean arg1){
      super(false);
    }
    // Methods

    public boolean isAllowed(char arg1){
      return false;
    }
  }
  // Constructors

  LoginFilter(boolean arg1){
  }
  LoginFilter(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onChange")
  public void onStart(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onChange")
  public void onStop(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange")
  public java.lang.CharSequence filter(java.lang.CharSequence arg1, int arg2, int arg3, Spanned arg4, int arg5, int arg6){
    return (java.lang.CharSequence) null;
  }
  public abstract boolean isAllowed(char arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("onChange")
  public void onInvalidCharacter(char arg1){
  }
}
