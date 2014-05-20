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
public class SipAddress extends java.lang.Object{
// Fields
// Methods
	@ArgsRule(value="SipAddress-1", pos={1})
    public  SipAddress(String address)
		throws java.lang.IllegalArgumentException{
        return;
    }
	@ArgsRule(value="SipAddress-2", pos={1,2})
    public  SipAddress(String displayName, String URI)
		throws java.lang.IllegalArgumentException{
        return;
    }
    public String getDisplayName(){
        return "" + "SipAddress.";
    }
    public void setDisplayName(String name)
		throws java.lang.IllegalArgumentException{
        return;
    }
    public String getScheme(){
        return "" + "SipAddress.";
    }
    public void setScheme(String scheme)
		throws java.lang.IllegalArgumentException{
        return;
    }
    public String getUser(){
        return "" + "SipAddress.";
    }
    public void setUser(String user)
		throws java.lang.IllegalArgumentException{
        return;
    }
    public String getURI(){
        return "" + "SipAddress.";
    }
    @ArgsRule(value="SipAddress.setURI", pos={1})
    public void setURI(String URI)
		throws java.lang.IllegalArgumentException{
        return;
    }
    public String getHost(){
        return "" + "SipAddress.";
    }
    @ArgsRule(value="SipAddress.setHost", pos={1})
    public void setHost(String host)
		throws java.lang.IllegalArgumentException{
        return;
    }
    public int getPort(){
        return 0;
    }
    public void setPort(int port)
		throws java.lang.IllegalArgumentException{
        return;
    }
    public String getParameter(String name){
        return "" + "SipAddress.";
    }
    public void setParameter(String name, String value)
		throws java.lang.IllegalArgumentException{
        return;
    }
    public void removeParameter(String name){
        return;
    }
    public String[] getParameterNames(){
    	java.lang.String [] str = new java.lang.String[1];
    	str[0] = new java.lang.String();
        return str;
    }
    public String toString(){
        return "" + "SipAddress.";
    }
// Default constructor
    public SipAddress(){ super(); }
}
