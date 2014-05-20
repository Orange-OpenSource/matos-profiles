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
public enum PKIStatus
{
  // Enum Constants

  GRANTED(0)
, GRANTED_WITH_MODS(0)
, REJECTION(0)
, WAITING(0)
, REVOCATION_WARNING(0)
, REVOCATION_NOTIFICATION(0)
;
  // Fields

  // Constructors

  private PKIStatus(int arg1){
  }
  // Methods

  public static PKIStatus getInstance(int arg1){
    return (PKIStatus) null;
  }
  public int getStatus(){
    return 0;
  }
}
