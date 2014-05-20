package android.net;

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

import com.francetelecom.rd.stubs.annotation.ArgsRule;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class WebAddress
{
  // Constructors

  @ArgsRule(value="WebAddress",pos={0,1})
  public WebAddress(java.lang.String arg1) throws ParseException{
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mPath")
  public java.lang.String getPath(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mScheme")
  public java.lang.String getScheme(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mHost")
  public java.lang.String getHost(){
    return (java.lang.String) null;
  }
  public int getPort(){
    return 0;
  }
  @ArgsRule(value="WebAddress.setPath",pos={0,1})
  public void setPath(@com.francetelecom.rd.stubs.annotation.FieldSet("mPath") java.lang.String arg1){
  }
  
  @ArgsRule(value="WebAddress.setScheme",pos={0,1})
  public void setScheme(@com.francetelecom.rd.stubs.annotation.FieldSet("mScheme") java.lang.String arg1){
  }
  @ArgsRule(value="WebAddress.setHost",pos={0,1})
  public void setHost(@com.francetelecom.rd.stubs.annotation.FieldSet("mHost") java.lang.String arg1){
  }
  public void setPort(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mAuthInfo")
  public java.lang.String getAuthInfo(){
    return (java.lang.String) null;
  }
  public void setAuthInfo(@com.francetelecom.rd.stubs.annotation.FieldSet("mAuthInfo") java.lang.String arg1){
  }
}
