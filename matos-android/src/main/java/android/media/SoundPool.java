package android.media;

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
public class SoundPool
{
  // Classes

  public static interface OnLoadCompleteListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onLoadComplete")
    public void onLoadComplete(SoundPool arg1, int arg2, int arg3);
  }
  // Constructors

  public SoundPool(int arg1, int arg2, int arg3){
  }
  // Methods

  protected void finalize(){
  }
  public int load(java.lang.String arg1, int arg2){
    return 0;
  }
  public int load(android.content.Context arg1, int arg2, int arg3){
    return 0;
  }
  public int load(android.content.res.AssetFileDescriptor arg1, int arg2){
    return 0;
  }
  public int load(java.io.FileDescriptor arg1, long arg2, long arg3, int arg4){
    return 0;
  }
  public final void setPriority(int arg1, int arg2){
  }
  public final void resume(int arg1){
  }
  public final void stop(int arg1){
  }
  public final void release(){
  }
  public final boolean unload(int arg1){
    return false;
  }
  public final void setVolume(int arg1, float arg2, float arg3){
  }
  public final void pause(int arg1){
  }
  public final int play(int arg1, float arg2, float arg3, int arg4, int arg5, float arg6){
    return 0;
  }
  public void setOnLoadCompleteListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onLoadComplete") SoundPool.OnLoadCompleteListener arg1){
  }
  public final void autoPause(){
  }
  public final void autoResume(){
  }
  public final void setLoop(int arg1, int arg2){
  }
  public final void setRate(int arg1, float arg2){
  }
}
