package android.os;

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
public abstract class CountDownTimer
{
  // Constructors

  public CountDownTimer(long arg1, long arg2){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.Code({"onTick(com.francetelecom.rd.stubs.Generator.longValue());", "onFinish();", "return this;"})
  public final synchronized CountDownTimer start(){
    return (CountDownTimer) null;
  }
  public final void cancel(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onChange")
  public abstract void onTick(long arg1);
  @com.francetelecom.rd.stubs.annotation.CallBack("onChange")
  public abstract void onFinish();
}
