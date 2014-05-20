package java.util.prefs;

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


public abstract class Preferences
{
  // Fields

  public static final int MAX_KEY_LENGTH = 80;

  public static final int MAX_NAME_LENGTH = 80;

  public static final int MAX_VALUE_LENGTH = 8192;

  // Constructors

  protected Preferences(){
  }
  // Methods

  public abstract java.lang.String name();
  public abstract Preferences parent();
  public abstract java.lang.String get(java.lang.String arg1, java.lang.String arg2);
  public abstract void put(java.lang.String arg1, java.lang.String arg2);
  public abstract java.lang.String toString();
  public abstract boolean getBoolean(java.lang.String arg1, boolean arg2);
  public abstract void putBoolean(java.lang.String arg1, boolean arg2);
  public abstract int getInt(java.lang.String arg1, int arg2);
  public abstract void putInt(java.lang.String arg1, int arg2);
  public abstract long getLong(java.lang.String arg1, long arg2);
  public abstract void putLong(java.lang.String arg1, long arg2);
  public abstract float getFloat(java.lang.String arg1, float arg2);
  public abstract void putFloat(java.lang.String arg1, float arg2);
  public abstract double getDouble(java.lang.String arg1, double arg2);
  public abstract void putDouble(java.lang.String arg1, double arg2);
  public abstract void clear() throws BackingStoreException;
  public abstract void remove(java.lang.String arg1);
  public abstract void flush() throws BackingStoreException;
  public abstract java.lang.String [] keys() throws BackingStoreException;
  public abstract void sync() throws BackingStoreException;
  public abstract Preferences node(java.lang.String arg1);
  public abstract byte [] getByteArray(java.lang.String arg1, byte [] arg2);
  public abstract java.lang.String absolutePath();
  public abstract java.lang.String [] childrenNames() throws BackingStoreException;
  public abstract void exportNode(java.io.OutputStream arg1) throws java.io.IOException, BackingStoreException;
  public abstract void exportSubtree(java.io.OutputStream arg1) throws java.io.IOException, BackingStoreException;
  public abstract boolean isUserNode();
  public abstract boolean nodeExists(java.lang.String arg1) throws BackingStoreException;
  public abstract void putByteArray(java.lang.String arg1, byte [] arg2);
  public abstract void removeNode() throws BackingStoreException;
  public abstract void addNodeChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("doPref") NodeChangeListener arg1);
  public abstract void addPreferenceChangeListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("doPref") PreferenceChangeListener arg1);
  public abstract void removeNodeChangeListener(NodeChangeListener arg1);
  public abstract void removePreferenceChangeListener(PreferenceChangeListener arg1);
  public static Preferences userRoot(){
    return (Preferences) null;
  }
  public static void importPreferences(java.io.InputStream arg1) throws InvalidPreferencesFormatException, java.io.IOException{
  }
  public static Preferences systemNodeForPackage(java.lang.Class<?> arg1){
    return (Preferences) null;
  }
  public static Preferences systemRoot(){
    return (Preferences) null;
  }
  public static Preferences userNodeForPackage(java.lang.Class<?> arg1){
    return (Preferences) null;
  }
}
