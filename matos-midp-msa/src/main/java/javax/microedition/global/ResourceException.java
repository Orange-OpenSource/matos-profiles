package javax.microedition.global;

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
final public class ResourceException extends java.lang.RuntimeException{
// Fields
    public static final int DATA_ERROR = 5;
    public static final int METAFILE_NOT_FOUND = 7;
    public static final int NO_RESOURCES_FOR_BASE_NAME = 3;
    public static final int NO_SYSTEM_DEFAULT_LOCALE = 4;
    public static final int RESOURCE_NOT_FOUND = 1;
    public static final int UNKNOWN_ERROR = 0;
    public static final int UNKNOWN_RESOURCE_TYPE = 6;
    public static final int WRONG_RESOURCE_TYPE = 2;
// Methods
    public  ResourceException(int err, String message){
        return;
    }
    public int getErrorCode(){
        return 0;
    }
// Default constructor
    public ResourceException(){ super(); }
}
