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


public final class Bundle
  implements Parcelable, java.lang.Cloneable
{
  // Fields

  public static final Bundle EMPTY = null;

  public static final Parcelable.Creator<Bundle> CREATOR = null;

  // Constructors

  public Bundle(){
  }
  Bundle(Parcel arg1){
  }
  Bundle(Parcel arg1, int arg2){
  }
  public Bundle(java.lang.ClassLoader arg1){
  }
  public Bundle(int arg1){
  }
  public Bundle(Bundle arg1){
  }
  // Methods

  public java.lang.Object get(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public synchronized java.lang.String toString(){
    return (java.lang.String) null;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public boolean getBoolean(java.lang.String arg1){
    return false;
  }
  public boolean getBoolean(java.lang.String arg1, boolean arg2){
    return false;
  }
  public void putBoolean(java.lang.String arg1, boolean arg2){
  }
  public byte getByte(java.lang.String arg1){
    return (byte) 0;
  }
  public java.lang.Byte getByte(java.lang.String arg1, byte arg2){
    return (java.lang.Byte) null;
  }
  public void putByte(java.lang.String arg1, byte arg2){
  }
  public short getShort(java.lang.String arg1){
    return (short) 0;
  }
  public short getShort(java.lang.String arg1, short arg2){
    return (short) 0;
  }
  public void putShort(java.lang.String arg1, short arg2){
  }
  public char getChar(java.lang.String arg1){
    return '\u0000';
  }
  public char getChar(java.lang.String arg1, char arg2){
    return '\u0000';
  }
  public void putChar(java.lang.String arg1, char arg2){
  }
  public int getInt(java.lang.String arg1){
    return 0;
  }
  public int getInt(java.lang.String arg1, int arg2){
    return 0;
  }
  public void putInt(java.lang.String arg1, int arg2){
  }
  public long getLong(java.lang.String arg1){
    return 0l;
  }
  public long getLong(java.lang.String arg1, long arg2){
    return 0l;
  }
  public void putLong(java.lang.String arg1, long arg2){
  }
  public float getFloat(java.lang.String arg1){
    return 0.0f;
  }
  public float getFloat(java.lang.String arg1, float arg2){
    return 0.0f;
  }
  public void putFloat(java.lang.String arg1, float arg2){
  }
  public double getDouble(java.lang.String arg1){
    return 0.0d;
  }
  public double getDouble(java.lang.String arg1, double arg2){
    return 0.0d;
  }
  public void putDouble(java.lang.String arg1, double arg2){
  }
  public void clear(){
  }
  public boolean isEmpty(){
    return false;
  }
  public java.lang.ClassLoader getClassLoader(){
    return (java.lang.ClassLoader) null;
  }
  public void putAll(Bundle arg1){
  }
  public int size(){
    return 0;
  }
  public void remove(java.lang.String arg1){
  }
  public java.util.Set<java.lang.String> keySet(){
    return (java.util.Set) null;
  }
  public boolean containsKey(java.lang.String arg1){
    return false;
  }
  public Bundle getBundle(java.lang.String arg1){
    return (Bundle) null;
  }
  public java.lang.String getString(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getString(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Bundle.putString", pos = {0, 1, 2}, report = "-")
  public void putString(java.lang.String arg1, java.lang.String arg2){
  }
  public void writeToParcel(Parcel arg1, int arg2){
  }
  public int describeContents(){
    return 0;
  }
  public void setClassLoader(java.lang.ClassLoader arg1){
  }
  public void readFromParcel(Parcel arg1){
  }
  public java.lang.String [] getStringArray(java.lang.String arg1){
    return (java.lang.String []) null;
  }
  public byte [] getByteArray(java.lang.String arg1){
    return (byte []) null;
  }
  public boolean hasFileDescriptors(){
    return false;
  }
  public int [] getIntArray(java.lang.String arg1){
    return (int []) null;
  }
  public void putByteArray(java.lang.String arg1, byte [] arg2){
  }
  public IBinder getIBinder(java.lang.String arg1){
    return (IBinder) null;
  }
  public void putStringArrayList(java.lang.String arg1, java.util.ArrayList<java.lang.String> arg2){
  }
  public java.util.ArrayList<java.lang.String> getStringArrayList(java.lang.String arg1){
    return (java.util.ArrayList) null;
  }
  public boolean setAllowFds(boolean arg1){
    return false;
  }
  public <T extends Parcelable>T getParcelable(java.lang.String arg1){
    return null;
  }
  public void putBundle(java.lang.String arg1, Bundle arg2){
  }
  public void putParcelable(java.lang.String arg1, Parcelable arg2){
  }
  public void putIntArray(java.lang.String arg1, int [] arg2){
  }
  public void putParcelableArray(java.lang.String arg1, Parcelable [] arg2){
  }
  public void putSerializable(java.lang.String arg1, java.io.Serializable arg2){
  }
  public java.io.Serializable getSerializable(java.lang.String arg1){
    return (java.io.Serializable) null;
  }
  public void putSparseParcelableArray(java.lang.String arg1, android.util.SparseArray<? extends Parcelable> arg2){
  }
  public <T extends Parcelable>android.util.SparseArray<T> getSparseParcelableArray(java.lang.String arg1){
    return (android.util.SparseArray) null;
  }
  public <T extends Parcelable>java.util.ArrayList<T> getParcelableArrayList(java.lang.String arg1){
    return (java.util.ArrayList) null;
  }
  public java.util.ArrayList<java.lang.Integer> getIntegerArrayList(java.lang.String arg1){
    return (java.util.ArrayList) null;
  }
  public void putIntegerArrayList(java.lang.String arg1, java.util.ArrayList<java.lang.Integer> arg2){
  }
  public java.lang.CharSequence getCharSequence(java.lang.String arg1){
    return (java.lang.CharSequence) null;
  }
  public java.lang.CharSequence getCharSequence(java.lang.String arg1, java.lang.CharSequence arg2){
    return (java.lang.CharSequence) null;
  }
  public java.lang.String getPairValue(){
    return (java.lang.String) null;
  }
  public void putCharSequence(java.lang.String arg1, java.lang.CharSequence arg2){
  }
  public void putStringArray(java.lang.String arg1, java.lang.String [] arg2){
  }
  public static Bundle forPair(java.lang.String arg1, java.lang.String arg2){
    return (Bundle) null;
  }
  public void putParcelableArrayList(java.lang.String arg1, java.util.ArrayList<? extends Parcelable> arg2){
  }
  public Parcelable [] getParcelableArray(java.lang.String arg1){
    return (Parcelable []) null;
  }
  public void putCharSequenceArrayList(java.lang.String arg1, java.util.ArrayList<java.lang.CharSequence> arg2){
  }
  public void putBooleanArray(java.lang.String arg1, boolean [] arg2){
  }
  public void putShortArray(java.lang.String arg1, short [] arg2){
  }
  public void putCharArray(java.lang.String arg1, char [] arg2){
  }
  public void putLongArray(java.lang.String arg1, long [] arg2){
  }
  public void putFloatArray(java.lang.String arg1, float [] arg2){
  }
  public void putDoubleArray(java.lang.String arg1, double [] arg2){
  }
  public void putCharSequenceArray(java.lang.String arg1, java.lang.CharSequence [] arg2){
  }
  public void putIBinder(java.lang.String arg1, IBinder arg2){
  }
  public java.util.ArrayList<java.lang.CharSequence> getCharSequenceArrayList(java.lang.String arg1){
    return (java.util.ArrayList) null;
  }
  public boolean [] getBooleanArray(java.lang.String arg1){
    return (boolean []) null;
  }
  public short [] getShortArray(java.lang.String arg1){
    return (short []) null;
  }
  public char [] getCharArray(java.lang.String arg1){
    return (char []) null;
  }
  public long [] getLongArray(java.lang.String arg1){
    return (long []) null;
  }
  public float [] getFloatArray(java.lang.String arg1){
    return (float []) null;
  }
  public double [] getDoubleArray(java.lang.String arg1){
    return (double []) null;
  }
  public java.lang.CharSequence [] getCharSequenceArray(java.lang.String arg1){
    return (java.lang.CharSequence []) null;
  }
}
