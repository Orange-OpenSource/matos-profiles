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


public class EnvironmentalReverb
  extends AudioEffect{
  // Classes

  public static interface OnParameterChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onParameterChangeListener")
    public void onParameterChange(EnvironmentalReverb arg1, int arg2, int arg3, int arg4);
  }
  public static class Settings
  {
    // Fields

    public short roomLevel;

    public short roomHFLevel;

    public int decayTime;

    public short decayHFRatio;

    public short reflectionsLevel;

    public int reflectionsDelay;

    public short reverbLevel;

    public int reverbDelay;

    public short diffusion;

    public short density;

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

  public static final int PARAM_ROOM_LEVEL = 0;

  public static final int PARAM_ROOM_HF_LEVEL = 1;

  public static final int PARAM_DECAY_TIME = 2;

  public static final int PARAM_DECAY_HF_RATIO = 3;

  public static final int PARAM_REFLECTIONS_LEVEL = 4;

  public static final int PARAM_REFLECTIONS_DELAY = 5;

  public static final int PARAM_REVERB_LEVEL = 6;

  public static final int PARAM_REVERB_DELAY = 7;

  public static final int PARAM_DIFFUSION = 8;

  public static final int PARAM_DENSITY = 9;

  // Constructors

  public EnvironmentalReverb(int arg1, int arg2) throws java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException{
    super((java.util.UUID) null, (java.util.UUID) null, 0, 0);
  }
  // Methods

  public EnvironmentalReverb.Settings getProperties() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return (EnvironmentalReverb.Settings) null;
  }
  public void setProperties(EnvironmentalReverb.Settings arg1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
  }
  public void setParameterListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onParameterChangeListener") EnvironmentalReverb.OnParameterChangeListener arg1){
  }
  public void setDensity(short arg1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
  }
  public short getDensity() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return (short) 0;
  }
  public void setRoomLevel(short arg1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
  }
  public short getRoomLevel() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return (short) 0;
  }
  public void setRoomHFLevel(short arg1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
  }
  public short getRoomHFLevel() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return (short) 0;
  }
  public void setDecayTime(int arg1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
  }
  public int getDecayTime() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return 0;
  }
  public void setDecayHFRatio(short arg1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
  }
  public short getDecayHFRatio() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return (short) 0;
  }
  public void setReflectionsLevel(short arg1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
  }
  public short getReflectionsLevel() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return (short) 0;
  }
  public void setReflectionsDelay(int arg1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
  }
  public int getReflectionsDelay() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return 0;
  }
  public void setReverbLevel(short arg1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
  }
  public short getReverbLevel() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return (short) 0;
  }
  public void setReverbDelay(int arg1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
  }
  public int getReverbDelay() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return 0;
  }
  public void setDiffusion(short arg1) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
  }
  public short getDiffusion() throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException{
    return (short) 0;
  }
}
