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
public abstract class WindowOrientationListener
{
  // Constructors

  public WindowOrientationListener(android.content.Context arg1){
  }
  private WindowOrientationListener(android.content.Context arg1, int arg2){
  }
  // Methods

  public void disable(){
  }
  public void enable(){
  }
  public void setCurrentRotation(int arg1){
  }
  public int getProposedRotation(){
    return 0;
  }
  public boolean canDetectOrientation(){
    return false;
  }
  public abstract void onProposedRotationChanged(int arg1);
  public void setLogEnabled(boolean arg1){
  }
}
