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
public class JetPlayer
{
  // Classes

  public static interface OnJetEventListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onJetEvent")
    public void onJetEvent(JetPlayer arg1, short arg2, byte arg3, byte arg4, byte arg5, byte arg6);
    @com.francetelecom.rd.stubs.annotation.CallBack("onJetEvent")
    public void onJetUserIdUpdate(JetPlayer arg1, int arg2, int arg3);
    @com.francetelecom.rd.stubs.annotation.CallBack("onJetEvent")
    public void onJetNumQueuedSegmentUpdate(JetPlayer arg1, int arg2);
    @com.francetelecom.rd.stubs.annotation.CallBack("onJetEvent")
    public void onJetPauseUpdate(JetPlayer arg1, int arg2);
  }
  // Constructors

  private JetPlayer(){
  }
  // Methods

  protected void finalize(){
  }
  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public void release(){
  }
  public boolean pause(){
    return false;
  }
  public boolean play(){
    return false;
  }
  public static JetPlayer getJetPlayer(){
    return (JetPlayer) null;
  }
  public static int getMaxTracks(){
    return 0;
  }
  public boolean loadJetFile(java.lang.String arg1){
    return false;
  }
  public boolean loadJetFile(android.content.res.AssetFileDescriptor arg1){
    return false;
  }
  public boolean closeJetFile(){
    return false;
  }
  public boolean queueJetSegment(int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6){
    return false;
  }
  public boolean queueJetSegmentMuteArray(int arg1, int arg2, int arg3, int arg4, boolean [] arg5, byte arg6){
    return false;
  }
  public boolean setMuteFlags(int arg1, boolean arg2){
    return false;
  }
  public boolean setMuteArray(boolean [] arg1, boolean arg2){
    return false;
  }
  public boolean setMuteFlag(int arg1, boolean arg2, boolean arg3){
    return false;
  }
  public boolean triggerClip(int arg1){
    return false;
  }
  public boolean clearQueue(){
    return false;
  }
  public void setEventListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.media.JetPlayer.OnJetEventListener.onJetEvent") JetPlayer.OnJetEventListener arg1){
  }
  public void setEventListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("android.media.JetPlayer.OnJetEventListener.onJetEvent") JetPlayer.OnJetEventListener arg1, android.os.Handler arg2){
  }
}
