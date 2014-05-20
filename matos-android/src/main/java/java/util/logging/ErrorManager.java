package java.util.logging;

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


public class ErrorManager
{
  // Fields

  public static final int GENERIC_FAILURE = 0;

  public static final int WRITE_FAILURE = 1;

  public static final int FLUSH_FAILURE = 2;

  public static final int CLOSE_FAILURE = 3;

  public static final int OPEN_FAILURE = 4;

  public static final int FORMAT_FAILURE = 5;

  // Constructors

  public ErrorManager(){
  }
  // Methods

  public void error(java.lang.String arg1, java.lang.Exception arg2, int arg3){
  }
}
