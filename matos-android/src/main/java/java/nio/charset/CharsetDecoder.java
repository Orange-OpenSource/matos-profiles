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
@Real("com.francetelecom.rd.fakeandroid.CharsetDecoderImpl")
public abstract class CharsetDecoder
{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  protected CharsetDecoder(Charset arg1, float arg2, float arg3){
  }
  // Methods

  public final Charset charset(){
    return (Charset) null;
  }
  public final java.nio.CharBuffer decode(java.nio.ByteBuffer arg1) throws CharacterCodingException{
    return (java.nio.CharBuffer) null;
  }
  public final CoderResult decode(java.nio.ByteBuffer arg1, java.nio.CharBuffer arg2, boolean arg3){
    return (CoderResult) null;
  }
  public final CoderResult flush(java.nio.CharBuffer arg1){
    return (CoderResult) null;
  }
  public final CharsetDecoder reset(){
    return (CharsetDecoder) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
 public final CharsetDecoder onMalformedInput(CodingErrorAction arg1){
    return (CharsetDecoder) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public final CharsetDecoder onUnmappableCharacter(CodingErrorAction arg1){
    return (CharsetDecoder) null;
  }
  public final float maxCharsPerByte(){
    return 0.0f;
  }
  protected abstract CoderResult decodeLoop(java.nio.ByteBuffer arg1, java.nio.CharBuffer arg2);
  public final float averageCharsPerByte(){
    return 0.0f;
  }
  public Charset detectedCharset(){
    return (Charset) null;
  }
  protected CoderResult implFlush(java.nio.CharBuffer arg1){
    return (CoderResult) null;
  }
  protected void implOnMalformedInput(CodingErrorAction arg1){
  }
  protected void implOnUnmappableCharacter(CodingErrorAction arg1){
  }
  protected void implReplaceWith(java.lang.String arg1){
  }
  protected void implReset(){
  }
  public boolean isAutoDetecting(){
    return false;
  }
  public boolean isCharsetDetected(){
    return false;
  }
  public CodingErrorAction malformedInputAction(){
    return (CodingErrorAction) null;
  }
  public final CharsetDecoder replaceWith(java.lang.String arg1){
    return (CharsetDecoder) null;
  }
  public final java.lang.String replacement(){
    return (java.lang.String) null;
  }
  public CodingErrorAction unmappableCharacterAction(){
    return (CodingErrorAction) null;
  }
}
