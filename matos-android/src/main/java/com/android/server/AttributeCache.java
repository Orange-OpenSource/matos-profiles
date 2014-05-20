package com.android.server;

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


public final class AttributeCache
{
  // Classes

  public static final class Package
  {
    // Fields

    public final android.content.Context context = (android.content.Context) null;

    // Constructors

    public Package(android.content.Context arg1){
    }
  }
  public static final class Entry
  {
    // Fields

    public final android.content.Context context = (android.content.Context) null;

    public final android.content.res.TypedArray array = (android.content.res.TypedArray) null;

    // Constructors

    public Entry(android.content.Context arg1, android.content.res.TypedArray arg2){
    }
  }
  // Constructors

  public AttributeCache(android.content.Context arg1){
  }
  // Methods

  public AttributeCache.Entry get(java.lang.String arg1, int arg2, int [] arg3){
    return (AttributeCache.Entry) null;
  }
  public static void init(android.content.Context arg1){
  }
  public void updateConfiguration(android.content.res.Configuration arg1){
  }
  public static AttributeCache instance(){
    return (AttributeCache) null;
  }
  public void removePackage(java.lang.String arg1){
  }
}
