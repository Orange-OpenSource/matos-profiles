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
public abstract class Program
{
  // Constructors

  public Program(){
  }
  // Methods

  public void reset(){
  }
  public abstract void process(Frame [] arg1, Frame arg2);
  public void process(Frame arg1, Frame arg2){
  }
  public abstract void setHostValue(java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("hostValue") java.lang.Object arg2);
  @com.francetelecom.rd.stubs.annotation.FieldGet("hostValue")
  public abstract java.lang.Object getHostValue(java.lang.String arg1);
}
