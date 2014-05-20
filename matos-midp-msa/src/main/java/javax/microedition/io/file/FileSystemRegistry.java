package javax.microedition.io.file;

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
import java.util.Vector;

import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.UseRule;
@ClassDone
public class FileSystemRegistry {
// Fields
// Methods
	@UseRule("FileSystemRegistry.addFileSystemListener")
    public static boolean addFileSystemListener(@CallBackRegister("file")javax.microedition.io.file.FileSystemListener listener){
    	return true;
    }
    public static boolean removeFileSystemListener(javax.microedition.io.file.FileSystemListener listener){
        return true;
    }
    public static java.util.Enumeration listRoots(){
    	Vector v = new Vector();
    	v.addElement(new String());
    	return v.elements();
    }
}
