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


public class DrmEvent
{
  // Fields

  public static final int TYPE_ALL_RIGHTS_REMOVED = 1001;

  public static final int TYPE_DRM_INFO_PROCESSED = 1002;

  public static final java.lang.String DRM_INFO_STATUS_OBJECT = "drm_info_status_object";

  public static final java.lang.String DRM_INFO_OBJECT = "drm_info_object";

  // Constructors

  protected DrmEvent(int arg1, int arg2, java.lang.String arg3, java.util.HashMap<java.lang.String, java.lang.Object> arg4){
  }
  protected DrmEvent(int arg1, int arg2, java.lang.String arg3){
  }
  // Methods

  public java.lang.String getMessage(){
    return (java.lang.String) null;
  }
  public int getType(){
    return 0;
  }
  public java.lang.Object getAttribute(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public int getUniqueId(){
    return 0;
  }
}
