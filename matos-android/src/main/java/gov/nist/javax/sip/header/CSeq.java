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


public class CSeq
  extends SIPHeader  implements javax.sip.header.CSeqHeader
{
  // Fields

  protected java.lang.Long seqno;

  protected java.lang.String method;

  // Constructors

  public CSeq(){
    super((java.lang.String) null);
  }
  public CSeq(long arg1, java.lang.String arg2){
    super((java.lang.String) null);
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("method")
  public java.lang.String getMethod(){
    return (java.lang.String) null;
  }
  public void setMethod(@com.francetelecom.rd.stubs.annotation.FieldSet("this.method") java.lang.String arg1) throws java.text.ParseException{
  }
  public java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  protected java.lang.StringBuffer encodeBody(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  public long getSeqNumber(){
    return 0l;
  }
  public void setSeqNumber(long arg1) throws javax.sip.InvalidArgumentException{
  }
  public int getSequenceNumber(){
    return 0;
  }
  public void setSequenceNumber(int arg1) throws javax.sip.InvalidArgumentException{
  }
}
