package javax.xml.namespace;

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
public class QName extends java.lang.Object{
// Fields
// Methods
    public  QName(String namespaceURI, String localPart){
        return;
    }
    public  QName(String namespaceURI, String localPart, String prefix){
        return;
    }
    public  QName(String localPart){
        return;
    }
    public String getNamespaceURI(){
        return "" + "QName.";
    }
    public String getLocalPart(){
        return "" + "QName.";
    }
    public String getPrefix(){
        return "" + "QName.";
    }
    public boolean equals(Object objectToTest){
        return true;
    }
    public int hashCode(){
        return 0;
    }
    public String toString(){
        return "" + "QName.";
    }
    public static javax.xml.namespace.QName valueOf(String qNameAsString){
        return new javax.xml.namespace.QName("" + "QName.");
    }
// Default constructor
    public QName(){ super(); }
}
