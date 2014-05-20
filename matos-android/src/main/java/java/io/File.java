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


public class File
  implements Serializable, java.lang.Comparable<File>
{
  // Fields

  public static final char separatorChar = '\u0000';

  public static final java.lang.String separator = null;

  public static final char pathSeparatorChar = '\u0000';

  public static final java.lang.String pathSeparator = null;

  // Constructors

  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File-1", pos = {0, 1, 2}, report = "-")
  public File(File arg1, java.lang.String arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File-2", pos = {0, 1}, report = "-")
  public File(java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File-3", pos = {0, 1}, report = "-")
  public File(java.lang.String arg1, java.lang.String arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File-4", pos = {0, 1}, report = "-")
  public File(java.net.URI arg1){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public int compareTo(File arg1){
    return 0;
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public long length(){
    return 0l;
  }
  public java.lang.String getCanonicalPath() throws IOException{
    return (java.lang.String) null;
  }
  public java.lang.String getParent(){
    return (java.lang.String) null;
  }
  public boolean isAbsolute(){
    return false;
  }
  public boolean setReadOnly(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.list-1", pos = {0, -1}, report = "-")
  public java.lang.String [] list(){
    return (java.lang.String []) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.list-2", pos = {0, -1}, report = "-")
  public java.lang.String [] list(FilenameFilter arg1){
    return (java.lang.String []) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.delete", pos = 0, report = "-")
  public boolean delete(){
    return false;
  }
  public boolean exists(){
    return false;
  }
  public boolean canExecute(){
    return false;
  }
  public boolean canRead(){
    return false;
  }
  public boolean canWrite(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.createNewFile", pos = 0, report = "-")
  public boolean createNewFile() throws IOException{
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.createTempFile-1", pos = {-1, 1, 2}, report = "-")
  public static File createTempFile(java.lang.String arg1, java.lang.String arg2) throws IOException{
    return (File) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.createTempFile-2", pos = {-1, 1, 2}, report = "-")
  public static File createTempFile(java.lang.String arg1, java.lang.String arg2, File arg3) throws IOException{
    return (File) null;
  }
  public void deleteOnExit(){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.getAbsoluteFile", pos = {0, -1}, report = "-")
  public File getAbsoluteFile(){
    return (File) null;
  }
  public java.lang.String getAbsolutePath(){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return this;")
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.getCanonicalsFile", pos = {0, -1}, report = "-")
  public File getCanonicalFile() throws IOException{
    return (File) null;
  }
  public long getFreeSpace(){
    return 0l;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.getParentFile", pos = {0, -1}, report = "-")
  public File getParentFile(){
    return (File) null;
  }
  public java.lang.String getPath(){
    return (java.lang.String) null;
  }
  public long getTotalSpace(){
    return 0l;
  }
  public long getUsableSpace(){
    return 0l;
  }
  public boolean isDirectory(){
    return false;
  }
  public boolean isFile(){
    return false;
  }
  public boolean isHidden(){
    return false;
  }
  public long lastModified(){
    return 0l;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.listFiles-1", pos = {0, -1}, report = "-")
  public File [] listFiles(){
    return (File []) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.listFiles-2", pos = {0, -1}, report = "-")
  public File [] listFiles(FilenameFilter arg1){
    return (File []) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.listFiles-3", pos = {0, -1}, report = "-")
  public File [] listFiles(FileFilter arg1){
    return (File []) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.listRoots", pos = -1, report = "-")
  public static File [] listRoots(){
    return (File []) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.mkdir", pos = 0, report = "-")
  public boolean mkdir(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.mkdirs", pos = 0, report = "-")
  public boolean mkdirs(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.renameTo", pos = {0, 1}, report = "-")
  public boolean renameTo(File arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.setExecutable-1", pos = {0, 1, 2}, report = "-")
  public boolean setExecutable(boolean arg1, boolean arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.setExecutable-2", pos = {0, 1}, report = "-")
  public boolean setExecutable(boolean arg1){
    return false;
  }
  public boolean setLastModified(long arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.setReadable-1", pos = {0, 1, 2}, report = "-")
  public boolean setReadable(boolean arg1, boolean arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.setReadable-2", pos = {0, 1}, report = "-")
  public boolean setReadable(boolean arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.setWritable-1", pos = {0, 1, 2}, report = "-")
  public boolean setWritable(boolean arg1, boolean arg2){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "File.setWritable-2", pos = {0, 1}, report = "-")
  public boolean setWritable(boolean arg1){
    return false;
  }
  public java.net.URI toURI(){
    return (java.net.URI) null;
  }
  public java.net.URL toURL() throws java.net.MalformedURLException{
    return (java.net.URL) null;
  }
}
