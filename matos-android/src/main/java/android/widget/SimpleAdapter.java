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
public class SimpleAdapter
  extends BaseAdapter  implements Filterable
{
  // Classes

  public static interface ViewBinder
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("setViewValue")
    public boolean setViewValue(android.view.View arg1, java.lang.Object arg2, java.lang.String arg3);
  }
  // Constructors

  public SimpleAdapter(android.content.Context arg1, java.util.List<? extends java.util.Map<java.lang.String, ?>> arg2, int arg3, java.lang.String [] arg4, int [] arg5){
    super();
  }
  // Methods

  public Filter getFilter(){
    return (Filter) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("viewBinder")
  public SimpleAdapter.ViewBinder getViewBinder(){
    return (SimpleAdapter.ViewBinder) null;
  }
  public void setViewBinder(@com.francetelecom.rd.stubs.annotation.FieldSet("viewBinder") @com.francetelecom.rd.stubs.annotation.CallBackRegister("setViewValue") SimpleAdapter.ViewBinder arg1){
  }
  public void setViewImage(ImageView arg1, int arg2){
  }
  public void setViewImage(ImageView arg1, java.lang.String arg2){
  }
  public void setViewText(TextView arg1, java.lang.String arg2){
  }
  public void setDropDownViewResource(int arg1){
  }
  public int getCount(){
    return 0;
  }
  public java.lang.Object getItem(int arg1){
    return (java.lang.Object) null;
  }
  public long getItemId(int arg1){
    return 0l;
  }
  public android.view.View getView(int arg1, android.view.View arg2, android.view.ViewGroup arg3){
    return (android.view.View) null;
  }
  public android.view.View getDropDownView(int arg1, android.view.View arg2, android.view.ViewGroup arg3){
    return (android.view.View) null;
  }
}
