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

import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;

@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr075.ContactImplem")
public interface Contact extends javax.microedition.pim.PIMItem{
// Fields
    public static final int ADDR = 100;
    public static final int BIRTHDAY = 101;
    public static final int CLASS = 102;
    public static final int EMAIL = 103;
    public static final int FORMATTED_ADDR = 104;
    public static final int FORMATTED_NAME = 105;
    public static final int NAME = 106;
    public static final int NICKNAME = 107;
    public static final int NOTE = 108;
    public static final int ORG = 109;
    public static final int PHOTO = 110;
    public static final int PHOTO_URL = 111;
    public static final int PUBLIC_KEY = 112;
    public static final int PUBLIC_KEY_STRING = 113;
    public static final int REVISION = 114;
    public static final int TEL = 115;
    public static final int TITLE = 116;
    public static final int UID = 117;
    public static final int URL = 118;
    public static final int ATTR_ASST = 1;
    public static final int ATTR_AUTO = 2;
    public static final int ATTR_FAX = 4;
    public static final int ATTR_HOME = 8;
    public static final int ATTR_MOBILE = 16;
    public static final int ATTR_OTHER = 32;
    public static final int ATTR_PAGER = 64;
    public static final int ATTR_PREFERRED = 128;
    public static final int ATTR_SMS = 256;
    public static final int ATTR_WORK = 512;
    public static final int ADDR_POBOX = 0;
    public static final int ADDR_EXTRA = 1;
    public static final int ADDR_STREET = 2;
    public static final int ADDR_LOCALITY = 3;
    public static final int ADDR_REGION = 4;
    public static final int ADDR_POSTALCODE = 5;
    public static final int ADDR_COUNTRY = 6;
    public static final int NAME_FAMILY = 0;
    public static final int NAME_GIVEN = 1;
    public static final int NAME_OTHER = 2;
    public static final int NAME_PREFIX = 3;
    public static final int NAME_SUFFIX = 4;
    public static final int CLASS_CONFIDENTIAL = 200;
    public static final int CLASS_PRIVATE = 201;
    public static final int CLASS_PUBLIC = 202;
// Methods
    public abstract int getPreferredIndex(int arg1);
}
