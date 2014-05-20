package javax.microedition.location;

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
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;
@ClassDone
public class AddressInfo extends java.lang.Object{
// Fields
    public static final int EXTENSION = 1;
    public static final int STREET = 2;
    public static final int POSTAL_CODE = 3;
    public static final int CITY = 4;
    public static final int COUNTY = 5;
    public static final int STATE = 6;
    public static final int COUNTRY = 7;
    public static final int COUNTRY_CODE = 8;
    public static final int DISTRICT = 9;
    public static final int BUILDING_NAME = 10;
    public static final int BUILDING_FLOOR = 11;
    public static final int BUILDING_ROOM = 12;
    public static final int BUILDING_ZONE = 13;
    public static final int CROSSING1 = 14;
    public static final int CROSSING2 = 15;
    public static final int URL = 16;
    public static final int PHONE_NUMBER = 17;
    static final int DATA_SIZE = 17;
// Methods
    public  AddressInfo(){
        return;
    }
    @ArgsRule(value="AddressInfo.getField",pos={1})
    @FieldGet("f")
    public String getField(int field){
        return "" + "AddressInfo.getField";
    }
    public void setField(int field, @FieldSet("f") String value){
        return;
    }
}
