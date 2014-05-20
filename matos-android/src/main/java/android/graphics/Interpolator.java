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
public class Interpolator
{
  // Classes

  public static enum Result
  {
    // Enum Constants

    NORMAL()
, FREEZE_START()
, FREEZE_END()
;
    // Fields

    // Constructors

    private Result(){
    }
    // Methods

  }
  // Constructors

  public Interpolator(int arg1){
  }
  public Interpolator(int arg1, int arg2){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public void reset(int arg1){
  }
  public void reset(int arg1, int arg2){
  }
  public Interpolator.Result timeToValues(float [] arg1){
    return (Interpolator.Result) null;
  }
  public Interpolator.Result timeToValues(int arg1, float [] arg2){
    return (Interpolator.Result) null;
  }
  public final int getKeyFrameCount(){
    return 0;
  }
  public final int getValueCount(){
    return 0;
  }
  public void setKeyFrame(int arg1, int arg2, float [] arg3){
  }
  public void setKeyFrame(int arg1, int arg2, float [] arg3, float [] arg4){
  }
  public void setRepeatMirror(float arg1, boolean arg2){
  }
}
