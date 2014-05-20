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
@Real("com.francetelecom.rd.fakemidp.jsr226.SVGElementImplem")
public interface SVGElement extends org.w3c.dom.Element{
// Fields
// Methods
    public abstract void setId(String arg1)
		throws org.w3c.dom.DOMException;
    public abstract String getId();
    public abstract org.w3c.dom.Element getFirstElementChild();
    public abstract org.w3c.dom.Element getNextElementSibling();
    public abstract String getTrait(String arg1)
		throws org.w3c.dom.DOMException;
    public abstract String getTraitNS(String arg1, String arg2)
		throws org.w3c.dom.DOMException;
    public abstract float getFloatTrait(String arg1)
		throws org.w3c.dom.DOMException;
    public abstract org.w3c.dom.svg.SVGMatrix getMatrixTrait(String arg1)
		throws org.w3c.dom.DOMException;
    public abstract org.w3c.dom.svg.SVGRect getRectTrait(String arg1)
		throws org.w3c.dom.DOMException;
    public abstract org.w3c.dom.svg.SVGPath getPathTrait(String arg1)
		throws org.w3c.dom.DOMException;
    public abstract org.w3c.dom.svg.SVGRGBColor getRGBColorTrait(String arg1)
		throws org.w3c.dom.DOMException;
    public abstract void setTrait(String arg1, String arg2)
		throws org.w3c.dom.DOMException;
    public abstract void setTraitNS(String arg1, String arg2, String arg3)
		throws org.w3c.dom.DOMException;
    public abstract void setFloatTrait(String arg1, float arg2)
		throws org.w3c.dom.DOMException;
    public abstract void setMatrixTrait(String arg1, org.w3c.dom.svg.SVGMatrix arg2)
		throws org.w3c.dom.DOMException;
    public abstract void setRectTrait(String arg1, org.w3c.dom.svg.SVGRect arg2)
		throws org.w3c.dom.DOMException;
    public abstract void setPathTrait(String arg1, org.w3c.dom.svg.SVGPath arg2)
		throws org.w3c.dom.DOMException;
    public abstract void setRGBColorTrait(String arg1, org.w3c.dom.svg.SVGRGBColor arg2)
		throws org.w3c.dom.DOMException;
}
