package com.android.org.bouncycastle.crypto.digests;

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
public abstract class GeneralDigest
  implements com.android.org.bouncycastle.crypto.ExtendedDigest
{
  // Constructors

  protected GeneralDigest(){
  }
  protected GeneralDigest(GeneralDigest arg1){
  }
  // Methods

  public void reset(){
  }
  public void update(byte arg1){
  }
  public void update(byte [] arg1, int arg2, int arg3){
  }
  public void finish(){
  }
  protected abstract void processBlock();
  public int getByteLength(){
    return 0;
  }
  protected abstract void processWord(byte [] arg1, int arg2);
  protected abstract void processLength(long arg1);
}
