package javax.microedition.amms;

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

import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;
@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr234.MediaProcessorImplem")
public interface MediaProcessor extends javax.microedition.media.Controllable{
// Fields
    public static final int UNKNOWN = -1;
    public static final int UNREALIZED = 100;
    public static final int REALIZED = 200;
    public static final int STARTED = 400;
    public static final int STOPPED = 300;
// Methods
    public abstract void setInput(java.io.InputStream arg1, int arg2)
		throws javax.microedition.media.MediaException;
    public abstract void setInput(Object arg1)
		throws javax.microedition.media.MediaException;
    public abstract void setOutput(java.io.OutputStream arg1);
    public abstract void start()
		throws javax.microedition.media.MediaException;
    public abstract void stop()
		throws javax.microedition.media.MediaException;
    public abstract void complete()
		throws javax.microedition.media.MediaException;
    public abstract void abort();
    public abstract void addMediaProcessorListener(@CallBackRegister("mediaprocessor") javax.microedition.amms.MediaProcessorListener arg1);
    public abstract void removeMediaProcessorListener(javax.microedition.amms.MediaProcessorListener arg1);
    public abstract int getProgress();
    public abstract int getState();
}
