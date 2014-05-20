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
public abstract class InputPort
  extends FilterPort{
  // Fields

  protected OutputPort mSourcePort;

  // Constructors

  public InputPort(Filter arg1, java.lang.String arg2){
    super((Filter) null, (java.lang.String) null);
  }
  // Methods

  public void close(){
  }
  public abstract void transfer(FilterContext arg1);
  public void open(){
  }
  public boolean isConnected(){
    return false;
  }
  public java.lang.Object getTarget(){
    return (java.lang.Object) null;
  }
  public boolean filterMustClose(){
    return false;
  }
  public boolean isReady(){
    return false;
  }
  public boolean acceptsFrame(){
    return false;
  }
  public void setSourcePort(@com.francetelecom.rd.stubs.annotation.FieldSet("this.mSourcePort") OutputPort arg1){
  }
  public FrameFormat getSourceFormat(){
    return (FrameFormat) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mSourcePort")
  public OutputPort getSourcePort(){
    return (OutputPort) null;
  }
  public Filter getSourceFilter(){
    return (Filter) null;
  }
}
