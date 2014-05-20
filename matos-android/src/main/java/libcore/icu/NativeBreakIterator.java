package libcore.icu;

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
public final class NativeBreakIterator
  implements java.lang.Cloneable
{
  // Constructors

  private NativeBreakIterator(int arg1, int arg2){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"return this;"})
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public int next(int arg1){
    return 0;
  }
  public int next(){
    return 0;
  }
  public int previous(){
    return 0;
  }
  public int first(){
    return 0;
  }
  public int last(){
    return 0;
  }
  public int current(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("text")
  public java.text.CharacterIterator getText(){
    return (java.text.CharacterIterator) null;
  }
  public void setText(@com.francetelecom.rd.stubs.annotation.FieldSet("text") java.text.CharacterIterator arg1){
  }
  public void setText(java.lang.String arg1){
  }
  public int preceding(int arg1){
    return 0;
  }
  public int following(int arg1){
    return 0;
  }
  public static NativeBreakIterator getWordInstance(java.util.Locale arg1){
    return (NativeBreakIterator) null;
  }
  public static NativeBreakIterator getLineInstance(java.util.Locale arg1){
    return (NativeBreakIterator) null;
  }
  public static NativeBreakIterator getCharacterInstance(java.util.Locale arg1){
    return (NativeBreakIterator) null;
  }
  public static NativeBreakIterator getSentenceInstance(java.util.Locale arg1){
    return (NativeBreakIterator) null;
  }
  public boolean isBoundary(int arg1){
    return false;
  }
}
