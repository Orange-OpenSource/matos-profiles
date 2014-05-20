package  com.nokia.mid.messaging;

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
import javax.wireless.messaging.MessageListener;

import com.francetelecom.rd.stubs.annotation.ClassDone;
@ClassDone
public class MessageConnection implements javax.wireless.messaging.MessageConnection {
		// Nokia emulator used to generate the original version of that
		// file uses String for "message type", just as reference JSR
		// spec : 
		public static final String TEXT_MESSAGE="text";
		public static final String BINARY_MESSAGE="binary";
		public javax.wireless.messaging.Message newMessage(String a0) {
			if (a0.equals(TEXT_MESSAGE)) return new TextMessage();
			else return new BinaryMessage();
		}
		public javax.wireless.messaging.Message newMessage(String a0,java.lang.String a1) {
			if (a0.equals(TEXT_MESSAGE)) return new TextMessage();
			else return new BinaryMessage();
		}
		//===============================================================


		// BUT : Official nokia messenging API uses int rather than String :
		public javax.wireless.messaging.Message newMessage(int a0) {
			if (a0==1) return new TextMessage(); 
			else return new BinaryMessage();
		}

		public javax.wireless.messaging.Message newMessage(int a0,java.lang.String a1) {
			if (a0==1) return new TextMessage();
			else return new BinaryMessage();
		}
		//===============================================================
		/*
		public Message newMessage(int a) {
			return new BinaryMessage();
		}
		*/

		public void send(javax.wireless.messaging.Message a0) 
			throws java.io.IOException, java.io.InterruptedIOException 
		{} 

		public void send(Message a) 
			throws java.io.IOException, java.io.InterruptedIOException 
		{}

		public javax.wireless.messaging.Message receive() 
			throws java.io.IOException, java.io.InterruptedIOException
		{ return new TextMessage(); }
		public void setMessageListener(MessageListener a0)
			throws java.io.IOException
		{ }
		public int numberOfSegments(javax.wireless.messaging.Message a0) { return 0; }
		public void close() {}
}

