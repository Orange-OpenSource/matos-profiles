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


public interface WarningHeader
  extends Header
{
  // Fields

  public static final java.lang.String NAME = "Warning";

  public static final int ATTRIBUTE_NOT_UNDERSTOOD = 10;

  public static final int INCOMPATIBLE_BANDWIDTH_UNITS = 20;

  public static final int INCOMPATIBLE_MEDIA_FORMAT = 21;

  public static final int INCOMPATIBLE_NETWORK_ADDRESS_FORMATS = 22;

  public static final int INCOMPATIBLE_NETWORK_PROTOCOL = 23;

  public static final int INCOMPATIBLE_TRANSPORT_PROTOCOL = 24;

  public static final int INSUFFICIENT_BANDWIDTH = 30;

  public static final int MEDIA_TYPE_NOT_AVAILABLE = 40;

  public static final int MISCELLANEOUS_WARNING = 99;

  public static final int MULTICAST_NOT_AVAILABLE = 50;

  public static final int SESSION_DESCRIPTION_PARAMETER_NOT_UNDERSTOOD = 60;

  public static final int UNICAST_NOT_AVAILABLE = 51;

  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("text")
  public java.lang.String getText();
  public void setText(@com.francetelecom.rd.stubs.annotation.FieldSet("text") java.lang.String arg1) throws java.text.ParseException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("agent")
  public java.lang.String getAgent();
  public void setAgent(@com.francetelecom.rd.stubs.annotation.FieldSet("agent") java.lang.String arg1) throws java.text.ParseException;
  public int getCode();
  public void setCode(int arg1) throws javax.sip.InvalidArgumentException;
}
