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
import com.francetelecom.rd.stubs.annotation.ArgsRule;
import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.ClassDone;
@ClassDone
public class Registry extends java.lang.Object{
	
// Fields
// Methods
    public static javax.microedition.content.Registry getRegistry(String classname){
        return null;
    }
    public static javax.microedition.content.ContentHandlerServer getServer(String classname)
		throws javax.microedition.content.ContentHandlerException{
    	return null;
    }
    @ArgsRule(value="Registry.register", pos= {1,2,3,4,5,6})
    public javax.microedition.content.ContentHandlerServer register(String classname, String[] types, String[] suffixes, String[] actions, javax.microedition.content.ActionNameMap[] actionnames, String ID, String[] accessAllowed)
		throws java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.ClassNotFoundException, javax.microedition.content.ContentHandlerException{
    	return null;
    }
    public boolean unregister(String classname){
        return true;
    }
    public String[] getTypes(){ return null; }
    public String[] getIDs(){ return null; }
    public String[] getActions(){ return null; }
    public String[] getSuffixes(){ return null; }
    
    
    public javax.microedition.content.ContentHandler[] forType(String type){
        return null;
    }
    public javax.microedition.content.ContentHandler[] forAction(String action){
        return null;
    }
    public javax.microedition.content.ContentHandler[] forSuffix(String suffix){
        return null;
    }
    public javax.microedition.content.ContentHandler forID(String ID, boolean exact){
    	return null;
    }
    public javax.microedition.content.ContentHandler[] findHandler(javax.microedition.content.Invocation invocation)
		throws java.io.IOException, javax.microedition.content.ContentHandlerException, java.lang.SecurityException{
        return null;
    }
    public boolean invoke(javax.microedition.content.Invocation invocation, javax.microedition.content.Invocation previous)
		throws java.lang.IllegalArgumentException, java.io.IOException, javax.microedition.content.ContentHandlerException, java.lang.SecurityException{
        return true;
    }
    public boolean invoke(javax.microedition.content.Invocation invocation)
		throws java.lang.IllegalArgumentException, java.io.IOException, javax.microedition.content.ContentHandlerException, java.lang.SecurityException{
        return true;
    }
    public boolean reinvoke(javax.microedition.content.Invocation invocation)
		throws java.lang.IllegalArgumentException, java.io.IOException, javax.microedition.content.ContentHandlerException, java.lang.SecurityException{
        return true;
    }
    public javax.microedition.content.Invocation getResponse(boolean wait){
        return new javax.microedition.content.Invocation();
    }
    public void cancelGetResponse(){
        return;
    }
    public void setListener(@CallBackRegister("chandler") javax.microedition.content.ResponseListener listener){

    }
    public String getID(){
        return "" + "Registry.";
    }
// Default constructor
    public Registry(){ super(); }
}
