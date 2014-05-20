package android.text.style;

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
public abstract class ReplacementSpan
  extends MetricAffectingSpan{
  // Constructors

  public ReplacementSpan(){
    super();
  }
  // Methods

  public abstract int getSize(android.graphics.Paint arg1, java.lang.CharSequence arg2, int arg3, int arg4, android.graphics.Paint.FontMetricsInt arg5);
  public abstract void draw(android.graphics.Canvas arg1, java.lang.CharSequence arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, android.graphics.Paint arg9);
  public void updateDrawState(android.text.TextPaint arg1){
  }
  public void updateMeasureState(android.text.TextPaint arg1){
  }
}
