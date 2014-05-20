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

import com.francetelecom.rd.stubs.annotation.CallBack;
import com.francetelecom.rd.stubs.annotation.ClassDone;
@ClassDone
public interface MediaProcessorListener{
// Fields
    public static final String PROCESSOR_REALIZED = "processRealized";
    public static final String PROCESSING_STARTED = "processingStarted";
    public static final String PROCESSING_STOPPED = "processingStopped";
    public static final String PROCESSING_ABORTED = "processingAborted";
    public static final String PROCESSING_COMPLETED = "processingCompleted";
    public static final String PROCESSING_ERROR = "processingError";
// Methods
    @CallBack("mediaprocessor") 
    public abstract void mediaProcessorUpdate(javax.microedition.amms.MediaProcessor arg1, String arg2, Object arg3);
}
