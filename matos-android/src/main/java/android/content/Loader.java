package android.content;

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

import java.lang.reflect.Modifier;

import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.Field;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@Field(value="content", type="D", modifier=Modifier.PROTECTED)
public class Loader<D>
{
  // Classes

  public final class ForceLoadContentObserver
    extends android.database.ContentObserver  {
    // Fields

    // Constructors

    public ForceLoadContentObserver(){
      super((android.os.Handler) null);
    }
    // Methods
    public void onChange(boolean arg1){
    }
    public boolean deliverSelfNotifications(){
      return false;
    }
  }
  public static interface OnLoadCompleteListener<D>
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onLoadComplete")
    public void onLoadComplete(Loader<D> arg1, D arg2);
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("Loader")
  public Loader(Context arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public Context getContext(){
    return (Context) null;
  }
  public int getId(){
    return 0;
  }
  public void reset(){
  }
  public void dump(java.lang.String arg1, java.io.FileDescriptor arg2, java.io.PrintWriter arg3, java.lang.String [] arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("Loader")
  public void onContentChanged(){
  }
  public void stopLoading(){
  }
  @Code("arg2.onLoadComplete(this,content);")
  public void registerListener(int arg1, Loader.OnLoadCompleteListener<D> arg2){
  }
  public void unregisterListener(Loader.OnLoadCompleteListener<D> arg1){
  }
  public void deliverResult(D arg1){
  }
  public boolean isStarted(){
    return false;
  }
  public boolean isAbandoned(){
    return false;
  }
  public boolean isReset(){
    return false;
  }
  public final void startLoading(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("Loader")
  protected void onStartLoading(){
  }
  public void forceLoad(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("Loader")
  protected void onForceLoad(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("Loader")
  protected void onStopLoading(){
  }
  public void abandon(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("Loader")
  protected void onAbandon(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("Loader")
  protected void onReset(){
  }
  public boolean takeContentChanged(){
    return false;
  }
  public java.lang.String dataToString(D arg1){
    return (java.lang.String) null;
  }
}
