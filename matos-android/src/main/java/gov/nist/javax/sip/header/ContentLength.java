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


public class ContentLength
  extends SIPHeader  implements javax.sip.header.ContentLengthHeader
{
  // Fields

  protected java.lang.Integer contentLength;

  // Constructors

  public ContentLength(){
    super((java.lang.String) null);
  }
  public ContentLength(int arg1){
    super((java.lang.String) null);
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public boolean match(java.lang.Object arg1){
    return false;
  }
  public int getContentLength(){
    return 0;
  }
  public void setContentLength(int arg1) throws javax.sip.InvalidArgumentException{
  }
  public java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  protected java.lang.StringBuffer encodeBody(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
}
