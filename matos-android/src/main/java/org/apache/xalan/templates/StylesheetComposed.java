package org.apache.xalan.templates;

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


public class StylesheetComposed
  extends Stylesheet{
  // Constructors

  public StylesheetComposed(Stylesheet arg1){
    super((Stylesheet) null);
  }
  // Methods

  public void recompose(java.util.Vector arg1) throws javax.xml.transform.TransformerException{
  }
  public boolean isAggregatedType(){
    return false;
  }
  public int getImportCountComposed(){
    return 0;
  }
  public void recomposeTemplates(boolean arg1) throws javax.xml.transform.TransformerException{
  }
  public int getIncludeCountComposed(){
    return 0;
  }
  public Stylesheet getIncludeComposed(int arg1) throws java.lang.ArrayIndexOutOfBoundsException{
    return (Stylesheet) null;
  }
  public int getEndImportCountComposed(){
    return 0;
  }
  public StylesheetComposed getImportComposed(int arg1) throws java.lang.ArrayIndexOutOfBoundsException{
    return (StylesheetComposed) null;
  }
}
