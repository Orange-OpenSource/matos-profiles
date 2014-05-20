package org.w3c.dom.ls;

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


public interface LSParser
{
  // Fields

  public static final short ACTION_APPEND_AS_CHILDREN = 1;

  public static final short ACTION_REPLACE_CHILDREN = 2;

  public static final short ACTION_INSERT_BEFORE = 3;

  public static final short ACTION_INSERT_AFTER = 4;

  public static final short ACTION_REPLACE = 5;

  // Methods

  public org.w3c.dom.Document parse(LSInput arg1) throws org.w3c.dom.DOMException, LSException;
  public void abort();
  public LSParserFilter getFilter();
  public void setFilter(LSParserFilter arg1);
  public org.w3c.dom.DOMConfiguration getDomConfig();
  public boolean getAsync();
  public boolean getBusy();
  public org.w3c.dom.Document parseURI(java.lang.String arg1) throws org.w3c.dom.DOMException, LSException;
  public org.w3c.dom.Node parseWithContext(LSInput arg1, org.w3c.dom.Node arg2, short arg3) throws org.w3c.dom.DOMException, LSException;
}
