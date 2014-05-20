package java.lang;

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


public abstract class AbstractStringBuilder
{
  // Constructors

  AbstractStringBuilder(){
  }
  AbstractStringBuilder(int arg1){
  }
  AbstractStringBuilder(String arg1){
  }
  // Methods

  public String toString(){
    return (String) null;
  }
  public int indexOf(String arg1){
    return 0;
  }
  public int indexOf(String arg1, int arg2){
    return 0;
  }
  public char charAt(int arg1){
    return '\u0000';
  }
  public int codePointAt(int arg1){
    return 0;
  }
  public int codePointBefore(int arg1){
    return 0;
  }
  public int codePointCount(int arg1, int arg2){
    return 0;
  }
  public void getChars(int arg1, int arg2, char [] arg3, int arg4){
  }
  public int lastIndexOf(String arg1){
    return 0;
  }
  public int lastIndexOf(String arg1, int arg2){
    return 0;
  }
  public int length(){
    return 0;
  }
  public int offsetByCodePoints(int arg1, int arg2){
    return 0;
  }
  public CharSequence subSequence(int arg1, int arg2){
    return (CharSequence) null;
  }
  public String substring(int arg1){
    return (String) null;
  }
  public String substring(int arg1, int arg2){
    return (String) null;
  }
  public int capacity(){
    return 0;
  }
  public void ensureCapacity(int arg1){
  }
  public void setCharAt(int arg1, char arg2){
  }
  public void setLength(int arg1){
  }
  public void trimToSize(){
  }
}
