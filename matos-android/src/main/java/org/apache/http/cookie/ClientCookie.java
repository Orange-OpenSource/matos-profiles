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
public interface ClientCookie
  extends Cookie
{
  // Fields

  public static final java.lang.String VERSION_ATTR = "version";

  public static final java.lang.String PATH_ATTR = "path";

  public static final java.lang.String DOMAIN_ATTR = "domain";

  public static final java.lang.String MAX_AGE_ATTR = "max-age";

  public static final java.lang.String SECURE_ATTR = "secure";

  public static final java.lang.String COMMENT_ATTR = "comment";

  public static final java.lang.String EXPIRES_ATTR = "expires";

  public static final java.lang.String PORT_ATTR = "port";

  public static final java.lang.String COMMENTURL_ATTR = "commenturl";

  public static final java.lang.String DISCARD_ATTR = "discard";

  // Methods

  public java.lang.String getAttribute(java.lang.String arg1);
  public boolean containsAttribute(java.lang.String arg1);
}
