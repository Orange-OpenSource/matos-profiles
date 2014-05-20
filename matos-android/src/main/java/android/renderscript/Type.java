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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class Type
  extends BaseObj{
  // Classes

  public static enum CubemapFace
  {
    // Enum Constants

    POSITIVE_X(0)
, NEGATIVE_X(0)
, POSITIVE_Y(0)
, NEGATIVE_Y(0)
, POSITIVE_Z(0)
, NEGATIVE_Z(0)
, POSITVE_X(0)
, POSITVE_Y(0)
, POSITVE_Z(0)
;
    // Fields

    // Constructors

    private CubemapFace(int arg1){
    }
    // Methods

  }
  public static class Builder
  {
    // Constructors

    public Builder(RenderScript arg1, Element arg2){
    }
    // Methods

    public Type create(){
      return (Type) null;
    }
    public Type.Builder setX(int arg1){
      return (Type.Builder) null;
    }
    public Type.Builder setY(int arg1){
      return (Type.Builder) null;
    }
    public Type.Builder setMipmaps(boolean arg1){
      return (Type.Builder) null;
    }
    public Type.Builder setFaces(boolean arg1){
      return (Type.Builder) null;
    }
  }
  // Constructors

  Type(int arg1, RenderScript arg2){
    super(0, (RenderScript) null);
  }
  // Methods

  public int getCount(){
    return 0;
  }
  public int getX(){
    return 0;
  }
  public int getY(){
    return 0;
  }
  public Element getElement(){
    return (Element) null;
  }
  public int getZ(){
    return 0;
  }
  public boolean hasMipmaps(){
    return false;
  }
  public boolean hasFaces(){
    return false;
  }
}
