package android.media.audiofx;

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


public class Visualizer
{
  // Classes

  public static interface OnDataCaptureListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onDataCaptureListener")
    public void onWaveFormDataCapture(Visualizer arg1, byte [] arg2, int arg3);
    @com.francetelecom.rd.stubs.annotation.CallBack("onDataCaptureListener")
    public void onFftDataCapture(Visualizer arg1, byte [] arg2, int arg3);
  }
  // Fields

  public static final int STATE_UNINITIALIZED = 0;

  public static final int STATE_INITIALIZED = 1;

  public static final int STATE_ENABLED = 2;

  public static final int SUCCESS = 0;

  public static final int ERROR = -1;

  public static final int ALREADY_EXISTS = -2;

  public static final int ERROR_NO_INIT = -3;

  public static final int ERROR_BAD_VALUE = -4;

  public static final int ERROR_INVALID_OPERATION = -5;

  public static final int ERROR_NO_MEMORY = -6;

  public static final int ERROR_DEAD_OBJECT = -7;

  // Constructors

  public Visualizer(int arg1) throws java.lang.UnsupportedOperationException, java.lang.RuntimeException{
  }
  // Methods

  protected void finalize(){
  }
  public void release(){
  }
  public int setEnabled(boolean arg1) throws java.lang.IllegalStateException{
    return 0;
  }
  public boolean getEnabled(){
    return false;
  }
  public static int [] getCaptureSizeRange(){
    return (int []) null;
  }
  public static int getMaxCaptureRate(){
    return 0;
  }
  public int setCaptureSize(int arg1) throws java.lang.IllegalStateException{
    return 0;
  }
  public int getCaptureSize() throws java.lang.IllegalStateException{
    return 0;
  }
  public int getSamplingRate() throws java.lang.IllegalStateException{
    return 0;
  }
  public int getWaveForm(byte [] arg1) throws java.lang.IllegalStateException{
    return 0;
  }
  public int getFft(byte [] arg1) throws java.lang.IllegalStateException{
    return 0;
  }
  public int setDataCaptureListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onDataCaptureListener") Visualizer.OnDataCaptureListener arg1, int arg2, boolean arg3, boolean arg4){
    return 0;
  }
}
