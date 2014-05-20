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

import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;

@ClassDone
public class NDEFRecordType {
	public static final int EMPTY = 0;
	public static final int EXTERNAL_RTD = 4;
	public static final int MIME = 2;
	public static final int NFC_FORUM_RTD = 1;
	public static final int UNKNOWN = 5;
	public static final int URI = 3;
	
	
	public NDEFRecordType(int format,@FieldSet("content") java.lang.String name) {
	}

	public int getFormat() { return 0;}
	@FieldGet("content")
	public java.lang.String getName() { return null; }

	public byte[] getNameAsBytes() { return null; }

}
