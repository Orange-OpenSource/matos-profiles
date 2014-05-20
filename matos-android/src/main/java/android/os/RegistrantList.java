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
public class RegistrantList
{
  // Constructors

  public RegistrantList(){
  }
  // Methods

  public synchronized void add(Handler arg1, int arg2, java.lang.Object arg3){
  }
  public synchronized void add(Registrant arg1){
  }
  public synchronized java.lang.Object get(int arg1){
    return (java.lang.Object) null;
  }
  public synchronized int size(){
    return 0;
  }
  public synchronized void remove(Handler arg1){
  }
  public void notifyRegistrants(){
  }
  public void notifyRegistrants(AsyncResult arg1){
  }
  public synchronized void removeCleared(){
  }
  public synchronized void addUnique(Handler arg1, int arg2, java.lang.Object arg3){
  }
  public void notifyResult(java.lang.Object arg1){
  }
  public void notifyException(java.lang.Throwable arg1){
  }
}
