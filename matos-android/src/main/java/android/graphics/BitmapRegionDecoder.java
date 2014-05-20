package android.graphics;

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


public final class BitmapRegionDecoder
{
  // Constructors

  private BitmapRegionDecoder(int arg1){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public static BitmapRegionDecoder newInstance(byte [] arg1, int arg2, int arg3, boolean arg4) throws java.io.IOException{
    return (BitmapRegionDecoder) null;
  }
  public static BitmapRegionDecoder newInstance(java.io.FileDescriptor arg1, boolean arg2) throws java.io.IOException{
    return (BitmapRegionDecoder) null;
  }
  public static BitmapRegionDecoder newInstance(java.io.InputStream arg1, boolean arg2) throws java.io.IOException{
    return (BitmapRegionDecoder) null;
  }
  public static BitmapRegionDecoder newInstance(java.lang.String arg1, boolean arg2) throws java.io.IOException{
    return (BitmapRegionDecoder) null;
  }
  public int getWidth(){
    return 0;
  }
  public int getHeight(){
    return 0;
  }
  public void recycle(){
  }
  public final boolean isRecycled(){
    return false;
  }
  public Bitmap decodeRegion(Rect arg1, BitmapFactory.Options arg2){
    return (Bitmap) null;
  }
}
