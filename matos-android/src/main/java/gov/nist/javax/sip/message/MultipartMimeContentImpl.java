package gov.nist.javax.sip.message;

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


public class MultipartMimeContentImpl
  implements MultipartMimeContent
{
  // Fields

  public static java.lang.String BOUNDARY;

  // Constructors

  public MultipartMimeContentImpl(javax.sip.header.ContentTypeHeader arg1){
  }
  // Methods

  public boolean add(Content arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.util.Iterator<Content> getContents(){
    return (java.util.Iterator) null;
  }
  public javax.sip.header.ContentTypeHeader getContentTypeHeader(){
    return (javax.sip.header.ContentTypeHeader) null;
  }
  public void addContent(Content arg1){
  }
  public int getContentCount(){
    return 0;
  }
  public void createContentList(java.lang.String arg1) throws java.text.ParseException{
  }
  public Content getContentByType(java.lang.String arg1, java.lang.String arg2){
    return (Content) null;
  }
}
