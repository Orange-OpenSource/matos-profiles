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
public interface IWindow
  extends android.os.IInterface
{
  // Classes

  public abstract static class Stub
    extends android.os.Binder    implements IWindow
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IWindow asInterface(android.os.IBinder arg1){
      return (IWindow) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("IWindow")
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("IWindow")
  public void dispatchDragEvent(DragEvent arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWindow")
  public void dispatchSystemUiVisibilityChanged(int arg1, int arg2, int arg3, int arg4) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWindow")
  public void resized(int arg1, int arg2, android.graphics.Rect arg3, android.graphics.Rect arg4, boolean arg5, android.content.res.Configuration arg6) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWindow")
  public void dispatchAppVisibility(boolean arg1) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWindow")
  public void dispatchWallpaperOffsets(float arg1, float arg2, float arg3, float arg4, boolean arg5) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWindow")
  public void dispatchWallpaperCommand(java.lang.String arg1, int arg2, int arg3, int arg4, android.os.Bundle arg5, boolean arg6) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWindow")
  public void dispatchGetNewSurface() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWindow")
  public void windowFocusChanged(boolean arg1, boolean arg2) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWindow")
  public void executeCommand(java.lang.String arg1, java.lang.String arg2, android.os.ParcelFileDescriptor arg3) throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IWindow")
  public void closeSystemDialogs(java.lang.String arg1) throws android.os.RemoteException;
}
