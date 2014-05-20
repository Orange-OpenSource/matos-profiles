package org.apache.xalan.xslt;

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


public class EnvironmentCheck
{
  // Fields

  public static final java.lang.String ERROR = "ERROR.";

  public static final java.lang.String WARNING = "WARNING.";

  public static final java.lang.String ERROR_FOUND = "At least one error was found!";

  public static final java.lang.String VERSION = "version.";

  public static final java.lang.String FOUNDCLASSES = "foundclasses.";

  public static final java.lang.String CLASS_PRESENT = "present-unknown-version";

  public static final java.lang.String CLASS_NOTPRESENT = "not-present";

  public java.lang.String [] jarNames;

  protected java.io.PrintWriter outWriter;

  // Constructors

  public EnvironmentCheck(){
  }
  // Methods

  public static void main(java.lang.String [] arg1){
  }
  public boolean checkEnvironment(java.io.PrintWriter arg1){
    return false;
  }
  public java.util.Hashtable getEnvironmentHash(){
    return (java.util.Hashtable) null;
  }
  protected boolean writeEnvironmentReport(java.util.Hashtable arg1){
    return false;
  }
  protected boolean logFoundJars(java.util.Vector arg1, java.lang.String arg2){
    return false;
  }
  public void appendEnvironmentReport(org.w3c.dom.Node arg1, org.w3c.dom.Document arg2, java.util.Hashtable arg3){
  }
  protected boolean appendFoundJars(org.w3c.dom.Node arg1, org.w3c.dom.Document arg2, java.util.Vector arg3, java.lang.String arg4){
    return false;
  }
  protected void checkSystemProperties(java.util.Hashtable arg1){
  }
  protected java.util.Vector checkPathForJars(java.lang.String arg1, java.lang.String [] arg2){
    return (java.util.Vector) null;
  }
  protected java.lang.String getApparentVersion(java.lang.String arg1, long arg2){
    return (java.lang.String) null;
  }
  protected void checkJAXPVersion(java.util.Hashtable arg1){
  }
  protected void checkProcessorVersion(java.util.Hashtable arg1){
  }
  protected void checkParserVersion(java.util.Hashtable arg1){
  }
  protected void checkAntVersion(java.util.Hashtable arg1){
  }
  protected void checkDOMVersion(java.util.Hashtable arg1){
  }
  protected void checkSAXVersion(java.util.Hashtable arg1){
  }
  protected void logMsg(java.lang.String arg1){
  }
}
