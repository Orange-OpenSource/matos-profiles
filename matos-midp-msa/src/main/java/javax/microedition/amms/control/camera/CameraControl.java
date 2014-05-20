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

@Real("com.francetelecom.rd.fakemidp.jsr234.CameraControlImplem")
@ClassDone
public interface CameraControl extends javax.microedition.media.Control{
// Fields
    public static final int ROTATE_LEFT = 2;
    public static final int ROTATE_RIGHT = 3;
    public static final int ROTATE_NONE = 1;
    public static final int UNKNOWN = -1004;
// Methods
    public abstract int getCameraRotation();
    public abstract void enableShutterFeedback(boolean arg1)
		throws javax.microedition.media.MediaException;
    public abstract boolean isShutterFeedbackEnabled();
    public abstract String[] getSupportedExposureModes();
    public abstract void setExposureMode(String arg1);
    public abstract String getExposureMode();
    public abstract int[] getSupportedVideoResolutions();
    public abstract int[] getSupportedStillResolutions();
    public abstract void setVideoResolution(int arg1);
    public abstract void setStillResolution(int arg1);
    public abstract int getVideoResolution();
    public abstract int getStillResolution();
}
