package java.io;

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


public class LineNumberInputStream
  extends FilterInputStream{
  // Constructors

  public LineNumberInputStream(InputStream arg1){
    super((InputStream) null);
  }
  // Methods

  public int getLineNumber(){
    return 0;
  }
  public void mark(int arg1){
  }
  public void reset() throws IOException{
  }
  public int read() throws IOException{
    return 0;
  }
  public int read(byte [] arg1, int arg2, int arg3) throws IOException{
    return 0;
  }
  public int available() throws IOException{
    return 0;
  }
  public long skip(long arg1) throws IOException{
    return 0l;
  }
  public void setLineNumber(int arg1){
  }
}
