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
public abstract class Transition
{
  // Fields

  public static final int BEHAVIOR_SPEED_UP = 0;

  public static final int BEHAVIOR_SPEED_DOWN = 1;

  public static final int BEHAVIOR_LINEAR = 2;

  public static final int BEHAVIOR_MIDDLE_SLOW = 3;

  public static final int BEHAVIOR_MIDDLE_FAST = 4;

  protected final int mBehavior = 0;

  protected long mDurationMs;

  protected java.lang.String mFilename;

  // Constructors

  private Transition(){
  }
  protected Transition(@com.francetelecom.rd.stubs.annotation.FieldSet("mId") java.lang.String arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("beforeMediaItem") MediaItem arg2, @com.francetelecom.rd.stubs.annotation.FieldSet("afterMediaItem") MediaItem arg3, long arg4, int arg5){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("mId")
  public java.lang.String getId(){
    return (java.lang.String) null;
  }
  public long getDuration(){
    return 0l;
  }
  public void setDuration(long arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("afterMediaItem")
  public MediaItem getAfterMediaItem(){
    return (MediaItem) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("beforeMediaItem")
  public MediaItem getBeforeMediaItem(){
    return (MediaItem) null;
  }
  public long getMaximumDuration(){
    return 0l;
  }
  public int getBehavior(){
    return 0;
  }
}
