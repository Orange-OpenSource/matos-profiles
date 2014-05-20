package android.os;

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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class FileUtils
{
  // Classes

  public static final class FileStatus
  {
    // Fields

    public int dev;

    public int ino;

    public int mode;

    public int nlink;

    public int uid;

    public int gid;

    public int rdev;

    public long size;

    public int blksize;

    public long blocks;

    public long atime;

    public long mtime;

    public long ctime;

    // Constructors

    public FileStatus(){
    }
  }
  // Fields

  public static final int S_IRWXU = 448;

  public static final int S_IRUSR = 256;

  public static final int S_IWUSR = 128;

  public static final int S_IXUSR = 64;

  public static final int S_IRWXG = 56;

  public static final int S_IRGRP = 32;

  public static final int S_IWGRP = 16;

  public static final int S_IXGRP = 8;

  public static final int S_IRWXO = 7;

  public static final int S_IROTH = 4;

  public static final int S_IWOTH = 2;

  public static final int S_IXOTH = 1;

  // Constructors

  public FileUtils(){
  }
  // Methods

  public static int getPermissions(java.lang.String arg1, int [] arg2){
    return 0;
  }
  public static boolean sync(java.io.FileOutputStream arg1){
    return false;
  }
  public static java.lang.String readTextFile(java.io.File arg1, int arg2, java.lang.String arg3) throws java.io.IOException{
    return (java.lang.String) null;
  }
  public static boolean getFileStatus(java.lang.String arg1, FileUtils.FileStatus arg2){
    return false;
  }
  public static int setPermissions(java.lang.String arg1, int arg2, int arg3, int arg4){
    return 0;
  }
  public static int setUMask(int arg1){
    return 0;
  }
  public static int getFatVolumeId(java.lang.String arg1){
    return 0;
  }
  public static boolean copyFile(java.io.File arg1, java.io.File arg2){
    return false;
  }
  public static boolean copyToFile(java.io.InputStream arg1, java.io.File arg2){
    return false;
  }
  public static boolean isFilenameSafe(java.io.File arg1){
    return false;
  }
  public static void stringToFile(java.lang.String arg1, java.lang.String arg2) throws java.io.IOException{
  }
  public static long checksumCrc32(java.io.File arg1) throws java.io.FileNotFoundException, java.io.IOException{
    return 0l;
  }
}
