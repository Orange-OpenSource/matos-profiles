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
public class StateListDrawable
  extends DrawableContainer{
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public StateListDrawable(){
    super();
  }
  // Methods

  public void inflate(android.content.res.Resources arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg2, android.util.AttributeSet arg3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public void addState(int [] arg1, Drawable arg2){
  }
  public Drawable mutate(){
    return (Drawable) null;
  }
  public boolean isStateful(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  protected boolean onStateChange(int [] arg1){
    return false;
  }
  public int getStateDrawableIndex(int [] arg1){
    return 0;
  }
  public int getStateCount(){
    return 0;
  }
  public Drawable getStateDrawable(int arg1){
    return (Drawable) null;
  }
  public int [] getStateSet(int arg1){
    return (int []) null;
  }
}
