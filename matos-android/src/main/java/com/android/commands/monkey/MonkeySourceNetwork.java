package com.android.commands.monkey;

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


public class MonkeySourceNetwork
  implements MonkeyEventSource
{
  // Classes

  public static class MonkeyCommandReturn
  {
    // Constructors

    public MonkeyCommandReturn(boolean arg1){
    }
    public MonkeyCommandReturn(boolean arg1, java.lang.String arg2){
    }
  }
  public static interface MonkeyCommand
  {
    // Methods

    public MonkeySourceNetwork.MonkeyCommandReturn translateCommand(java.util.List<java.lang.String> arg1, MonkeySourceNetwork.CommandQueue arg2);
  }
  public static interface CommandQueue
  {
    // Methods

    public void enqueueEvent(MonkeyEvent arg1);
  }
  // Fields

  public static final int MONKEY_NETWORK_VERSION = 2;

  public static final MonkeySourceNetwork.MonkeyCommandReturn OK = null;

  public static final MonkeySourceNetwork.MonkeyCommandReturn ERROR = null;

  public static final MonkeySourceNetwork.MonkeyCommandReturn EARG = null;

  // Constructors

  public MonkeySourceNetwork(int arg1) throws java.io.IOException{
  }
  // Methods

  public boolean validate(){
    return false;
  }
  public void setVerbose(int arg1){
  }
  public MonkeyEvent getNextEvent(){
    return (MonkeyEvent) null;
  }
}
