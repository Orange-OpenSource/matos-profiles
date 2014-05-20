package javax.microedition.lcdui;

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
public class TextField extends Item {
    public static final int ANY = 0;
    public static final int EMAILADDR = 1;
    public static final int NUMERIC = 2;
    public static final int PHONENUMBER = 3;
    public static final int URL = 4;
    public static final int DECIMAL = 5;
    public static final int PASSWORD = 65536;
    public static final int UNEDITABLE = 131072;
    public static final int SENSITIVE = 262144;
    public static final int NON_PREDICTIVE = 524288;
    public static final int INITIAL_CAPS_WORD = 1048576;
    public static final int INITIAL_CAPS_SENTENCE = 2097152;
    public static final int CONSTRAINT_MASK = 65535;
    public TextField(@FieldSet("this.label")String a0,@FieldSet("string") java.lang.String a1,int a2,int a3){}
    @FieldGet("string")
    public String getString(){ return "" + "TextField";}
    public void setString(@FieldSet("string") String a0){ return; }
    public int getChars(char[] a0){ return 0;}
    @Code("string=new String(arg1);")
    public void setChars(char[] a0,int a1,int a2){ return; }
    public void insert(@FieldSet("string") String a0,int a1){ return; }
    @Code("string=new String(arg1);")
    public void insert(char[] a0,int a1,int a2,int a3){ return; }
    public void delete(int a0,int a1){ return; }
    public int getMaxSize(){ return 0;}
    public int setMaxSize(int a0){ return 0;}
    public int size(){ return 0;}
    public int getCaretPosition(){ return 0;}
    public void setConstraints(int a0){ return; }
    public int getConstraints(){ return 0;}
    public void setInitialInputMode(String a0){ return; }
}

