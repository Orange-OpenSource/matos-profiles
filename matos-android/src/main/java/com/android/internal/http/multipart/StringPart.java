package com.android.internal.http.multipart;

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


public class StringPart
  extends PartBase{
  // Fields

  public static final java.lang.String DEFAULT_CONTENT_TYPE = "text/plain";

  public static final java.lang.String DEFAULT_CHARSET = "US-ASCII";

  public static final java.lang.String DEFAULT_TRANSFER_ENCODING = "8bit";

  // Constructors

  public StringPart(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
    super((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null);
  }
  public StringPart(java.lang.String arg1, java.lang.String arg2){
    super((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null);
  }
  // Methods

  protected void sendData(java.io.OutputStream arg1) throws java.io.IOException{
  }
  protected long lengthOfData(){
    return 0l;
  }
  public void setCharSet(java.lang.String arg1){
  }
}
