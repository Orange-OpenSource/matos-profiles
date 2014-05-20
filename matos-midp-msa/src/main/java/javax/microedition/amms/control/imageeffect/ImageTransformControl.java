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

@Real("com.francetelecom.rd.fakemidp.jsr234.ImageTransformControlImplem")
@ClassDone
public interface ImageTransformControl extends javax.microedition.amms.control.EffectControl{
// Fields
// Methods
    public abstract int getSourceWidth();
    public abstract int getSourceHeight();
    public abstract void setSourceRect(int arg1, int arg2, int arg3, int arg4);
    public abstract void setTargetSize(int arg1, int arg2, int arg3);
}
