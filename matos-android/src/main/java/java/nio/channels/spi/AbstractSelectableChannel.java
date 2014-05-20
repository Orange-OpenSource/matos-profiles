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


public abstract class AbstractSelectableChannel
  extends java.nio.channels.SelectableChannel{
  // Constructors

  protected AbstractSelectableChannel(SelectorProvider arg1){
    super();
  }
  // Methods

  public final java.nio.channels.SelectionKey register(java.nio.channels.Selector arg1, int arg2, java.lang.Object arg3) throws java.nio.channels.ClosedChannelException{
    return (java.nio.channels.SelectionKey) null;
  }
  public final SelectorProvider provider(){
    return (SelectorProvider) null;
  }
  public final synchronized boolean isRegistered(){
    return false;
  }
  public final boolean isBlocking(){
    return false;
  }
  public final java.lang.Object blockingLock(){
    return (java.lang.Object) null;
  }
  public final synchronized java.nio.channels.SelectionKey keyFor(java.nio.channels.Selector arg1){
    return (java.nio.channels.SelectionKey) null;
  }
  protected final synchronized void implCloseChannel() throws java.io.IOException{
  }
  protected abstract void implCloseSelectableChannel() throws java.io.IOException;
  public final java.nio.channels.SelectableChannel configureBlocking(boolean arg1) throws java.io.IOException{
    return (java.nio.channels.SelectableChannel) null;
  }
  protected abstract void implConfigureBlocking(boolean arg1) throws java.io.IOException;
}
