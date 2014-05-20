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


public abstract class InputEvent
  implements android.os.Parcelable
{
  // Fields

  protected static final int PARCEL_TOKEN_MOTION_EVENT = 0;

  protected static final int PARCEL_TOKEN_KEY_EVENT = 0;

  public static final android.os.Parcelable.Creator<InputEvent> CREATOR = null;

  // Constructors

  InputEvent(){
  }
  // Methods

  public abstract InputEvent copy();
  public int describeContents(){
    return 0;
  }
  public abstract int getSource();
  public abstract int getDeviceId();
  public abstract void recycle();
  public abstract void setSource(int arg1);
  public abstract void setTainted(boolean arg1);
  public abstract boolean isTainted();
  public abstract long getEventTimeNano();
  public final InputDevice getDevice(){
    return (InputDevice) null;
  }
}
