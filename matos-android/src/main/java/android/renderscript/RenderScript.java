package android.renderscript;

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
public class RenderScript
{
  // Classes

  public static class RSMessageHandler
    implements java.lang.Runnable
  {
    // Fields

    protected int [] mData;

    protected int mID;

    protected int mLength;

    // Constructors
    @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
    public RSMessageHandler(){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public void run(){
    }
  }
  public static class RSErrorHandler
    implements java.lang.Runnable
  {
    // Fields

    protected java.lang.String mErrorMessage;

    protected int mErrorNum;

    // Constructors

    @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
    public RSErrorHandler(){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
    public void run(){
    }
  }
  public static enum Priority
  {
    // Enum Constants

    LOW(0)
, NORMAL(0)
;
    // Fields

    // Constructors

    private Priority(int arg1){
    }
    // Methods

  }
  // Constructors

  RenderScript(android.content.Context arg1){
  }
  // Methods

  public void setPriority(RenderScript.Priority arg1){
  }
  public void destroy(){
  }
  @UseRule("RenderScript")
  public static RenderScript create(android.content.Context arg1){
    return (RenderScript) null;
  }
  public void finish(){
  }
  public final android.content.Context getApplicationContext(){
    return (android.content.Context) null;
  }
  public void setErrorHandler(@com.francetelecom.rd.stubs.annotation.FieldSet("mErrorCallback") RenderScript.RSErrorHandler arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mErrorCallback")
  public RenderScript.RSErrorHandler getErrorHandler(){
    return (RenderScript.RSErrorHandler) null;
  }
  public void setMessageHandler(@com.francetelecom.rd.stubs.annotation.FieldSet("mMessageCallback") RenderScript.RSMessageHandler arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mMessageCallback")
  public RenderScript.RSMessageHandler getMessageHandler(){
    return (RenderScript.RSMessageHandler) null;
  }
  public void contextDump(){
  }
}
