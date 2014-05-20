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
public interface IWindowSession
  extends android.os.IInterface
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.IWindowsSessionStubImpl", superClass = "")
  public abstract static class Stub
    extends android.os.Binder    implements IWindowSession
  {
    // Constructors

    public Stub(){
      super();
    }
    // Methods

    public android.os.IBinder asBinder(){
      return (android.os.IBinder) null;
    }
    public static IWindowSession asInterface(android.os.IBinder arg1){
      return (IWindowSession) null;
    }
    public boolean onTransact(int arg1, android.os.Parcel arg2, android.os.Parcel arg3, int arg4) throws android.os.RemoteException{
      return false;
    }
  }
  // Methods

  public int add(IWindow arg1, int arg2, WindowManager.LayoutParams arg3, int arg4, android.graphics.Rect arg5, InputChannel arg6) throws android.os.RemoteException;
  public void remove(IWindow arg1) throws android.os.RemoteException;
  public boolean performHapticFeedback(IWindow arg1, int arg2, boolean arg3) throws android.os.RemoteException;
  public void setInTouchMode(boolean arg1) throws android.os.RemoteException;
  public void finishDrawing(IWindow arg1) throws android.os.RemoteException;
  public void wallpaperOffsetsComplete(android.os.IBinder arg1) throws android.os.RemoteException;
  public void wallpaperCommandComplete(android.os.IBinder arg1, android.os.Bundle arg2) throws android.os.RemoteException;
  public void getDisplayFrame(IWindow arg1, android.graphics.Rect arg2) throws android.os.RemoteException;
  public android.os.IBinder prepareDrag(IWindow arg1, int arg2, int arg3, int arg4, Surface arg5) throws android.os.RemoteException;
  public boolean performDrag(IWindow arg1, android.os.IBinder arg2, float arg3, float arg4, float arg5, float arg6, android.content.ClipData arg7) throws android.os.RemoteException;
  public int addWithoutInputChannel(IWindow arg1, int arg2, WindowManager.LayoutParams arg3, int arg4, android.graphics.Rect arg5) throws android.os.RemoteException;
  public int relayout(IWindow arg1, int arg2, WindowManager.LayoutParams arg3, int arg4, int arg5, int arg6, boolean arg7, android.graphics.Rect arg8, android.graphics.Rect arg9, android.graphics.Rect arg10, android.content.res.Configuration arg11, Surface arg12) throws android.os.RemoteException;
  public boolean outOfMemory(IWindow arg1) throws android.os.RemoteException;
  public void setTransparentRegion(IWindow arg1, android.graphics.Region arg2) throws android.os.RemoteException;
  public void setInsets(IWindow arg1, int arg2, android.graphics.Rect arg3, android.graphics.Rect arg4, android.graphics.Region arg5) throws android.os.RemoteException;
  public boolean getInTouchMode() throws android.os.RemoteException;
  public void reportDropResult(IWindow arg1, boolean arg2) throws android.os.RemoteException;
  public void dragRecipientEntered(IWindow arg1) throws android.os.RemoteException;
  public void dragRecipientExited(IWindow arg1) throws android.os.RemoteException;
  public void setWallpaperPosition(android.os.IBinder arg1, float arg2, float arg3, float arg4, float arg5) throws android.os.RemoteException;
  public android.os.Bundle sendWallpaperCommand(android.os.IBinder arg1, java.lang.String arg2, int arg3, int arg4, int arg5, android.os.Bundle arg6, boolean arg7) throws android.os.RemoteException;
}
