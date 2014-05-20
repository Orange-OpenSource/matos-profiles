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
@ClassDone
public class MessagePart extends java.lang.Object{
// Fields
    static int MAX_PART_SIZE_BYTES;
    static final int BUFFER_SIZE = 2048;
    byte[] content;
    String contentID;
    String contentLocation;
    String encoding;
    String mimeType;
    static final char US_ASCII_LOWEST_VALID_CHAR = 32;
    static final char US_ASCII_VALID_BIT_MASK = 127;

// Methods
    public  MessagePart(byte[] contents, int offset, int length, String mimeType, String contentId, String contentLocation, String enc)
		throws javax.wireless.messaging.SizeExceededException{
        return;
    }
    public  MessagePart(byte[] contents, String mimeType, String contentId, String contentLocation, String enc)
		throws javax.wireless.messaging.SizeExceededException{
        return;
    }
    public  MessagePart(java.io.InputStream is, String mimeType, String contentId, String contentLocation, String enc)
		throws java.io.IOException, javax.wireless.messaging.SizeExceededException{
    
        return;
    }
    public byte[] getContent(){
		byte[] bytes = new byte[1];
		bytes[0] = 0;
        return bytes;
    }
    
    @ArgsRule(value="MessagePart.getContentAsStream",pos={0,-1})
    public java.io.InputStream getContentAsStream(){
        return null;
    }
    public String getContentID(){
        return "" + "MessagePart.";
    }
    public String getContentLocation(){
        return "" + "MessagePart.";
    }
    public String getEncoding(){
        return "" + "MessagePart.";
    }
    public int getLength(){
        return 0;
    }
    public String getMIMEType(){
        return "" + "MessagePart.";
    }
// Default constructor
    public MessagePart(){ super(); }
}
