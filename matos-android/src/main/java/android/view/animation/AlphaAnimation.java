package android.view.animation;

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
public class AlphaAnimation
  extends Animation{
  // Constructors

  public AlphaAnimation(android.content.Context arg1, android.util.AttributeSet arg2){
    super();
  }
  public AlphaAnimation(float arg1, float arg2){
    super();
  }
  // Methods

  protected void applyTransformation(float arg1, Transformation arg2){
  }
  public boolean willChangeTransformationMatrix(){
    return false;
  }
  public boolean willChangeBounds(){
    return false;
  }
  public boolean hasAlpha(){
    return false;
  }
}
