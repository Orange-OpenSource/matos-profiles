package javax.xml.transform.stream;

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


public class StreamSource
  implements javax.xml.transform.Source
{
  // Fields

  public static final java.lang.String FEATURE = "http://javax.xml.transform.stream.StreamSource/feature";

  // Constructors

  public StreamSource(){
  }
  public StreamSource(java.io.InputStream arg1){
  }
  public StreamSource(java.io.InputStream arg1, java.lang.String arg2){
  }
  public StreamSource(java.io.Reader arg1){
  }
  public StreamSource(java.io.Reader arg1, java.lang.String arg2){
  }
  public StreamSource(java.lang.String arg1){
  }
  public StreamSource(java.io.File arg1){
  }
  // Methods

  public java.io.InputStream getInputStream(){
    return (java.io.InputStream) null;
  }
  public java.lang.String getPublicId(){
    return (java.lang.String) null;
  }
  public java.lang.String getSystemId(){
    return (java.lang.String) null;
  }
  public void setSystemId(java.lang.String arg1){
  }
  public void setSystemId(java.io.File arg1){
  }
  public void setPublicId(java.lang.String arg1){
  }
  public java.io.Reader getReader(){
    return (java.io.Reader) null;
  }
  public void setInputStream(java.io.InputStream arg1){
  }
  public void setReader(java.io.Reader arg1){
  }
}
