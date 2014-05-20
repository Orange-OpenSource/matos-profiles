package android.media.effect;

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

import com.francetelecom.rd.stubs.annotation.Accumulator;
import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.FieldSet;

@Accumulator
public abstract class Effect
{
  // Constructors

  public Effect(){
  }
  // Methods

  public abstract java.lang.String getName();
  public abstract void release();
  public abstract void setParameter(java.lang.String arg1,@FieldSet("param") java.lang.Object arg2);
  public abstract void apply(int arg1, int arg2, int arg3, int arg4);
  @Code("arg1.onEffectUpdated(this, param);")
  public void setUpdateListener( EffectUpdateListener arg1){
  }
}
