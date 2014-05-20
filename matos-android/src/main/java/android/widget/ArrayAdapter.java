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
public class ArrayAdapter<T>
  extends BaseAdapter  implements Filterable
{
  // Constructors

  public ArrayAdapter(android.content.Context arg1, int arg2){
    super();
  }
  public ArrayAdapter(android.content.Context arg1, int arg2, int arg3){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.Code("content=arg3[0];")
  public ArrayAdapter(android.content.Context arg1, int arg2, T [] arg3){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.Code("content=arg4[0];")
  public ArrayAdapter(android.content.Context arg1, int arg2, int arg3, T [] arg4){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.Code("content=arg3.iterator().next();")
  public ArrayAdapter(android.content.Context arg1, int arg2, java.util.List<T> arg3){
    super();
  }
  @com.francetelecom.rd.stubs.annotation.Code("content=arg4.iterator().next();")
  public ArrayAdapter(android.content.Context arg1, int arg2, int arg3, java.util.List<T> arg4){
    super();
  }
  // Methods

  public void add(@com.francetelecom.rd.stubs.annotation.FieldSet("content") T arg1){
  }
  public void clear(){
  }
  public void addAll(java.util.Collection<? extends T> arg1){
  }
  public void addAll(T [] arg1){
  }
  public void remove(T arg1){
  }
  public android.content.Context getContext(){
    return (android.content.Context) null;
  }
  public void insert(@com.francetelecom.rd.stubs.annotation.FieldSet("content") T arg1, int arg2){
  }
  public void sort(java.util.Comparator<? super T> arg1){
  }
  public Filter getFilter(){
    return (Filter) null;
  }
  public void setDropDownViewResource(int arg1){
  }
  public int getCount(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public T getItem(int arg1){
    return null;
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
  public void notifyDataSetChanged(){
  }
  public int getPosition(T arg1){
    return 0;
  }
  public void setNotifyOnChange(boolean arg1){
  }
  public static ArrayAdapter<java.lang.CharSequence> createFromResource(android.content.Context arg1, int arg2, int arg3){
    return (ArrayAdapter) null;
  }
}
