package java.sql;

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


public class Timestamp
  extends java.util.Date{
  // Constructors

  public Timestamp(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws java.lang.IllegalArgumentException{
    super();
  }
  public Timestamp(long arg1){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public boolean equals(Timestamp arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int compareTo(java.util.Date arg1) throws java.lang.ClassCastException{
    return 0;
  }
  public int compareTo(Timestamp arg1){
    return 0;
  }
  public static Timestamp valueOf(java.lang.String arg1) throws java.lang.IllegalArgumentException{
    return (Timestamp) null;
  }
  public boolean after(Timestamp arg1){
    return false;
  }
  public boolean before(Timestamp arg1){
    return false;
  }
  public long getTime(){
    return 0l;
  }
  public void setTime(long arg1){
  }
  public int getNanos(){
    return 0;
  }
  public void setNanos(int arg1) throws java.lang.IllegalArgumentException{
  }
}
