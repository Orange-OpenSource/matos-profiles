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


public class MediaImageItem
  extends MediaItem{
  // Constructors

  private MediaImageItem() throws java.io.IOException{
    super((VideoEditor) null, (java.lang.String) null, (java.lang.String) null, 0);
  }
  public MediaImageItem(VideoEditor arg1, java.lang.String arg2, java.lang.String arg3, long arg4, int arg5) throws java.io.IOException{
    super((VideoEditor) null, (java.lang.String) null, (java.lang.String) null, 0);
  }
  // Methods

  public android.graphics.Bitmap getThumbnail(int arg1, int arg2, long arg3) throws java.io.IOException{
    return (android.graphics.Bitmap) null;
  }
  public long getDuration(){
    return 0l;
  }
  public long getTimelineDuration(){
    return 0l;
  }
  public int getWidth(){
    return 0;
  }
  public int getHeight(){
    return 0;
  }
  public void setDuration(long arg1){
  }
  public int getFileType(){
    return 0;
  }
  public int getAspectRatio(){
    return 0;
  }
  public void getThumbnailList(int arg1, int arg2, long arg3, long arg4, int arg5, int [] arg6, MediaItem.GetThumbnailListCallback arg7) throws java.io.IOException{
  }
  public int getScaledWidth(){
    return 0;
  }
  public int getScaledHeight(){
    return 0;
  }
}
