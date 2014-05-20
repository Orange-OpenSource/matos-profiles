package android.speech;

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


public abstract class RecognitionService
  extends android.app.Service{
  // Classes

  public class Callback
  {
    // Fields

    // Constructors

    private Callback(IRecognitionListener arg1){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("RecognitionServiceCallback")
    public void error(int arg1) throws android.os.RemoteException{
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("RecognitionServiceCallback")
    public void results(android.os.Bundle arg1) throws android.os.RemoteException{
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("RecognitionServiceCallback")
    public void beginningOfSpeech() throws android.os.RemoteException{
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("RecognitionServiceCallback")
    public void bufferReceived(byte [] arg1) throws android.os.RemoteException{
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("RecognitionServiceCallback")
    public void endOfSpeech() throws android.os.RemoteException{
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("RecognitionServiceCallback")
    public void partialResults(android.os.Bundle arg1) throws android.os.RemoteException{
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("RecognitionServiceCallback")
    public void readyForSpeech(android.os.Bundle arg1) throws android.os.RemoteException{
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("RecognitionServiceCallback")
    public void rmsChanged(float arg1) throws android.os.RemoteException{
    }
  }
  // Fields

  public static final java.lang.String SERVICE_INTERFACE = "android.speech.RecognitionService";

  public static final java.lang.String SERVICE_META_DATA = "android.speech";

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public RecognitionService(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDestroy(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public final android.os.IBinder onBind(android.content.Intent arg1){
    return (android.os.IBinder) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onCancel(RecognitionService.Callback arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onStartListening(android.content.Intent arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("RecognitionServiceCallback") RecognitionService.Callback arg2);
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected abstract void onStopListening(RecognitionService.Callback arg1);
}
