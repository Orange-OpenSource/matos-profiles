package org.apache.commons.logging.impl;

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
public class LogFactoryImpl
  extends org.apache.commons.logging.LogFactory{
  // Fields

  public static final java.lang.String LOG_PROPERTY = "org.apache.commons.logging.Log";

  protected static final java.lang.String LOG_PROPERTY_OLD = (java.lang.String) null;

  public static final java.lang.String ALLOW_FLAWED_CONTEXT_PROPERTY = "org.apache.commons.logging.Log.allowFlawedContext";

  public static final java.lang.String ALLOW_FLAWED_DISCOVERY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedDiscovery";

  public static final java.lang.String ALLOW_FLAWED_HIERARCHY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedHierarchy";

  protected java.util.Hashtable attributes;

  protected java.util.Hashtable instances;

  protected java.lang.reflect.Constructor logConstructor;

  protected java.lang.Class [] logConstructorSignature;

  protected java.lang.reflect.Method logMethod;

  protected java.lang.Class [] logMethodSignature;

  // Constructors

  public LogFactoryImpl(){
    super();
  }
  // Methods

  protected static java.lang.ClassLoader getClassLoader(java.lang.Class arg1){
    return (java.lang.ClassLoader) null;
  }
  public org.apache.commons.logging.Log getInstance(java.lang.Class arg1) throws org.apache.commons.logging.LogConfigurationException{
    return (org.apache.commons.logging.Log) null;
  }
  public org.apache.commons.logging.Log getInstance(java.lang.String arg1) throws org.apache.commons.logging.LogConfigurationException{
    return (org.apache.commons.logging.Log) null;
  }
  protected org.apache.commons.logging.Log newInstance(java.lang.String arg1) throws org.apache.commons.logging.LogConfigurationException{
    return (org.apache.commons.logging.Log) null;
  }
  protected static java.lang.ClassLoader getContextClassLoader() throws org.apache.commons.logging.LogConfigurationException{
    return (java.lang.ClassLoader) null;
  }
  public void release(){
  }
  public java.lang.Object getAttribute(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public void setAttribute(java.lang.String arg1, java.lang.Object arg2){
  }
  public void removeAttribute(java.lang.String arg1){
  }
  public java.lang.String [] getAttributeNames(){
    return (java.lang.String []) null;
  }
  protected static boolean isDiagnosticsEnabled(){
    return false;
  }
  protected void logDiagnostic(java.lang.String arg1){
  }
  protected java.lang.String getLogClassName(){
    return (java.lang.String) null;
  }
  protected java.lang.reflect.Constructor getLogConstructor() throws org.apache.commons.logging.LogConfigurationException{
    return (java.lang.reflect.Constructor) null;
  }
  protected boolean isJdk13LumberjackAvailable(){
    return false;
  }
  protected boolean isJdk14Available(){
    return false;
  }
  protected boolean isLog4JAvailable(){
    return false;
  }
}
