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
public class SurfaceTexture
{
  // Classes

  public static interface OnFrameAvailableListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("onFrameAvailable")
    public void onFrameAvailable(SurfaceTexture arg1);
  }
  public static class OutOfResourcesException
    extends java.lang.Exception  {
    // Constructors

    public OutOfResourcesException(){
      super();
    }
    public OutOfResourcesException(java.lang.String arg1){
      super();
    }
  }
  // Constructors

  public SurfaceTexture(int arg1){
  }
  public SurfaceTexture(int arg1, boolean arg2){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public void release(){
  }
  public long getTimestamp(){
    return 0l;
  }
  public void setOnFrameAvailableListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onFrameAvailable") SurfaceTexture.OnFrameAvailableListener arg1){
  }
  public void updateTexImage(){
  }
  public void getTransformMatrix(float [] arg1){
  }
  public void setDefaultBufferSize(int arg1, int arg2){
  }
}
