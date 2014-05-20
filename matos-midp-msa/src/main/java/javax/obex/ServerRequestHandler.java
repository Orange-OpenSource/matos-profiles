package javax.obex;

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
public class ServerRequestHandler extends java.lang.Object{
// Fields
// Methods
    protected  ServerRequestHandler(){
        return;
    }
    public final javax.obex.HeaderSet createHeaderSet(){
    	return null;
    }
    public void setConnectionID(long id){
        return;
    }
    public long getConnectionID(){
        return 0L;
    }
    @CallBack("serverobex") 
    public int onConnect(javax.obex.HeaderSet request, javax.obex.HeaderSet reply){
        return 0;
    }
    @CallBack("serverobex")
    public void onDisconnect(javax.obex.HeaderSet request, javax.obex.HeaderSet reply){
        return;
    }
    @CallBack("serverobex")
    public int onSetPath(javax.obex.HeaderSet request, javax.obex.HeaderSet reply, boolean backup, boolean create){
        return 0;
    }
    @CallBack("serverobex")
    public int onDelete(javax.obex.HeaderSet request, javax.obex.HeaderSet reply){
        return 0;
    }
    @CallBack("serverobex")
    public int onPut(javax.obex.Operation op){
        return 0;
    }
    @CallBack("serverobex")
    public int onGet(javax.obex.Operation op){
        return 0;
    }
    @CallBack("serverobex")
    public void onAuthenticationFailure(byte[] userName){
        return;
    }
}
