package java.nio.charset;

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


public class CoderResult
{
  // Fields

  public static final CoderResult UNDERFLOW = null;

  public static final CoderResult OVERFLOW = null;

  // Constructors

  private CoderResult(int arg1, int arg2){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int length() throws java.lang.UnsupportedOperationException{
    return 0;
  }
  public void throwException() throws java.nio.BufferUnderflowException, java.nio.BufferOverflowException, UnmappableCharacterException, MalformedInputException, CharacterCodingException{
  }
  public boolean isUnderflow(){
    return false;
  }
  public static synchronized CoderResult malformedForLength(int arg1) throws java.lang.IllegalArgumentException{
    return (CoderResult) null;
  }
  public boolean isMalformed(){
    return false;
  }
  public boolean isOverflow(){
    return false;
  }
  public boolean isUnmappable(){
    return false;
  }
  public boolean isError(){
    return false;
  }
  public static synchronized CoderResult unmappableForLength(int arg1) throws java.lang.IllegalArgumentException{
    return (CoderResult) null;
  }
}
