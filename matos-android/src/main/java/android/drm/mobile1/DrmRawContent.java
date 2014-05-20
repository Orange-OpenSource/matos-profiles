package android.drm.mobile1;

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
public class DrmRawContent
{
  // Fields

  public static final java.lang.String DRM_MIMETYPE_MESSAGE_STRING = "application/vnd.oma.drm.message";

  public static final java.lang.String DRM_MIMETYPE_CONTENT_STRING = "application/vnd.oma.drm.content";

  public static final int DRM_FORWARD_LOCK = 1;

  public static final int DRM_COMBINED_DELIVERY = 2;

  public static final int DRM_SEPARATE_DELIVERY = 3;

  public static final int DRM_SEPARATE_DELIVERY_DM = 4;

  public static final int DRM_UNKNOWN_DATA_LEN = -1;

  // Constructors

  public DrmRawContent(java.io.InputStream arg1, int arg2, java.lang.String arg3) throws DrmException, java.io.IOException{
  }
  // Methods

  protected void finalize(){
  }
  public int getContentLength(DrmRights arg1) throws DrmException{
    return 0;
  }
  public java.lang.String getContentType(){
    return (java.lang.String) null;
  }
  public int getRawType(){
    return 0;
  }
  public java.io.InputStream getContentInputStream(DrmRights arg1){
    return (java.io.InputStream) null;
  }
  public java.lang.String getRightsAddress(){
    return (java.lang.String) null;
  }
}
