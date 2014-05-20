package javax.microedition.xml.rpc;

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

@ClassDone
public class Operation extends java.lang.Object{
// Fields
    public static final String SOAPACTION_URI_PROPERTY = "javax.xml.rpc.soap.http.soapaction.uri";
// Methods
    protected  Operation(){
        return;
    }
    public static javax.microedition.xml.rpc.Operation newInstance(javax.xml.namespace.QName name, javax.microedition.xml.rpc.Element input, javax.microedition.xml.rpc.Element output){
        return new Operation();
    }
    public static javax.microedition.xml.rpc.Operation newInstance(javax.xml.namespace.QName name, javax.microedition.xml.rpc.Element input, javax.microedition.xml.rpc.Element output, javax.microedition.xml.rpc.FaultDetailHandler faultDetailHandler){
        return new Operation();
    }
    public void setProperty(String name, String value)
		throws java.lang.IllegalArgumentException{
        return;
    }
    public Object invoke(Object inParams)
		throws javax.xml.rpc.JAXRPCException{
        return new java.lang.Object();
    }
}
