package org.apache.xml.serializer;

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


public interface SerializerTrace
{
  // Fields

  public static final int EVENTTYPE_STARTDOCUMENT = 1;

  public static final int EVENTTYPE_ENDDOCUMENT = 2;

  public static final int EVENTTYPE_STARTELEMENT = 3;

  public static final int EVENTTYPE_ENDELEMENT = 4;

  public static final int EVENTTYPE_CHARACTERS = 5;

  public static final int EVENTTYPE_IGNORABLEWHITESPACE = 6;

  public static final int EVENTTYPE_PI = 7;

  public static final int EVENTTYPE_COMMENT = 8;

  public static final int EVENTTYPE_ENTITYREF = 9;

  public static final int EVENTTYPE_CDATA = 10;

  public static final int EVENTTYPE_OUTPUT_PSEUDO_CHARACTERS = 11;

  public static final int EVENTTYPE_OUTPUT_CHARACTERS = 12;

  // Methods

  public void fireGenerateEvent(int arg1);
  public void fireGenerateEvent(int arg1, java.lang.String arg2, org.xml.sax.Attributes arg3);
  public void fireGenerateEvent(int arg1, char [] arg2, int arg3, int arg4);
  public void fireGenerateEvent(int arg1, java.lang.String arg2, java.lang.String arg3);
  public void fireGenerateEvent(int arg1, java.lang.String arg2);
  public boolean hasTraceListeners();
}
