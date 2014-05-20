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


public interface SubscriptionStateHeader
  extends Parameters, ExpiresHeader
{
  // Fields

  public static final java.lang.String NAME = "Subscription-State";

  public static final java.lang.String DEACTIVATED = "Deactivated";

  public static final java.lang.String GIVE_UP = "Give-Up";

  public static final java.lang.String NO_RESOURCE = "No-Resource";

  public static final java.lang.String PROBATION = "Probation";

  public static final java.lang.String REJECTED = "Rejected";

  public static final java.lang.String TIMEOUT = "Timeout";

  public static final java.lang.String UNKNOWN = "Unknown";

  public static final java.lang.String ACTIVE = "Active";

  public static final java.lang.String PENDING = "Pending";

  public static final java.lang.String TERMINATED = "Terminated";

  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("state")
  public java.lang.String getState();
  public void setState(@com.francetelecom.rd.stubs.annotation.FieldSet("state") java.lang.String arg1) throws java.text.ParseException;
  public void setRetryAfter(int arg1) throws javax.sip.InvalidArgumentException;
  public int getRetryAfter();
  @com.francetelecom.rd.stubs.annotation.FieldGet("reasonCode")
  public java.lang.String getReasonCode();
  public void setReasonCode(@com.francetelecom.rd.stubs.annotation.FieldSet("reasonCode") java.lang.String arg1) throws java.text.ParseException;
}
