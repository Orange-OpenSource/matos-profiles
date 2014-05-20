package javax.microedition.amms.control.audio3d;

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

@Real("com.francetelecom.rd.fakemidp.jsr234.DistanceAttenuationControlImplem")
@ClassDone
public interface DistanceAttenuationControl extends javax.microedition.media.Control{
// Fields
// Methods
    public abstract void setParameters(int arg1, int arg2, boolean arg3, int arg4);
    public abstract int getMinDistance();
    public abstract int getMaxDistance();
    public abstract boolean getMuteAfterMax();
    public abstract int getRolloffFactor();
}
