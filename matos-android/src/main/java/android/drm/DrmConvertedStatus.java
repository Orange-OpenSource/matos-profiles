package android.drm;

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


public class DrmConvertedStatus
{
  // Fields

  public static final int STATUS_OK = 1;

  public static final int STATUS_INPUTDATA_ERROR = 2;

  public static final int STATUS_ERROR = 3;

  public final int statusCode = 0;

  public final byte [] convertedData = (byte []) null;

  public final int offset = 0;

  // Constructors

  public DrmConvertedStatus(int arg1, byte [] arg2, int arg3){
  }
}
