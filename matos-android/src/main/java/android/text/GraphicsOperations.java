package android.text;

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
public interface GraphicsOperations
  extends java.lang.CharSequence
{
  // Methods

  public float measureText(int arg1, int arg2, android.graphics.Paint arg3);
  public float getTextRunAdvances(int arg1, int arg2, int arg3, int arg4, int arg5, float [] arg6, int arg7, android.graphics.Paint arg8);
  public float getTextRunAdvances(int arg1, int arg2, int arg3, int arg4, int arg5, float [] arg6, int arg7, android.graphics.Paint arg8, int arg9);
  public int getTextWidths(int arg1, int arg2, float [] arg3, android.graphics.Paint arg4);
  public int getTextRunCursor(int arg1, int arg2, int arg3, int arg4, int arg5, android.graphics.Paint arg6);
  public void drawText(android.graphics.Canvas arg1, int arg2, int arg3, float arg4, float arg5, android.graphics.Paint arg6);
  public void drawTextRun(android.graphics.Canvas arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, android.graphics.Paint arg9);
}
