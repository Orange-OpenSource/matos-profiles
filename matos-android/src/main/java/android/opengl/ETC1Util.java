package android.opengl;

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


public class ETC1Util
{
  // Classes

  public static class ETC1Texture
  {
    // Constructors

    public ETC1Texture(int arg1, int arg2, java.nio.ByteBuffer arg3){
    }
    // Methods

    public java.nio.ByteBuffer getData(){
      return (java.nio.ByteBuffer) null;
    }
    public int getWidth(){
      return 0;
    }
    public int getHeight(){
      return 0;
    }
  }
  // Constructors

  public ETC1Util(){
  }
  // Methods

  public static void loadTexture(int arg1, int arg2, int arg3, int arg4, int arg5, java.io.InputStream arg6) throws java.io.IOException{
  }
  public static void loadTexture(int arg1, int arg2, int arg3, int arg4, int arg5, ETC1Util.ETC1Texture arg6){
  }
  public static boolean isETC1Supported(){
    return false;
  }
  public static ETC1Util.ETC1Texture createTexture(java.io.InputStream arg1) throws java.io.IOException{
    return (ETC1Util.ETC1Texture) null;
  }
  public static ETC1Util.ETC1Texture compressTexture(java.nio.Buffer arg1, int arg2, int arg3, int arg4, int arg5){
    return (ETC1Util.ETC1Texture) null;
  }
  public static void writeTexture(ETC1Util.ETC1Texture arg1, java.io.OutputStream arg2) throws java.io.IOException{
  }
}
