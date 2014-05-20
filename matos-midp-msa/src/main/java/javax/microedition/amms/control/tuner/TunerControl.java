package javax.microedition.amms.control.tuner;

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

@Real("com.francetelecom.rd.fakemidp.jsr234.TunerControlImplem")
@ClassDone
public interface TunerControl extends javax.microedition.media.Control{
// Fields
    public static final int MONO = 1;
    public static final int STEREO = 2;
    public static final int AUTO = 3;
    public static final String MODULATION_FM = "fm";
    public static final String MODULATION_AM = "am";
// Methods
    public abstract int getMinFreq(String arg1);
    public abstract int getMaxFreq(String arg1);
    public abstract int setFrequency(int arg1, String arg2);
    public abstract int getFrequency();
    public abstract int seek(int arg1, String arg2, boolean arg3)
		throws javax.microedition.media.MediaException;
    public abstract boolean getSquelch();
    public abstract void setSquelch(boolean arg1)
		throws javax.microedition.media.MediaException;
    public abstract String getModulation();
    public abstract int getSignalStrength()
		throws javax.microedition.media.MediaException;
    public abstract int getStereoMode();
    public abstract void setStereoMode(int arg1);
    public abstract int getNumberOfPresets();
    public abstract void usePreset(int arg1);
    public abstract void setPreset(int arg1);
    public abstract void setPreset(int arg1, int arg2, String arg3, int arg4);
    public abstract int getPresetFrequency(int arg1);
    public abstract String getPresetModulation(int arg1);
    public abstract int getPresetStereoMode(int arg1)
		throws javax.microedition.media.MediaException;
    public abstract String getPresetName(int arg1);
    public abstract void setPresetName(int arg1, String arg2);
}
