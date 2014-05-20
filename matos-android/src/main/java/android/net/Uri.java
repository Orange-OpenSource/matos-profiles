package android.net;

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
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.UriImpl", superClass = "")
public abstract class Uri
  implements java.lang.Comparable<Uri>, android.os.Parcelable
{
  // Classes

  public static final class Builder
  {
    // Constructors

    public Builder(){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Uri.Builder.path", pos = {0, 1}, report = "-")
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public Uri.Builder path(java.lang.String arg1){
      return (Uri.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public Uri.Builder authority(java.lang.String arg1){
      return (Uri.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public Uri.Builder query(java.lang.String arg1){
      return (Uri.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Uri.Builder.scheme", pos = {0, 1}, report = "-")
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public Uri.Builder scheme(java.lang.String arg1){
      return (Uri.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Uri.Builder.build", pos = {0, -1}, report = "-")
    public Uri build(){
      return (Uri) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public Uri.Builder fragment(java.lang.String arg1){
      return (Uri.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Uri.Builder.appendPath", pos = {0, -1}, report = "-")
    public Uri.Builder appendPath(java.lang.String arg1){
      return (Uri.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Uri.Builder.appendEncodedPath", pos = {0, -1}, report = "-")
    public Uri.Builder appendEncodedPath(java.lang.String arg1){
      return (Uri.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public Uri.Builder encodedAuthority(java.lang.String arg1){
      return (Uri.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public Uri.Builder opaquePart(java.lang.String arg1){
      return (Uri.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public Uri.Builder appendQueryParameter(java.lang.String arg1, java.lang.String arg2){
      return (Uri.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public Uri.Builder encodedOpaquePart(java.lang.String arg1){
      return (Uri.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Uri.Builder.encodedPath", pos = {0, -1}, report = "-")
    public Uri.Builder encodedPath(java.lang.String arg1){
      return (Uri.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public Uri.Builder encodedQuery(java.lang.String arg1){
      return (Uri.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public Uri.Builder encodedFragment(java.lang.String arg1){
      return (Uri.Builder) null;
    }
    @com.francetelecom.rd.stubs.annotation.Code("return this;")
    public Uri.Builder clearQuery(){
      return (Uri.Builder) null;
    }
  }
  // Fields

  public static final Uri EMPTY = null;

  public static final android.os.Parcelable.Creator<Uri> CREATOR = null;

  // Constructors

  private Uri(){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public abstract java.lang.String toString();
  public int hashCode(){
    return 0;
  }
  public int compareTo(Uri arg1){
    return 0;
  }
  public static java.lang.String decode(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String encode(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static java.lang.String encode(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public boolean isAbsolute(){
    return false;
  }
  public abstract java.lang.String getAuthority();
  public abstract java.lang.String getFragment();
  public abstract java.lang.String getPath();
  public abstract java.lang.String getQuery();
  public abstract java.lang.String getScheme();
  public boolean isOpaque(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "android.Uri.parse", pos = {1, -1}, report = "-")
  public static Uri parse(java.lang.String arg1){
    return (Uri) null;
  }
  public abstract java.lang.String getHost();
  public abstract int getPort();
  public abstract java.lang.String getUserInfo();
  public static void writeToParcel(android.os.Parcel arg1, Uri arg2){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "android.Uri.fromFile", pos = {1, -1}, report = "-")
  public static Uri fromFile(java.io.File arg1){
    return (Uri) null;
  }
  public abstract java.lang.String getSchemeSpecificPart();
  public static Uri withAppendedPath(Uri arg1, java.lang.String arg2){
    return (Uri) null;
  }
  public abstract Uri.Builder buildUpon();
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "android.Uri.fromParts", pos = {1, 2, 3, -1}, report = "-")
  public static Uri fromParts(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
    return (Uri) null;
  }
  public abstract java.util.List<java.lang.String> getPathSegments();
  public abstract java.lang.String getLastPathSegment();
  public abstract boolean isHierarchical();
  public abstract boolean isRelative();
  public abstract java.lang.String getEncodedSchemeSpecificPart();
  public abstract java.lang.String getEncodedAuthority();
  public abstract java.lang.String getEncodedPath();
  public abstract java.lang.String getEncodedQuery();
  public abstract java.lang.String getEncodedFragment();
  public abstract java.lang.String getEncodedUserInfo();
  public java.lang.String toSafeString(){
    return (java.lang.String) null;
  }
  public java.util.Set<java.lang.String> getQueryParameterNames(){
    return (java.util.Set) null;
  }
  public java.util.List<java.lang.String> getQueryParameters(java.lang.String arg1){
    return (java.util.List) null;
  }
  public java.lang.String getQueryParameter(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public boolean getBooleanQueryParameter(java.lang.String arg1, boolean arg2){
    return false;
  }
}
