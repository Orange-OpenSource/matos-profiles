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
public class AlphabetIndexer
  extends android.database.DataSetObserver  implements SectionIndexer
{
  // Fields

  protected android.database.Cursor mDataCursor;

  protected int mColumnIndex;

  protected java.lang.CharSequence mAlphabet;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public AlphabetIndexer(android.database.Cursor arg1, int arg2, java.lang.CharSequence arg3){
    super();
  }
  // Methods

  protected int compare(java.lang.String arg1, java.lang.String arg2){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onChanged(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInvalidated(){
  }
  public java.lang.Object [] getSections(){
    return (java.lang.Object []) null;
  }
  public int getPositionForSection(int arg1){
    return 0;
  }
  public int getSectionForPosition(int arg1){
    return 0;
  }
  public void setCursor(android.database.Cursor arg1){
  }
}
