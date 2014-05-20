package javacard.framework;

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
public class APDUException extends javacard.framework.CardRuntimeException{
// Fields
    public static final short ILLEGAL_USE = 1;
    public static final short BUFFER_BOUNDS = 2;
    public static final short BAD_LENGTH = 3;
    public static final short IO_ERROR = 4;
    public static final short NO_T0_GETRESPONSE = 170;
    public static final short T1_IFD_ABORT = 171;
    public static final short NO_T0_REISSUE = 172;
// Methods
    public  APDUException(short reason){
       super((short) 0);
        return;
    }
    public static void throwIt(short reason){
        return;
    }
//other constructor
    public APDUException(){
       super((short) 0);
    }
}
