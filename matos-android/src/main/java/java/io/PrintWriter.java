package java.io;

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


public class PrintWriter
  extends Writer{
  // Fields

  protected Writer out;

  // Constructors

  public PrintWriter(OutputStream arg1){
    super();
  }
  public PrintWriter(OutputStream arg1, boolean arg2){
    super();
  }
  public PrintWriter(Writer arg1){
    super();
  }
  public PrintWriter(Writer arg1, boolean arg2){
    super();
  }
  public PrintWriter(File arg1) throws FileNotFoundException{
    super();
  }
  public PrintWriter(File arg1, java.lang.String arg2) throws FileNotFoundException, UnsupportedEncodingException{
    super();
  }
  public PrintWriter(java.lang.String arg1) throws FileNotFoundException{
    super();
  }
  public PrintWriter(java.lang.String arg1, java.lang.String arg2) throws FileNotFoundException, UnsupportedEncodingException{
    super();
  }
  // Methods

  public void println(){
  }
  public void println(char [] arg1){
  }
  public void println(char arg1){
  }
  public void println(double arg1){
  }
  public void println(float arg1){
  }
  public void println(int arg1){
  }
  public void println(long arg1){
  }
  public void println(java.lang.Object arg1){
  }
  public void println(java.lang.String arg1){
  }
  public void println(boolean arg1){
  }
  public PrintWriter append(char arg1){
    return (PrintWriter) null;
  }
  public PrintWriter append(java.lang.CharSequence arg1){
    return (PrintWriter) null;
  }
  public PrintWriter append(java.lang.CharSequence arg1, int arg2, int arg3){
    return (PrintWriter) null;
  }
  public PrintWriter format(java.lang.String arg1, java.lang.Object [] arg2){
    return (PrintWriter) null;
  }
  public PrintWriter format(java.util.Locale arg1, java.lang.String arg2, java.lang.Object [] arg3){
    return (PrintWriter) null;
  }
  public void write(char [] arg1){
  }
  public void write(char [] arg1, int arg2, int arg3){
  }
  public void write(int arg1){
  }
  public void write(java.lang.String arg1){
  }
  public void write(java.lang.String arg1, int arg2, int arg3){
  }
  public void print(char [] arg1){
  }
  public void print(char arg1){
  }
  public void print(double arg1){
  }
  public void print(float arg1){
  }
  public void print(int arg1){
  }
  public void print(long arg1){
  }
  public void print(java.lang.Object arg1){
  }
  public void print(java.lang.String arg1){
  }
  public void print(boolean arg1){
  }
  public void close(){
  }
  public void flush(){
  }
  public boolean checkError(){
    return false;
  }
  protected void clearError(){
  }
  public PrintWriter printf(java.lang.String arg1, java.lang.Object [] arg2){
    return (PrintWriter) null;
  }
  public PrintWriter printf(java.util.Locale arg1, java.lang.String arg2, java.lang.Object [] arg3){
    return (PrintWriter) null;
  }
  protected void setError(){
  }
}
