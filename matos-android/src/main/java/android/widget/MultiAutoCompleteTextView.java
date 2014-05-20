package android.widget;

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
public class MultiAutoCompleteTextView
  extends AutoCompleteTextView{
  // Classes

  public static interface Tokenizer
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("tokenize")
    public int findTokenStart(java.lang.CharSequence arg1, int arg2);
    @com.francetelecom.rd.stubs.annotation.CallBack("tokenize")
    public int findTokenEnd(java.lang.CharSequence arg1, int arg2);
    @com.francetelecom.rd.stubs.annotation.CallBack("tokenize")
    public java.lang.CharSequence terminateToken(java.lang.CharSequence arg1);
  }
  public static class CommaTokenizer
    implements MultiAutoCompleteTextView.Tokenizer
  {
    // Constructors

    public CommaTokenizer(){
    }
    // Methods

    public int findTokenStart(java.lang.CharSequence arg1, int arg2){
      return 0;
    }
    public int findTokenEnd(java.lang.CharSequence arg1, int arg2){
      return 0;
    }
    public java.lang.CharSequence terminateToken(java.lang.CharSequence arg1){
      return (java.lang.CharSequence) null;
    }
  }
  // Constructors

  public MultiAutoCompleteTextView(android.content.Context arg1){
    super((android.content.Context) null);
  }
  public MultiAutoCompleteTextView(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  public MultiAutoCompleteTextView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public boolean enoughToFilter(){
    return false;
  }
  protected void performFiltering(java.lang.CharSequence arg1, int arg2){
  }
  protected void performFiltering(java.lang.CharSequence arg1, int arg2, int arg3, int arg4){
  }
  protected void replaceText(java.lang.CharSequence arg1){
  }
  public void performValidation(){
  }
  public void setTokenizer(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.widget.MultiAutoCompleteTextView.Tokenizer.tokenize") MultiAutoCompleteTextView.Tokenizer arg1){
  }
}
