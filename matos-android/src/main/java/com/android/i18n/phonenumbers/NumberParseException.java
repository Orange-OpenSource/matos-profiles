package com.android.i18n.phonenumbers;

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


public class NumberParseException
  extends java.lang.Exception{
  // Classes

  public static enum ErrorType
  {
    // Enum Constants

    INVALID_COUNTRY_CODE()
, NOT_A_NUMBER()
, TOO_SHORT_AFTER_IDD()
, TOO_SHORT_NSN()
, TOO_LONG()
;
    // Fields

    // Constructors

    private ErrorType(){
    }
    // Methods

  }
  // Constructors

  public NumberParseException(NumberParseException.ErrorType arg1, java.lang.String arg2){
    super();
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public NumberParseException.ErrorType getErrorType(){
    return (NumberParseException.ErrorType) null;
  }
}
