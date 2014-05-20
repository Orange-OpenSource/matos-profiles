package javax.microedition.contactless;

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

import javax.microedition.contactless.ndef.NDEFRecordListener;
import javax.microedition.contactless.ndef.NDEFRecordType;

import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;


public class DiscoveryManager {
	
	public void addNDEFRecordListener(@CallBackRegister("ndef") NDEFRecordListener listener, NDEFRecordType recordType) throws ContactlessException {
	}
	
	public void addTargetListener(@CallBackRegister("target") TargetListener listener, TargetType targetType) 
	throws ContactlessException, java.lang.IllegalStateException {
		
	} 
	
	public void addTransactionListener(@CallBackRegister("transaction")TransactionListener listener)  throws ContactlessException {
	 
	}
	
	public static DiscoveryManager getInstance() { return null; }
	@FieldGet("properties")
	public String getProperty(String name) { return null;}

	@Code("return new TargetType [] { TargetType.ISO14443_CARD, TargetType.NDEF_TAG, TargetType.RFID_TAG, TargetType.VISUAL_TAG };")
	public static TargetType[] getSupportedTargetTypes() { return null; } 
	
	public void removeNDEFRecordListener(NDEFRecordListener listener, NDEFRecordType recordType) {} 
	
	public void removeTargetListener(TargetListener listener, TargetType targetType) {}
	
	public void removeTransactionListener(TransactionListener listener) {}
	
	public void setProperty(String name, @FieldSet("properties")String value) { }
}
