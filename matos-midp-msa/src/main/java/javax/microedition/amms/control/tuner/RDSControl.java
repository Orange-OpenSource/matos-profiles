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

@Real("com.francetelecom.rd.fakemidp.jsr234.RDSControlImplem")
@ClassDone
public interface RDSControl extends javax.microedition.media.Control{
// Fields
    public static final String RDS_NEW_DATA = "RDS_NEW_DATA";
    public static final String RDS_NEW_ALARM = "RDS_ALARM";
    public static final String RADIO_CHANGED = "radio_changed";
// Methods
    public abstract boolean isRDSSignal();
    public abstract String getPS();
    public abstract String getRT();
    public abstract short getPTY();
    public abstract String getPTYString(boolean arg1);
    public abstract short getPI();
    public abstract int[] getFreqsByPTY(short arg1);
    public abstract int[][] getFreqsByTA(boolean arg1);
    public abstract String[] getPSByPTY(short arg1);
    public abstract String[] getPSByTA(boolean arg1);
    public abstract java.util.Date getCT();
    public abstract boolean getTA();
    public abstract boolean getTP();
    public abstract void setAutomaticSwitching(boolean arg1)
		throws javax.microedition.media.MediaException;
    public abstract boolean getAutomaticSwitching();
    public abstract void setAutomaticTA(boolean arg1)
		throws javax.microedition.media.MediaException;
    public abstract boolean getAutomaticTA();
}
