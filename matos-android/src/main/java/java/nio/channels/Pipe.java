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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.PipeImpl", superClass = "")
public abstract class Pipe
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.PipeSinkChannelImpl", superClass = "")
  public abstract static class SinkChannel
    extends java.nio.channels.spi.AbstractSelectableChannel    implements GatheringByteChannel, WritableByteChannel
  {
    // Constructors

    protected SinkChannel(java.nio.channels.spi.SelectorProvider arg1){
      super((java.nio.channels.spi.SelectorProvider) null);
    }
    // Methods

    public final int validOps(){
      return 0;
    }
  }
  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.PipeSourceChannelImpl", superClass = "")
  public abstract static class SourceChannel
    extends java.nio.channels.spi.AbstractSelectableChannel    implements ScatteringByteChannel, ReadableByteChannel
  {
    // Constructors

    protected SourceChannel(java.nio.channels.spi.SelectorProvider arg1){
      super((java.nio.channels.spi.SelectorProvider) null);
    }
    // Methods

    public final int validOps(){
      return 0;
    }
  }
  // Constructors

  protected Pipe(){
  }
  // Methods

  public static Pipe open() throws java.io.IOException{
    return (Pipe) null;
  }
  public abstract Pipe.SourceChannel source();
  public abstract Pipe.SinkChannel sink();
}
