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


public class ETC1
{
  // Fields

  public static final int ENCODED_BLOCK_SIZE = 8;

  public static final int DECODED_BLOCK_SIZE = 48;

  public static final int ETC_PKM_HEADER_SIZE = 16;

  public static final int ETC1_RGB8_OES = 36196;

  // Constructors

  public ETC1(){
  }
  // Methods

  public static boolean isValid(java.nio.Buffer arg1){
    return false;
  }
  public static int getWidth(java.nio.Buffer arg1){
    return 0;
  }
  public static int getHeight(java.nio.Buffer arg1){
    return 0;
  }
  public static void encodeBlock(java.nio.Buffer arg1, int arg2, java.nio.Buffer arg3){
  }
  public static void decodeBlock(java.nio.Buffer arg1, java.nio.Buffer arg2){
  }
  public static void formatHeader(java.nio.Buffer arg1, int arg2, int arg3){
  }
  public static void decodeImage(java.nio.Buffer arg1, java.nio.Buffer arg2, int arg3, int arg4, int arg5, int arg6){
  }
  public static int getEncodedDataSize(int arg1, int arg2){
    return 0;
  }
  public static void encodeImage(java.nio.Buffer arg1, int arg2, int arg3, int arg4, int arg5, java.nio.Buffer arg6){
  }
}
