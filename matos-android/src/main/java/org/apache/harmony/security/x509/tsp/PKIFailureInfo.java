package org.apache.harmony.security.x509.tsp;

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
public enum PKIFailureInfo
{
  // Enum Constants

  BAD_ALG(0)
, BAD_REQUEST(0)
, BAD_DATA_FORMAT(0)
, TIME_NOT_AVAILABLE(0)
, UNACCEPTED_POLICY(0)
, UNACCEPTED_EXTENSION(0)
, ADD_INFO_NOT_AVAILABLE(0)
, SYSTEM_FAILURE(0)
;
  // Fields

  // Constructors

  private PKIFailureInfo(int arg1){
  }
  // Methods

  public int getValue(){
    return 0;
  }
  public static PKIFailureInfo getInstance(int arg1){
    return (PKIFailureInfo) null;
  }
  public static int getMaxValue(){
    return 0;
  }
}
