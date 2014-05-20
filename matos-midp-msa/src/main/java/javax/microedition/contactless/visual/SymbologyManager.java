package javax.microedition.contactless.visual;

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

import javax.microedition.contactless.ContactlessException;

import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Code;
@ClassDone
public class SymbologyManager {
	 
	
	@Code("return new String []{\"aztec-code\", \"code-16k	code-39	code-49	code-93	code-128\", \"codebar\", \"data-matrix\", \"ean-upc\", \"interleaved-2-of-5	maxicode\", \"pdf417\", \"qr-code\" };")
	public static java.lang.String[] getGenerateSymbologies() {
		return null;
	}
    @Code("return new Class[] { javax.microedition.lcdui.Image.class };")
	public static java.lang.Class[] getImageClasses() {
		return null;
	}
    
	public static ImageProperties getImageProperties(java.lang.String symbologyName) throws ContactlessException {
		return null;
	}
	@Code("return new String []{\"aztec-code\", \"code-16k	code-39	code-49	code-93	code-128\", \"codebar\", \"data-matrix\", \"ean-upc\", \"interleaved-2-of-5	maxicode\", \"pdf417\", \"qr-code\" };")
	public static java.lang.String[] getReadSymbologies() {
		return null;
	}
}
