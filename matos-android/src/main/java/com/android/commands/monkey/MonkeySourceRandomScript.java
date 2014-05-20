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


public class MonkeySourceRandomScript
  implements MonkeyEventSource
{
  // Constructors

  public MonkeySourceRandomScript(java.lang.String arg1, java.util.ArrayList<java.lang.String> arg2, long arg3, boolean arg4, java.util.Random arg5, long arg6, long arg7, boolean arg8){
  }
  public MonkeySourceRandomScript(java.util.ArrayList<java.lang.String> arg1, long arg2, boolean arg3, java.util.Random arg4, long arg5, long arg6, boolean arg7){
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
