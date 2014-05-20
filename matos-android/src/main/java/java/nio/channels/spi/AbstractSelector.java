package java.nio.channels.spi;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.AbstractSelectorImpl", superClass = "")
public abstract class AbstractSelector
  extends java.nio.channels.Selector{
  // Constructors

  protected AbstractSelector(SelectorProvider arg1){
    super();
  }
  // Methods

  protected abstract java.nio.channels.SelectionKey register(AbstractSelectableChannel arg1, int arg2, java.lang.Object arg3);
  public final SelectorProvider provider(){
    return (SelectorProvider) null;
  }
  public final void close() throws java.io.IOException{
  }
  public final boolean isOpen(){
    return false;
  }
  protected final void end(){
  }
  protected final void begin(){
  }
  protected final void deregister(AbstractSelectionKey arg1){
  }
  protected abstract void implCloseSelector() throws java.io.IOException;
  protected final java.util.Set<java.nio.channels.SelectionKey> cancelledKeys(){
    return (java.util.Set) null;
  }
}
