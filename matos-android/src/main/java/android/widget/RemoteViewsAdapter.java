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


public class RemoteViewsAdapter
  extends BaseAdapter  implements android.os.Handler.Callback
{
  // Classes

  public static interface RemoteAdapterConnectionCallback
  {
    // Methods

	@com.francetelecom.rd.stubs.annotation.CallBack("RemoteAdapterConnectionCallback")
    public void onRemoteAdapterDisconnected();
	@com.francetelecom.rd.stubs.annotation.CallBack("RemoteAdapterConnectionCallback")
    public void deferNotifyDataSetChanged();
	@com.francetelecom.rd.stubs.annotation.CallBack("RemoteAdapterConnectionCallback")
    public boolean onRemoteAdapterConnected();
  }
  // Constructors

  
  public RemoteViewsAdapter(android.content.Context arg1, android.content.Intent arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("RemoteAdapterConnectionCallback") RemoteViewsAdapter.RemoteAdapterConnectionCallback arg3){
    super();
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public boolean isEmpty(){
    return false;
  }
  public boolean handleMessage(android.os.Message arg1){
    return false;
  }
  public int getCount(){
    return 0;
  }
  public boolean hasStableIds(){
    return false;
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
  public void notifyDataSetChanged(){
  }
  public int getItemViewType(int arg1){
    return 0;
  }
  public int getViewTypeCount(){
    return 0;
  }
  public android.content.Intent getRemoteViewsServiceIntent(){
    return (android.content.Intent) null;
  }
}
