package javax.microedition.io;

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
public class Connector extends Object {
    public static final int READ = 1;
    public static final int WRITE = 2;
    public static final int READ_WRITE = 3;
    @ArgsRule(value="Connector.open-1",pos={1})
    public static Connection open(String a0) throws java.io.IOException {
	return null;
    }
    @ArgsRule(value="Connector.open-2",pos={1,2})
    public static Connection open(String a0,int a1)throws java.io.IOException {
    	return null;
    } 
    @ArgsRule(value="Connector.open-3",pos={1,2,3})
    public static Connection open(String a0,int a1,boolean a2) 
	throws java.io.IOException 
    {  
    	return null;
    } 
    @ArgsRule(value="Connector.openDataInputStream",pos={1})
    public static java.io.DataInputStream openDataInputStream(String a0) 
	throws java.io.IOException
    {  
    	return null;
    } 
    @ArgsRule(value="Connector.openDataOutputStream",pos={1})
    public static java.io.DataOutputStream openDataOutputStream(String a0) 
	throws java.io.IOException
    {  
    	return null;
    } 
    @ArgsRule(value="Connector.openInputStream",pos={1})
    public static java.io.InputStream openInputStream(String a0) 
	throws java.io.IOException
    {  
    	return null;
    } 
    @ArgsRule(value="Connector.openOutputStream",pos={1})
    public static java.io.OutputStream openOutputStream(String a0) 
	throws java.io.IOException
    {  
	return null;
    } 
}

