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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.DurationImplem", superClass = "")
public abstract class Duration
{
  // Constructors

  public Duration(){
  }
  // Methods

  public abstract Duration add(Duration arg1);
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public abstract int hashCode();
  public abstract int compare(Duration arg1);
  public abstract java.lang.Number getField(DatatypeConstants.Field arg1);
  public abstract boolean isSet(DatatypeConstants.Field arg1);
  public int getHours(){
    return 0;
  }
  public int getMinutes(){
    return 0;
  }
  public int getSeconds(){
    return 0;
  }
  public abstract void addTo(java.util.Calendar arg1);
  public void addTo(java.util.Date arg1){
  }
  public int getMonths(){
    return 0;
  }
  public Duration subtract(Duration arg1){
    return (Duration) null;
  }
  public abstract Duration negate();
  public Duration multiply(int arg1){
    return (Duration) null;
  }
  public abstract Duration multiply(java.math.BigDecimal arg1);
  public javax.xml.namespace.QName getXMLSchemaType(){
    return (javax.xml.namespace.QName) null;
  }
  public long getTimeInMillis(java.util.Calendar arg1){
    return 0l;
  }
  public long getTimeInMillis(java.util.Date arg1){
    return 0l;
  }
  public abstract int getSign();
  public int getYears(){
    return 0;
  }
  public int getDays(){
    return 0;
  }
  public abstract Duration normalizeWith(java.util.Calendar arg1);
  public boolean isLongerThan(Duration arg1){
    return false;
  }
  public boolean isShorterThan(Duration arg1){
    return false;
  }
}
