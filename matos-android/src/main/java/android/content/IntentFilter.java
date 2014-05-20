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

import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class IntentFilter
  implements android.os.Parcelable
{
  // Classes

  public static class MalformedMimeTypeException
    extends android.util.AndroidException  {
    // Constructors

    public MalformedMimeTypeException(){
      super();
    }
    public MalformedMimeTypeException(java.lang.String arg1){
      super();
    }
  }
  public static final class AuthorityEntry
  {
    // Constructors

    public AuthorityEntry(java.lang.String arg1, java.lang.String arg2){
    }
    AuthorityEntry(android.os.Parcel arg1){
    }
    // Methods

    public java.lang.String getHost(){
      return (java.lang.String) null;
    }
    public int getPort(){
      return 0;
    }
    public int match(android.net.Uri arg1){
      return 0;
    }
  }
  // Fields

  public static final int SYSTEM_HIGH_PRIORITY = 1000;

  public static final int SYSTEM_LOW_PRIORITY = -1000;

  public static final int MATCH_CATEGORY_MASK = 268369920;

  public static final int MATCH_ADJUSTMENT_MASK = 65535;

  public static final int MATCH_ADJUSTMENT_NORMAL = 32768;

  public static final int MATCH_CATEGORY_EMPTY = 1048576;

  public static final int MATCH_CATEGORY_SCHEME = 2097152;

  public static final int MATCH_CATEGORY_HOST = 3145728;

  public static final int MATCH_CATEGORY_PORT = 4194304;

  public static final int MATCH_CATEGORY_PATH = 5242880;

  public static final int MATCH_CATEGORY_TYPE = 6291456;

  public static final int NO_MATCH_TYPE = -1;

  public static final int NO_MATCH_DATA = -2;

  public static final int NO_MATCH_ACTION = -3;

  public static final int NO_MATCH_CATEGORY = -4;

  public static final android.os.Parcelable.Creator<IntentFilter> CREATOR = null;

  // Constructors

  public IntentFilter(){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "IntentFilter-1", pos = {0, 1}, report = "-")
  public IntentFilter(@FieldSet("action") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "IntentFilter-2", pos = {0, 1, 2}, report = "-")
  public IntentFilter(@FieldSet("action") java.lang.String arg1, java.lang.String arg2) throws IntentFilter.MalformedMimeTypeException{
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "IntentFilter-3", pos = {0, 1}, report = "-")
  @Code("action=arg1.action;")
  public IntentFilter(IntentFilter arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "IntentFilter-4", pos = {0, 1}, report = "-")
  @Code("action=\"*\";")
  private IntentFilter(android.os.Parcel arg1){
  }
  // Methods

  public final void setPriority(int arg1){
  }
  public final int getPriority(){
    return 0;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "IntentFilter.create", pos = {-1, 1, 2}, report = "-")
  public static IntentFilter create(java.lang.String arg1, java.lang.String arg2){
    return (IntentFilter) null;
  }
  public final int match(ContentResolver arg1, Intent arg2, boolean arg3, java.lang.String arg4){
    return 0;
  }
  public final int match(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, android.net.Uri arg4, java.util.Set<java.lang.String> arg5, java.lang.String arg6){
    return 0;
  }
  public void dump(android.util.Printer arg1, java.lang.String arg2){
  }
  public final void writeToParcel(android.os.Parcel arg1, int arg2){
  }
  public final int describeContents(){
    return 0;
  }
  @FieldGet("action")
  public final java.lang.String getAction(int arg1){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "IntentFilter.addAction", pos = {0, 1}, report = "-")
  public final void addAction(@FieldSet("action") java.lang.String arg1){
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "IntentFilter.addDataScheme", pos = {0, 1}, report = "-")
  public final void addDataScheme(java.lang.String arg1){
  }
  public final java.lang.String getDataType(int arg1){
    return (java.lang.String) null;
  }
  public final int countActions(){
    return 0;
  }
  public final boolean hasAction(java.lang.String arg1){
    return false;
  }
  public final boolean matchAction(java.lang.String arg1){
    return false;
  }
  public final java.util.Iterator<java.lang.String> actionsIterator(){
    return (java.util.Iterator) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "IntentFilter.addDataType", pos = {0, 1}, report = "-")
  public final void addDataType(java.lang.String arg1) throws IntentFilter.MalformedMimeTypeException{
  }
  public final boolean hasDataType(java.lang.String arg1){
    return false;
  }
  public final int countDataTypes(){
    return 0;
  }
  public final java.util.Iterator<java.lang.String> typesIterator(){
    return (java.util.Iterator) null;
  }
  public final int countDataSchemes(){
    return 0;
  }
  public final java.lang.String getDataScheme(int arg1){
    return (java.lang.String) null;
  }
  public final boolean hasDataScheme(java.lang.String arg1){
    return false;
  }
  public final java.util.Iterator<java.lang.String> schemesIterator(){
    return (java.util.Iterator) null;
  }
  public final void addDataAuthority(java.lang.String arg1, java.lang.String arg2){
  }
  public final int countDataAuthorities(){
    return 0;
  }
  public final IntentFilter.AuthorityEntry getDataAuthority(int arg1){
    return (IntentFilter.AuthorityEntry) null;
  }
  public final boolean hasDataAuthority(android.net.Uri arg1){
    return false;
  }
  public final java.util.Iterator<IntentFilter.AuthorityEntry> authoritiesIterator(){
    return (java.util.Iterator) null;
  }
  public final void addDataPath(java.lang.String arg1, int arg2){
  }
  public final int countDataPaths(){
    return 0;
  }
  public final android.os.PatternMatcher getDataPath(int arg1){
    return (android.os.PatternMatcher) null;
  }
  public final boolean hasDataPath(java.lang.String arg1){
    return false;
  }
  public final java.util.Iterator<android.os.PatternMatcher> pathsIterator(){
    return (java.util.Iterator) null;
  }
  public final int matchDataAuthority(android.net.Uri arg1){
    return 0;
  }
  public final int matchData(java.lang.String arg1, java.lang.String arg2, android.net.Uri arg3){
    return 0;
  }
  public final void addCategory(java.lang.String arg1){
  }
  public final int countCategories(){
    return 0;
  }
  public final java.lang.String getCategory(int arg1){
    return (java.lang.String) null;
  }
  public final boolean hasCategory(java.lang.String arg1){
    return false;
  }
  public final java.util.Iterator<java.lang.String> categoriesIterator(){
    return (java.util.Iterator) null;
  }
  public final java.lang.String matchCategories(java.util.Set<java.lang.String> arg1){
    return (java.lang.String) null;
  }
  public void writeToXml(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlSerializer") org.xmlpull.v1.XmlSerializer arg1) throws java.io.IOException{
  }
  public void readFromXml(@com.francetelecom.rd.stubs.annotation.CallBackRegister("xmlPullParser") org.xmlpull.v1.XmlPullParser arg1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException{
  }
  public boolean debugCheck(){
    return false;
  }
}
