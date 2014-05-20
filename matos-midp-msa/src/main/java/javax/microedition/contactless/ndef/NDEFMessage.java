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
import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;

@ClassDone
public class NDEFMessage {
	
	public NDEFMessage() {
	}
	public NDEFMessage(byte[] data, int offset) {}
	@Code("content=arg1[0];")
	public NDEFMessage(NDEFRecord[] records) {}

	public void	appendRecord(NDEFRecord record) {
	} 
	public int getNumberOfRecords() { return 0;
	}
	@FieldGet("content")
	public NDEFRecord getRecord(byte[] id){ return null;
	} 
	@FieldGet("content")
	public NDEFRecord getRecord(int index){ return null;
	}
	@Code("return new NDEFRecord[]{content};")
	public NDEFRecord[] getRecord(NDEFRecordType recordType){ return null;
	}
	@Code("return new NDEFRecord[]{content};")
	public NDEFRecord[] getRecords(){ return null;
	}

	public NDEFRecordType[] getRecordTypes(){ return null;
	}

	public void insertRecord(int index,@FieldSet("content") NDEFRecord record){
	}

	public void removeRecord(int index){}

	public void setRecord(int index,@FieldSet("content") NDEFRecord record){
	}

	public byte[] toByteArray(){ return null;}

}
