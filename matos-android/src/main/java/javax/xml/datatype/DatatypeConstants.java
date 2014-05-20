package javax.xml.datatype;

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


public final class DatatypeConstants
{
  // Classes

  public static final class Field
  {
    // Constructors

    private Field(java.lang.String arg1, int arg2){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    public int getId(){
      return 0;
    }
  }
  // Fields

  public static final int JANUARY = 1;

  public static final int FEBRUARY = 2;

  public static final int MARCH = 3;

  public static final int APRIL = 4;

  public static final int MAY = 5;

  public static final int JUNE = 6;

  public static final int JULY = 7;

  public static final int AUGUST = 8;

  public static final int SEPTEMBER = 9;

  public static final int OCTOBER = 10;

  public static final int NOVEMBER = 11;

  public static final int DECEMBER = 12;

  public static final int LESSER = -1;

  public static final int EQUAL = 0;

  public static final int GREATER = 1;

  public static final int INDETERMINATE = 2;

  public static final int FIELD_UNDEFINED = -2147483648;

  public static final DatatypeConstants.Field YEARS = null;

  public static final DatatypeConstants.Field MONTHS = null;

  public static final DatatypeConstants.Field DAYS = null;

  public static final DatatypeConstants.Field HOURS = null;

  public static final DatatypeConstants.Field MINUTES = null;

  public static final DatatypeConstants.Field SECONDS = null;

  public static final javax.xml.namespace.QName DATETIME = null;

  public static final javax.xml.namespace.QName TIME = null;

  public static final javax.xml.namespace.QName DATE = null;

  public static final javax.xml.namespace.QName GYEARMONTH = null;

  public static final javax.xml.namespace.QName GMONTHDAY = null;

  public static final javax.xml.namespace.QName GYEAR = null;

  public static final javax.xml.namespace.QName GMONTH = null;

  public static final javax.xml.namespace.QName GDAY = null;

  public static final javax.xml.namespace.QName DURATION = null;

  public static final javax.xml.namespace.QName DURATION_DAYTIME = null;

  public static final javax.xml.namespace.QName DURATION_YEARMONTH = null;

  public static final int MAX_TIMEZONE_OFFSET = -840;

  public static final int MIN_TIMEZONE_OFFSET = 840;

  // Constructors

  private DatatypeConstants(){
  }
}
