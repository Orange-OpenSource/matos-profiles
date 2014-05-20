package javax.xml.rpc;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2004 - 2014 Orange SA
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

import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;

@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr172.StubImplem")
public interface Stub{
// Fields
    public static final String USERNAME_PROPERTY = "javax.xml.rpc.security.auth.username";
    public static final String PASSWORD_PROPERTY = "javax.xml.rpc.security.auth.password";
    public static final String ENDPOINT_ADDRESS_PROPERTY = "javax.xml.rpc.service.endpoint.address";
    public static final String SESSION_MAINTAIN_PROPERTY = "javax.xml.rpc.session.maintain";
// Methods
    public abstract void _setProperty(String arg1, Object arg2);
    public abstract Object _getProperty(String arg1);
}
