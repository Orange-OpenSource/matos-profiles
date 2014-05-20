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
public class Element extends javax.microedition.xml.rpc.Type{
// Fields
    public final javax.xml.namespace.QName name;
    public final javax.microedition.xml.rpc.Type contentType;
    public final boolean isNillable = true;
    public final boolean isArray = true;
    public final boolean isOptional = true;
    public final int minOccurs = 0;
    public final int maxOccurs = 0;
    public static final int UNBOUNDED = -1;
// Methods
    public  Element(javax.xml.namespace.QName name, javax.microedition.xml.rpc.Type type, int minOccurs, int maxOccurs, boolean nillable)
		throws java.lang.IllegalArgumentException{
    	this.name = name;
    	this.contentType = type;
        return;
    }
    public  Element(javax.xml.namespace.QName name, javax.microedition.xml.rpc.Type type)
		throws java.lang.IllegalArgumentException{
    	this.name = name;
    	this.contentType = type;
        return;
    }
}
