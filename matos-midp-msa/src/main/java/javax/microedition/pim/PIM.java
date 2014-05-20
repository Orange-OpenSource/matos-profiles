package javax.microedition.pim;

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
@Real("com.francetelecom.rd.fakemidp.jsr075.PIMImplem")
abstract public class PIM extends java.lang.Object{
// Fields
    public static final int CONTACT_LIST = 1;
    public static final int EVENT_LIST = 2;
    public static final int TODO_LIST = 3;
    public static final int READ_ONLY = 1;
    public static final int WRITE_ONLY = 2;
    public static final int READ_WRITE = 3;
    static PIM pim;
// Methods
    public static javax.microedition.pim.PIM getInstance(){
        return null;
    }
    protected  PIM(){
        return;
    }
    @ArgsRule(value="PIM.openPIMList-1",pos={1,2})
    public abstract javax.microedition.pim.PIMList openPIMList(int arg1, int arg2)
		throws javax.microedition.pim.PIMException;
    @ArgsRule(value="PIM.openPIMList-2",pos={1,2,3})
    public abstract javax.microedition.pim.PIMList openPIMList(int arg1, int arg2, String arg3)
		throws javax.microedition.pim.PIMException;
    public abstract String[] listPIMLists(int arg1);
    @ArgsRule(value="PIM.fromSerialFormat",pos={1,2})
    public abstract javax.microedition.pim.PIMItem[] fromSerialFormat(java.io.InputStream arg1, String arg2)
		throws javax.microedition.pim.PIMException, java.io.UnsupportedEncodingException;
    @ArgsRule(value="PIM.toSerialFormat",pos={1,2,3})
    public abstract void toSerialFormat(javax.microedition.pim.PIMItem arg1, java.io.OutputStream arg2, String arg3, String arg4)
		throws javax.microedition.pim.PIMException, java.io.UnsupportedEncodingException;
    public abstract String[] supportedSerialFormats(int arg1);
}
