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


public class SubscriptionState
  extends ParametersHeader  implements javax.sip.header.SubscriptionStateHeader
{
  // Fields

  protected int expires;

  protected int retryAfter;

  protected java.lang.String reasonCode;

  protected java.lang.String state;

  // Constructors

  public SubscriptionState(){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("state")
  public java.lang.String getState(){
    return (java.lang.String) null;
  }
  public void setState(@com.francetelecom.rd.stubs.annotation.FieldSet("this.state") java.lang.String arg1) throws java.text.ParseException{
  }
  public java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  protected java.lang.StringBuffer encodeBody(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  public void setExpires(int arg1) throws javax.sip.InvalidArgumentException{
  }
  public int getExpires(){
    return 0;
  }
  public void setRetryAfter(int arg1) throws javax.sip.InvalidArgumentException{
  }
  public int getRetryAfter(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("reasonCode")
  public java.lang.String getReasonCode(){
    return (java.lang.String) null;
  }
  public void setReasonCode(@com.francetelecom.rd.stubs.annotation.FieldSet("this.reasonCode") java.lang.String arg1) throws java.text.ParseException{
  }
}
