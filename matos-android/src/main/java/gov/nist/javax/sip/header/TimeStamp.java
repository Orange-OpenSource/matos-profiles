package gov.nist.javax.sip.header;

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


public class TimeStamp
  extends SIPHeader  implements javax.sip.header.TimeStampHeader
{
  // Fields

  protected long timeStamp;

  protected int delay;

  protected float delayFloat;

  // Constructors

  public TimeStamp(){
    super((java.lang.String) null);
  }
  // Methods

  public long getTime(){
    return 0l;
  }
  public void setTime(long arg1) throws javax.sip.InvalidArgumentException{
  }
  public float getDelay(){
    return 0.0f;
  }
  public void setDelay(float arg1) throws javax.sip.InvalidArgumentException{
  }
  public java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  public void setTimeStamp(float arg1) throws javax.sip.InvalidArgumentException{
  }
  public boolean hasDelay(){
    return false;
  }
  public void removeDelay(){
  }
  public float getTimeStamp(){
    return 0.0f;
  }
  public int getTimeDelay(){
    return 0;
  }
  public void setTimeDelay(int arg1) throws javax.sip.InvalidArgumentException{
  }
}
