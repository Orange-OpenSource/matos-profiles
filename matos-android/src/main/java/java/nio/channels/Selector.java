package java.nio.channels;

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


public abstract class Selector
{
  // Constructors

  protected Selector(){
  }
  // Methods

  public abstract java.nio.channels.spi.SelectorProvider provider();
  public abstract void close() throws java.io.IOException;
  public abstract java.util.Set<SelectionKey> keys();
  public static Selector open() throws java.io.IOException{
    return (Selector) null;
  }
  public abstract boolean isOpen();
  public abstract int select() throws java.io.IOException;
  public abstract int select(long arg1) throws java.io.IOException;
  public abstract Selector wakeup();
  public abstract java.util.Set<SelectionKey> selectedKeys();
  public abstract int selectNow() throws java.io.IOException;
}
