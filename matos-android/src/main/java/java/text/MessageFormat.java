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


public class MessageFormat
  extends Format{
  // Classes

  public static class Field
    extends Format.Field  {
    // Fields

    public static final MessageFormat.Field ARGUMENT = null;

    // Constructors

    protected Field(java.lang.String arg1){
      super((java.lang.String) null);
    }
  }
  // Constructors

  public MessageFormat(java.lang.String arg1, java.util.Locale arg2){
    super();
  }
  public MessageFormat(java.lang.String arg1){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public final java.lang.StringBuffer format(java.lang.Object [] arg1, java.lang.StringBuffer arg2, FieldPosition arg3){
    return (java.lang.StringBuffer) null;
  }
  public final java.lang.StringBuffer format(java.lang.Object arg1, java.lang.StringBuffer arg2, FieldPosition arg3){
    return (java.lang.StringBuffer) null;
  }
  public static java.lang.String format(java.lang.String arg1, java.lang.Object [] arg2){
    return (java.lang.String) null;
  }
  public java.lang.Object [] parse(java.lang.String arg1) throws ParseException{
    return (java.lang.Object []) null;
  }
  public java.lang.Object [] parse(java.lang.String arg1, ParsePosition arg2){
    return (java.lang.Object []) null;
  }
  public void setLocale(java.util.Locale arg1){
  }
  public java.util.Locale getLocale(){
    return (java.util.Locale) null;
  }
  public void setFormat(int arg1, Format arg2){
  }
  public Format [] getFormats(){
    return (Format []) null;
  }
  public void applyPattern(java.lang.String arg1){
  }
  public AttributedCharacterIterator formatToCharacterIterator(java.lang.Object arg1){
    return (AttributedCharacterIterator) null;
  }
  public java.lang.String toPattern(){
    return (java.lang.String) null;
  }
  public java.lang.Object parseObject(java.lang.String arg1, ParsePosition arg2){
    return (java.lang.Object) null;
  }
  public Format [] getFormatsByArgumentIndex(){
    return (Format []) null;
  }
  public void setFormatByArgumentIndex(int arg1, Format arg2){
  }
  public void setFormatsByArgumentIndex(Format [] arg1){
  }
  public void setFormats(Format [] arg1){
  }
}
