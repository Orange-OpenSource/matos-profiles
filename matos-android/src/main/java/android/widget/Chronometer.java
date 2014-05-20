package android.widget;

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
public class Chronometer
  extends TextView{
  // Classes

  public static interface OnChronometerTickListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onTick")
    public void onChronometerTick(Chronometer arg1);
  }
  // Constructors

  public Chronometer(android.content.Context arg1){
    super((android.content.Context) null);
  }
  public Chronometer(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  public Chronometer(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public void start(){
  }
  public void stop(){
  }
  protected void onDetachedFromWindow(){
  }
  public java.lang.String getFormat(){
    return (java.lang.String) null;
  }
  public long getBase(){
    return 0l;
  }
  protected void onWindowVisibilityChanged(int arg1){
  }
  public void setFormat(java.lang.String arg1){
  }
  public void setOnChronometerTickListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.widget.OnChronometerTickListener.onTick") Chronometer.OnChronometerTickListener arg1){
  }
  public void setBase(long arg1){
  }
  public void setStarted(boolean arg1){
  }
  public Chronometer.OnChronometerTickListener getOnChronometerTickListener(){
    return (Chronometer.OnChronometerTickListener) null;
  }
}
