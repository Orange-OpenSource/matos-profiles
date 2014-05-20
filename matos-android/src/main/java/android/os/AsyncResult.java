package android.os;

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
public class AsyncResult
{
  // Fields

  public java.lang.Object userObj;

  public java.lang.Throwable exception;

  public java.lang.Object result;

  // Constructors

  public AsyncResult(@com.francetelecom.rd.stubs.annotation.FieldSet("userObj") java.lang.Object arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("result") java.lang.Object arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("exception") java.lang.Throwable arg3){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.Code({"AsyncResult ret= new AsyncResult(arg1, arg2, arg3);", "arg1.obj=ret;", "return ret;"})
  public static AsyncResult forMessage(Message arg1, java.lang.Object arg2, java.lang.Throwable arg3){
    return (AsyncResult) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return AsyncResult.forMessage(arg1, null, null);")
  public static AsyncResult forMessage(Message arg1){
    return (AsyncResult) null;
  }
}
