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

import com.francetelecom.rd.stubs.annotation.Real;

@Real("com.francetelecom.rd.fakeandroid.FilterFWImpl")
public abstract class Filter
{
  // Constructors

  public Filter(java.lang.String arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public final java.lang.String getName(){
    return (java.lang.String) null;
  }
  public final void init() throws ProtocolException{
  }
  public void close(FilterContext arg1){
  }
  public void open(FilterContext arg1){
  }
  public boolean isOpen(){
    return false;
  }
  public abstract void process(FilterContext arg1);
  protected void prepare(FilterContext arg1){
  }
  public void tearDown(FilterContext arg1){
  }
  public abstract void setupPorts();
  public void fieldPortValueUpdated(java.lang.String arg1, FilterContext arg2){
  }
  public static final boolean isAvailable(java.lang.String arg1){
    return false;
  }
  protected void addMaskedInputPort(java.lang.String arg1, FrameFormat arg2){
  }
  protected final Frame pullInput(java.lang.String arg1){
    return (Frame) null;
  }
  public final void initWithValueMap(KeyValueMap arg1){
  }
  public final void initWithAssignmentString(java.lang.String arg1){
  }
  public final void initWithAssignmentList(java.lang.Object [] arg1){
  }
  public java.lang.String getFilterClassName(){
    return (java.lang.String) null;
  }
  public void setInputFrame(java.lang.String arg1, Frame arg2){
  }
  public final void setInputValue(java.lang.String arg1, java.lang.Object arg2){
  }
  protected void parametersUpdated(java.util.Set<java.lang.String> arg1){
  }
  protected void delayNextProcess(int arg1){
  }
  public FrameFormat getOutputFormat(java.lang.String arg1, FrameFormat arg2){
    return (FrameFormat) null;
  }
  public final FrameFormat getInputFormat(java.lang.String arg1){
    return (FrameFormat) null;
  }
  public final int getSleepDelay(){
    return 0;
  }
  public final int getNumberOfConnectedInputs(){
    return 0;
  }
  public final int getNumberOfConnectedOutputs(){
    return 0;
  }
  public final int getNumberOfInputs(){
    return 0;
  }
  public final int getNumberOfOutputs(){
    return 0;
  }
  public final InputPort getInputPort(java.lang.String arg1){
    return (InputPort) null;
  }
  public final OutputPort getOutputPort(java.lang.String arg1){
    return (OutputPort) null;
  }
  protected final void pushOutput(java.lang.String arg1, Frame arg2){
  }
  protected void transferInputPortFrame(java.lang.String arg1, FilterContext arg2){
  }
  protected void initProgramInputs(Program arg1, FilterContext arg2){
  }
  protected void addInputPort(java.lang.String arg1){
  }
  protected void addOutputPort(java.lang.String arg1, FrameFormat arg2){
  }
  protected void addOutputBasedOnInput(java.lang.String arg1, java.lang.String arg2){
  }
  protected void addFieldPort(java.lang.String arg1, java.lang.reflect.Field arg2, boolean arg3, boolean arg4){
  }
  protected void addProgramPort(java.lang.String arg1, java.lang.String arg2, java.lang.reflect.Field arg3, java.lang.Class arg4, boolean arg5){
  }
  protected void closeOutputPort(java.lang.String arg1){
  }
  protected void setWaitsOnInputPort(java.lang.String arg1, boolean arg2){
  }
  protected void setWaitsOnOutputPort(java.lang.String arg1, boolean arg2){
  }
}
