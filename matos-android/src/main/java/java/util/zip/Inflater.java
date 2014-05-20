package java.util.zip;

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


public class Inflater
{
  // Constructors

  public Inflater(){
  }
  public Inflater(boolean arg1){
  }
  // Methods

  protected void finalize(){
  }
  public synchronized void reset(){
  }
  public synchronized boolean finished(){
    return false;
  }
  public synchronized void end(){
  }
  public synchronized long getBytesWritten(){
    return 0l;
  }
  public synchronized void setInput(byte [] arg1){
  }
  public synchronized void setInput(byte [] arg1, int arg2, int arg3){
  }
  public int inflate(byte [] arg1) throws DataFormatException{
    return 0;
  }
  public synchronized int inflate(byte [] arg1, int arg2, int arg3) throws DataFormatException{
    return 0;
  }
  public synchronized boolean needsDictionary(){
    return false;
  }
  public synchronized boolean needsInput(){
    return false;
  }
  public synchronized int getAdler(){
    return 0;
  }
  public synchronized long getBytesRead(){
    return 0l;
  }
  public synchronized int getRemaining(){
    return 0;
  }
  public synchronized int getTotalIn(){
    return 0;
  }
  public synchronized int getTotalOut(){
    return 0;
  }
  public synchronized void setDictionary(byte [] arg1){
  }
  public synchronized void setDictionary(byte [] arg1, int arg2, int arg3){
  }
}
