package javax.wireless.messaging;

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

import com.francetelecom.rd.stubs.annotation.ArgsRule;
import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;
import com.francetelecom.rd.stubs.annotation.UseRule;

@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr120.MessageConnectionImplem")
public interface MessageConnection extends javax.microedition.io.Connection{
// Fields
    public static final String TEXT_MESSAGE = "text";
    public static final String BINARY_MESSAGE = "binary";
    public static final String MULTIPART_MESSAGE = "multipart";
// Methods
    @ArgsRule(value="MessageConnection.newMessage-1",pos={1})
    public abstract javax.wireless.messaging.Message newMessage(String arg1);
    @ArgsRule(value="MessageConnection.newMessage-2",pos={1,2})
    public abstract javax.wireless.messaging.Message newMessage(String arg1, String arg2);
    @UseRule("MessageConnection.send")
    public abstract void send(javax.wireless.messaging.Message arg1)
		throws java.io.IOException, java.io.InterruptedIOException;
    @UseRule("MessageConnection.receive")
    public abstract javax.wireless.messaging.Message receive()
		throws java.io.IOException, java.io.InterruptedIOException;
    public abstract void setMessageListener(@CallBackRegister("message")javax.wireless.messaging.MessageListener arg1)
		throws java.io.IOException;
    public abstract int numberOfSegments(javax.wireless.messaging.Message arg1);
}
