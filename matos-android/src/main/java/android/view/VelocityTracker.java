package android.view;

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
public final class VelocityTracker
  implements android.util.Poolable<VelocityTracker>
{
  // Classes

  public static final class Estimator
  {
    // Fields

    public final float [] xCoeff = (float []) null;

    public final float [] yCoeff = (float []) null;

    public int degree;

    public float confidence;

    // Constructors

    public Estimator(){
    }
    // Methods

    public float estimateX(float arg1){
      return 0.0f;
    }
    public float estimateY(float arg1){
      return 0.0f;
    }
  }
  // Constructors

  private VelocityTracker(){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public void clear(){
  }
  public static VelocityTracker obtain(){
    return (VelocityTracker) null;
  }
  public void recycle(){
  }
  public VelocityTracker getNextPoolable(){
    return (VelocityTracker) null;
  }
  public void setNextPoolable(VelocityTracker arg1){
  }
  public void setPooled(boolean arg1){
  }
  public boolean isPooled(){
    return false;
  }
  public void addMovement(MotionEvent arg1){
  }
  public void computeCurrentVelocity(int arg1){
  }
  public void computeCurrentVelocity(int arg1, float arg2){
  }
  public float getXVelocity(){
    return 0.0f;
  }
  public float getXVelocity(int arg1){
    return 0.0f;
  }
  public float getYVelocity(){
    return 0.0f;
  }
  public float getYVelocity(int arg1){
    return 0.0f;
  }
  public boolean getEstimator(int arg1, int arg2, int arg3, VelocityTracker.Estimator arg4){
    return false;
  }
}
