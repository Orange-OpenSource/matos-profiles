package android.graphics;

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
public class Typeface
{
  // Fields

  public static final Typeface DEFAULT = null;

  public static final Typeface DEFAULT_BOLD = null;

  public static final Typeface SANS_SERIF = null;

  public static final Typeface SERIF = null;

  public static final Typeface MONOSPACE = null;

  public static final int NORMAL = 0;

  public static final int BOLD = 1;

  public static final int ITALIC = 2;

  public static final int BOLD_ITALIC = 3;

  // Constructors

  private Typeface(int arg1){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public static Typeface create(java.lang.String arg1, int arg2){
    return (Typeface) null;
  }
  public static Typeface create(Typeface arg1, int arg2){
    return (Typeface) null;
  }
  public int getStyle(){
    return 0;
  }
  public static Typeface createFromAsset(android.content.res.AssetManager arg1, java.lang.String arg2){
    return (Typeface) null;
  }
  public static Typeface createFromFile(java.io.File arg1){
    return (Typeface) null;
  }
  public static Typeface createFromFile(java.lang.String arg1){
    return (Typeface) null;
  }
  public static Typeface defaultFromStyle(int arg1){
    return (Typeface) null;
  }
  public final boolean isBold(){
    return false;
  }
  public final boolean isItalic(){
    return false;
  }
  public static void setGammaForText(float arg1, float arg2){
  }
}
