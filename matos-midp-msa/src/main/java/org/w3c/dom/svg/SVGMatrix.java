package org.w3c.dom.svg;

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

@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr226.SVGMatrixImplem")
public interface SVGMatrix{
// Fields
// Methods
    public abstract float getComponent(int arg1)
		throws org.w3c.dom.DOMException;
    public abstract org.w3c.dom.svg.SVGMatrix mMultiply(org.w3c.dom.svg.SVGMatrix arg1);
    public abstract org.w3c.dom.svg.SVGMatrix inverse()
		throws org.w3c.dom.svg.SVGException;
    public abstract org.w3c.dom.svg.SVGMatrix mTranslate(float arg1, float arg2);
    public abstract org.w3c.dom.svg.SVGMatrix mScale(float arg1);
    public abstract org.w3c.dom.svg.SVGMatrix mRotate(float arg1);
}
