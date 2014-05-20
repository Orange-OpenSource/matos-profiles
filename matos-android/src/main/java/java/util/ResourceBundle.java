package java.util;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.ResourceBundleImplem", superClass = "")
public abstract class ResourceBundle
{
  // Classes

  public static class Control
  {
    // Fields

    public static final List<java.lang.String> FORMAT_DEFAULT = null;

    public static final List<java.lang.String> FORMAT_CLASS = null;

    public static final List<java.lang.String> FORMAT_PROPERTIES = null;

    public static final long TTL_DONT_CACHE = -1l;

    public static final long TTL_NO_EXPIRATION_CONTROL = -2l;

    // Constructors

    protected Control(){
    }
    // Methods

    public List<java.lang.String> getFormats(java.lang.String arg1){
      return (List) null;
    }
    public long getTimeToLive(java.lang.String arg1, Locale arg2){
      return 0l;
    }
    public static ResourceBundle.Control getControl(List<java.lang.String> arg1){
      return (ResourceBundle.Control) null;
    }
    public static ResourceBundle.Control getNoFallbackControl(List<java.lang.String> arg1){
      return (ResourceBundle.Control) null;
    }
    public List<Locale> getCandidateLocales(java.lang.String arg1, Locale arg2){
      return (List) null;
    }
    public Locale getFallbackLocale(java.lang.String arg1, Locale arg2){
      return (Locale) null;
    }
    public ResourceBundle newBundle(java.lang.String arg1, Locale arg2, java.lang.String arg3, java.lang.ClassLoader arg4, boolean arg5) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.io.IOException{
      return (ResourceBundle) null;
    }
    public boolean needsReload(java.lang.String arg1, Locale arg2, java.lang.String arg3, java.lang.ClassLoader arg4, ResourceBundle arg5, long arg6){
      return false;
    }
    public java.lang.String toBundleName(java.lang.String arg1, Locale arg2){
      return (java.lang.String) null;
    }
    public final java.lang.String toResourceName(java.lang.String arg1, java.lang.String arg2){
      return (java.lang.String) null;
    }
  }
  // Fields

  protected ResourceBundle parent;

  // Constructors

  public ResourceBundle(){
  }
  // Methods

  public final java.lang.Object getObject(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public Set<java.lang.String> keySet(){
    return (Set) null;
  }
  public boolean containsKey(java.lang.String arg1){
    return false;
  }
  protected void setParent(ResourceBundle arg1){
  }
  public static ResourceBundle getBundle(java.lang.String arg1) throws MissingResourceException{
    return (ResourceBundle) null;
  }
  public static ResourceBundle getBundle(java.lang.String arg1, Locale arg2){
    return (ResourceBundle) null;
  }
  public static ResourceBundle getBundle(java.lang.String arg1, Locale arg2, java.lang.ClassLoader arg3) throws MissingResourceException{
    return (ResourceBundle) null;
  }
  public static ResourceBundle getBundle(java.lang.String arg1, ResourceBundle.Control arg2){
    return (ResourceBundle) null;
  }
  public static ResourceBundle getBundle(java.lang.String arg1, Locale arg2, ResourceBundle.Control arg3){
    return (ResourceBundle) null;
  }
  public static ResourceBundle getBundle(java.lang.String arg1, Locale arg2, java.lang.ClassLoader arg3, ResourceBundle.Control arg4){
    return (ResourceBundle) null;
  }
  public final java.lang.String getString(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public static void clearCache(){
  }
  public static void clearCache(java.lang.ClassLoader arg1){
  }
  public abstract Enumeration<java.lang.String> getKeys();
  public Locale getLocale(){
    return (Locale) null;
  }
  public final java.lang.String [] getStringArray(java.lang.String arg1){
    return (java.lang.String []) null;
  }
  protected abstract java.lang.Object handleGetObject(java.lang.String arg1);
  protected Set<java.lang.String> handleKeySet(){
    return (Set) null;
  }
}
