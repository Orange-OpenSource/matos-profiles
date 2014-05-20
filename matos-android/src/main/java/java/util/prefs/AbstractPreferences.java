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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.AbstractPreferencesImpl", superClass = "")
public abstract class AbstractPreferences
  extends Preferences{
  // Fields

  protected final java.lang.Object lock = (java.lang.Object) null;

  protected boolean newNode;

  // Constructors

  protected AbstractPreferences(AbstractPreferences arg1, java.lang.String arg2){
    super();
  }
  // Methods

  public java.lang.String name(){
    return (java.lang.String) null;
  }
  public Preferences parent(){
    return (Preferences) null;
  }
  public java.lang.String get(java.lang.String arg1, java.lang.String arg2){
    return (java.lang.String) null;
  }
  public void put(java.lang.String arg1, java.lang.String arg2){
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public boolean getBoolean(java.lang.String arg1, boolean arg2){
    return false;
  }
  public void putBoolean(java.lang.String arg1, boolean arg2){
  }
  public int getInt(java.lang.String arg1, int arg2){
    return 0;
  }
  public void putInt(java.lang.String arg1, int arg2){
  }
  public long getLong(java.lang.String arg1, long arg2){
    return 0l;
  }
  public void putLong(java.lang.String arg1, long arg2){
  }
  public float getFloat(java.lang.String arg1, float arg2){
    return 0.0f;
  }
  public void putFloat(java.lang.String arg1, float arg2){
  }
  public double getDouble(java.lang.String arg1, double arg2){
    return 0.0d;
  }
  public void putDouble(java.lang.String arg1, double arg2){
  }
  public void clear() throws BackingStoreException{
  }
  public void remove(java.lang.String arg1){
  }
  public void flush() throws BackingStoreException{
  }
  public java.lang.String [] keys() throws BackingStoreException{
    return (java.lang.String []) null;
  }
  public void sync() throws BackingStoreException{
  }
  protected AbstractPreferences getChild(java.lang.String arg1) throws BackingStoreException{
    return (AbstractPreferences) null;
  }
  public Preferences node(java.lang.String arg1){
    return (Preferences) null;
  }
  public byte [] getByteArray(java.lang.String arg1, byte [] arg2){
    return (byte []) null;
  }
  public java.lang.String absolutePath(){
    return (java.lang.String) null;
  }
  public java.lang.String [] childrenNames() throws BackingStoreException{
    return (java.lang.String []) null;
  }
  public void exportNode(java.io.OutputStream arg1) throws java.io.IOException, BackingStoreException{
  }
  public void exportSubtree(java.io.OutputStream arg1) throws java.io.IOException, BackingStoreException{
  }
  public boolean isUserNode(){
    return false;
  }
  public boolean nodeExists(java.lang.String arg1) throws BackingStoreException{
    return false;
  }
  public void putByteArray(java.lang.String arg1, byte [] arg2){
  }
  public void removeNode() throws BackingStoreException{
  }
  public void addNodeChangeListener(NodeChangeListener arg1){
  }
  public void addPreferenceChangeListener(PreferenceChangeListener arg1){
  }
  public void removeNodeChangeListener(NodeChangeListener arg1){
  }
  public void removePreferenceChangeListener(PreferenceChangeListener arg1){
  }
  protected abstract java.lang.String [] childrenNamesSpi() throws BackingStoreException;
  protected abstract AbstractPreferences childSpi(java.lang.String arg1);
  protected abstract void flushSpi() throws BackingStoreException;
  protected abstract java.lang.String getSpi(java.lang.String arg1);
  protected abstract java.lang.String [] keysSpi() throws BackingStoreException;
  protected abstract void putSpi(java.lang.String arg1, java.lang.String arg2);
  protected abstract void removeNodeSpi() throws BackingStoreException;
  protected abstract void removeSpi(java.lang.String arg1);
  protected abstract void syncSpi() throws BackingStoreException;
  protected boolean isRemoved(){
    return false;
  }
  protected final AbstractPreferences [] cachedChildren(){
    return (AbstractPreferences []) null;
  }
}
