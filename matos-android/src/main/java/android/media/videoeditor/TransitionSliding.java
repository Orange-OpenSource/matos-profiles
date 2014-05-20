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

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class TransitionSliding
  extends Transition{
  // Fields

  public static final int DIRECTION_RIGHT_OUT_LEFT_IN = 0;

  public static final int DIRECTION_LEFT_OUT_RIGHT_IN = 1;

  public static final int DIRECTION_TOP_OUT_BOTTOM_IN = 2;

  public static final int DIRECTION_BOTTOM_OUT_TOP_IN = 3;

  // Constructors

  private TransitionSliding(){
    super((java.lang.String) null, (MediaItem) null, (MediaItem) null, 0l, 0);
  }
  public TransitionSliding(@com.francetelecom.rd.stubs.annotation.FieldSet("mId") java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("beforeMediaItem") MediaItem arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("afterMediaItem") MediaItem arg3, long arg4, int arg5, int arg6){
    super((java.lang.String) null, (MediaItem) null, (MediaItem) null, 0l, 0);
  }
  // Methods

  public int getDirection(){
    return 0;
  }
}
