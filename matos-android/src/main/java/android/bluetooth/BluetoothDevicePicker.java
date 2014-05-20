package android.bluetooth;

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
public interface BluetoothDevicePicker
{
  // Fields

  public static final java.lang.String EXTRA_NEED_AUTH = "android.bluetooth.devicepicker.extra.NEED_AUTH";

  public static final java.lang.String EXTRA_FILTER_TYPE = "android.bluetooth.devicepicker.extra.FILTER_TYPE";

  public static final java.lang.String EXTRA_LAUNCH_PACKAGE = "android.bluetooth.devicepicker.extra.LAUNCH_PACKAGE";

  public static final java.lang.String EXTRA_LAUNCH_CLASS = "android.bluetooth.devicepicker.extra.DEVICE_PICKER_LAUNCH_CLASS";

  public static final java.lang.String ACTION_DEVICE_SELECTED = "android.bluetooth.devicepicker.action.DEVICE_SELECTED";

  public static final java.lang.String ACTION_LAUNCH = "android.bluetooth.devicepicker.action.LAUNCH";

  public static final int FILTER_TYPE_ALL = 0;

  public static final int FILTER_TYPE_AUDIO = 1;

  public static final int FILTER_TYPE_TRANSFER = 2;

  public static final int FILTER_TYPE_PANU = 3;

  public static final int FILTER_TYPE_NAP = 4;

}
