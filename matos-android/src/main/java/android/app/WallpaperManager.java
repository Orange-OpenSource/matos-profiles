package android.app;

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
public class WallpaperManager
{
  // Fields

  public static final java.lang.String ACTION_LIVE_WALLPAPER_CHOOSER = "android.service.wallpaper.LIVE_WALLPAPER_CHOOSER";

  public static final java.lang.String WALLPAPER_PREVIEW_META_DATA = "android.wallpaper.preview";

  public static final java.lang.String COMMAND_TAP = "android.wallpaper.tap";

  public static final java.lang.String COMMAND_SECONDARY_TAP = "android.wallpaper.secondaryTap";

  public static final java.lang.String COMMAND_DROP = "android.home.drop";

  // Constructors

  WallpaperManager(android.content.Context arg1, android.os.Handler arg2){
  }
  // Methods

  public void clear() throws java.io.IOException{
  }
  public static WallpaperManager getInstance(android.content.Context arg1){
    return (WallpaperManager) null;
  }
  public android.graphics.Bitmap getBitmap(){
    return (android.graphics.Bitmap) null;
  }
  public android.graphics.drawable.Drawable getDrawable(){
    return (android.graphics.drawable.Drawable) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WallpaperManager.setBitmap", report = "-")
  public void setBitmap(android.graphics.Bitmap arg1) throws java.io.IOException{
  }
  public int getDesiredMinimumWidth(){
    return 0;
  }
  public int getDesiredMinimumHeight(){
    return 0;
  }
  public WallpaperInfo getWallpaperInfo(){
    return (WallpaperInfo) null;
  }
  public void sendWallpaperCommand(android.os.IBinder arg1, java.lang.String arg2, int arg3, int arg4, int arg5, android.os.Bundle arg6){
  }
  public android.graphics.drawable.Drawable peekDrawable(){
    return (android.graphics.drawable.Drawable) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WallpaperManager.setStream", report = "-")
  public void setStream(java.io.InputStream arg1) throws java.io.IOException{
  }
  public void forgetLoadedWallpaper(){
  }
  public IWallpaperManager getIWallpaperManager(){
    return (IWallpaperManager) null;
  }
  public android.graphics.drawable.Drawable getFastDrawable(){
    return (android.graphics.drawable.Drawable) null;
  }
  public android.graphics.drawable.Drawable peekFastDrawable(){
    return (android.graphics.drawable.Drawable) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "WallpaperManager.setResource", report = "-")
  public void setResource(int arg1) throws java.io.IOException{
  }
  public void suggestDesiredDimensions(int arg1, int arg2){
  }
  public void setWallpaperOffsets(android.os.IBinder arg1, float arg2, float arg3){
  }
  public void setWallpaperOffsetSteps(float arg1, float arg2){
  }
  public void clearWallpaperOffsets(android.os.IBinder arg1){
  }
}
