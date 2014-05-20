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


public class ExecutorCompletionService<V>
  implements CompletionService<V>
{
  // Constructors

  public ExecutorCompletionService(Executor arg1){
  }
  public ExecutorCompletionService(Executor arg1, BlockingQueue<Future<V>> arg2){
  }
  // Methods

  public Future<V> poll(){
    return (Future) null;
  }
  public Future<V> poll(long arg1, TimeUnit arg2) throws java.lang.InterruptedException{
    return (Future) null;
  }
  public Future<V> take() throws java.lang.InterruptedException{
    return (Future) null;
  }
  public Future<V> submit(Callable<V> arg1){
    return (Future) null;
  }
  public Future<V> submit(java.lang.Runnable arg1, V arg2){
    return (Future) null;
  }
}
