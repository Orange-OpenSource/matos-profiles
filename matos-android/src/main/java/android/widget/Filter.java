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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.FilterImpl", superClass = "")
public abstract class Filter
{
  // Classes

  protected static class FilterResults
  {
    // Fields

    public java.lang.Object values;

    public int count;

    // Constructors

    public FilterResults(){
    }
  }
  public static interface FilterListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onFilter")
    public void onFilterComplete(int arg1);
  }
  public static interface Delayer
  {
    // Methods

    public long getPostingDelay(java.lang.CharSequence arg1);
  }
  // Constructors

  public Filter(){
  }
  // Methods

  protected abstract Filter.FilterResults performFiltering(java.lang.CharSequence arg1);
  public final void filter(java.lang.CharSequence arg1){
  }
  public final void filter(java.lang.CharSequence arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onFilter") Filter.FilterListener arg2){
  }
  protected abstract void publishResults(java.lang.CharSequence arg1, Filter.FilterResults arg2);
  public java.lang.CharSequence convertResultToString(java.lang.Object arg1){
    return (java.lang.CharSequence) null;
  }
  public void setDelayer(Filter.Delayer arg1){
  }
}
