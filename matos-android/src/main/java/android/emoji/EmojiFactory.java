package android.emoji;

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
public final class EmojiFactory
{
  // Constructors

  private EmojiFactory(int arg1, java.lang.String arg2){
  }
  // Methods

  public java.lang.String name(){
    return (java.lang.String) null;
  }
  protected void finalize() throws java.lang.Throwable{
  }
  public static EmojiFactory newInstance(java.lang.String arg1){
    return (EmojiFactory) null;
  }
  public synchronized android.graphics.Bitmap getBitmapFromAndroidPua(int arg1){
    return (android.graphics.Bitmap) null;
  }
  public synchronized android.graphics.Bitmap getBitmapFromVendorSpecificSjis(char arg1){
    return (android.graphics.Bitmap) null;
  }
  public synchronized android.graphics.Bitmap getBitmapFromVendorSpecificPua(int arg1){
    return (android.graphics.Bitmap) null;
  }
  public int getAndroidPuaFromVendorSpecificSjis(char arg1){
    return 0;
  }
  public int getVendorSpecificSjisFromAndroidPua(int arg1){
    return 0;
  }
  public int getAndroidPuaFromVendorSpecificPua(int arg1){
    return 0;
  }
  public java.lang.String getAndroidPuaFromVendorSpecificPua(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public int getVendorSpecificPuaFromAndroidPua(int arg1){
    return 0;
  }
  public java.lang.String getVendorSpecificPuaFromAndroidPua(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static EmojiFactory newAvailableInstance(){
    return (EmojiFactory) null;
  }
  public int getMinimumAndroidPua(){
    return 0;
  }
  public int getMaximumAndroidPua(){
    return 0;
  }
}
