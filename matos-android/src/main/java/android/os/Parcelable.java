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
@com.francetelecom.rd.stubs.annotation.Accumulator("Content.c")
public interface Parcelable
{
  // Added
  static class Content { static public Parcelable c; }
  // Classes

  public static interface Creator<T>
  {
    // Methods

    public T [] newArray(int arg1);
    public T createFromParcel(Parcel arg1);
  }
  public static interface ClassLoaderCreator<T>
    extends Parcelable.Creator<T>
  {
    // Methods

    public T createFromParcel(Parcel arg1, java.lang.ClassLoader arg2);
  }
  // Fields

  public static final int PARCELABLE_WRITE_RETURN_VALUE = 1;

  public static final int CONTENTS_FILE_DESCRIPTOR = 1;

  // Methods

  public void writeToParcel(Parcel arg1, int arg2);
  public int describeContents();
}
