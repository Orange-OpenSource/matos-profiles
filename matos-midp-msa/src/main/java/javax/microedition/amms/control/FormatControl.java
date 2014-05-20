package javax.microedition.amms.control;

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

@Real("com.francetelecom.rd.fakemidp.jsr234.FormatControlImplem")
@ClassDone
public interface FormatControl extends javax.microedition.media.Control{
// Fields
    public static final int METADATA_NOT_SUPPORTED = 0;
    public static final int METADATA_SUPPORTED_FIXED_KEYS = 1;
    public static final int METADATA_SUPPORTED_FREE_KEYS = 2;
    public static final String PARAM_BITRATE = "bitrate";
    public static final String PARAM_BITRATE_TYPE = "bitrate type";
    public static final String PARAM_SAMPLERATE = "sample rate";
    public static final String PARAM_FRAMERATE = "frame rate";
    public static final String PARAM_QUALITY = "quality";
    public static final String PARAM_VERSION_TYPE = "version type";
// Methods
    public abstract String[] getSupportedFormats();
    public abstract String[] getSupportedStrParameters();
    public abstract String[] getSupportedIntParameters();
    public abstract String[] getSupportedStrParameterValues(String arg1);
    public abstract int[] getSupportedIntParameterRange(String arg1);
    public abstract void setFormat(String arg1);
    public abstract String getFormat();
    public abstract int setParameter(String arg1, int arg2);
    public abstract void setParameter(String arg1, String arg2);
    public abstract String getStrParameterValue(String arg1);
    public abstract int getIntParameterValue(String arg1);
    public abstract int getEstimatedBitRate()
		throws javax.microedition.media.MediaException;
    public abstract void setMetadata(String arg1, String arg2)
		throws javax.microedition.media.MediaException;
    public abstract String[] getSupportedMetadataKeys();
    public abstract int getMetadataSupportMode();
    public abstract void setMetadataOverride(boolean arg1);
    public abstract boolean getMetadataOverride();
}
