package android.content;

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

import com.francetelecom.rd.stubs.annotation.UseRule;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@com.francetelecom.rd.stubs.annotation.Accumulator("stubAccumulator")
@com.francetelecom.rd.stubs.annotation.DumpHierarchy(value = "android.hierarchy.BroadcastReceiver", noAbstract = false)
public abstract class BroadcastReceiver
{
  // Classes

  public static class PendingResult
  {
    // Fields

    public static final int TYPE_COMPONENT = 0;

    public static final int TYPE_REGISTERED = 1;

    public static final int TYPE_UNREGISTERED = 2;

    // Constructors

    public PendingResult(int arg1, java.lang.String arg2, android.os.Bundle arg3, int arg4, boolean arg5, boolean arg6, android.os.IBinder arg7){
    }
    // Methods

    public final void setResult(int arg1, java.lang.String arg2, android.os.Bundle arg3){
    }
    public final void finish(){
    }
    public final void setResultCode(int arg1){
    }
    public final int getResultCode(){
      return 0;
    }
    public final void setResultData(java.lang.String arg1){
    }
    public final java.lang.String getResultData(){
      return (java.lang.String) null;
    }
    public final void setResultExtras(android.os.Bundle arg1){
    }
    public final android.os.Bundle getResultExtras(boolean arg1){
      return (android.os.Bundle) null;
    }
    public final boolean getAbortBroadcast(){
      return false;
    }
    
    @UseRule(value="BroadcastReceiver.abortBroadcast")
    public final void abortBroadcast(){
    }
    public final void clearAbortBroadcast(){
    }
    public void sendFinished(android.app.IActivityManager arg1){
    }
    public void setExtrasClassLoader(java.lang.ClassLoader arg1){
    }
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onReceive")
  public BroadcastReceiver(){
  }
  // Methods

  public final void setResult(int arg1, java.lang.String arg2, android.os.Bundle arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onReceive")
  public abstract void onReceive(Context arg1, Intent arg2);
  public final BroadcastReceiver.PendingResult goAsync(){
    return (BroadcastReceiver.PendingResult) null;
  }
  public android.os.IBinder peekService(Context arg1, Intent arg2){
    return (android.os.IBinder) null;
  }
  public final void setResultCode(int arg1){
  }
  public final int getResultCode(){
    return 0;
  }
  public final void setResultData(java.lang.String arg1){
  }
  public final java.lang.String getResultData(){
    return (java.lang.String) null;
  }
  public final void setResultExtras(android.os.Bundle arg1){
  }
  public final android.os.Bundle getResultExtras(boolean arg1){
    return (android.os.Bundle) null;
  }
  public final boolean getAbortBroadcast(){
    return false;
  }
  public final void abortBroadcast(){
  }
  public final void clearAbortBroadcast(){
  }
  public final boolean isOrderedBroadcast(){
    return false;
  }
  public final boolean isInitialStickyBroadcast(){
    return false;
  }
  public final void setOrderedHint(boolean arg1){
  }
  public final void setPendingResult(BroadcastReceiver.PendingResult arg1){
  }
  public final BroadcastReceiver.PendingResult getPendingResult(){
    return (BroadcastReceiver.PendingResult) null;
  }
  public final void setDebugUnregister(boolean arg1){
  }
  public final boolean getDebugUnregister(){
    return false;
  }
}
