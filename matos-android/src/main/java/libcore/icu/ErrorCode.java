package libcore.icu;

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
public final class ErrorCode
  extends java.lang.Exception{
  // Fields

  public static final int U_ZERO_ERROR = 0;

  public static final int U_INVALID_CHAR_FOUND = 10;

  public static final int U_TRUNCATED_CHAR_FOUND = 11;

  public static final int U_ILLEGAL_CHAR_FOUND = 12;

  public static final int U_BUFFER_OVERFLOW_ERROR = 15;

  // Constructors

  public ErrorCode(){
    super();
  }
  // Methods

  public static java.lang.RuntimeException throwException(int arg1){
    return (java.lang.RuntimeException) null;
  }
  public static boolean isFailure(int arg1){
    return false;
  }
}
