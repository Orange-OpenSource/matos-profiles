package android.pim;

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
public class ContactsAsyncHelper
  extends android.os.Handler{
  // Classes

  public static interface OnImageLoadCompleteListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onImageLoadComplete")
    public void onImageLoadComplete(int arg1, java.lang.Object arg2, android.widget.ImageView arg3, boolean arg4);
  }
  public static class ImageTracker
  {
    // Fields

    public static final int DISPLAY_UNDEFINED = 0;

    public static final int DISPLAY_IMAGE = -1;

    public static final int DISPLAY_DEFAULT = -2;

    // Constructors

    public ImageTracker(){
    }
    // Methods

    public boolean isDifferentImageRequest(com.android.internal.telephony.CallerInfo arg1){
      return false;
    }
    public boolean isDifferentImageRequest(com.android.internal.telephony.Connection arg1){
      return false;
    }
    public void setPhotoRequest(com.android.internal.telephony.CallerInfo arg1){
    }
    public android.net.Uri getPhotoUri(){
      return (android.net.Uri) null;
    }
    public void setPhotoState(int arg1){
    }
    public int getPhotoState(){
      return 0;
    }
  }
  // Constructors

  private ContactsAsyncHelper(){
    super();
  }
  // Methods

  public void handleMessage(android.os.Message arg1){
  }
  public static final void updateImageViewWithContactPhotoAsync(android.content.Context arg1, android.widget.ImageView arg2, android.net.Uri arg3, int arg4){
  }
  public static final void updateImageViewWithContactPhotoAsync(com.android.internal.telephony.CallerInfo arg1, android.content.Context arg2, android.widget.ImageView arg3, android.net.Uri arg4, int arg5){
  }
  public static final void updateImageViewWithContactPhotoAsync(com.android.internal.telephony.CallerInfo arg1, int arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onImageLoadComplete") ContactsAsyncHelper.OnImageLoadCompleteListener arg3, java.lang.Object arg4, android.content.Context arg5, android.widget.ImageView arg6, android.net.Uri arg7, int arg8){
  }
}
