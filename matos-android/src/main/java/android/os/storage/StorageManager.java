package android.os.storage;

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


public class StorageManager
{
  // Constructors

  public StorageManager(android.os.Looper arg1) throws android.os.RemoteException{
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseRule(value = "StorageManager.registerListener", report = "-")
  public void registerListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("StorageEventListener") StorageEventListener arg1){
  }
  public void unregisterListener(StorageEventListener arg1){
  }
  public boolean isUsbMassStorageConnected(){
    return false;
  }
  public boolean isUsbMassStorageEnabled(){
    return false;
  }
  public java.lang.String getVolumeState(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public boolean mountObb(java.lang.String arg1, java.lang.String arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onObbStateChange") OnObbStateChangeListener arg3){
    return false;
  }
  public boolean unmountObb(java.lang.String arg1, boolean arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onObbStateChange") OnObbStateChangeListener arg3){
    return false;
  }
  public boolean isObbMounted(java.lang.String arg1){
    return false;
  }
  public java.lang.String getMountedObbPath(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public StorageVolume [] getVolumeList(){
    return (StorageVolume []) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "StorageManager.enableUsbMassStorage", report = "-")
  public void enableUsbMassStorage(){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "StorageManager.disableUsbMassStorage", report = "-")
  public void disableUsbMassStorage(){
  }
  public java.lang.String [] getVolumePaths(){
    return (java.lang.String []) null;
  }
}
