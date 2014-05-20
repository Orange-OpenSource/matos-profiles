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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.DatatypeFactoryImplem", superClass = "")
public abstract class DatatypeFactory
{
  // Fields

  public static final java.lang.String DATATYPEFACTORY_PROPERTY = "javax.xml.datatype.DatatypeFactory";

  public static final java.lang.String DATATYPEFACTORY_IMPLEMENTATION_CLASS = null;

  // Constructors

  protected DatatypeFactory(){
  }
  // Methods

  public static DatatypeFactory newInstance() throws DatatypeConfigurationException{
    return (DatatypeFactory) null;
  }
  public static DatatypeFactory newInstance(java.lang.String arg1, java.lang.ClassLoader arg2) throws DatatypeConfigurationException{
    return (DatatypeFactory) null;
  }
  public abstract Duration newDuration(java.lang.String arg1);
  public abstract Duration newDuration(long arg1);
  public abstract Duration newDuration(boolean arg1, java.math.BigInteger arg2, java.math.BigInteger arg3, java.math.BigInteger arg4, java.math.BigInteger arg5, java.math.BigInteger arg6, java.math.BigDecimal arg7);
  public Duration newDuration(boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7){
    return (Duration) null;
  }
  public Duration newDurationDayTime(java.lang.String arg1){
    return (Duration) null;
  }
  public Duration newDurationDayTime(long arg1){
    return (Duration) null;
  }
  public Duration newDurationDayTime(boolean arg1, java.math.BigInteger arg2, java.math.BigInteger arg3, java.math.BigInteger arg4, java.math.BigInteger arg5){
    return (Duration) null;
  }
  public Duration newDurationDayTime(boolean arg1, int arg2, int arg3, int arg4, int arg5){
    return (Duration) null;
  }
  public Duration newDurationYearMonth(java.lang.String arg1){
    return (Duration) null;
  }
  public Duration newDurationYearMonth(long arg1){
    return (Duration) null;
  }
  public Duration newDurationYearMonth(boolean arg1, java.math.BigInteger arg2, java.math.BigInteger arg3){
    return (Duration) null;
  }
  public Duration newDurationYearMonth(boolean arg1, int arg2, int arg3){
    return (Duration) null;
  }
  public abstract XMLGregorianCalendar newXMLGregorianCalendar();
  public abstract XMLGregorianCalendar newXMLGregorianCalendar(java.lang.String arg1);
  public abstract XMLGregorianCalendar newXMLGregorianCalendar(java.util.GregorianCalendar arg1);
  public abstract XMLGregorianCalendar newXMLGregorianCalendar(java.math.BigInteger arg1, int arg2, int arg3, int arg4, int arg5, int arg6, java.math.BigDecimal arg7, int arg8);
  public XMLGregorianCalendar newXMLGregorianCalendar(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8){
    return (XMLGregorianCalendar) null;
  }
  public XMLGregorianCalendar newXMLGregorianCalendarDate(int arg1, int arg2, int arg3, int arg4){
    return (XMLGregorianCalendar) null;
  }
  public XMLGregorianCalendar newXMLGregorianCalendarTime(int arg1, int arg2, int arg3, int arg4){
    return (XMLGregorianCalendar) null;
  }
  public XMLGregorianCalendar newXMLGregorianCalendarTime(int arg1, int arg2, int arg3, java.math.BigDecimal arg4, int arg5){
    return (XMLGregorianCalendar) null;
  }
  public XMLGregorianCalendar newXMLGregorianCalendarTime(int arg1, int arg2, int arg3, int arg4, int arg5){
    return (XMLGregorianCalendar) null;
  }
}
