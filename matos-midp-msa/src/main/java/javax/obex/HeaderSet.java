package javax.obex;

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

import com.francetelecom.rd.stubs.annotation.ArgsRule;
import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;

@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr082.HeaderSetImplem")
public interface HeaderSet{
// Fields
    public static final int COUNT = 192;
    public static final int NAME = 1;
    public static final int TYPE = 66;
    public static final int LENGTH = 195;
    public static final int TIME_ISO_8601 = 68;
    public static final int TIME_4_BYTE = 196;
    public static final int DESCRIPTION = 5;
    public static final int TARGET = 70;
    public static final int HTTP = 71;
    public static final int WHO = 74;
    public static final int OBJECT_CLASS = 79;
    public static final int APPLICATION_PARAMETER = 76;
// Methods
    @ArgsRule(value="HeaderSet.setHeader",pos={0,1,2})
    public abstract void setHeader(int arg1, Object arg2);
    public abstract Object getHeader(int arg1)
		throws java.io.IOException;
    public abstract int[] getHeaderList()
		throws java.io.IOException;
    public abstract void createAuthenticationChallenge(String arg1, boolean arg2, boolean arg3);
    public abstract int getResponseCode()
		throws java.io.IOException;
}
