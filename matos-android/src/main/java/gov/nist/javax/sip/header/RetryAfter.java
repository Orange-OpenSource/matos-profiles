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


public class RetryAfter
  extends ParametersHeader  implements javax.sip.header.RetryAfterHeader
{
  // Fields

  public static final java.lang.String DURATION = "duration";

  protected java.lang.Integer retryAfter;

  protected java.lang.String comment;

  // Constructors

  public RetryAfter(){
    super();
  }
  // Methods

  public java.lang.String getComment(){
    return (java.lang.String) null;
  }
  public void setComment(java.lang.String arg1) throws java.text.ParseException{
  }
  public int getDuration(){
    return 0;
  }
  public void setDuration(int arg1) throws javax.sip.InvalidArgumentException{
  }
  public java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  public void setRetryAfter(int arg1) throws javax.sip.InvalidArgumentException{
  }
  public int getRetryAfter(){
    return 0;
  }
  public boolean hasComment(){
    return false;
  }
  public void removeComment(){
  }
  public void removeDuration(){
  }
}
