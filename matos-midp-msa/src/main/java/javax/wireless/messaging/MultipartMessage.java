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
import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;

@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr120.MultipartMessageImplem")
public interface MultipartMessage extends javax.wireless.messaging.Message{
// Fields
// Methods
	@ArgsRule(value="MultipartMessage.addAddress", pos={1,2})
    public abstract boolean addAddress(String arg1, String arg2);
    public abstract void addMessagePart(javax.wireless.messaging.MessagePart arg1)
		throws javax.wireless.messaging.SizeExceededException;
    public abstract String getAddress();
    public abstract String[] getAddresses(String arg1);
    public abstract String getHeader(String arg1);
    public abstract javax.wireless.messaging.MessagePart getMessagePart(String arg1);
    public abstract javax.wireless.messaging.MessagePart[] getMessageParts();
    public abstract String getStartContentId();
    public abstract String getSubject();
    public abstract boolean removeAddress(String arg1, String arg2);
    public abstract void removeAddresses();
    public abstract void removeAddresses(String arg1);
    public abstract boolean removeMessagePart(javax.wireless.messaging.MessagePart arg1);
    public abstract boolean removeMessagePartId(String arg1);
    public abstract boolean removeMessagePartLocation(String arg1);
    @ArgsRule(value="MultipartMessage.setAddress", pos={1})
    public abstract void setAddress(String arg1);
    @ArgsRule(value="MultipartMessage.setHeader", pos={1,2})
    public abstract void setHeader(String arg1, String arg2);
    public abstract void setStartContentId(String arg1);
    public abstract void setSubject(String arg1);
}
