package android.preference;

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
public abstract class PreferenceGroup
  extends Preference{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public PreferenceGroup(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null, (android.util.AttributeSet) null, 0);
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public PreferenceGroup(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null, (android.util.AttributeSet) null, 0);
  }
  // Methods

  public void removeAll(){
  }
  protected void dispatchSaveInstanceState(android.os.Bundle arg1){
  }
  protected void dispatchRestoreInstanceState(android.os.Bundle arg1){
  }
  public void setEnabled(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onAttachedToActivity(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected void onPrepareForRemoval(){
  }
  public Preference getPreference(int arg1){
    return (Preference) null;
  }
  public Preference findPreference(java.lang.CharSequence arg1){
    return (Preference) null;
  }
  public void addItemFromInflater(Preference arg1){
  }
  public int getPreferenceCount(){
    return 0;
  }
  protected boolean isOnSameScreenAsChildren(){
    return false;
  }
  public void setOrderingAsAdded(boolean arg1){
  }
  public boolean isOrderingAsAdded(){
    return false;
  }
  public boolean addPreference(Preference arg1){
    return false;
  }
  public boolean removePreference(Preference arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected boolean onPrepareAddPreference(Preference arg1){
    return false;
  }
}
