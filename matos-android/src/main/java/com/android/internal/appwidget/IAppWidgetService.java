package com.android.internal.appwidget;

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


public interface IAppWidgetService
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.IAppWidgetServiceStubImpl", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements IAppWidgetService
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IAppWidgetService asInterface(android.os.IBinder arg1){
      return (IAppWidgetService) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IAppWidgetService")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IAppWidgetService")
  public void notifyAppWidgetViewDataChanged(int [] arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAppWidgetService")
  public java.util.List<android.appwidget.AppWidgetProviderInfo> getInstalledProviders() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAppWidgetService")
  public android.appwidget.AppWidgetProviderInfo getAppWidgetInfo(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAppWidgetService")
  public void bindAppWidgetId(int arg1, android.content.ComponentName arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAppWidgetService")
  public void bindRemoteViewsService(int arg1, android.content.Intent arg2, android.os.IBinder arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAppWidgetService")
  public void unbindRemoteViewsService(int arg1, android.content.Intent arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAppWidgetService")
  public int [] getAppWidgetIds(android.content.ComponentName arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAppWidgetService")
  public void updateAppWidgetIds(int [] arg1, android.widget.RemoteViews arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAppWidgetService")
  public void partiallyUpdateAppWidgetIds(int [] arg1, android.widget.RemoteViews arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAppWidgetService")
  public void updateAppWidgetProvider(android.content.ComponentName arg1, android.widget.RemoteViews arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAppWidgetService")
  public int [] startListening(IAppWidgetHost arg1, java.lang.String arg2, int arg3, java.util.List<android.widget.RemoteViews> arg4) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAppWidgetService")
  public void stopListening(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAppWidgetService")
  public int allocateAppWidgetId(java.lang.String arg1, int arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAppWidgetService")
  public void deleteAppWidgetId(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAppWidgetService")
  public void deleteHost(int arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAppWidgetService")
  public void deleteAllHosts() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IAppWidgetService")
  public android.widget.RemoteViews getAppWidgetViews(int arg1) throws android.os.RemoteException;
}
