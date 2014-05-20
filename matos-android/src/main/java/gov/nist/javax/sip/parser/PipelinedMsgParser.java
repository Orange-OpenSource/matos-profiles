package gov.nist.javax.sip.parser;

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


public final class PipelinedMsgParser
  implements java.lang.Runnable
{
  // Fields

  protected SIPMessageListener sipMessageListener;

  // Constructors

  protected PipelinedMsgParser(){
  }
  public PipelinedMsgParser(@com.francetelecom.rd.stubs.annotation.CallBackRegister("processSIPMessage") SIPMessageListener arg1, Pipeline arg2, boolean arg3, int arg4){
  }
  public PipelinedMsgParser(@com.francetelecom.rd.stubs.annotation.CallBackRegister("processSIPMessage") SIPMessageListener arg1, Pipeline arg2, int arg3){
  }
  public PipelinedMsgParser(Pipeline arg1){
  }
  // Methods

  public void run(){
  }
  protected java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public void close(){
  }
  public void processInput(){
  }
  public void setMessageListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("processSIPMessage") SIPMessageListener arg1){
  }
}
