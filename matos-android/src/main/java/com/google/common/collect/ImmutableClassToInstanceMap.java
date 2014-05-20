package com.google.common.collect;

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


public final class ImmutableClassToInstanceMap<B>
  extends ForwardingMap<java.lang.Class<? extends B>, B>  implements ClassToInstanceMap<B>
{
  // Classes

  public static final class Builder<B>
  {
    // Constructors

    public Builder(){
    }
    // Methods

    public <T extends B>ImmutableClassToInstanceMap.Builder<B> put(java.lang.Class<T> arg1, T arg2){
      return (ImmutableClassToInstanceMap.Builder) null;
    }
    public <T extends B>ImmutableClassToInstanceMap.Builder<B> putAll(java.util.Map<? extends java.lang.Class<? extends T>, ? extends T> arg1){
      return (ImmutableClassToInstanceMap.Builder) null;
    }
    public ImmutableClassToInstanceMap<B> build(){
      return (ImmutableClassToInstanceMap) null;
    }
  }
  // Constructors

  private ImmutableClassToInstanceMap(ImmutableMap<java.lang.Class<? extends B>, B> arg1){
    super();
  }
  // Methods

  public static <B, S extends B>ImmutableClassToInstanceMap<B> copyOf(java.util.Map<? extends java.lang.Class<? extends S>, ? extends S> arg1){
    return (ImmutableClassToInstanceMap) null;
  }
  public <T extends B>T getInstance(java.lang.Class<T> arg1){
    return null;
  }
  protected java.util.Map<java.lang.Class<? extends B>, B> delegate(){
    return (java.util.Map) null;
  }
  public <T extends B>T putInstance(java.lang.Class<T> arg1, T arg2){
    return null;
  }
  public static <B>ImmutableClassToInstanceMap.Builder<B> builder(){
    return (ImmutableClassToInstanceMap.Builder) null;
  }
}
