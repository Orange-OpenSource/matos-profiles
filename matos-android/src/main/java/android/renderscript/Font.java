package android.renderscript;

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


public class Font
  extends BaseObj{
  // Classes

  public static enum Style
  {
    // Enum Constants

    NORMAL()
, BOLD()
, ITALIC()
, BOLD_ITALIC()
;
    // Fields

    // Constructors

    private Style(){
    }
    // Methods

  }
  // Constructors

  Font(int arg1, RenderScript arg2){
    super(0, (RenderScript) null);
  }
  // Methods

  public static Font create(RenderScript arg1, android.content.res.Resources arg2, java.lang.String arg3, Font.Style arg4, float arg5){
    return (Font) null;
  }
  public static Font createFromResource(RenderScript arg1, android.content.res.Resources arg2, int arg3, float arg4){
    return (Font) null;
  }
  public static Font createFromAsset(RenderScript arg1, android.content.res.Resources arg2, java.lang.String arg3, float arg4){
    return (Font) null;
  }
  public static Font createFromFile(RenderScript arg1, android.content.res.Resources arg2, java.lang.String arg3, float arg4){
    return (Font) null;
  }
  public static Font createFromFile(RenderScript arg1, android.content.res.Resources arg2, java.io.File arg3, float arg4){
    return (Font) null;
  }
}
