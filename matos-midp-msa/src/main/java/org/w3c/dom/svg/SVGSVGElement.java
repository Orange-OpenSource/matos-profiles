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
@Real("com.francetelecom.rd.fakemidp.jsr226.SVGSVGElementImplem")
public interface SVGSVGElement extends org.w3c.dom.svg.SVGLocatableElement{
// Fields
// Methods
    public abstract void setCurrentScale(float arg1)
		throws org.w3c.dom.DOMException;
    public abstract float getCurrentScale();
    public abstract void setCurrentRotate(float arg1);
    public abstract float getCurrentRotate();
    public abstract org.w3c.dom.svg.SVGPoint getCurrentTranslate();
    public abstract float getCurrentTime();
    public abstract void setCurrentTime(float arg1);
    public abstract org.w3c.dom.svg.SVGMatrix createSVGMatrixComponents(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6);
    public abstract org.w3c.dom.svg.SVGRect createSVGRect();
    public abstract org.w3c.dom.svg.SVGPath createSVGPath();
    public abstract org.w3c.dom.svg.SVGRGBColor createSVGRGBColor(int arg1, int arg2, int arg3)
		throws org.w3c.dom.svg.SVGException;
}
