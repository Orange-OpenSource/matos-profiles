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
@com.francetelecom.rd.stubs.annotation.Field(type = "Object", value = "content", modifier = 2)
public final class Parcel
{
  // Fields

  public static final Parcelable.Creator<java.lang.String> STRING_CREATOR = null;

  // Constructors

  private Parcel(int arg1){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public final int readInt(){
    return 0;
  }
  public final void writeInt(int arg1){
  }
  public final byte readByte(){
    return (byte) 0;
  }
  public final long readLong(){
    return 0l;
  }
  public final void writeByte(byte arg1){
  }
  public final void writeLong(long arg1){
  }
  public final float readFloat(){
    return 0.0f;
  }
  public final void writeFloat(float arg1){
  }
  public final double readDouble(){
    return 0.0d;
  }
  public final void writeDouble(double arg1){
  }
  public final void writeString(java.lang.String arg1){
  }
  public final void writeArray(java.lang.Object [] arg1){
  }
  public static Parcel obtain(){
    return (Parcel) null;
  }
  protected static final Parcel obtain(int arg1){
    return (Parcel) null;
  }
  public final void recycle(){
  }
  public final void readIntArray(int [] arg1){
  }
  public final void readByteArray(byte [] arg1){
  }
  public final void writeInterfaceToken(java.lang.String arg1){
  }
  public final void readException(){
  }
  public final void readException(int arg1, java.lang.String arg2){
  }
  public final <T>java.util.ArrayList<T> createTypedArrayList(Parcelable.Creator<T> arg1){
    return (java.util.ArrayList) null;
  }
  public final void writeByteArray(byte [] arg1){
  }
  public final void writeByteArray(byte [] arg1, int arg2, int arg3){
  }
  public final void writeStringList(java.util.List<java.lang.String> arg1){
  }
  public final <T extends Parcelable>void writeTypedList(java.util.List<T> arg1){
  }
  public final void enforceInterface(java.lang.String arg1){
  }
  public final void writeNoException(){
  }
  public final ParcelFileDescriptor readFileDescriptor(){
    return (ParcelFileDescriptor) null;
  }
  public final void readStringArray(java.lang.String [] arg1){
  }
  public final java.lang.String [] readStringArray(){
    return (java.lang.String []) null;
  }
  public final void setDataPosition(int arg1){
  }
  public final void writeException(java.lang.Exception arg1){
  }
  public final void writeStrongBinder(IBinder arg1){
  }
  public final java.lang.String readString(){
    return (java.lang.String) null;
  }
  public final byte [] createByteArray(){
    return (byte []) null;
  }
  public final int readExceptionCode(){
    return 0;
  }
  public final <T extends Parcelable>T readParcelable(java.lang.ClassLoader arg1){
    return null;
  }
  public final void writeParcelable(Parcelable arg1, int arg2){
  }
  public final IBinder readStrongBinder(){
    return (IBinder) null;
  }
  public final void writeBundle(Bundle arg1){
  }
  public final Bundle readBundle(){
    return (Bundle) null;
  }
  public final Bundle readBundle(java.lang.ClassLoader arg1){
    return (Bundle) null;
  }
  public final void writeFileDescriptor(java.io.FileDescriptor arg1){
  }
  public final int [] createIntArray(){
    return (int []) null;
  }
  public final void writeIntArray(int [] arg1){
  }
  @com.francetelecom.rd.stubs.annotation.Code("content=arg1[0];")
  public final <T extends Parcelable>void writeTypedArray(T [] arg1, int arg2){
  }
  @com.francetelecom.rd.stubs.annotation.Code("return (T[]) new Object[]{ content};")
  public final <T>T [] createTypedArray(Parcelable.Creator<T> arg1){
    return (T []) null;
  }
  public final void readBinderList(java.util.List<IBinder> arg1){
  }
  public final <T>void readTypedList(java.util.List<T> arg1, Parcelable.Creator<T> arg2){
  }
  public final void writeStringArray(java.lang.String [] arg1){
  }
  public final int dataAvail(){
    return 0;
  }
  public final java.lang.CharSequence readCharSequence(){
    return (java.lang.CharSequence) null;
  }
  public final void writeCharSequence(java.lang.CharSequence arg1){
  }
  public final void readStringList(java.util.List<java.lang.String> arg1){
  }
  public final long [] createLongArray(){
    return (long []) null;
  }
  public final void writeMap(java.util.Map arg1){
  }
  public final void writeStrongInterface(IInterface arg1){
  }
  public final int dataPosition(){
    return 0;
  }
  public final void appendFrom(Parcel arg1, int arg2, int arg3){
  }
  public final <T>void readTypedArray(T [] arg1, Parcelable.Creator<T> arg2){
  }
  @com.francetelecom.rd.stubs.annotation.Code("return (T[]) new Object[]{ content};")
  public final <T>T [] readTypedArray(Parcelable.Creator<T> arg1){
    return (T []) null;
  }
  public final <T extends Parcelable>void writeParcelableArray(T [] arg1, int arg2){
  }
  public final java.lang.String [] createStringArray(){
    return (java.lang.String []) null;
  }
  public final void readLongArray(long [] arg1){
  }
  public final void writeLongArray(long [] arg1){
  }
  public final float [] createFloatArray(){
    return (float []) null;
  }
  public final void readList(java.util.List arg1, java.lang.ClassLoader arg2){
  }
  public final void writeList(java.util.List arg1){
  }
  public final int dataSize(){
    return 0;
  }
  public final java.util.ArrayList<java.lang.String> createStringArrayList(){
    return (java.util.ArrayList) null;
  }
  public final android.util.SparseBooleanArray readSparseBooleanArray(){
    return (android.util.SparseBooleanArray) null;
  }
  public final void writeSparseBooleanArray(android.util.SparseBooleanArray arg1){
  }
  public final java.lang.Object readValue(java.lang.ClassLoader arg1){
    return (java.lang.Object) null;
  }
  public final void unmarshall(byte [] arg1, int arg2, int arg3){
  }
  public final int dataCapacity(){
    return 0;
  }
  public final void setDataSize(int arg1){
  }
  public final void setDataCapacity(int arg1){
  }
  public final boolean pushAllowFds(boolean arg1){
    return false;
  }
  public final void restoreAllowFds(boolean arg1){
  }
  public final byte [] marshall(){
    return (byte []) null;
  }
  public final boolean hasFileDescriptors(){
    return false;
  }
  public final void writeSparseArray(android.util.SparseArray<java.lang.Object> arg1){
  }
  public final void writeBooleanArray(boolean [] arg1){
  }
  public final boolean [] createBooleanArray(){
    return (boolean []) null;
  }
  public final void readBooleanArray(boolean [] arg1){
  }
  public final void writeCharArray(char [] arg1){
  }
  public final char [] createCharArray(){
    return (char []) null;
  }
  public final void readCharArray(char [] arg1){
  }
  public final void writeFloatArray(float [] arg1){
  }
  public final void readFloatArray(float [] arg1){
  }
  public final void writeDoubleArray(double [] arg1){
  }
  public final double [] createDoubleArray(){
    return (double []) null;
  }
  public final void readDoubleArray(double [] arg1){
  }
  public final void writeBinderArray(IBinder [] arg1){
  }
  public final void writeCharSequenceArray(java.lang.CharSequence [] arg1){
  }
  public final IBinder [] createBinderArray(){
    return (IBinder []) null;
  }
  public final void readBinderArray(IBinder [] arg1){
  }
  public final void writeBinderList(java.util.List<IBinder> arg1){
  }
  public final void writeValue(java.lang.Object arg1){
  }
  public final void writeSerializable(java.io.Serializable arg1){
  }
  public final void readMap(java.util.Map arg1, java.lang.ClassLoader arg2){
  }
  public final java.util.HashMap readHashMap(java.lang.ClassLoader arg1){
    return (java.util.HashMap) null;
  }
  public final java.lang.CharSequence [] readCharSequenceArray(){
    return (java.lang.CharSequence []) null;
  }
  public final java.util.ArrayList readArrayList(java.lang.ClassLoader arg1){
    return (java.util.ArrayList) null;
  }
  public final java.lang.Object [] readArray(java.lang.ClassLoader arg1){
    return (java.lang.Object []) null;
  }
  public final android.util.SparseArray readSparseArray(java.lang.ClassLoader arg1){
    return (android.util.SparseArray) null;
  }
  public final java.util.ArrayList<IBinder> createBinderArrayList(){
    return (java.util.ArrayList) null;
  }
  public final Parcelable [] readParcelableArray(java.lang.ClassLoader arg1){
    return (Parcelable []) null;
  }
  public final java.io.Serializable readSerializable(){
    return (java.io.Serializable) null;
  }
}
