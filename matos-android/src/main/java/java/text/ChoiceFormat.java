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


public class ChoiceFormat
  extends NumberFormat{
  // Constructors

  public ChoiceFormat(double [] arg1, java.lang.String [] arg2){
    super();
  }
  public ChoiceFormat(java.lang.String arg1){
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
  public java.lang.StringBuffer format(double arg1, java.lang.StringBuffer arg2, FieldPosition arg3){
    return (java.lang.StringBuffer) null;
  }
  public java.lang.StringBuffer format(long arg1, java.lang.StringBuffer arg2, FieldPosition arg3){
    return (java.lang.StringBuffer) null;
  }
  public static final double nextDouble(double arg1){
    return 0.0d;
  }
  public static double nextDouble(double arg1, boolean arg2){
    return 0.0d;
  }
  public java.lang.Number parse(java.lang.String arg1, ParsePosition arg2){
    return (java.lang.Number) null;
  }
  public java.lang.Object [] getFormats(){
    return (java.lang.Object []) null;
  }
  public void applyPattern(java.lang.String arg1){
  }
  public java.lang.String toPattern(){
    return (java.lang.String) null;
  }
  public double [] getLimits(){
    return (double []) null;
  }
  public static final double previousDouble(double arg1){
    return 0.0d;
  }
  public void setChoices(double [] arg1, java.lang.String [] arg2){
  }
}
