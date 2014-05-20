package javax.bluetooth;

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
import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;
@ClassDone
public class DataElement extends java.lang.Object{
// Fields
    public static final int NULL = 0;
    public static final int U_INT_1 = 8;
    public static final int U_INT_2 = 9;
    public static final int U_INT_4 = 10;
    public static final int U_INT_8 = 11;
    public static final int U_INT_16 = 12;
    public static final int INT_1 = 16;
    public static final int INT_2 = 17;
    public static final int INT_4 = 18;
    public static final int INT_8 = 19;
    public static final int INT_16 = 20;
    public static final int URL = 64;
    public static final int UUID = 24;
    public static final int BOOL = 40;
    public static final int STRING = 32;
    public static final int DATSEQ = 48;
    public static final int DATALT = 56;
// Methods
    public  DataElement(int valueType){
        return;
    }
    public  DataElement(boolean bool){
        return;
    }
    public  DataElement(int valueType, long value){
        return;
    }
    public  DataElement(int valueType, @FieldSet("content") Object value){
        return;
    }
    @Code("content = arg1.content;")
    public synchronized void addElement(javax.bluetooth.DataElement elem){
        return;
    }
    @Code("content = arg1.content;")
    public synchronized void insertElementAt(javax.bluetooth.DataElement elem, int index){
        return;
    }
    public synchronized int getSize(){
        return 0;
    }
    public boolean removeElement(javax.bluetooth.DataElement elem){
        return true;
    }
    public int getDataType(){
        return 0;
    }
    public long getLong(){
        return 0L;
    }
    public boolean getBoolean(){
        return true;
    }
    @FieldGet("content")
    public synchronized Object getValue(){
        return new java.lang.Object();
    }
// Default constructor
    public DataElement(){ super(); }
}
