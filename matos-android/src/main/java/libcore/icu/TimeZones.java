package libcore.icu;

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
public final class TimeZones
{
  // Classes

  public static class ZoneStringsCache
    extends libcore.util.BasicLruCache<java.util.Locale, java.lang.String [] []>  {
    // Constructors

    public ZoneStringsCache(){
      super(0);
    }
    // Methods

    protected java.lang.String [] [] create(java.util.Locale arg1){
      return (java.lang.String [] []) null;
    }
  }
  // Fields

  public static final int OLSON_NAME = 0;

  public static final int LONG_NAME = 1;

  public static final int SHORT_NAME = 2;

  public static final int LONG_NAME_DST = 3;

  public static final int SHORT_NAME_DST = 4;

  public static final int NAME_COUNT = 5;

  // Constructors

  private TimeZones(){
  }
  // Methods

  public static java.lang.String getDisplayName(java.lang.String [] [] arg1, java.lang.String arg2, boolean arg3, int arg4){
    return (java.lang.String) null;
  }
  public static java.lang.String [] [] getZoneStrings(java.util.Locale arg1){
    return (java.lang.String [] []) null;
  }
  public static java.lang.String [] forLocale(java.util.Locale arg1){
    return (java.lang.String []) null;
  }
}
