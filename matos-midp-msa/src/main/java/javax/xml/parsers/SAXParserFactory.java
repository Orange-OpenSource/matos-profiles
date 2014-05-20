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
@Real("com.francetelecom.rd.fakemidp.jsr172.SAXParserFactoryImplem")
abstract public class SAXParserFactory extends java.lang.Object{
// Fields
// Methods
    protected  SAXParserFactory(){
        return;
    }
    public static javax.xml.parsers.SAXParserFactory newInstance()
		throws javax.xml.parsers.FactoryConfigurationError{
        return null;
    }
    public abstract javax.xml.parsers.SAXParser newSAXParser()
		throws javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException;
    public void setNamespaceAware(boolean awareness){
        return;
    }
    public boolean isNamespaceAware(){
        return true;
    }
    public void setValidating(boolean validating){
        return;
    }
    public boolean isValidating(){
        return true;
    }
    public abstract void setFeature(String arg1, boolean arg2)
		throws javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
    public abstract boolean getFeature(String arg1)
		throws javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
}
