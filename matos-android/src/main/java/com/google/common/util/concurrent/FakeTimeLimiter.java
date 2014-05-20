package com.google.common.util.concurrent;

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


public class FakeTimeLimiter
  implements TimeLimiter
{
  // Constructors

  public FakeTimeLimiter(){
  }
  // Methods

  public <T>T newProxy(T arg1, java.lang.Class<T> arg2, long arg3, java.util.concurrent.TimeUnit arg4){
    return null;
  }
  public <T>T callWithTimeout(java.util.concurrent.Callable<T> arg1, long arg2, java.util.concurrent.TimeUnit arg3, boolean arg4) throws java.lang.Exception{
    return null;
  }
}
