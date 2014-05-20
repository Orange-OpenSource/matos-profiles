package org.xmlpull.v1;

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


public class XmlPullParserFactory
{
  // Fields

  public static final java.lang.String PROPERTY_NAME = "org.xmlpull.v1.XmlPullParserFactory";

  protected java.util.ArrayList parserClasses;

  protected java.lang.String classNamesLocation;

  protected java.util.ArrayList serializerClasses;

  protected java.util.HashMap features;

  // Constructors

  protected XmlPullParserFactory(){
  }
  // Methods

  public static XmlPullParserFactory newInstance() throws XmlPullParserException{
    return (XmlPullParserFactory) null;
  }
  public static XmlPullParserFactory newInstance(java.lang.String arg1, java.lang.Class arg2) throws XmlPullParserException{
    return (XmlPullParserFactory) null;
  }
  public boolean getFeature(java.lang.String arg1){
    return false;
  }
  public void setFeature(java.lang.String arg1, boolean arg2) throws XmlPullParserException{
  }
  public void setNamespaceAware(boolean arg1){
  }
  public boolean isNamespaceAware(){
    return false;
  }
  public boolean isValidating(){
    return false;
  }
  public void setValidating(boolean arg1){
  }
  public XmlPullParser newPullParser() throws XmlPullParserException{
    return (XmlPullParser) null;
  }
  public XmlSerializer newSerializer() throws XmlPullParserException{
    return (XmlSerializer) null;
  }
}
