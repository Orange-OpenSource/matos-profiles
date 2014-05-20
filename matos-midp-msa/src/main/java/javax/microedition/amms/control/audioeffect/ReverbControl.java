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

@Real("com.francetelecom.rd.fakemidp.jsr234.ReverbControlImplem")
@ClassDone
public interface ReverbControl extends javax.microedition.amms.control.EffectControl{
// Fields
// Methods
    public abstract int setReverbLevel(int arg1)
		throws java.lang.IllegalArgumentException;
    public abstract int getReverbLevel();
    public abstract void setReverbTime(int arg1)
		throws java.lang.IllegalArgumentException, javax.microedition.media.MediaException;
    public abstract int getReverbTime()
		throws javax.microedition.media.MediaException;
}
