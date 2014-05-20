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


public class Reason
  extends ParametersHeader  implements javax.sip.header.ReasonHeader
{
  // Fields

  public final java.lang.String TEXT = (java.lang.String) null;

  public final java.lang.String CAUSE = (java.lang.String) null;

  protected java.lang.String protocol;

  // Constructors

  public Reason(){
    super();
  }
  // Methods

  public int getCause(){
    return 0;
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public java.lang.String getProtocol(){
    return (java.lang.String) null;
  }
  public java.lang.String getText(){
    return (java.lang.String) null;
  }
  public void setText(java.lang.String arg1) throws java.text.ParseException{
  }
  protected java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  public void setProtocol(java.lang.String arg1) throws java.text.ParseException{
  }
  public void setCause(int arg1) throws javax.sip.InvalidArgumentException{
  }
}
