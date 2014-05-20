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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@com.francetelecom.rd.stubs.annotation.Fields({@com.francetelecom.rd.stubs.annotation.Field(type = "T", value = "content", modifier = 4), @com.francetelecom.rd.stubs.annotation.Field(type = "ReferenceQueue<T>", value = "queue", modifier = 4)})
public abstract class Reference<T>
{
  // Fields

  public Reference<?> pendingNext;

  // Constructors

  Reference(){
  }
  Reference(@com.francetelecom.rd.stubs.annotation.FieldSet("content") T arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("queue") ReferenceQueue arg2){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public T get(){
    return null;
  }
  public void clear(){
  }
  @com.francetelecom.rd.stubs.annotation.Code({"queue.content = this;", "return com.francetelecom.rd.stubs.Generator.booleanValue();"})
  public boolean enqueue(){
    return false;
  }
  public boolean isEnqueued(){
    return false;
  }
  public final synchronized boolean enqueueInternal(){
    return false;
  }
}
