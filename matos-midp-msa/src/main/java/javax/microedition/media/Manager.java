package javax.microedition.media;

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
import javax.microedition.media.protocol.DataSource;

import com.francetelecom.rd.stubs.annotation.ArgsRule;
import com.francetelecom.rd.stubs.annotation.ClassDone;
@ClassDone
public final class Manager extends Object {
    public static final String TONE_DEVICE_LOCATOR=null;
    public static final String MIDI_DEVICE_LOCATOR=null;
    protected static boolean Debug;
    public static String[] getSupportedContentTypes(java.lang.String a0)
    { return new String[0];}

    public static String[] getSupportedProtocols(java.lang.String a0)
    { return new String[0];}
    @ArgsRule(value="Player.createPlayer-1",pos={1,-1})
    public static Player createPlayer(String a0)
	throws java.io.IOException, MediaException 
    { return null; }
    @ArgsRule(value="Player.createPlayer-2",pos={1,-1})
    public static Player createPlayer(DataSource a0) 
	throws java.io.IOException, MediaException 
    { return null; }
    @ArgsRule(value="Player.createPlayer-3",pos={1,2,-1})
    public static Player createPlayer(java.io.InputStream a0,String a1) 
	throws java.io.IOException, MediaException 
    { return null; }

    public static void playTone(int a0,int a1,int a2) 
	throws MediaException
    { return; }
    
    public static TimeBase getSystemTimeBase() 
    { return null; }
}

