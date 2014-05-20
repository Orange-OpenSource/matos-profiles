package java.util;

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


public final class Formatter
  implements java.io.Closeable, java.io.Flushable
{
  // Classes

  public static enum BigDecimalLayoutForm
  {
    // Enum Constants

    SCIENTIFIC()
, DECIMAL_FLOAT()
;
    // Fields

    // Constructors

    private BigDecimalLayoutForm(){
    }
    // Methods

  }
  // Constructors

  public Formatter(){
  }
  public Formatter(java.lang.Appendable arg1){
  }
  public Formatter(Locale arg1){
  }
  public Formatter(java.lang.Appendable arg1, Locale arg2){
  }
  public Formatter(java.lang.String arg1) throws java.io.FileNotFoundException{
  }
  public Formatter(java.lang.String arg1, java.lang.String arg2) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException{
  }
  public Formatter(java.lang.String arg1, java.lang.String arg2, Locale arg3) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException{
  }
  public Formatter(java.io.File arg1) throws java.io.FileNotFoundException{
  }
  public Formatter(java.io.File arg1, java.lang.String arg2) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException{
  }
  public Formatter(java.io.File arg1, java.lang.String arg2, Locale arg3) throws java.io.FileNotFoundException, java.io.UnsupportedEncodingException{
  }
  public Formatter(java.io.OutputStream arg1){
  }
  public Formatter(java.io.OutputStream arg1, java.lang.String arg2) throws java.io.UnsupportedEncodingException{
  }
  public Formatter(java.io.OutputStream arg1, java.lang.String arg2, Locale arg3) throws java.io.UnsupportedEncodingException{
  }
  public Formatter(java.io.PrintStream arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public Formatter format(java.lang.String arg1, java.lang.Object [] arg2){
    return (Formatter) null;
  }
  public Formatter format(Locale arg1, java.lang.String arg2, java.lang.Object [] arg3){
    return (Formatter) null;
  }
  public java.lang.Appendable out(){
    return (java.lang.Appendable) null;
  }
  public void close(){
  }
  public void flush(){
  }
  public Locale locale(){
    return (Locale) null;
  }
  public java.io.IOException ioException(){
    return (java.io.IOException) null;
  }
}
