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

@Real("com.francetelecom.rd.fakemidp.jsr234.ExposureControlImplem")
@ClassDone
public interface ExposureControl extends javax.microedition.media.Control{
// Fields
// Methods
    public abstract int[] getSupportedFStops();
    public abstract int getFStop();
    public abstract void setFStop(int arg1)
		throws javax.microedition.media.MediaException;
    public abstract int getMinExposureTime();
    public abstract int getMaxExposureTime();
    public abstract int getExposureTime();
    public abstract int setExposureTime(int arg1)
		throws javax.microedition.media.MediaException;
    public abstract int[] getSupportedISOs();
    public abstract int getISO();
    public abstract void setISO(int arg1)
		throws javax.microedition.media.MediaException;
    public abstract int[] getSupportedExposureCompensations();
    public abstract int getExposureCompensation();
    public abstract void setExposureCompensation(int arg1)
		throws javax.microedition.media.MediaException;
    public abstract int getExposureValue();
    public abstract String[] getSupportedLightMeterings();
    public abstract void setLightMetering(String arg1);
    public abstract String getLightMetering();
}
