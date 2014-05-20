package org.w3c.dom;

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

@ClassDone
public class DOMException extends java.lang.RuntimeException{
// Fields
    public static final short WRONG_DOCUMENT_ERR = 4;
    public static final short INDEX_SIZE_ERR = 1;
    public static final short HIERARCHY_REQUEST_ERR = 3;
    public static final short NO_MODIFICATION_ALLOWED_ERR = 7;
    public static final short NOT_FOUND_ERR = 8;
    public static final short NOT_SUPPORTED_ERR = 9;
    public static final short INVALID_STATE_ERR = 11;
    public static final short INVALID_MODIFICATION_ERR = 13;
    public static final short INVALID_ACCESS_ERR = 15;
    public static final short TYPE_MISMATCH_ERR = 17;
    public short code;
// Methods
    public  DOMException(short code, String message){
        return;
    }
// Default constructor
    public DOMException(){ super(); }
}
