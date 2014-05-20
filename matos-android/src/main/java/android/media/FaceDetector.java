package android.media;

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
public class FaceDetector
{
  // Classes

  public class Face
  {
    // Fields

    public static final float CONFIDENCE_THRESHOLD = 0.4f;

    public static final int EULER_X = 0;

    public static final int EULER_Y = 1;

    public static final int EULER_Z = 2;

    // Constructors

    private Face(){
    }
    // Methods

    public float confidence(){
      return 0.0f;
    }
    public void getMidPoint(android.graphics.PointF arg1){
    }
    public float eyesDistance(){
      return 0.0f;
    }
    public float pose(int arg1){
      return 0.0f;
    }
  }
  // Constructors

  public FaceDetector(int arg1, int arg2, int arg3){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public int findFaces(android.graphics.Bitmap arg1, FaceDetector.Face [] arg2){
    return 0;
  }
}
