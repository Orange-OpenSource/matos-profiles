package gov.nist.core;

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


public interface LogLevels
{
  // Fields

  public static final int TRACE_NONE = 0;

  public static final int TRACE_FATAL = 2;

  public static final int TRACE_ERROR = 4;

  public static final int TRACE_WARN = 8;

  public static final int TRACE_INFO = 16;

  public static final int TRACE_DEBUG = 32;

  public static final int TRACE_TRACE = 64;

  public static final int TRACE_MESSAGES = 16;

  public static final int TRACE_EXCEPTION = 4;

}
