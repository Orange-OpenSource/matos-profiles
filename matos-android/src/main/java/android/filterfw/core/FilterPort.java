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


public abstract class FilterPort
{
  // Fields

  protected Filter mFilter;

  protected java.lang.String mName;

  protected FrameFormat mPortFormat;

  protected boolean mIsBlocking;

  protected boolean mIsOpen;

  protected boolean mChecksType;

  // Constructors

  public FilterPort(Filter arg1, java.lang.String arg2){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public abstract void clear();
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public void close(){
  }
  public void open(){
  }
  public boolean isOpen(){
    return false;
  }
  public Filter getFilter(){
    return (Filter) null;
  }
  public abstract void pushFrame(Frame arg1);
  public abstract boolean filterMustClose();
  public abstract boolean isReady();
  public abstract void setFrame(Frame arg1);
  public abstract Frame pullFrame();
  public abstract boolean hasFrame();
  public boolean isBlocking(){
    return false;
  }
  protected void assertPortIsOpen(){
  }
  public boolean isAttached(){
    return false;
  }
  public FrameFormat getPortFormat(){
    return (FrameFormat) null;
  }
  public void setPortFormat(FrameFormat arg1){
  }
  public void setBlocking(boolean arg1){
  }
  public void setChecksType(boolean arg1){
  }
  protected void checkFrameType(Frame arg1, boolean arg2){
  }
  protected void checkFrameManager(Frame arg1, FilterContext arg2){
  }
}
