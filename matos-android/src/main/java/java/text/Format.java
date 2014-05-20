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


public abstract class Format
  implements java.io.Serializable, java.lang.Cloneable
{
  // Classes

  public static class Field
    extends AttributedCharacterIterator.Attribute  {
    // Constructors

    protected Field(java.lang.String arg1){
      super((java.lang.String) null);
    }
  }
  // Constructors

  protected Format(){
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public final java.lang.String format(java.lang.Object arg1){
    return (java.lang.String) null;
  }
  public abstract java.lang.StringBuffer format(java.lang.Object arg1, java.lang.StringBuffer arg2, FieldPosition arg3);
  public AttributedCharacterIterator formatToCharacterIterator(java.lang.Object arg1){
    return (AttributedCharacterIterator) null;
  }
  public java.lang.Object parseObject(java.lang.String arg1) throws ParseException{
    return (java.lang.Object) null;
  }
  public abstract java.lang.Object parseObject(java.lang.String arg1, ParsePosition arg2);
}
