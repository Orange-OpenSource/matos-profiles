package android.widget;

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
public class RatingBar
  extends AbsSeekBar{
  // Classes

  public static interface OnRatingBarChangeListener
  {
    // Methods

    @com.francetelecom.rd.stubs.annotation.CallBack("onRatingChanged")
    public void onRatingChanged(RatingBar arg1, float arg2, boolean arg3);
  }
  // Constructors

  public RatingBar(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  public RatingBar(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  public RatingBar(android.content.Context arg1){
    super((android.content.Context) null);
  }
  // Methods

  protected synchronized void onMeasure(int arg1, int arg2){
  }
  public boolean isIndicator(){
    return false;
  }
  public synchronized void setMax(int arg1){
  }
  public void setOnRatingBarChangeListener(@com.francetelecom.rd.stubs.annotation.FieldSet("changeListener") @com.francetelecom.rd.stubs.annotation.CallBackRegister("android.widget.RatingBar.OnRatingBarChangeListener.onRatingChanged") RatingBar.OnRatingBarChangeListener arg1){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("changeListener")
  public RatingBar.OnRatingBarChangeListener getOnRatingBarChangeListener(){
    return (RatingBar.OnRatingBarChangeListener) null;
  }
  public void setIsIndicator(boolean arg1){
  }
  public void setNumStars(int arg1){
  }
  public int getNumStars(){
    return 0;
  }
  public void setRating(float arg1){
  }
  public float getRating(){
    return 0.0f;
  }
  public void setStepSize(float arg1){
  }
  public float getStepSize(){
    return 0.0f;
  }
}
