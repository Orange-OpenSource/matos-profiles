package java.util.concurrent;

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
@com.francetelecom.rd.stubs.annotation.Field(type = "V", value = "result", modifier = 4)
public class FutureTask<V>
  implements RunnableFuture<V>
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.Code("try { result = arg1.call(); } catch (Exception e) {}")
  public FutureTask(Callable<V> arg1){
  }
  public FutureTask(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("result") V arg2){
  }
  // Methods

  public void run(){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("result")
  public V get() throws java.lang.InterruptedException, ExecutionException{
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("result")
  public V get(long arg1, TimeUnit arg2) throws java.lang.InterruptedException, ExecutionException, TimeoutException{
    return null;
  }
  protected void set(@com.francetelecom.rd.stubs.annotation.FieldSet("result") V arg1){
  }
  protected void done(){
  }
  public boolean cancel(boolean arg1){
    return false;
  }
  public boolean isDone(){
    return false;
  }
  public boolean isCancelled(){
    return false;
  }
  protected void setException(java.lang.Throwable arg1){
  }
  protected boolean runAndReset(){
    return false;
  }
}
