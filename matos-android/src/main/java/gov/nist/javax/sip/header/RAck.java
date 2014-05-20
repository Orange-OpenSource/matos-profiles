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


public class RAck
  extends SIPHeader  implements javax.sip.header.RAckHeader
{
  // Fields

  protected long cSeqNumber;

  protected long rSeqNumber;

  protected java.lang.String method;

  // Constructors

  public RAck(){
    super((java.lang.String) null);
  }
  // Methods

  public java.lang.String getMethod(){
    return (java.lang.String) null;
  }
  public void setMethod(java.lang.String arg1) throws java.text.ParseException{
  }
  protected java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  public void setRSequenceNumber(long arg1) throws javax.sip.InvalidArgumentException{
  }
  public void setCSequenceNumber(long arg1) throws javax.sip.InvalidArgumentException{
  }
  public long getCSequenceNumber(){
    return 0l;
  }
  public long getRSequenceNumber(){
    return 0l;
  }
  public int getCSeqNumber(){
    return 0;
  }
  public void setCSeqNumber(int arg1) throws javax.sip.InvalidArgumentException{
  }
  public int getRSeqNumber(){
    return 0;
  }
  public void setRSeqNumber(int arg1) throws javax.sip.InvalidArgumentException{
  }
  public long getCSeqNumberLong(){
    return 0l;
  }
}
