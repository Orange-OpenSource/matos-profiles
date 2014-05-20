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

@Real("com.francetelecom.rd.fakemidp.jsr234.FlashControlImplem")
@ClassDone
public interface FlashControl extends javax.microedition.media.Control{
// Fields
    public static final int OFF = 1;
    public static final int AUTO = 2;
    public static final int AUTO_WITH_REDEYEREDUCE = 3;
    public static final int FORCE = 4;
    public static final int FORCE_WITH_REDEYEREDUCE = 5;
    public static final int FILLIN = 6;
// Methods
    public abstract int[] getSupportedModes();
    public abstract void setMode(int arg1);
    public abstract int getMode();
    public abstract boolean isFlashReady();
}
