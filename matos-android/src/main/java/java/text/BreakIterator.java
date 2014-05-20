package java.text;

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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.BreakIteratorImpl", superClass = "")
public abstract class BreakIterator
  implements java.lang.Cloneable
{
  // Fields

  public static final int DONE = -1;

  // Constructors

  protected BreakIterator(){
  }
  BreakIterator(libcore.icu.NativeBreakIterator arg1){
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public abstract int next();
  public abstract int next(int arg1);
  public abstract int previous();
  public static java.util.Locale [] getAvailableLocales(){
    return (java.util.Locale []) null;
  }
  public abstract int first();
  public abstract int last();
  public abstract int current();
  public abstract CharacterIterator getText();
  public void setText(java.lang.String arg1){
  }
  public abstract void setText(CharacterIterator arg1);
  public int preceding(int arg1){
    return 0;
  }
  public abstract int following(int arg1);
  public static BreakIterator getWordInstance(){
    return (BreakIterator) null;
  }
  public static BreakIterator getWordInstance(java.util.Locale arg1){
    return (BreakIterator) null;
  }
  public static BreakIterator getLineInstance(){
    return (BreakIterator) null;
  }
  public static BreakIterator getLineInstance(java.util.Locale arg1){
    return (BreakIterator) null;
  }
  public static BreakIterator getCharacterInstance(){
    return (BreakIterator) null;
  }
  public static BreakIterator getCharacterInstance(java.util.Locale arg1){
    return (BreakIterator) null;
  }
  public static BreakIterator getSentenceInstance(){
    return (BreakIterator) null;
  }
  public static BreakIterator getSentenceInstance(java.util.Locale arg1){
    return (BreakIterator) null;
  }
  public boolean isBoundary(int arg1){
    return false;
  }
}
