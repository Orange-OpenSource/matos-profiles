package javax.xml.parsers;

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
@Real("com.francetelecom.rd.fakemidp.jsr172.SAXParserImplem")
abstract public class SAXParser extends java.lang.Object{
// Fields
// Methods
    protected  SAXParser(){
        return;
    }
    public abstract void parse(java.io.InputStream arg1, org.xml.sax.helpers.DefaultHandler arg2)
		throws org.xml.sax.SAXException, java.io.IOException;
    public abstract void parse(org.xml.sax.InputSource arg1, org.xml.sax.helpers.DefaultHandler arg2)
		throws org.xml.sax.SAXException, java.io.IOException;
    public abstract boolean isNamespaceAware();
    public abstract boolean isValidating();
}
