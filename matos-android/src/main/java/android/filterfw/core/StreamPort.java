package android.filterfw.core;

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


public class StreamPort
  extends InputPort{
  // Constructors

  public StreamPort(Filter arg1, java.lang.String arg2){
    super((Filter) null, (java.lang.String) null);
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void clear(){
  }
  public synchronized void transfer(FilterContext arg1){
  }
  public void pushFrame(Frame arg1){
  }
  public void setFrame(Frame arg1){
  }
  public synchronized Frame pullFrame(){
    return (Frame) null;
  }
  public synchronized boolean hasFrame(){
    return false;
  }
  protected synchronized void assignFrame(Frame arg1, boolean arg2){
  }
}
