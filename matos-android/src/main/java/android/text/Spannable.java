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
public interface Spannable
  extends Spanned
{
  // Classes

  public static class Factory
  {
    // Constructors

    public Factory(){
    }
    // Methods

    public static Spannable.Factory getInstance(){
      return (Spannable.Factory) null;
    }
    public Spannable newSpannable(java.lang.CharSequence arg1){
      return (Spannable) null;
    }
  }
  // Methods

  public void removeSpan(java.lang.Object arg1);
  public void setSpan(java.lang.Object arg1, int arg2, int arg3, int arg4);
}
