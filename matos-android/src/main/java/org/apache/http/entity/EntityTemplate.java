package org.apache.http.entity;

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
public class EntityTemplate
  extends AbstractHttpEntity{
  // Constructors

  public EntityTemplate(ContentProducer arg1){
    super();
  }
  // Methods

  public java.io.InputStream getContent(){
    return (java.io.InputStream) null;
  }
  public void writeTo(java.io.OutputStream arg1) throws java.io.IOException{
  }
  public long getContentLength(){
    return 0l;
  }
  public boolean isRepeatable(){
    return false;
  }
  public boolean isStreaming(){
    return false;
  }
  public void consumeContent() throws java.io.IOException{
  }
}
