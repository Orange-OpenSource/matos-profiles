package java.text.spi;

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


public abstract class DateFormatProvider
  extends java.util.spi.LocaleServiceProvider{
  // Constructors

  protected DateFormatProvider(){
    super();
  }
  // Methods

  public abstract java.text.DateFormat getDateTimeInstance(int arg1, int arg2, java.util.Locale arg3);
  public abstract java.text.DateFormat getTimeInstance(int arg1, java.util.Locale arg2);
  public abstract java.text.DateFormat getDateInstance(int arg1, java.util.Locale arg2);
}
