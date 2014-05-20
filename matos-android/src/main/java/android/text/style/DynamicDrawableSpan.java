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
public abstract class DynamicDrawableSpan
  extends ReplacementSpan{
  // Fields

  public static final int ALIGN_BOTTOM = 0;

  public static final int ALIGN_BASELINE = 1;

  protected final int mVerticalAlignment = 0;

  // Constructors

  public DynamicDrawableSpan(){
    super();
  }
  protected DynamicDrawableSpan(int arg1){
    super();
  }
  // Methods

  public int getSize(android.graphics.Paint arg1, java.lang.CharSequence arg2, int arg3, int arg4, android.graphics.Paint.FontMetricsInt arg5){
    return 0;
  }
  public void draw(android.graphics.Canvas arg1, java.lang.CharSequence arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, android.graphics.Paint arg9){
  }
  public abstract android.graphics.drawable.Drawable getDrawable();
  public int getVerticalAlignment(){
    return 0;
  }
}
