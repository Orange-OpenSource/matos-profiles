package org.xml.sax.helpers;

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

import com.francetelecom.rd.stubs.annotation.CallBack;
import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.ClassDone;

@ClassDone
public class DefaultHandler extends java.lang.Object{
// Fields
// Methods
	@CallBackRegister("sax")
    public  DefaultHandler(){
        return;
    }
	@CallBack("sax")
    public org.xml.sax.InputSource resolveEntity(String publicId, String systemId)
		throws org.xml.sax.SAXException{
        return new org.xml.sax.InputSource();
    }
	@CallBack("sax")
    public void notationDecl(String name, String publicId, String systemId)
		throws org.xml.sax.SAXException{
        return;
    }
	@CallBack("sax")
    public void unparsedEntityDecl(String name, String publicIDd, String systemId, String notationName)
		throws org.xml.sax.SAXException{
        return;
    }
	@CallBack("sax")
    public void setDocumentLocator(org.xml.sax.Locator locator){
        return;
    }
	@CallBack("sax")
    public void startDocument()
		throws org.xml.sax.SAXException{
        return;
    }
	@CallBack("sax")
    public void endDocument()
		throws org.xml.sax.SAXException{
        return;
    }
	@CallBack("sax")
    public void startPrefixMapping(String prefix, String uri)
		throws org.xml.sax.SAXException{
        return;
    }
	@CallBack("sax")
    public void endPrefixMapping(String prefix)
		throws org.xml.sax.SAXException{
        return;
    }
	@CallBack("sax")
    public void startElement(String uri, String localName, String qName, org.xml.sax.Attributes attributes)
		throws org.xml.sax.SAXException{
        return;
    }
	@CallBack("sax")
    public void endElement(String uri, String localName, String qName)
		throws org.xml.sax.SAXException{
        return;
    }
	@CallBack("sax")
    public void characters(char[] ch, int start, int length)
		throws org.xml.sax.SAXException{
        return;
    }
	@CallBack("sax")
    public void ignorableWhitespace(char[] ch, int start, int length)
		throws org.xml.sax.SAXException{
        return;
    }
	@CallBack("sax")
    public void processingInstruction(String target, String data)
		throws org.xml.sax.SAXException{
        return;
    }
	@CallBack("sax")
    public void skippedEntity(String name)
		throws org.xml.sax.SAXException{
        return;
    }
	@CallBack("sax")
    public void warning(org.xml.sax.SAXParseException e)
		throws org.xml.sax.SAXException{
        return;
    }
	@CallBack("sax")
    public void error(org.xml.sax.SAXParseException e)
		throws org.xml.sax.SAXException{
        return;
    }
	@CallBack("sax")
    public void fatalError(org.xml.sax.SAXParseException e)
		throws org.xml.sax.SAXException{
        return;
    }
}
