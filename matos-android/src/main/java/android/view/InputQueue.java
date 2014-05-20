package android.view;

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


public final class InputQueue
{
  // Classes

  public static interface Callback
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("onInputQueue")
    public void onInputQueueCreated(InputQueue arg1);
	@com.francetelecom.rd.stubs.annotation.CallBack("onInputQueue")
    public void onInputQueueDestroyed(InputQueue arg1);
  }
  public static final class FinishedCallback
  {
    // Constructors

    private FinishedCallback(){
    }
    // Methods
    @com.francetelecom.rd.stubs.annotation.CallBack("FinishedCallback")
    public void finished(boolean arg1){
    }
    public static InputQueue.FinishedCallback obtain(long arg1){
      return (InputQueue.FinishedCallback) null;
    }
  }
  // Constructors

  public InputQueue(InputChannel arg1){
  }
  // Methods

  public static void registerInputChannel(InputChannel arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("InputHandler") InputHandler arg2, android.os.MessageQueue arg3){
  }
  public static void unregisterInputChannel(InputChannel arg1){
  }
  public InputChannel getInputChannel(){
    return (InputChannel) null;
  }
}
