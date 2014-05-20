package java.lang.ref;

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

import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.FieldNoValue;


public final class FinalizerReference<T>
  extends Reference<T>{
  // Fields

	
  public static final ReferenceQueue<java.lang.Object> queue = null;

  // Constructors

	@Code({"super();", "content = arg1;"})
  public FinalizerReference( T arg1, ReferenceQueue<? super T> arg2){
    super();
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public T get(){
    return null;
  }
  public void clear(){
  }
  public static void remove(FinalizerReference arg1){
  }
  public static void finalizeAllEnqueued() throws java.lang.InterruptedException{
  }
}
