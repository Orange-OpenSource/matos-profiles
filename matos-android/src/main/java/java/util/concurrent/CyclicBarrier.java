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


public class CyclicBarrier
{
  // Constructors

  public CyclicBarrier(int arg1, java.lang.Runnable arg2){
  }
  public CyclicBarrier(int arg1){
  }
  // Methods

  public void reset(){
  }
  public int await() throws java.lang.InterruptedException, BrokenBarrierException{
    return 0;
  }
  public int await(long arg1, TimeUnit arg2) throws java.lang.InterruptedException, BrokenBarrierException, TimeoutException{
    return 0;
  }
  public int getParties(){
    return 0;
  }
  public boolean isBroken(){
    return false;
  }
  public int getNumberWaiting(){
    return 0;
  }
}
