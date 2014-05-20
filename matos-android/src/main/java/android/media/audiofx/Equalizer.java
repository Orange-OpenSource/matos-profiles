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


public class Equalizer
  extends AudioEffect{
  // Classes

  public static interface OnParameterChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onParameterChangeListener")
    public void onParameterChange(Equalizer arg1, int arg2, int arg3, int arg4, int arg5);
  }
  public static class Settings
  {
    // Fields

    public short curPreset;

    public short numBands;

    public short [] bandLevels;

    // Constructors

    public Settings(){
    }
    public Settings(java.lang.String arg1){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  // Fields

  public static final int PARAM_NUM_BANDS = 0;

  public static final int PARAM_LEVEL_RANGE = 1;

  public static final int PARAM_BAND_LEVEL = 2;

  public static final int PARAM_CENTER_FREQ = 3;

  public static final int PARAM_BAND_FREQ_RANGE = 4;

  public static final int PARAM_GET_BAND = 5;

  public static final int PARAM_CURRENT_PRESET = 6;

  public static final int PARAM_GET_NUM_OF_PRESETS = 7;

  public static final int PARAM_GET_PRESET_NAME = 8;

  public static final int PARAM_STRING_SIZE_MAX = 32;

  // Constructors

  public Equalizer(int arg1, int arg2) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException{
    super((java.util.UUID) null, (java.util.UUID) null, 0, 0);
  }
  // Methods

  public Equalizer.Settings getProperties() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return (Equalizer.Settings) null;
  }
  public void setProperties(Equalizer.Settings arg1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
  }
  public void setParameterListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onParameterChangeListener") Equalizer.OnParameterChangeListener arg1){
  }
  public short getNumberOfBands() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return (short) 0;
  }
  public short [] getBandLevelRange() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return (short []) null;
  }
  public void setBandLevel(short arg1, short arg2) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
  }
  public short getBandLevel(short arg1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return (short) 0;
  }
  public int getCenterFreq(short arg1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return 0;
  }
  public int [] getBandFreqRange(short arg1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return (int []) null;
  }
  public short getBand(int arg1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return (short) 0;
  }
  public short getCurrentPreset() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return (short) 0;
  }
  public void usePreset(short arg1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
  }
  public short getNumberOfPresets() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return (short) 0;
  }
  public java.lang.String getPresetName(short arg1){
    return (java.lang.String) null;
  }
}
