package java.lang;

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
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;
@ClassDone
public final class Character extends Object {
    public static final int MIN_RADIX = 2;
    public static final int MAX_RADIX = 36;
    public static final char MIN_VALUE=((char) 0);
    public static final char MAX_VALUE=((char) 65535);
    public Character(@FieldSet("b") char a0){}
    @FieldGet("b") 
    public char charValue(){ return ' ';}
    public int hashCode(){ return 0;}
    public boolean equals(Object a0){ return true;}
    public String toString(){ return "" + "Character.toString";}
    public static boolean isLowerCase(char a0){ return true;}
    public static boolean isUpperCase(char a0){ return true;}
    public static boolean isDigit(char a0){ return true;}
    public static char toLowerCase(char a0){ return ' ';}
    public static char toUpperCase(char a0){ return ' ';}
    public static int digit(char a0,int a1){ return 0;}
}

