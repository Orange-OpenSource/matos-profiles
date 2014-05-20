package android.preference;

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


public class PreferenceFrameLayout
  extends android.widget.FrameLayout{
  // Classes

  public static class LayoutParams
    extends android.widget.FrameLayout.LayoutParams  {
    // Fields

    public boolean removeBorders;

    // Constructors

    public LayoutParams(android.content.Context arg1, android.util.AttributeSet arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
    public LayoutParams(int arg1, int arg2){
      super((android.content.Context) null, (android.util.AttributeSet) null);
    }
  }
  // Constructors

  public PreferenceFrameLayout(android.content.Context arg1){
    super((android.content.Context) null);
  }
  public PreferenceFrameLayout(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  public PreferenceFrameLayout(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public PreferenceFrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet arg1){
    return (PreferenceFrameLayout.LayoutParams) null;
  }
  public void addView(android.view.View arg1){
  }
}
