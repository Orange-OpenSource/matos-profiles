package android.util;

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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.AttributeSetImpl", superClass = "")
public interface AttributeSet
{
  // Methods

  public java.lang.String getAttributeValue(int arg1);
  public java.lang.String getAttributeValue(java.lang.String arg1, java.lang.String arg2);
  public int getAttributeCount();
  public java.lang.String getAttributeName(int arg1);
  public java.lang.String getPositionDescription();
  public int getAttributeNameResource(int arg1);
  public int getAttributeResourceValue(java.lang.String arg1, java.lang.String arg2, int arg3);
  public int getAttributeResourceValue(int arg1, int arg2);
  public boolean getAttributeBooleanValue(java.lang.String arg1, java.lang.String arg2, boolean arg3);
  public boolean getAttributeBooleanValue(int arg1, boolean arg2);
  public int getAttributeIntValue(java.lang.String arg1, java.lang.String arg2, int arg3);
  public int getAttributeIntValue(int arg1, int arg2);
  public int getAttributeListValue(java.lang.String arg1, java.lang.String arg2, java.lang.String [] arg3, int arg4);
  public int getAttributeListValue(int arg1, java.lang.String [] arg2, int arg3);
  public int getAttributeUnsignedIntValue(java.lang.String arg1, java.lang.String arg2, int arg3);
  public int getAttributeUnsignedIntValue(int arg1, int arg2);
  public float getAttributeFloatValue(java.lang.String arg1, java.lang.String arg2, float arg3);
  public float getAttributeFloatValue(int arg1, float arg2);
  public java.lang.String getIdAttribute();
  public java.lang.String getClassAttribute();
  public int getIdAttributeResourceValue(int arg1);
  public int getStyleAttribute();
}
