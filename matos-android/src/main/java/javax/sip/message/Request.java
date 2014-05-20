package javax.sip.message;

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


public interface Request
  extends Message
{
  // Fields

  public static final java.lang.String ACK = "ACK";

  public static final java.lang.String BYE = "BYE";

  public static final java.lang.String CANCEL = "CANCEL";

  public static final java.lang.String INVITE = "INVITE";

  public static final java.lang.String OPTIONS = "OPTIONS";

  public static final java.lang.String REGISTER = "REGISTER";

  public static final java.lang.String INFO = "INFO";

  public static final java.lang.String MESSAGE = "MESSAGE";

  public static final java.lang.String NOTIFY = "NOTIFY";

  public static final java.lang.String PRACK = "PRACK";

  public static final java.lang.String PUBLISH = "PUBLISH";

  public static final java.lang.String REFER = "REFER";

  public static final java.lang.String SUBSCRIBE = "SUBSCRIBE";

  public static final java.lang.String UPDATE = "UPDATE";

  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("method")
  public java.lang.String getMethod();
  public void setMethod(@com.francetelecom.rd.stubs.annotation.FieldSet("method") java.lang.String arg1) throws java.text.ParseException;
  public javax.sip.address.URI getRequestURI();
  public void setRequestURI(javax.sip.address.URI arg1);
}
