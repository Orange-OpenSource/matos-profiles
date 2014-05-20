package android.net.rtp;

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


public class AudioStream
  extends RtpStream{
  // Constructors

  public AudioStream(java.net.InetAddress arg1) throws java.net.SocketException{
    super((java.net.InetAddress) null);
  }
  // Methods

  public void join(AudioGroup arg1){
  }
  public AudioGroup getGroup(){
    return (AudioGroup) null;
  }
  public final boolean isBusy(){
    return false;
  }
  public AudioCodec getCodec(){
    return (AudioCodec) null;
  }
  public void setCodec(AudioCodec arg1){
  }
  public int getDtmfType(){
    return 0;
  }
  public void setDtmfType(int arg1){
  }
}
