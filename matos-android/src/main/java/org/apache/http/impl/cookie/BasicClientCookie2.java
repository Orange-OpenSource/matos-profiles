package org.apache.http.impl.cookie;

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
public class BasicClientCookie2
  extends BasicClientCookie  implements org.apache.http.cookie.SetCookie2
{
  // Constructors

  public BasicClientCookie2(java.lang.String arg1, java.lang.String arg2){
    super((java.lang.String) null, (java.lang.String) null);
  }
  // Methods

  public java.lang.Object clone() throws java.lang.CloneNotSupportedException{
    return (java.lang.Object) null;
  }
  public java.lang.String getCommentURL(){
    return (java.lang.String) null;
  }
  public void setCommentURL(java.lang.String arg1){
  }
  public void setDiscard(boolean arg1){
  }
  public boolean isPersistent(){
    return false;
  }
  public int [] getPorts(){
    return (int []) null;
  }
  public boolean isExpired(java.util.Date arg1){
    return false;
  }
  public void setPorts(int [] arg1){
  }
}
