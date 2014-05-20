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
public interface Editable
  extends java.lang.Appendable, Spannable, java.lang.CharSequence, GetChars
{
  // Classes

  public static class Factory
  {
    // Constructors

    public Factory(){
    }
    // Methods

    public static Editable.Factory getInstance(){
      return (Editable.Factory) null;
    }
    public Editable newEditable(java.lang.CharSequence arg1){
      return (Editable) null;
    }
  }
  // Methods

  public Editable append(java.lang.CharSequence arg1);
  public Editable append(java.lang.CharSequence arg1, int arg2, int arg3);
  public Editable append(char arg1);
  public void clear();
  public Editable replace(int arg1, int arg2, java.lang.CharSequence arg3, int arg4, int arg5);
  public Editable replace(int arg1, int arg2, java.lang.CharSequence arg3);
  public Editable delete(int arg1, int arg2);
  public Editable insert(int arg1, java.lang.CharSequence arg2, int arg3, int arg4);
  public Editable insert(int arg1, java.lang.CharSequence arg2);
  public void setFilters(InputFilter [] arg1);
  public InputFilter [] getFilters();
  public void clearSpans();
}
