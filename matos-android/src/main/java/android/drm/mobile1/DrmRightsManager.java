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
public class DrmRightsManager
{
  // Fields

  public static final java.lang.String DRM_MIMETYPE_RIGHTS_XML_STRING = "application/vnd.oma.drm.rights+xml";

  public static final java.lang.String DRM_MIMETYPE_RIGHTS_WBXML_STRING = "application/vnd.oma.drm.rights+wbxml";

  // Constructors

  protected DrmRightsManager(){
  }
  // Methods

  public static synchronized DrmRightsManager getInstance(){
    return (DrmRightsManager) null;
  }
  public synchronized DrmRights installRights(java.io.InputStream arg1, int arg2, java.lang.String arg3) throws DrmException, java.io.IOException{
    return (DrmRights) null;
  }
  public synchronized DrmRights queryRights(DrmRawContent arg1){
    return (DrmRights) null;
  }
  public synchronized java.util.List getRightsList(){
    return (java.util.List) null;
  }
  public synchronized void deleteRights(DrmRights arg1){
  }
}
