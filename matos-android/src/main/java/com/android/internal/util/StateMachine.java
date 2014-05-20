package com.android.internal.util;

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
public class StateMachine
{
  // Classes

  public static class ProcessedMessageInfo
  {
    // Constructors

    ProcessedMessageInfo(android.os.Message arg1, State arg2, State arg3){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public State getState(){
      return (State) null;
    }
    public void update(android.os.Message arg1, State arg2, State arg3){
    }
    public int getWhat(){
      return 0;
    }
    public State getOriginalState(){
      return (State) null;
    }
  }
  // Fields

  public static final int SM_QUIT_CMD = -1;

  public static final int SM_INIT_CMD = -1;

  public static final boolean HANDLED = true;

  public static final boolean NOT_HANDLED = false;

  // Constructors

  protected StateMachine(java.lang.String arg1){
  }
  protected StateMachine(java.lang.String arg1, android.os.Looper arg2){
  }
  // Methods

  public final java.lang.String getName(){
    return (java.lang.String) null;
  }
  public void start(){
  }
  public final android.os.Handler getHandler(){
    return (android.os.Handler) null;
  }
  public final android.os.Message obtainMessage(){
    return (android.os.Message) null;
  }
  public final android.os.Message obtainMessage(int arg1){
    return (android.os.Message) null;
  }
  public final android.os.Message obtainMessage(int arg1, java.lang.Object arg2){
    return (android.os.Message) null;
  }
  public final android.os.Message obtainMessage(int arg1, int arg2, int arg3){
    return (android.os.Message) null;
  }
  public final android.os.Message obtainMessage(int arg1, int arg2, int arg3, java.lang.Object arg4){
    return (android.os.Message) null;
  }
  public final void sendMessage(int arg1){
  }
  public final void sendMessage(int arg1, java.lang.Object arg2){
  }
  public final void sendMessage(android.os.Message arg1){
  }
  public final void sendMessageDelayed(int arg1, long arg2){
  }
  public final void sendMessageDelayed(int arg1, java.lang.Object arg2, long arg3){
  }
  public final void sendMessageDelayed(android.os.Message arg1, long arg2){
  }
  protected final void sendMessageAtFrontOfQueue(int arg1, java.lang.Object arg2){
  }
  protected final void sendMessageAtFrontOfQueue(int arg1){
  }
  protected final void sendMessageAtFrontOfQueue(android.os.Message arg1){
  }
  protected final void removeMessages(int arg1){
  }
  protected final void deferMessage(android.os.Message arg1){
  }
  protected final void transitionTo(IState arg1){
  }
  protected final void addState(State arg1, State arg2){
  }
  protected final void addState(State arg1){
  }
  protected final void setInitialState(State arg1){
  }
  protected final android.os.Message getCurrentMessage(){
    return (android.os.Message) null;
  }
  protected final IState getCurrentState(){
    return (IState) null;
  }
  protected final void transitionToHaltingState(){
  }
  protected void unhandledMessage(android.os.Message arg1){
  }
  protected void haltedProcessMessage(android.os.Message arg1){
  }
  protected void halting(){
  }
  protected void quitting(){
  }
  public final void setProcessedMessagesSize(int arg1){
  }
  public final int getProcessedMessagesSize(){
    return 0;
  }
  public final int getProcessedMessagesCount(){
    return 0;
  }
  public final StateMachine.ProcessedMessageInfo getProcessedMessageInfo(int arg1){
    return (StateMachine.ProcessedMessageInfo) null;
  }
  public final void quit(){
  }
  protected final boolean isQuit(android.os.Message arg1){
    return false;
  }
  public boolean isDbg(){
    return false;
  }
  public void setDbg(boolean arg1){
  }
}
