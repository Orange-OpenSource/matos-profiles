package android.view;

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
public abstract class LayoutInflater
{
  // Classes

  public static interface Filter
  {
    // Methods

    public boolean onLoadClass(java.lang.Class arg1);
  }
  public static interface Factory
  {
    // Methods

    public View onCreateView(java.lang.String arg1, android.content.Context arg2, android.util.AttributeSet arg3);
  }
  public static interface Factory2
    extends LayoutInflater.Factory
  {
    // Methods

    public View onCreateView(View arg1, java.lang.String arg2, android.content.Context arg3, android.util.AttributeSet arg4);
  }
  // Fields

  protected final android.content.Context mContext = (android.content.Context) null;

  // Constructors

  protected LayoutInflater(android.content.Context arg1){
  }
  protected LayoutInflater(LayoutInflater arg1, android.content.Context arg2){
  }
  // Methods

  public static LayoutInflater from(android.content.Context arg1){
    return (LayoutInflater) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mFactory")
  public final LayoutInflater.Factory getFactory(){
    return (LayoutInflater.Factory) null;
  }
  public android.content.Context getContext(){
    return (android.content.Context) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public View inflate(int arg1, ViewGroup arg2){
    return (View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public View inflate(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1, ViewGroup arg2){
    return (View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public View inflate(int arg1, ViewGroup arg2, boolean arg3){
    return (View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public View inflate(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1, ViewGroup arg2, boolean arg3){
    return (View) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mFilter")
  public LayoutInflater.Filter getFilter(){
    return (LayoutInflater.Filter) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected View onCreateView(java.lang.String arg1, android.util.AttributeSet arg2) throws java.lang.ClassNotFoundException{
    return (View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected View onCreateView(View arg1, java.lang.String arg2, android.util.AttributeSet arg3) throws java.lang.ClassNotFoundException{
    return (View) null;
  }
  public void setFilter(@com.francetelecom.rd.stubs.annotation.FieldSet("mFilter") LayoutInflater.Filter arg1){
  }
  public void setFactory(@com.francetelecom.rd.stubs.annotation.FieldSet("mFactory") LayoutInflater.Factory arg1){
  }
  public void setPrivateFactory(@com.francetelecom.rd.stubs.annotation.FieldSet("mFactory2") LayoutInflater.Factory2 arg1){
  }
  public abstract LayoutInflater cloneInContext(android.content.Context arg1);
  public final View createView(java.lang.String arg1, java.lang.String arg2, android.util.AttributeSet arg3) throws java.lang.ClassNotFoundException, InflateException{
    return (View) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mFactory2")
  public final LayoutInflater.Factory2 getFactory2(){
    return (LayoutInflater.Factory2) null;
  }
  public void setFactory2(@com.francetelecom.rd.stubs.annotation.FieldSet("mFactory2") LayoutInflater.Factory2 arg1){
  }
}
