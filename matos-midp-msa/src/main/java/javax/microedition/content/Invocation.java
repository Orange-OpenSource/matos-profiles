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
import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;
final public class Invocation extends java.lang.Object{
// Fields
    public static final int INIT = 1;
    public static final int ACTIVE = 2;
    public static final int WAITING = 3;
    public static final int HOLD = 4;
    public static final int OK = 5;
    public static final int CANCELLED = 6;
    public static final int ERROR = 7;
    public static final int INITIATED = 8;
// Methods
   
    public  Invocation(){
        return;
    }
    @ArgsRule(value="Invocation-1",pos={0,1,2,3})
    public  Invocation(@FieldSet("url")String url, @FieldSet("type")String type, @FieldSet("id") String ID){
    }
    @ArgsRule(value="Invocation-2",pos={0,1,2})
    public  Invocation(@FieldSet("url") String url, @FieldSet("type") String type){
    }
    @ArgsRule(value="Invocation-3",pos={0,1})
    public  Invocation(@FieldSet("url") String url){
    }
    @ArgsRule(value="Invocation-4",pos={0,1,2,3,5})
    public  Invocation(@FieldSet("url") String url, @FieldSet("type") String type,@FieldSet("id") String ID, boolean responseRequired, String action){
    }
    public void setArgs(@FieldSet("args") String[] args){
        return;
    }
    @FieldGet("args")
    public String[] getArgs(){ return null;
    }
    public void setData(byte[] data){
        return;
    }
    public byte[] getData(){
		byte[] bytes = new byte[1];
		bytes[0] = 0;
        return bytes;
    }
    @FieldGet("url")
    public String getURL(){ return null;
    }
    @ArgsRule(value="Invocation.setURL",pos={0,1})
    public void setURL(@FieldSet("url") String url){
    }
    @FieldGet("type")
    public String getType(){
        return "" + "Invocation.";
    }
    @ArgsRule(value="Invocation.setType",pos={0,1})
    public void setType(@FieldSet("type") String type){
        return;
    }
    @FieldGet("action")
    public String getAction(){
        return "" + "Invocation.";
    }
    @ArgsRule(value="Invocation.setAction",pos={0,1})
    public void setAction(@FieldSet("action") String action){
        return;
    }
    public boolean getResponseRequired(){
        return true;
    }
    public void setResponseRequired(boolean responseRequired){
        return;
    }
    public int getStatus(){
        return 0;
    }
    @FieldGet("id")
    public String getID(){
        return "" + "Invocation.";
    }
    @ArgsRule(value="Invocation.setID",pos={0,1})
    public void setID(@FieldSet("id") String ID){
        return;
    }
    public javax.microedition.content.Invocation getPrevious(){
        return new javax.microedition.content.Invocation();
    }
    public String getInvokingAuthority(){
        return "" + "Invocation.";
    }
    public String getInvokingID(){
        return "" + "Invocation.";
    }
    public String getInvokingAppName(){
        return "" + "Invocation.";
    }
    public String findType()
		throws java.io.IOException, javax.microedition.content.ContentHandlerException, java.lang.SecurityException{
        return "" + "Invocation.";
    }
    
    @ArgsRule(value="Invocation.open",pos={-1,0})
    public javax.microedition.io.Connection open(boolean timeouts)
		throws java.io.IOException, java.lang.SecurityException{
        return null;
    }
    @ArgsRule(value="Invocation.setCredentials",pos={0,1,2})
    public void setCredentials(String username, char[] password){
        return;
    }
}
