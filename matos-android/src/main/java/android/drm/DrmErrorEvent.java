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


public class DrmErrorEvent
  extends DrmEvent{
  // Fields

  public static final int TYPE_RIGHTS_NOT_INSTALLED = 2001;

  public static final int TYPE_RIGHTS_RENEWAL_NOT_ALLOWED = 2002;

  public static final int TYPE_NOT_SUPPORTED = 2003;

  public static final int TYPE_OUT_OF_MEMORY = 2004;

  public static final int TYPE_NO_INTERNET_CONNECTION = 2005;

  public static final int TYPE_PROCESS_DRM_INFO_FAILED = 2006;

  public static final int TYPE_REMOVE_ALL_RIGHTS_FAILED = 2007;

  public static final int TYPE_ACQUIRE_DRM_INFO_FAILED = 2008;

  // Constructors

  public DrmErrorEvent(int arg1, int arg2, java.lang.String arg3){
    super(0, 0, (java.lang.String) null, (java.util.HashMap) null);
  }
  public DrmErrorEvent(int arg1, int arg2, java.lang.String arg3, java.util.HashMap<java.lang.String, java.lang.Object> arg4){
    super(0, 0, (java.lang.String) null, (java.util.HashMap) null);
  }
}
