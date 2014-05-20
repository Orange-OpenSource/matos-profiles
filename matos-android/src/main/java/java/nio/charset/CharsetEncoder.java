package java.nio.charset;

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

import com.francetelecom.rd.stubs.annotation.Real;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@Real("com.francetelecom.rd.fakeandroid.CharsetEncoderImpl")
public abstract class CharsetEncoder
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  protected CharsetEncoder(Charset arg1, float arg2, float arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  protected CharsetEncoder(Charset arg1, float arg2, float arg3, byte [] arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  CharsetEncoder(Charset arg1, float arg2, float arg3, byte [] arg4, boolean arg5){
  }
  // Methods

  public final Charset charset(){
    return (Charset) null;
  }
  public final java.nio.ByteBuffer encode(java.nio.CharBuffer arg1) throws CharacterCodingException{
    return (java.nio.ByteBuffer) null;
  }
  public final CoderResult encode(java.nio.CharBuffer arg1, java.nio.ByteBuffer arg2, boolean arg3){
    return (CoderResult) null;
  }
  public final CoderResult flush(java.nio.ByteBuffer arg1){
    return (CoderResult) null;
  }
  public final CharsetEncoder reset(){
    return (CharsetEncoder) null;
  }
  public boolean canEncode(char arg1){
    return false;
  }
  public boolean canEncode(java.lang.CharSequence arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public final CharsetEncoder onMalformedInput(CodingErrorAction arg1){
    return (CharsetEncoder) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public final CharsetEncoder onUnmappableCharacter(CodingErrorAction arg1){
    return (CharsetEncoder) null;
  }
  protected CoderResult implFlush(java.nio.ByteBuffer arg1){
    return (CoderResult) null;
  }
  protected void implOnMalformedInput(CodingErrorAction arg1){
  }
  protected void implOnUnmappableCharacter(CodingErrorAction arg1){
  }
  protected void implReplaceWith(byte [] arg1){
  }
  protected void implReset(){
  }
  public CodingErrorAction malformedInputAction(){
    return (CodingErrorAction) null;
  }
  public final CharsetEncoder replaceWith(byte [] arg1){
    return (CharsetEncoder) null;
  }
  public final byte [] replacement(){
    return (byte []) null;
  }
  public CodingErrorAction unmappableCharacterAction(){
    return (CodingErrorAction) null;
  }
  public final float maxBytesPerChar(){
    return 0.0f;
  }
  protected abstract CoderResult encodeLoop(java.nio.CharBuffer arg1, java.nio.ByteBuffer arg2);
  public boolean isLegalReplacement(byte [] arg1){
    return false;
  }
  public final float averageBytesPerChar(){
    return 0.0f;
  }
}
