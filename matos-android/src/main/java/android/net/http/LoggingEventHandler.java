package android.net.http;

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
public class LoggingEventHandler
  implements EventHandler
{
  // Constructors

  public LoggingEventHandler(){
  }
  // Methods

  public void error(int arg1, java.lang.String arg2){
  }
  public void status(int arg1, int arg2, int arg3, java.lang.String arg4){
  }
  public void data(byte [] arg1, int arg2){
  }
  public void headers(Headers arg1){
  }
  public void certificate(SslCertificate arg1){
  }
  public void endData(){
  }
  public boolean handleSslErrorRequest(SslError arg1){
    return false;
  }
  public void requestSent(){
  }
  public void locationChanged(java.lang.String arg1, boolean arg2){
  }
}
