package javax.microedition.amms.control.camera;

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
import com.francetelecom.rd.stubs.annotation.Real;

@Real("com.francetelecom.rd.fakemidp.jsr234.SnapshotControlImplem")
@ClassDone
public interface SnapshotControl extends javax.microedition.media.Control{
// Fields
    public static final String SHOOTING_STOPPED = "SHOOTING_STOPPED";
    public static final String STORAGE_ERROR = "STORAGE_ERROR";
    public static final String WAITING_UNFREEZE = "WAITING_UNFREEZE";
    public static final int FREEZE = -2;
    public static final int FREEZE_AND_CONFIRM = -1;
// Methods
    public abstract void setDirectory(String arg1);
    public abstract String getDirectory();
    public abstract void setFilePrefix(String arg1);
    public abstract String getFilePrefix();
    public abstract void setFileSuffix(String arg1);
    public abstract String getFileSuffix();
    public abstract void start(int arg1)
		throws java.lang.SecurityException;
    public abstract void stop();
    public abstract void unfreeze(boolean arg1);
}
