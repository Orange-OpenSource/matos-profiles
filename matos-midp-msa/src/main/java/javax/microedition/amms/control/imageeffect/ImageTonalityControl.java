package javax.microedition.amms.control.imageeffect;

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

@Real("com.francetelecom.rd.fakemidp.jsr234.ImageTonalityControlImplem")
@ClassDone
public interface ImageTonalityControl extends javax.microedition.amms.control.EffectControl{
// Fields
    public static final int AUTO = -1000;
    public static final int NEXT = -1001;
    public static final int PREVIOUS = -1002;
// Methods
    public abstract int setBrightness(int arg1);
    public abstract int getBrightness();
    public abstract int getBrightnessLevels();
    public abstract int setContrast(int arg1);
    public abstract int getContrast();
    public abstract int getContrastLevels();
    public abstract int setGamma(int arg1);
    public abstract int getGamma();
    public abstract int getGammaLevels();
}
