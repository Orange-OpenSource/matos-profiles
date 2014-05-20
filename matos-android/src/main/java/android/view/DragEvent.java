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


public class DragEvent
  implements android.os.Parcelable
{
  // Fields

  public static final int ACTION_DRAG_STARTED = 1;

  public static final int ACTION_DRAG_LOCATION = 2;

  public static final int ACTION_DROP = 3;

  public static final int ACTION_DRAG_ENDED = 4;

  public static final int ACTION_DRAG_ENTERED = 5;

  public static final int ACTION_DRAG_EXITED = 6;

  public static final android.os.Parcelable.Creator<DragEvent> CREATOR = null;

  // Constructors

  private DragEvent(){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public float getX(){
    return 0.0f;
  }
  public float getY(){
    return 0.0f;
  }
  public int getAction(){
    return 0;
  }
  public static DragEvent obtain(int arg1, float arg2, float arg3, java.lang.Object arg4, android.content.ClipDescription arg5, android.content.ClipData arg6, boolean arg7){
    return (DragEvent) null;
  }
  public static DragEvent obtain(DragEvent arg1){
    return (DragEvent) null;
  }
  public final void recycle(){
  }
  public boolean getResult(){
    return false;
  }
  public android.content.ClipData getClipData(){
    return (android.content.ClipData) null;
  }
  public java.lang.Object getLocalState(){
    return (java.lang.Object) null;
  }
  public android.content.ClipDescription getClipDescription(){
    return (android.content.ClipDescription) null;
  }
}
