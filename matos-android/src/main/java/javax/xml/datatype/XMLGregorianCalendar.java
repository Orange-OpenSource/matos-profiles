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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.XMLGregorianCalendarImplem", superClass = "")
public abstract class XMLGregorianCalendar
  implements java.lang.Cloneable
{
  // Constructors

  public XMLGregorianCalendar(){
  }
  // Methods

  public abstract void add(Duration arg1);
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public abstract java.lang.Object clone();
  public abstract void clear();
  public abstract int compare(XMLGregorianCalendar arg1);
  public abstract void reset();
  public abstract XMLGregorianCalendar normalize();
  public abstract int getMonth();
  public abstract int getYear();
  public void setTime(int arg1, int arg2, int arg3){
  }
  public void setTime(int arg1, int arg2, int arg3, java.math.BigDecimal arg4){
  }
  public void setTime(int arg1, int arg2, int arg3, int arg4){
  }
  public abstract boolean isValid();
  public abstract java.util.TimeZone getTimeZone(int arg1);
  public abstract int getDay();
  public abstract void setMonth(int arg1);
  public abstract void setYear(java.math.BigInteger arg1);
  public abstract void setYear(int arg1);
  public abstract int getHour();
  public abstract int getMinute();
  public abstract int getSecond();
  public abstract void setDay(int arg1);
  public abstract void setHour(int arg1);
  public abstract void setMinute(int arg1);
  public abstract void setSecond(int arg1);
  public abstract void setTimezone(int arg1);
  public abstract void setMillisecond(int arg1);
  public abstract void setFractionalSecond(java.math.BigDecimal arg1);
  public abstract java.math.BigInteger getEon();
  public abstract java.math.BigInteger getEonAndYear();
  public abstract int getTimezone();
  public int getMillisecond(){
    return 0;
  }
  public abstract java.math.BigDecimal getFractionalSecond();
  public abstract java.lang.String toXMLFormat();
  public abstract javax.xml.namespace.QName getXMLSchemaType();
  public abstract java.util.GregorianCalendar toGregorianCalendar();
  public abstract java.util.GregorianCalendar toGregorianCalendar(java.util.TimeZone arg1, java.util.Locale arg2, XMLGregorianCalendar arg3);
}
