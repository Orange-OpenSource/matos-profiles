package gov.nist.core;

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


@com.francetelecom.rd.stubs.annotation.Field(value="value",type="java.lang.String", modifier= java.lang.reflect.Modifier.PRIVATE)
public class NameValue
  extends GenericObject  implements java.util.Map.Entry<java.lang.String, java.lang.String>
{
  // Fields
  protected boolean isQuotedString;

  protected final boolean isFlagParameter = false;

  // Constructors

  public NameValue(){
    super();
  }
  public NameValue(java.lang.String arg1, java.lang.Object arg2, boolean arg3){
    super();
  }
  public NameValue(java.lang.String arg1, java.lang.Object arg2){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("name")
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  public java.lang.StringBuffer encode(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("value")
  public java.lang.String getValue(){
    return (java.lang.String) null;
  }
  public java.lang.String getKey(){
    return (java.lang.String) null;
  }
  public void setName(@com.francetelecom.rd.stubs.annotation.FieldSet("name") java.lang.String arg1){
  }
  public java.lang.String setValue(@com.francetelecom.rd.stubs.annotation.FieldSet(value="value",type="-") java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void setSeparator(java.lang.String arg1){
  }
  public java.lang.Object getValueAsObject(){
    return (java.lang.Object) null;
  }
  public void setQuotedValue(){
  }
  public void setValueAsObject(java.lang.Object arg1){
  }
  public boolean isValueQuoted(){
    return false;
  }
}
