package android.graphics.drawable;

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
public class AnimationDrawable
  extends DrawableContainer  implements Animatable, java.lang.Runnable
{
  // Constructors

  public AnimationDrawable(){
    super();
  }
  // Methods

  public void run(){
  }
  public void start(){
  }
  public void stop(){
  }
  public void inflate(android.content.res.Resources arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg2, android.util.AttributeSet arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public boolean setVisible(boolean arg1, boolean arg2){
    return false;
  }
  public int getDuration(int arg1){
    return 0;
  }
  public boolean isRunning(){
    return false;
  }
  public Drawable mutate(){
    return (Drawable) null;
  }
  public void unscheduleSelf(@com.francetelecom.rd.stubs.annotation.CallBackRegister("java.lang.Runnable.run") java.lang.Runnable arg1){
  }
  public Drawable getFrame(int arg1){
    return (Drawable) null;
  }
  public int getNumberOfFrames(){
    return 0;
  }
  public boolean isOneShot(){
    return false;
  }
  public void setOneShot(boolean arg1){
  }
  public void addFrame(Drawable arg1, int arg2){
  }
}
