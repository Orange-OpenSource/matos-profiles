package org.xml.sax;

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
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;

@ClassDone
public class InputSource extends java.lang.Object{
// Fields
// Methods
    public  InputSource(){
        return;
    }

    public  InputSource(String systemId){
        return;
    }
    
   
    @ArgsRule(value="InputSource-1", pos={0,1})    
    public  InputSource(@FieldSet("is") java.io.InputStream byteStream){
    }
    @ArgsRule(value="InputSource-2", pos={0,1})    
    public  InputSource(@FieldSet("reader") java.io.Reader characterStream){
    }
    public void setPublicId(String publicId){
        return;
    }
    public String getPublicId(){
        return "" + "InputSource.";
    }
    public void setSystemId(String systemId){
        return;
    }
    public String getSystemId(){
        return "" + "InputSource.";
    }
    
    public void setByteStream(@FieldSet("is") java.io.InputStream byteStream){
    }
    
    @FieldGet("is")
    public java.io.InputStream getByteStream(){
        return null;
    }
    public void setEncoding(String encoding){
        return;
    }
    public String getEncoding(){
        return "" + "InputSource.";
    }
    public void setCharacterStream(@FieldSet("reader") java.io.Reader characterStream){
        return;
    }
    @FieldGet("reader")
    public java.io.Reader getCharacterStream(){
    	return null;
    }
}
