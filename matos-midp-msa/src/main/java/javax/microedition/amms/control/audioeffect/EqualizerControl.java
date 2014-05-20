package javax.microedition.amms.control.audioeffect;

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

@Real("com.francetelecom.rd.fakemidp.jsr234.EqualizerControlImplem")
@ClassDone
public interface EqualizerControl extends javax.microedition.amms.control.EffectControl{
// Fields
    public static final int UNDEFINED = -1004;
// Methods
    public abstract int getMinBandLevel();
    public abstract int getMaxBandLevel();
    public abstract void setBandLevel(int arg1, int arg2)
		throws java.lang.IllegalArgumentException;
    public abstract int getBandLevel(int arg1)
		throws java.lang.IllegalArgumentException;
    public abstract int getNumberOfBands();
    public abstract int getCenterFreq(int arg1)
		throws java.lang.IllegalArgumentException;
    public abstract int getBand(int arg1);
    public abstract int setBass(int arg1)
		throws java.lang.IllegalArgumentException;
    public abstract int setTreble(int arg1)
		throws java.lang.IllegalArgumentException;
    public abstract int getBass();
    public abstract int getTreble();
}
