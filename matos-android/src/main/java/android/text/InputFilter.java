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
public interface InputFilter
{
  // Classes

  public static class AllCaps
    implements InputFilter
  {
    // Constructors

    public AllCaps(){
    }
    // Methods

    public java.lang.CharSequence filter(java.lang.CharSequence arg1, int arg2, int arg3, Spanned arg4, int arg5, int arg6){
      return (java.lang.CharSequence) null;
    }
  }
  public static class LengthFilter
    implements InputFilter
  {
    // Constructors

    public LengthFilter(int arg1){
    }
    // Methods

    public java.lang.CharSequence filter(java.lang.CharSequence arg1, int arg2, int arg3, Spanned arg4, int arg5, int arg6){
      return (java.lang.CharSequence) null;
    }
  }
  // Methods

  public java.lang.CharSequence filter(java.lang.CharSequence arg1, int arg2, int arg3, Spanned arg4, int arg5, int arg6);
}
