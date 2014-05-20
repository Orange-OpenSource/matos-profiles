package android.speech.srec;

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
public class WaveHeader
{
  // Fields

  public static final short FORMAT_PCM = 1;

  public static final short FORMAT_ALAW = 6;

  public static final short FORMAT_ULAW = 7;

  // Constructors

  public WaveHeader(){
  }
  public WaveHeader(short arg1, short arg2, int arg3, short arg4, int arg5){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int write(java.io.OutputStream arg1) throws java.io.IOException{
    return 0;
  }
  public int read(java.io.InputStream arg1) throws java.io.IOException{
    return 0;
  }
  public short getFormat(){
    return (short) 0;
  }
  public WaveHeader setFormat(short arg1){
    return (WaveHeader) null;
  }
  public int getSampleRate(){
    return 0;
  }
  public short getNumChannels(){
    return (short) 0;
  }
  public WaveHeader setNumChannels(short arg1){
    return (WaveHeader) null;
  }
  public WaveHeader setSampleRate(int arg1){
    return (WaveHeader) null;
  }
  public short getBitsPerSample(){
    return (short) 0;
  }
  public WaveHeader setBitsPerSample(short arg1){
    return (WaveHeader) null;
  }
  public int getNumBytes(){
    return 0;
  }
  public WaveHeader setNumBytes(int arg1){
    return (WaveHeader) null;
  }
}
