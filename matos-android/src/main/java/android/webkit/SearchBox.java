package android.webkit;

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

import com.francetelecom.rd.stubs.annotation.Real;

@Real("com.francetelecom.rd.fakeandroid.SearchBoxImpl")
public interface SearchBox
{
  // Classes

  public abstract static class SearchBoxListener
  {
    // Constructors

    public SearchBoxListener(){
    }
    // Methods
    @com.francetelecom.rd.stubs.annotation.CallBack("SearchBoxListener")
    public void onSuggestionsReceived(java.lang.String arg1, java.util.List<java.lang.String> arg2){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("SearchBoxListener")
    public void onChangeComplete(boolean arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("SearchBoxListener")
    public void onSubmitComplete(boolean arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("SearchBoxListener")
    public void onResizeComplete(boolean arg1){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("SearchBoxListener")
    public void onCancelComplete(boolean arg1){
    }
  }
  public static interface IsSupportedCallback
  {
    // Methods

	@com.francetelecom.rd.stubs.annotation.CallBack("IsSupportedCallback")
    public void searchBoxIsSupported(boolean arg1);
  }
  // Methods

  public void isSupported(@com.francetelecom.rd.stubs.annotation.CallBackRegister("IsSupportedCallback") SearchBox.IsSupportedCallback arg1);
  public void setSelection(int arg1, int arg2);
  public void setQuery(java.lang.String arg1);
  public void setDimensions(int arg1, int arg2, int arg3, int arg4);
  public void setVerbatim(boolean arg1);
  public void onchange(@com.francetelecom.rd.stubs.annotation.CallBackRegister("SearchBoxListener") SearchBox.SearchBoxListener arg1);
  public void onsubmit(@com.francetelecom.rd.stubs.annotation.CallBackRegister("SearchBoxListener") SearchBox.SearchBoxListener arg1);
  public void onresize(@com.francetelecom.rd.stubs.annotation.CallBackRegister("SearchBoxListener") SearchBox.SearchBoxListener arg1);
  public void oncancel(@com.francetelecom.rd.stubs.annotation.CallBackRegister("SearchBoxListener") SearchBox.SearchBoxListener arg1);
  public void addSearchBoxListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("SearchBoxListener") SearchBox.SearchBoxListener arg1);
  public void removeSearchBoxListener(SearchBox.SearchBoxListener arg1);
}
