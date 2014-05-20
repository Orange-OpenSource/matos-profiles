package sun.misc;

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
public final class Unsafe
{
  // Constructors

  private Unsafe(){
  }
  // Methods

  public void park(boolean arg1, long arg2){
  }
  public void unpark(java.lang.Object arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Unsafe.getObject", pos = {1, 2}, report = "-")
  public java.lang.Object getObject(java.lang.Object arg1, long arg2){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Unsafe.putObject", pos = {1, 2, 3}, report = "-")
  public void putObject(java.lang.Object arg1, long arg2, java.lang.Object arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Unsafe.getInt", pos = {1, 2}, report = "-")
  public int getInt(java.lang.Object arg1, long arg2){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Unsafe.putInt", pos = {1, 2}, report = "-")
  public void putInt(java.lang.Object arg1, long arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Unsafe.getLong", pos = {1, 2}, report = "-")
  public long getLong(java.lang.Object arg1, long arg2){
    return 0l;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Unsafe.putLong", pos = {1, 2}, report = "-")
  public void putLong(java.lang.Object arg1, long arg2, long arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Unsafe.getObjectVolatile", pos = {1, 2}, report = "-")
  public java.lang.Object getObjectVolatile(java.lang.Object arg1, long arg2){
    return (java.lang.Object) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Unsafe.putObjectVolatile", pos = {1, 2, 3}, report = "-")
  public void putObjectVolatile(java.lang.Object arg1, long arg2, java.lang.Object arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Unsafe.getIntVolatile", pos = {1, 2}, report = "-")
  public int getIntVolatile(java.lang.Object arg1, long arg2){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Unsafe.putIntVolatile", pos = {1, 2}, report = "-")
  public void putIntVolatile(java.lang.Object arg1, long arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Unsafe.getLongVolatile", pos = {1, 2}, report = "-")
  public long getLongVolatile(java.lang.Object arg1, long arg2){
    return 0l;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Unsafe.putLongVolatile", pos = {1, 2}, report = "-")
  public void putLongVolatile(java.lang.Object arg1, long arg2, long arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Unsafe.compareAndSwapObject", pos = {1, 2, 3, 4}, report = "-")
  public boolean compareAndSwapObject(java.lang.Object arg1, long arg2, java.lang.Object arg3, java.lang.Object arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Unsafe.compareAndSwapLong", pos = {1, 2}, report = "-")
  public boolean compareAndSwapLong(java.lang.Object arg1, long arg2, long arg3, long arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Unsafe.compareAndSwapInt", pos = {1, 2}, report = "-")
  public boolean compareAndSwapInt(java.lang.Object arg1, long arg2, int arg3, int arg4){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Unsafe.putOrderedObject", pos = {1, 2}, report = "-")
  public void putOrderedObject(java.lang.Object arg1, long arg2, java.lang.Object arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Unsafe.putOrderedLong", pos = {1, 2}, report = "-")
  public void putOrderedLong(java.lang.Object arg1, long arg2, long arg3){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Unsafe.putOrderedInt", pos = {1, 2}, report = "-")
  public void putOrderedInt(java.lang.Object arg1, long arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Unsafe.getUnsafe", report = "-")
  public static Unsafe getUnsafe(){
    return (Unsafe) null;
  }
  public int arrayBaseOffset(java.lang.Class arg1){
    return 0;
  }
  public int arrayIndexScale(java.lang.Class arg1){
    return 0;
  }
  public long objectFieldOffset(java.lang.reflect.Field arg1){
    return 0l;
  }
}
