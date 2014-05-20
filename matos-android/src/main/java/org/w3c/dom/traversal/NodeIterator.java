package org.w3c.dom.traversal;

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


public interface NodeIterator
{
  // Methods

  public org.w3c.dom.Node nextNode() throws org.w3c.dom.DOMException;
  public void detach();
  public org.w3c.dom.Node getRoot();
  public int getWhatToShow();
  public NodeFilter getFilter();
  public boolean getExpandEntityReferences();
  public org.w3c.dom.Node previousNode() throws org.w3c.dom.DOMException;
}
