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


public abstract class Overlay
{
  // Fields

  protected long mStartTimeMs;

  protected long mDurationMs;

  // Constructors

  private Overlay(){
  }
  public Overlay(MediaItem arg1, java.lang.String arg2, long arg3, long arg4){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.String getId(){
    return (java.lang.String) null;
  }
  public long getStartTime(){
    return 0l;
  }
  public long getDuration(){
    return 0l;
  }
  public void setDuration(long arg1){
  }
  public void setStartTime(long arg1){
  }
  public void setStartTimeAndDuration(long arg1, long arg2){
  }
  public MediaItem getMediaItem(){
    return (MediaItem) null;
  }
  public void setUserAttribute(java.lang.String arg1, java.lang.String arg2){
  }
  public java.util.Map<java.lang.String, java.lang.String> getUserAttributes(){
    return (java.util.Map) null;
  }
}
