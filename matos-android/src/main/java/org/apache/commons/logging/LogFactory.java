package org.apache.commons.logging;

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
public abstract class LogFactory
{
  // Fields

  public static final java.lang.String PRIORITY_KEY = "priority";

  public static final java.lang.String TCCL_KEY = "use_tccl";

  public static final java.lang.String FACTORY_PROPERTY = "org.apache.commons.logging.LogFactory";

  public static final java.lang.String FACTORY_DEFAULT = "org.apache.commons.logging.impl.LogFactoryImpl";

  public static final java.lang.String FACTORY_PROPERTIES = "commons-logging.properties";

  protected static final java.lang.String SERVICE_ID = (java.lang.String) null;

  public static final java.lang.String DIAGNOSTICS_DEST_PROPERTY = "org.apache.commons.logging.diagnostics.dest";

  public static final java.lang.String HASHTABLE_IMPLEMENTATION_PROPERTY = "org.apache.commons.logging.LogFactory.HashtableImpl";

  protected static java.util.Hashtable factories;

  protected static LogFactory nullClassLoaderFactory;

  // Constructors

  protected LogFactory(){
  }
  // Methods

  protected static java.lang.ClassLoader getClassLoader(java.lang.Class arg1){
    return (java.lang.ClassLoader) null;
  }
  public static LogFactory getFactory() throws LogConfigurationException{
    return (LogFactory) null;
  }
  public abstract Log getInstance(java.lang.Class arg1) throws LogConfigurationException;
  public abstract Log getInstance(java.lang.String arg1) throws LogConfigurationException;
  protected static java.lang.ClassLoader getContextClassLoader() throws LogConfigurationException{
    return (java.lang.ClassLoader) null;
  }
  public abstract void release();
  public static void release(java.lang.ClassLoader arg1){
  }
  public abstract java.lang.Object getAttribute(java.lang.String arg1);
  public abstract void setAttribute(java.lang.String arg1, java.lang.Object arg2);
  public abstract void removeAttribute(java.lang.String arg1);
  public abstract java.lang.String [] getAttributeNames();
  protected static LogFactory newFactory(java.lang.String arg1, java.lang.ClassLoader arg2, java.lang.ClassLoader arg3) throws LogConfigurationException{
    return (LogFactory) null;
  }
  protected static LogFactory newFactory(java.lang.String arg1, java.lang.ClassLoader arg2){
    return (LogFactory) null;
  }
  public static java.lang.String objectId(java.lang.Object arg1){
    return (java.lang.String) null;
  }
  public static void releaseAll(){
  }
  public static Log getLog(java.lang.Class arg1) throws LogConfigurationException{
    return (Log) null;
  }
  public static Log getLog(java.lang.String arg1) throws LogConfigurationException{
    return (Log) null;
  }
  protected static java.lang.ClassLoader directGetContextClassLoader() throws LogConfigurationException{
    return (java.lang.ClassLoader) null;
  }
  protected static java.lang.Object createFactory(java.lang.String arg1, java.lang.ClassLoader arg2){
    return (java.lang.Object) null;
  }
  protected static boolean isDiagnosticsEnabled(){
    return false;
  }
  protected static final void logRawDiagnostic(java.lang.String arg1){
  }
}
