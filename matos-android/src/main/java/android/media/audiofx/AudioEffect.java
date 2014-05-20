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


public class AudioEffect
{
  // Classes

  public static class Descriptor
  {
    // Fields

    public java.util.UUID type;

    public java.util.UUID uuid;

    public java.lang.String connectMode;

    public java.lang.String name;

    public java.lang.String implementor;

    // Constructors

    public Descriptor(){
    }
    public Descriptor(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5){
    }
  }
  public static interface OnEnableStatusChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onEnableStatusChange")
    public void onEnableStatusChange(AudioEffect arg1, boolean arg2);
  }
  public static interface OnControlStatusChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onControlStatusChangeListener")
    public void onControlStatusChange(AudioEffect arg1, boolean arg2);
  }
  public static interface OnParameterChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onParameterChangeListener")
    public void onParameterChange(AudioEffect arg1, int arg2, byte [] arg3, byte [] arg4);
  }
  // Fields

  public static final java.util.UUID EFFECT_TYPE_ENV_REVERB = null;

  public static final java.util.UUID EFFECT_TYPE_PRESET_REVERB = null;

  public static final java.util.UUID EFFECT_TYPE_EQUALIZER = null;

  public static final java.util.UUID EFFECT_TYPE_BASS_BOOST = null;

  public static final java.util.UUID EFFECT_TYPE_VIRTUALIZER = null;

  public static final java.util.UUID EFFECT_TYPE_AGC = null;

  public static final java.util.UUID EFFECT_TYPE_AEC = null;

  public static final java.util.UUID EFFECT_TYPE_NS = null;

  public static final java.util.UUID EFFECT_TYPE_NULL = null;

  public static final int STATE_UNINITIALIZED = 0;

  public static final int STATE_INITIALIZED = 1;

  public static final int NATIVE_EVENT_CONTROL_STATUS = 0;

  public static final int NATIVE_EVENT_ENABLED_STATUS = 1;

  public static final int NATIVE_EVENT_PARAMETER_CHANGED = 2;

  public static final int SUCCESS = 0;

  public static final int ERROR = -1;

  public static final int ALREADY_EXISTS = -2;

  public static final int ERROR_NO_INIT = -3;

  public static final int ERROR_BAD_VALUE = -4;

  public static final int ERROR_INVALID_OPERATION = -5;

  public static final int ERROR_NO_MEMORY = -6;

  public static final int ERROR_DEAD_OBJECT = -7;

  public static final java.lang.String EFFECT_INSERT = "Insert";

  public static final java.lang.String EFFECT_AUXILIARY = "Auxiliary";

  public static final java.lang.String EFFECT_PRE_PROCESSING = "Pre Processing";

  public final java.lang.Object mListenerLock = (java.lang.Object) null;

  public static final java.lang.String ACTION_DISPLAY_AUDIO_EFFECT_CONTROL_PANEL = "android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL";

  public static final java.lang.String ACTION_OPEN_AUDIO_EFFECT_CONTROL_SESSION = "android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION";

  public static final java.lang.String ACTION_CLOSE_AUDIO_EFFECT_CONTROL_SESSION = "android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION";

  public static final java.lang.String EXTRA_AUDIO_SESSION = "android.media.extra.AUDIO_SESSION";

  public static final java.lang.String EXTRA_PACKAGE_NAME = "android.media.extra.PACKAGE_NAME";

  public static final java.lang.String EXTRA_CONTENT_TYPE = "android.media.extra.CONTENT_TYPE";

  public static final int CONTENT_TYPE_MUSIC = 0;

  public static final int CONTENT_TYPE_MOVIE = 1;

  public static final int CONTENT_TYPE_GAME = 2;

  public static final int CONTENT_TYPE_VOICE = 3;

  // Constructors

  public AudioEffect(java.util.UUID arg1, java.util.UUID arg2, int arg3, int arg4) throws java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException, java.lang.RuntimeException{
  }
  // Methods

  protected void finalize(){
  }
  public AudioEffect.Descriptor getDescriptor() throws java.lang.IllegalStateException{
    return (AudioEffect.Descriptor) null;
  }
  public int getId() throws java.lang.IllegalStateException{
    return 0;
  }
  public static boolean isError(int arg1){
    return false;
  }
  public void release(){
  }
  public int command(int arg1, byte [] arg2, byte [] arg3) throws java.lang.IllegalStateException{
    return 0;
  }
  public int getParameter(byte [] arg1, byte [] arg2) throws java.lang.IllegalStateException{
    return 0;
  }
  public int getParameter(int arg1, byte [] arg2) throws java.lang.IllegalStateException{
    return 0;
  }
  public int getParameter(int arg1, int [] arg2) throws java.lang.IllegalStateException{
    return 0;
  }
  public int getParameter(int arg1, short [] arg2) throws java.lang.IllegalStateException{
    return 0;
  }
  public int getParameter(int [] arg1, int [] arg2) throws java.lang.IllegalStateException{
    return 0;
  }
  public int getParameter(int [] arg1, short [] arg2) throws java.lang.IllegalStateException{
    return 0;
  }
  public int getParameter(int [] arg1, byte [] arg2) throws java.lang.IllegalStateException{
    return 0;
  }
  public int setParameter(byte [] arg1, byte [] arg2) throws java.lang.IllegalStateException{
    return 0;
  }
  public int setParameter(int arg1, int arg2) throws java.lang.IllegalStateException{
    return 0;
  }
  public int setParameter(int arg1, short arg2) throws java.lang.IllegalStateException{
    return 0;
  }
  public int setParameter(int arg1, byte [] arg2) throws java.lang.IllegalStateException{
    return 0;
  }
  public int setParameter(int [] arg1, int [] arg2) throws java.lang.IllegalStateException{
    return 0;
  }
  public int setParameter(int [] arg1, short [] arg2) throws java.lang.IllegalStateException{
    return 0;
  }
  public int setParameter(int [] arg1, byte [] arg2) throws java.lang.IllegalStateException{
    return 0;
  }
  public int setEnabled(boolean arg1) throws java.lang.IllegalStateException{
    return 0;
  }
  public void setParameterListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onParameterChangeListener") AudioEffect.OnParameterChangeListener arg1){
  }
  public void checkState(java.lang.String arg1) throws java.lang.IllegalStateException{
  }
  public void checkStatus(int arg1){
  }
  public static AudioEffect.Descriptor [] queryEffects(){
    return (AudioEffect.Descriptor []) null;
  }
  public static AudioEffect.Descriptor [] queryPreProcessings(int arg1){
    return (AudioEffect.Descriptor []) null;
  }
  public boolean getEnabled() throws java.lang.IllegalStateException{
    return false;
  }
  public boolean hasControl() throws java.lang.IllegalStateException{
    return false;
  }
  public void setEnableStatusListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onEnableStatusChange") AudioEffect.OnEnableStatusChangeListener arg1){
  }
  public void setControlStatusListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onControlStatusChangeListener") AudioEffect.OnControlStatusChangeListener arg1){
  }
  public int byteArrayToInt(byte [] arg1){
    return 0;
  }
  public int byteArrayToInt(byte [] arg1, int arg2){
    return 0;
  }
  public byte [] intToByteArray(int arg1){
    return (byte []) null;
  }
  public short byteArrayToShort(byte [] arg1){
    return (short) 0;
  }
  public short byteArrayToShort(byte [] arg1, int arg2){
    return (short) 0;
  }
  public byte [] shortToByteArray(short arg1){
    return (byte []) null;
  }
  public byte [] concatArrays(byte [] [] arg1){
    return (byte []) null;
  }
}
