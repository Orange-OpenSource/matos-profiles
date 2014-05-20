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
public class PathMeasure
{
  // Fields

  public static final int POSITION_MATRIX_FLAG = 1;

  public static final int TANGENT_MATRIX_FLAG = 2;

  // Constructors

  public PathMeasure(){
  }
  public PathMeasure(Path arg1, boolean arg2){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public float getLength(){
    return 0.0f;
  }
  public boolean isClosed(){
    return false;
  }
  public void setPath(Path arg1, boolean arg2){
  }
  public boolean getMatrix(float arg1, Matrix arg2, int arg3){
    return false;
  }
  public boolean getPosTan(float arg1, float [] arg2, float [] arg3){
    return false;
  }
  public boolean getSegment(float arg1, float arg2, Path arg3, boolean arg4){
    return false;
  }
  public boolean nextContour(){
    return false;
  }
}
