package javax.obex;

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


public final class ApplicationParameter
{
  // Classes

  public static class TRIPLET_TAGID
  {
    // Fields

    public static final byte ORDER_TAGID = 1;

    public static final byte SEARCH_VALUE_TAGID = 2;

    public static final byte SEARCH_ATTRIBUTE_TAGID = 3;

    public static final byte MAXLISTCOUNT_TAGID = 4;

    public static final byte LISTSTARTOFFSET_TAGID = 5;

    public static final byte FILTER_TAGID = 6;

    public static final byte FORMAT_TAGID = 7;

    public static final byte PHONEBOOKSIZE_TAGID = 8;

    public static final byte NEWMISSEDCALLS_TAGID = 9;

    // Constructors

    public TRIPLET_TAGID(){
    }
  }
  public static class TRIPLET_VALUE
  {
    // Classes

    public static class ORDER
    {
      // Fields

      public static final byte ORDER_BY_INDEX = 0;

      public static final byte ORDER_BY_ALPHANUMERIC = 1;

      public static final byte ORDER_BY_PHONETIC = 2;

      // Constructors

      public ORDER(){
      }
    }
    public static class SEARCHATTRIBUTE
    {
      // Fields

      public static final byte SEARCH_BY_NAME = 0;

      public static final byte SEARCH_BY_NUMBER = 1;

      public static final byte SEARCH_BY_SOUND = 2;

      // Constructors

      public SEARCHATTRIBUTE(){
      }
    }
    public static class FORMAT
    {
      // Fields

      public static final byte VCARD_VERSION_21 = 0;

      public static final byte VCARD_VERSION_30 = 1;

      // Constructors

      public FORMAT(){
      }
    }
    // Constructors

    public TRIPLET_VALUE(){
    }
  }
  public static class TRIPLET_LENGTH
  {
    // Fields

    public static final byte ORDER_LENGTH = 1;

    public static final byte SEARCH_ATTRIBUTE_LENGTH = 1;

    public static final byte MAXLISTCOUNT_LENGTH = 2;

    public static final byte LISTSTARTOFFSET_LENGTH = 2;

    public static final byte FILTER_LENGTH = 8;

    public static final byte FORMAT_LENGTH = 1;

    public static final byte PHONEBOOKSIZE_LENGTH = 2;

    public static final byte NEWMISSEDCALLS_LENGTH = 1;

    // Constructors

    public TRIPLET_LENGTH(){
    }
  }
  // Constructors

  public ApplicationParameter(){
  }
  // Methods

  public void addAPPHeader(byte arg1, byte arg2, byte [] arg3){
  }
  public byte [] getAPPparam(){
    return (byte []) null;
  }
}
