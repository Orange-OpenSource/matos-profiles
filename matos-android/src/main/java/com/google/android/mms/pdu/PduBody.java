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


public class PduBody
{
  // Constructors

  public PduBody(){
  }
  // Methods

  public void removeAll(){
  }
  public PduPart getPart(int arg1){
    return (PduPart) null;
  }
  public boolean addPart(PduPart arg1){
    return false;
  }
  public void addPart(int arg1, PduPart arg2){
  }
  public int getPartsNum(){
    return 0;
  }
  public PduPart removePart(int arg1){
    return (PduPart) null;
  }
  public int getPartIndex(PduPart arg1){
    return 0;
  }
  public PduPart getPartByContentId(java.lang.String arg1){
    return (PduPart) null;
  }
  public PduPart getPartByContentLocation(java.lang.String arg1){
    return (PduPart) null;
  }
  public PduPart getPartByName(java.lang.String arg1){
    return (PduPart) null;
  }
  public PduPart getPartByFileName(java.lang.String arg1){
    return (PduPart) null;
  }
}
