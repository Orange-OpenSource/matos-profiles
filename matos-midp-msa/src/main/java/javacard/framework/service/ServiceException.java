package javacard.framework.service;

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
public class ServiceException extends javacard.framework.CardRuntimeException{
// Fields
    public static final short ILLEGAL_PARAM = 1;
    public static final short DISPATCH_TABLE_FULL = 2;
    public static final short COMMAND_DATA_TOO_LONG = 3;
    public static final short CANNOT_ACCESS_IN_COMMAND = 4;
    public static final short CANNOT_ACCESS_OUT_COMMAND = 5;
    public static final short COMMAND_IS_FINISHED = 6;
    public static final short REMOTE_OBJECT_NOT_EXPORTED = 7;
// Methods
    public  ServiceException(short reason){
       super((short) 0);
        return;
    }
    public static void throwIt(short reason)
		throws javacard.framework.service.ServiceException{
        return;
    }
//other constructor
    public ServiceException(){
       super((short) 0);
    }
}
