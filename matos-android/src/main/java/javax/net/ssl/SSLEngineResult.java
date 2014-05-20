package javax.net.ssl;

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


public class SSLEngineResult
{
  // Classes

  public static enum HandshakeStatus
  {
    // Enum Constants

    NOT_HANDSHAKING()
, FINISHED()
, NEED_TASK()
, NEED_WRAP()
, NEED_UNWRAP()
;
    // Fields

    // Constructors

    private HandshakeStatus(){
    }
    // Methods

  }
  public static enum Status
  {
    // Enum Constants

    BUFFER_OVERFLOW()
, BUFFER_UNDERFLOW()
, CLOSED()
, OK()
;
    // Fields

    // Constructors

    private Status(){
    }
    // Methods

  }
  // Constructors

  public SSLEngineResult(SSLEngineResult.Status arg1, SSLEngineResult.HandshakeStatus arg2, int arg3, int arg4){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public final SSLEngineResult.Status getStatus(){
    return (SSLEngineResult.Status) null;
  }
  public final SSLEngineResult.HandshakeStatus getHandshakeStatus(){
    return (SSLEngineResult.HandshakeStatus) null;
  }
  public final int bytesConsumed(){
    return 0;
  }
  public final int bytesProduced(){
    return 0;
  }
}
