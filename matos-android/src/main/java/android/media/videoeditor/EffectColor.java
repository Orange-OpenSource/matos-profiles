package android.media.videoeditor;

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


public class EffectColor
  extends Effect{
  // Fields

  public static final int TYPE_COLOR = 1;

  public static final int TYPE_GRADIENT = 2;

  public static final int TYPE_SEPIA = 3;

  public static final int TYPE_NEGATIVE = 4;

  public static final int TYPE_FIFTIES = 5;

  public static final int GREEN = 65280;

  public static final int PINK = 16737996;

  public static final int GRAY = 8355711;

  // Constructors

  private EffectColor(){
    super((MediaItem) null, (java.lang.String) null, 0l, 0l);
  }
  public EffectColor(MediaItem arg1, java.lang.String arg2, long arg3, long arg4, int arg5, int arg6){
    super((MediaItem) null, (java.lang.String) null, 0l, 0l);
  }
  // Methods

  public int getType(){
    return 0;
  }
  public int getColor(){
    return 0;
  }
}
