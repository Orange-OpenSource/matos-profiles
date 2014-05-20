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

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class OutputPort
  extends FilterPort{
  // Fields

  protected InputPort mTargetPort;

  protected InputPort mBasePort;

  // Constructors

  public OutputPort(Filter arg1, java.lang.String arg2){
    super((Filter) null, (java.lang.String) null);
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public void clear(){
  }
  public void close(){
  }
  public void open(){
  }
  public boolean isConnected(){
    return false;
  }
  public void pushFrame(Frame arg1){
  }
  public void connectTo(InputPort arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mTargetPort")
  public InputPort getTargetPort(){
    return (InputPort) null;
  }
  public Filter getTargetFilter(){
    return (Filter) null;
  }
  public void setBasePort(@com.francetelecom.rd.stubs.annotation.FieldSet("this.mBasePort") InputPort arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mBasePort")
  public InputPort getBasePort(){
    return (InputPort) null;
  }
  public boolean filterMustClose(){
    return false;
  }
  public boolean isReady(){
    return false;
  }
  public void setFrame(Frame arg1){
  }
  public Frame pullFrame(){
    return (Frame) null;
  }
  public boolean hasFrame(){
    return false;
  }
}
