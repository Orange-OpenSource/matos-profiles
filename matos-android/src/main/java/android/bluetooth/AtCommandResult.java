package android.bluetooth;

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
public class AtCommandResult
{
  // Fields

  public static final int OK = 0;

  public static final int ERROR = 1;

  public static final int UNSOLICITED = 2;

  // Constructors

  public AtCommandResult(int arg1){
  }
  public AtCommandResult(java.lang.String arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int getResultCode(){
    return 0;
  }
  public void addResult(AtCommandResult arg1){
  }
  public void addResponse(java.lang.String arg1){
  }
  public static void appendWithCrlf(java.lang.StringBuilder arg1, java.lang.String arg2){
  }
}
