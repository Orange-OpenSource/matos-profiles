package android.util;

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


public final class JsonReader
  implements java.io.Closeable
{
  // Constructors

  public JsonReader(java.io.Reader arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public boolean hasNext() throws java.io.IOException{
    return false;
  }
  public void close() throws java.io.IOException{
  }
  public int nextInt() throws java.io.IOException{
    return 0;
  }
  public JsonToken peek() throws java.io.IOException{
    return (JsonToken) null;
  }
  public double nextDouble() throws java.io.IOException{
    return 0.0d;
  }
  public long nextLong() throws java.io.IOException{
    return 0l;
  }
  public void setLenient(boolean arg1){
  }
  public boolean isLenient(){
    return false;
  }
  public void beginArray() throws java.io.IOException{
  }
  public void endArray() throws java.io.IOException{
  }
  public void beginObject() throws java.io.IOException{
  }
  public void endObject() throws java.io.IOException{
  }
  public java.lang.String nextName() throws java.io.IOException{
    return (java.lang.String) null;
  }
  public java.lang.String nextString() throws java.io.IOException{
    return (java.lang.String) null;
  }
  public boolean nextBoolean() throws java.io.IOException{
    return false;
  }
  public void nextNull() throws java.io.IOException{
  }
  public void skipValue() throws java.io.IOException{
  }
}
