package android.graphics;

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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class Shader
{
  // Classes

  public static enum TileMode
  {
    // Enum Constants

    CLAMP(0)
, REPEAT(0)
, MIRROR(0)
;
    // Fields

    // Constructors

    private TileMode(int arg1){
    }
    // Methods

  }
  // Fields

  public int native_instance;

  public int native_shader;

  // Constructors

  public Shader(){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public boolean getLocalMatrix(Matrix arg1){
    return false;
  }
  public void setLocalMatrix(Matrix arg1){
  }
}
