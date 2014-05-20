package javax.microedition.content;

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
@Real("com.francetelecom.rd.fakemidp.jsr211.ContentHandlerImplem")
public interface ContentHandler{
// Fields
    public static final String ACTION_OPEN = "open";
    public static final String ACTION_EDIT = "edit";
    public static final String ACTION_SEND = "send";
    public static final String ACTION_SAVE = "save";
    public static final String ACTION_EXECUTE = "execute";
    public static final String ACTION_SELECT = "select";
    public static final String ACTION_INSTALL = "install";
    public static final String ACTION_PRINT = "print";
    public static final String ACTION_NEW = "new";
    public static final String ACTION_STOP = "stop";
    public static final String UNIVERSAL_TYPE = "*";
// Methods
    public abstract String getID();
    public abstract String getType(int arg1);
    public abstract int getTypeCount();
    public abstract boolean hasType(String arg1);
    public abstract String getSuffix(int arg1);
    public abstract int getSuffixCount();
    public abstract boolean hasSuffix(String arg1);
    public abstract String getAction(int arg1);
    public abstract int getActionCount();
    public abstract boolean hasAction(String arg1);
    public abstract javax.microedition.content.ActionNameMap getActionNameMap();
    public abstract javax.microedition.content.ActionNameMap getActionNameMap(String arg1);
    public abstract int getActionNameMapCount();
    public abstract javax.microedition.content.ActionNameMap getActionNameMap(int arg1);
    public abstract String getAppName();
    public abstract String getVersion();
    public abstract String getAuthority();
}
