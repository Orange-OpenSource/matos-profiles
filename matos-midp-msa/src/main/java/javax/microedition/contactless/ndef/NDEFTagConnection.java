package javax.microedition.contactless.ndef;

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

import java.io.IOException;

import javax.microedition.contactless.ContactlessException;
import javax.microedition.contactless.TagConnection;

import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;
@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr257.NDEFTagConnectionImplem")
public interface NDEFTagConnection extends TagConnection {
	 public NDEFMessage readNDEF() throws ContactlessException, IOException;
	 public void writeNDEF(NDEFMessage message) throws ContactlessException, IOException;
}
