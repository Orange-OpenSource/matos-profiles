package org.apache.http.cookie;

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
public interface SetCookie
  extends Cookie
{
  // Methods

  public void setValue(java.lang.String arg1);
  public void setComment(java.lang.String arg1);
  public void setVersion(int arg1);
  public void setDomain(java.lang.String arg1);
  public void setPath(java.lang.String arg1);
  public void setSecure(boolean arg1);
  public void setExpiryDate(java.util.Date arg1);
}
