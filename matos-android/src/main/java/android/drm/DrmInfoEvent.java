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


public class DrmInfoEvent
  extends DrmEvent{
  // Fields

  public static final int TYPE_ALREADY_REGISTERED_BY_ANOTHER_ACCOUNT = 1;

  public static final int TYPE_REMOVE_RIGHTS = 2;

  public static final int TYPE_RIGHTS_INSTALLED = 3;

  public static final int TYPE_WAIT_FOR_RIGHTS = 4;

  public static final int TYPE_ACCOUNT_ALREADY_REGISTERED = 5;

  public static final int TYPE_RIGHTS_REMOVED = 6;

  // Constructors

  public DrmInfoEvent(int arg1, int arg2, java.lang.String arg3){
    super(0, 0, (java.lang.String) null, (java.util.HashMap) null);
  }
  public DrmInfoEvent(int arg1, int arg2, java.lang.String arg3, java.util.HashMap<java.lang.String, java.lang.Object> arg4){
    super(0, 0, (java.lang.String) null, (java.util.HashMap) null);
  }
}
