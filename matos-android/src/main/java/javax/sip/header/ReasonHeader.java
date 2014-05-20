package javax.sip.header;

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


public interface ReasonHeader
  extends Header, Parameters
{
  // Fields

  public static final java.lang.String NAME = "Reason";

  // Methods

  public int getCause();
  @com.francetelecom.rd.stubs.annotation.FieldGet("protocol")
  public java.lang.String getProtocol();
  @com.francetelecom.rd.stubs.annotation.FieldGet("text")
  public java.lang.String getText();
  public void setText(@com.francetelecom.rd.stubs.annotation.FieldSet("text") java.lang.String arg1) throws java.text.ParseException;
  public void setProtocol(@com.francetelecom.rd.stubs.annotation.FieldSet("protocol") java.lang.String arg1) throws java.text.ParseException;
  public void setCause(int arg1) throws javax.sip.InvalidArgumentException;
}
