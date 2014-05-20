package android.content;

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
public class ContentProviderOperation
  implements android.os.Parcelable
{
  // Classes

  public static class Builder
  {
    // Constructors

    private Builder(int arg1, android.net.Uri arg2){
    }
    // Methods

    public ContentProviderOperation build(){
      return (ContentProviderOperation) null;
    }
    public ContentProviderOperation.Builder withValue(java.lang.String arg1, java.lang.Object arg2){
      return (ContentProviderOperation.Builder) null;
    }
    public ContentProviderOperation.Builder withValues(ContentValues arg1){
      return (ContentProviderOperation.Builder) null;
    }
    public ContentProviderOperation.Builder withValueBackReferences(ContentValues arg1){
      return (ContentProviderOperation.Builder) null;
    }
    public ContentProviderOperation.Builder withValueBackReference(java.lang.String arg1, int arg2){
      return (ContentProviderOperation.Builder) null;
    }
    public ContentProviderOperation.Builder withSelectionBackReference(int arg1, int arg2){
      return (ContentProviderOperation.Builder) null;
    }
    public ContentProviderOperation.Builder withSelection(java.lang.String arg1, java.lang.String [] arg2){
      return (ContentProviderOperation.Builder) null;
    }
    public ContentProviderOperation.Builder withExpectedCount(int arg1){
      return (ContentProviderOperation.Builder) null;
    }
    public ContentProviderOperation.Builder withYieldAllowed(boolean arg1){
      return (ContentProviderOperation.Builder) null;
    }
  }
  // Fields

  public static final int TYPE_INSERT = 1;

  public static final int TYPE_UPDATE = 2;

  public static final int TYPE_DELETE = 3;

  public static final int TYPE_ASSERT = 4;

  public static final android.os.Parcelable.Creator<ContentProviderOperation> CREATOR = null;

  // Constructors

  private ContentProviderOperation(ContentProviderOperation.Builder arg1){
  }
  private ContentProviderOperation(android.os.Parcel arg1){
  }
  // Methods

  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int getType(){
    return 0;
  }
  public void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public android.net.Uri getUri(){
    return (android.net.Uri) null;
  }
  public ContentProviderResult apply(ContentProvider arg1, ContentProviderResult [] arg2, int arg3) throws OperationApplicationException{
    return (ContentProviderResult) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentProviderOperation.newInsert", pos = 1, report = "-")
  public static ContentProviderOperation.Builder newInsert(android.net.Uri arg1){
    return (ContentProviderOperation.Builder) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentProviderOperation.newUpdate", pos = 1, report = "-")
  public static ContentProviderOperation.Builder newUpdate(android.net.Uri arg1){
    return (ContentProviderOperation.Builder) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentProviderOperation.newDelete", pos = 1, report = "-")
  public static ContentProviderOperation.Builder newDelete(android.net.Uri arg1){
    return (ContentProviderOperation.Builder) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "ContentProviderOperation.newAssertQuery", pos = 1, report = "-")
  public static ContentProviderOperation.Builder newAssertQuery(android.net.Uri arg1){
    return (ContentProviderOperation.Builder) null;
  }
  public boolean isYieldAllowed(){
    return false;
  }
  public boolean isWriteOperation(){
    return false;
  }
  public boolean isReadOperation(){
    return false;
  }
  public ContentValues resolveValueBackReferences(ContentProviderResult [] arg1, int arg2){
    return (ContentValues) null;
  }
  public java.lang.String [] resolveSelectionArgsBackReferences(ContentProviderResult [] arg1, int arg2){
    return (java.lang.String []) null;
  }
}
