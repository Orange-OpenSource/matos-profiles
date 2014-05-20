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
public class Element
  extends BaseObj{
  // Classes

  public static enum DataType
  {
    // Enum Constants

    FLOAT_32(0, 0)
, FLOAT_64(0, 0)
, SIGNED_8(0, 0)
, SIGNED_16(0, 0)
, SIGNED_32(0, 0)
, SIGNED_64(0, 0)
, UNSIGNED_8(0, 0)
, UNSIGNED_16(0, 0)
, UNSIGNED_32(0, 0)
, UNSIGNED_64(0, 0)
, BOOLEAN(0, 0)
, UNSIGNED_5_6_5(0, 0)
, UNSIGNED_5_5_5_1(0, 0)
, UNSIGNED_4_4_4_4(0, 0)
, MATRIX_4X4(0, 0)
, MATRIX_3X3(0, 0)
, MATRIX_2X2(0, 0)
, RS_ELEMENT(0, 0)
, RS_TYPE(0, 0)
, RS_ALLOCATION(0, 0)
, RS_SAMPLER(0, 0)
, RS_SCRIPT(0, 0)
, RS_MESH(0, 0)
, RS_PROGRAM_FRAGMENT(0, 0)
, RS_PROGRAM_VERTEX(0, 0)
, RS_PROGRAM_RASTER(0, 0)
, RS_PROGRAM_STORE(0, 0)
;
    // Fields

    // Constructors

    private DataType(int arg1, int arg2){
    }
    // Methods

  }
  public static enum DataKind
  {
    // Enum Constants

    USER(0)
, PIXEL_L(0)
, PIXEL_A(0)
, PIXEL_LA(0)
, PIXEL_RGB(0)
, PIXEL_RGBA(0)
, PIXEL_DEPTH(0)
;
    // Fields

    // Constructors

    private DataKind(int arg1){
    }
    // Methods

  }
  public static class Builder
  {
    // Constructors

    public Builder(RenderScript arg1){
    }
    // Methods

    public Element.Builder add(Element arg1, java.lang.String arg2, int arg3){
      return (Element.Builder) null;
    }
    public Element.Builder add(Element arg1, java.lang.String arg2){
      return (Element.Builder) null;
    }
    public Element create(){
      return (Element) null;
    }
  }
  // Constructors

  Element(int arg1, RenderScript arg2, Element [] arg3, java.lang.String [] arg4, int [] arg5){
    super(0, (RenderScript) null);
  }
  Element(int arg1, RenderScript arg2, Element.DataType arg3, Element.DataKind arg4, boolean arg5, int arg6){
    super(0, (RenderScript) null);
  }
  Element(int arg1, RenderScript arg2){
    super(0, (RenderScript) null);
  }
  // Methods

  public static Element TYPE(RenderScript arg1){
    return (Element) null;
  }
  public static Element BOOLEAN(RenderScript arg1){
    return (Element) null;
  }
  public static Element MATRIX_4X4(RenderScript arg1){
    return (Element) null;
  }
  public static Element MATRIX_3X3(RenderScript arg1){
    return (Element) null;
  }
  public static Element MATRIX_2X2(RenderScript arg1){
    return (Element) null;
  }
  public static Element RGB_565(RenderScript arg1){
    return (Element) null;
  }
  public static Element ELEMENT(RenderScript arg1){
    return (Element) null;
  }
  public static Element MESH(RenderScript arg1){
    return (Element) null;
  }
  public boolean isComplex(){
    return false;
  }
  public static Element RGBA_8888(RenderScript arg1){
    return (Element) null;
  }
  public static Element RGB_888(RenderScript arg1){
    return (Element) null;
  }
  public static Element RGBA_5551(RenderScript arg1){
    return (Element) null;
  }
  public static Element RGBA_4444(RenderScript arg1){
    return (Element) null;
  }
  public static Element A_8(RenderScript arg1){
    return (Element) null;
  }
  public static Element createVector(RenderScript arg1, Element.DataType arg2, int arg3){
    return (Element) null;
  }
  public static Element F32_4(RenderScript arg1){
    return (Element) null;
  }
  public static Element F32_2(RenderScript arg1){
    return (Element) null;
  }
  public static Element F32_3(RenderScript arg1){
    return (Element) null;
  }
  public static Element U16(RenderScript arg1){
    return (Element) null;
  }
  public static Element U8(RenderScript arg1){
    return (Element) null;
  }
  public static Element F32(RenderScript arg1){
    return (Element) null;
  }
  public static Element SCRIPT(RenderScript arg1){
    return (Element) null;
  }
  public static Element I8(RenderScript arg1){
    return (Element) null;
  }
  public static Element I16(RenderScript arg1){
    return (Element) null;
  }
  public static Element U32(RenderScript arg1){
    return (Element) null;
  }
  public static Element I32(RenderScript arg1){
    return (Element) null;
  }
  public static Element U64(RenderScript arg1){
    return (Element) null;
  }
  public static Element I64(RenderScript arg1){
    return (Element) null;
  }
  public static Element F64(RenderScript arg1){
    return (Element) null;
  }
  public static Element ALLOCATION(RenderScript arg1){
    return (Element) null;
  }
  public static Element SAMPLER(RenderScript arg1){
    return (Element) null;
  }
  public static Element PROGRAM_FRAGMENT(RenderScript arg1){
    return (Element) null;
  }
  public static Element PROGRAM_VERTEX(RenderScript arg1){
    return (Element) null;
  }
  public static Element PROGRAM_RASTER(RenderScript arg1){
    return (Element) null;
  }
  public static Element PROGRAM_STORE(RenderScript arg1){
    return (Element) null;
  }
  public static Element F64_2(RenderScript arg1){
    return (Element) null;
  }
  public static Element F64_3(RenderScript arg1){
    return (Element) null;
  }
  public static Element F64_4(RenderScript arg1){
    return (Element) null;
  }
  public static Element U8_2(RenderScript arg1){
    return (Element) null;
  }
  public static Element U8_3(RenderScript arg1){
    return (Element) null;
  }
  public static Element U8_4(RenderScript arg1){
    return (Element) null;
  }
  public static Element I8_2(RenderScript arg1){
    return (Element) null;
  }
  public static Element I8_3(RenderScript arg1){
    return (Element) null;
  }
  public static Element I8_4(RenderScript arg1){
    return (Element) null;
  }
  public static Element U16_2(RenderScript arg1){
    return (Element) null;
  }
  public static Element U16_3(RenderScript arg1){
    return (Element) null;
  }
  public static Element U16_4(RenderScript arg1){
    return (Element) null;
  }
  public static Element I16_2(RenderScript arg1){
    return (Element) null;
  }
  public static Element I16_3(RenderScript arg1){
    return (Element) null;
  }
  public static Element I16_4(RenderScript arg1){
    return (Element) null;
  }
  public static Element U32_2(RenderScript arg1){
    return (Element) null;
  }
  public static Element U32_3(RenderScript arg1){
    return (Element) null;
  }
  public static Element U32_4(RenderScript arg1){
    return (Element) null;
  }
  public static Element I32_2(RenderScript arg1){
    return (Element) null;
  }
  public static Element I32_3(RenderScript arg1){
    return (Element) null;
  }
  public static Element I32_4(RenderScript arg1){
    return (Element) null;
  }
  public static Element U64_2(RenderScript arg1){
    return (Element) null;
  }
  public static Element U64_3(RenderScript arg1){
    return (Element) null;
  }
  public static Element U64_4(RenderScript arg1){
    return (Element) null;
  }
  public static Element I64_2(RenderScript arg1){
    return (Element) null;
  }
  public static Element I64_3(RenderScript arg1){
    return (Element) null;
  }
  public static Element I64_4(RenderScript arg1){
    return (Element) null;
  }
  public static Element MATRIX4X4(RenderScript arg1){
    return (Element) null;
  }
  public static Element createPixel(RenderScript arg1, Element.DataType arg2, Element.DataKind arg3){
    return (Element) null;
  }
  public boolean isCompatible(Element arg1){
    return false;
  }
}
