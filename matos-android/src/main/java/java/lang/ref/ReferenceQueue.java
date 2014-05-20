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
@com.francetelecom.rd.stubs.annotation.Field(type = "Reference<T>", value = "content", modifier = 0)
public class ReferenceQueue<T>
{
  // Fields

  public static Reference unenqueued;

  // Constructors

  public ReferenceQueue(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public Reference<? extends T> remove() throws java.lang.InterruptedException{
    return (Reference) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public synchronized Reference<? extends T> remove(long arg1) throws java.lang.InterruptedException{
    return (Reference) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("content")
  public synchronized Reference<? extends T> poll(){
    return (Reference) null;
  }
}
