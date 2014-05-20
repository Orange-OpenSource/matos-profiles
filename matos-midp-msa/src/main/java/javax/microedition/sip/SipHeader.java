package javax.microedition.sip;

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
@ClassDone
public class SipHeader extends java.lang.Object{
// Fields
// Methods
	@ArgsRule(value="SipHeader",pos={0,1,2})
    public  SipHeader(String name, String value)
		throws java.lang.IllegalArgumentException{
        return;
    }
    
	@ArgsRule(value="SipHeader.setName",pos={0,1})
    public void setName(String name)
		throws java.lang.IllegalArgumentException{
        return;
    }
    public String getName(){
        return "" + "SipHeader.";
    }
    public String getValue(){
        return "" + "SipHeader.";
    }
    public String getHeaderValue(){
        return "" + "SipHeader.";
    }
    @ArgsRule(value="SipHeader.setValue",pos={0,1})
    public void setValue(String value)
		throws java.lang.IllegalArgumentException{
        return;
    }
    public String getParameter(String name){
        return "" + "SipHeader.";
    }
    public String[] getParameterNames(){
    	java.lang.String [] str = new java.lang.String[1];
    	str[0] = new java.lang.String();
        return str;
    }
    public void setParameter(String name, String value)
		throws java.lang.IllegalArgumentException{
        return;
    }
    public void removeParameter(String name){
        return;
    }
    public String toString(){
        return "" + "SipHeader.";
    }
// Default constructor
    public SipHeader(){ super(); }
}
