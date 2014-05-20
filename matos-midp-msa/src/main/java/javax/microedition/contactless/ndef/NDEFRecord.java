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
@ClassDone
public class NDEFRecord {
	private byte [] b = new byte [100];
	
	public NDEFRecord(byte[] data, int offset) { b = data; }

	public NDEFRecord(NDEFRecordType recordType, byte[] id, byte[] payload) {b = payload; }

	public void	appendPayload(byte[] payload) {}

	public byte[] getId() { return b; }

	public NDEFMessage getNestedNDEFMessage(int offset) {return new NDEFMessage();}

	public byte[] getPayload() { return b; }

	public long	getPayloadLength() {return 0L; }

	public NDEFRecordType getRecordType() { return new NDEFRecordType(0x1234,"RecordType");}

	public void setId(byte[] id) {}

	public byte[] toByteArray() { return b; }

}
