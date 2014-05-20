package com.google.android.mms.pdu;

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


public class PduPersister
{
  // Fields

  public static final java.lang.String TEMPORARY_DRM_OBJECT_URI = "content://mms/9223372036854775807/part";

  public static final int PROC_STATUS_TRANSIENT_FAILURE = 1;

  public static final int PROC_STATUS_PERMANENTLY_FAILURE = 2;

  public static final int PROC_STATUS_COMPLETED = 3;

  // Constructors

  private PduPersister(android.content.Context arg1){
  }
  // Methods

  public static byte [] getBytes(java.lang.String arg1){
    return (byte []) null;
  }
  public GenericPdu load(android.net.Uri arg1) throws com.google.android.mms.MmsException{
    return (GenericPdu) null;
  }
  public void release(){
  }
  public android.net.Uri move(android.net.Uri arg1, android.net.Uri arg2) throws com.google.android.mms.MmsException{
    return (android.net.Uri) null;
  }
  public static PduPersister getPduPersister(android.content.Context arg1){
    return (PduPersister) null;
  }
  public android.net.Uri persistPart(PduPart arg1, long arg2) throws com.google.android.mms.MmsException{
    return (android.net.Uri) null;
  }
  public void updateHeaders(android.net.Uri arg1, SendReq arg2){
  }
  public void updateParts(android.net.Uri arg1, PduBody arg2) throws com.google.android.mms.MmsException{
  }
  public android.net.Uri persist(GenericPdu arg1, android.net.Uri arg2) throws com.google.android.mms.MmsException{
    return (android.net.Uri) null;
  }
  public static java.lang.String toIsoString(byte [] arg1){
    return (java.lang.String) null;
  }
  public android.database.Cursor getPendingMessages(long arg1){
    return (android.database.Cursor) null;
  }
}
