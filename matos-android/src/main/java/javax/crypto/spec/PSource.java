package javax.crypto.spec;

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


public class PSource
{
  // Classes

  public static final class PSpecified
    extends PSource  {
    // Fields

    public static final PSource.PSpecified DEFAULT = null;

    // Constructors

    private PSpecified(){
      super((java.lang.String) null);
    }
    public PSpecified(byte [] arg1){
      super((java.lang.String) null);
    }
    // Methods

    public byte [] getValue(){
      return (byte []) null;
    }
  }
  // Constructors

  private PSource(){
  }
  protected PSource(java.lang.String arg1){
  }
  // Methods

  public java.lang.String getAlgorithm(){
    return (java.lang.String) null;
  }
}
