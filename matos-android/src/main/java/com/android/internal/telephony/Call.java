package com.android.internal.telephony;

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
public abstract class Call
{
  // Classes

  public static enum State
  {
    // Enum Constants

    IDLE()
, ACTIVE()
, HOLDING()
, DIALING()
, ALERTING()
, INCOMING()
, WAITING()
, DISCONNECTED()
, DISCONNECTING()
;
    // Fields

    // Constructors

    private State(){
    }
    // Methods

    public boolean isAlive(){
      return false;
    }
    public boolean isRinging(){
      return false;
    }
    public boolean isDialing(){
      return false;
    }
  }
  // Fields

  public Call.State state;

  protected boolean isGeneric;

  protected final java.lang.String LOG_TAG = (java.lang.String) null;

  // Constructors

  public Call(){
  }
  // Methods

  public Call.State getState(){
    return (Call.State) null;
  }
  public abstract void hangup() throws CallStateException;
  public boolean isRinging(){
    return false;
  }
  public boolean isGeneric(){
    return false;
  }
  public abstract java.util.List<Connection> getConnections();
  public abstract boolean isMultiparty();
  public abstract Phone getPhone();
  public boolean hasConnection(Connection arg1){
    return false;
  }
  public boolean hasConnections(){
    return false;
  }
  public boolean isIdle(){
    return false;
  }
  public Connection getEarliestConnection(){
    return (Connection) null;
  }
  public long getEarliestCreateTime(){
    return 0l;
  }
  public long getEarliestConnectTime(){
    return 0l;
  }
  public boolean isDialingOrAlerting(){
    return false;
  }
  public Connection getLatestConnection(){
    return (Connection) null;
  }
  public void setGeneric(boolean arg1){
  }
  public void hangupIfAlive(){
  }
}
