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


public class PresetReverb
  extends AudioEffect{
  // Classes

  public static interface OnParameterChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onParameterChangeListener")
    public void onParameterChange(PresetReverb arg1, int arg2, int arg3, short arg4);
  }
  public static class Settings
  {
    // Fields

    public short preset;

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

  public static final int PARAM_PRESET = 0;

  public static final short PRESET_NONE = 0;

  public static final short PRESET_SMALLROOM = 1;

  public static final short PRESET_MEDIUMROOM = 2;

  public static final short PRESET_LARGEROOM = 3;

  public static final short PRESET_MEDIUMHALL = 4;

  public static final short PRESET_LARGEHALL = 5;

  public static final short PRESET_PLATE = 6;

  // Constructors

  public PresetReverb(int arg1, int arg2) throws java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException{
    super((java.util.UUID) null, (java.util.UUID) null, 0, 0);
  }
  // Methods

  public PresetReverb.Settings getProperties() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return (PresetReverb.Settings) null;
  }
  public void setProperties(PresetReverb.Settings arg1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
  }
  public void setParameterListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onParameterChangeListener") PresetReverb.OnParameterChangeListener arg1){
  }
  public void setPreset(short arg1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
  }
  public short getPreset() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return (short) 0;
  }
}
