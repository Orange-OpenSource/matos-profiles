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


public final class Accept
  extends ParametersHeader  implements javax.sip.header.AcceptHeader
{
  // Fields

  protected MediaRange mediaRange;

  // Constructors

  public Accept(){
    super();
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.lang.String getContentType(){
    return (java.lang.String) null;
  }
  public void setContentType(java.lang.String arg1){
  }
  protected java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  protected java.lang.StringBuffer encodeBody(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  public float getQValue(){
    return 0.0f;
  }
  public void setQValue(float arg1) throws javax.sip.InvalidArgumentException{
  }
  public boolean allowsAllContentTypes(){
    return false;
  }
  public boolean allowsAllContentSubTypes(){
    return false;
  }
  public MediaRange getMediaRange(){
    return (MediaRange) null;
  }
  public java.lang.String getContentSubType(){
    return (java.lang.String) null;
  }
  public boolean hasQValue(){
    return false;
  }
  public void removeQValue(){
  }
  public void setContentSubType(java.lang.String arg1){
  }
  public void setMediaRange(MediaRange arg1){
  }
}
