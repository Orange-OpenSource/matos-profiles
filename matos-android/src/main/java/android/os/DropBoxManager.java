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


public class DropBoxManager
{
  // Classes

  public static class Entry
    implements java.io.Closeable, Parcelable
  {
    // Fields

    public static final Parcelable.Creator<DropBoxManager.Entry> CREATOR = null;

    // Constructors

    public Entry(java.lang.String arg1, long arg2){
    }
    public Entry(java.lang.String arg1, long arg2, java.lang.String arg3){
    }
    public Entry(java.lang.String arg1, long arg2, byte [] arg3, int arg4){
    }
    public Entry(java.lang.String arg1, long arg2, ParcelFileDescriptor arg3, int arg4){
    }
    public Entry(java.lang.String arg1, long arg2, java.io.File arg3, int arg4) throws java.io.IOException{
    }
    // Methods

    public void close(){
    }
    public java.io.InputStream getInputStream() throws java.io.IOException{
      return (java.io.InputStream) null;
    }
    public java.lang.String getText(int arg1){
      return (java.lang.String) null;
    }
    public java.lang.String getTag(){
      return (java.lang.String) null;
    }
    public void writeToParcel(Parcel arg1, int arg2){
    }
    public int describeContents(){
      return 0;
    }
    public int getFlags(){
      return 0;
    }
    public long getTimeMillis(){
      return 0l;
    }
  }
  // Fields

  public static final int IS_EMPTY = 1;

  public static final int IS_TEXT = 2;

  public static final int IS_GZIPPED = 4;

  public static final java.lang.String ACTION_DROPBOX_ENTRY_ADDED = "android.intent.action.DROPBOX_ENTRY_ADDED";

  public static final java.lang.String EXTRA_TAG = "tag";

  public static final java.lang.String EXTRA_TIME = "time";

  // Constructors

  public DropBoxManager(com.android.internal.os.IDropBoxManagerService arg1){
  }
  protected DropBoxManager(){
  }
  // Methods

  public DropBoxManager.Entry getNextEntry(java.lang.String arg1, long arg2){
    return (DropBoxManager.Entry) null;
  }
  public boolean isTagEnabled(java.lang.String arg1){
    return false;
  }
  public void addFile(java.lang.String arg1, java.io.File arg2, int arg3) throws java.io.IOException{
  }
  public void addText(java.lang.String arg1, java.lang.String arg2){
  }
  public void addData(java.lang.String arg1, byte [] arg2, int arg3){
  }
}
