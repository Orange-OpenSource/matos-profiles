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


public abstract class RemoteViewsService
  extends android.app.Service{
  // Classes

  public static interface RemoteViewsFactory
  {
    // Methods

	@com.francetelecom.rd.stubs.annotation.CallBack("RemoteViewsFactory")
    public void onCreate();
	@com.francetelecom.rd.stubs.annotation.CallBack("RemoteViewsFactory")
    public void onDestroy();
	@com.francetelecom.rd.stubs.annotation.CallBack("RemoteViewsFactory")
    public int getCount();
	@com.francetelecom.rd.stubs.annotation.CallBack("RemoteViewsFactory")
    public boolean hasStableIds();
	@com.francetelecom.rd.stubs.annotation.CallBack("RemoteViewsFactory")
    public long getItemId(int arg1);
	@com.francetelecom.rd.stubs.annotation.CallBack("RemoteViewsFactory")
    public int getViewTypeCount();
    @com.francetelecom.rd.stubs.annotation.CallBack("RemoteViewsFactory")
    public void onDataSetChanged();
    @com.francetelecom.rd.stubs.annotation.CallBack("RemoteViewsFactory")
    public RemoteViews getViewAt(int arg1);
    @com.francetelecom.rd.stubs.annotation.CallBack("RemoteViewsFactory")
    public RemoteViews getLoadingView();
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public RemoteViewsService(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.os.IBinder onBind(android.content.Intent arg1){
    return (android.os.IBinder) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("RemoteViewsFactory")
  public abstract RemoteViewsService.RemoteViewsFactory onGetViewFactory(android.content.Intent arg1);
}
