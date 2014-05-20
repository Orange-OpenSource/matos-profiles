package java.text;

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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.AttributedCharacterIteratorImpl", superClass = "")
public interface AttributedCharacterIterator
  extends CharacterIterator
{
  // Classes

  public static class Attribute
    implements java.io.Serializable
  {
    // Fields

    public static final AttributedCharacterIterator.Attribute INPUT_METHOD_SEGMENT = null;

    public static final AttributedCharacterIterator.Attribute LANGUAGE = null;

    public static final AttributedCharacterIterator.Attribute READING = null;

    // Constructors

    protected Attribute(java.lang.String arg1){
    }
    // Methods

    public final boolean equals(java.lang.Object arg1){
      return false;
    }
    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public final int hashCode(){
      return 0;
    }
    protected java.lang.String getName(){
      return (java.lang.String) null;
    }
    protected java.lang.Object readResolve() throws java.io.InvalidObjectException{
      return (java.lang.Object) null;
    }
  }
  // Methods

  public java.util.Map<AttributedCharacterIterator.Attribute, java.lang.Object> getAttributes();
  public java.lang.Object getAttribute(AttributedCharacterIterator.Attribute arg1);
  public int getRunStart();
  public int getRunStart(AttributedCharacterIterator.Attribute arg1);
  public int getRunStart(java.util.Set<? extends AttributedCharacterIterator.Attribute> arg1);
  public int getRunLimit();
  public int getRunLimit(AttributedCharacterIterator.Attribute arg1);
  public int getRunLimit(java.util.Set<? extends AttributedCharacterIterator.Attribute> arg1);
  public java.util.Set<AttributedCharacterIterator.Attribute> getAllAttributeKeys();
}
