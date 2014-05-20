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
@Real("com.francetelecom.rd.fakemidp.jsr226.SVGPathImplem")
public interface SVGPath{
// Fields
    public static final short MOVE_TO = 77;
    public static final short LINE_TO = 76;
    public static final short CURVE_TO = 67;
    public static final short QUAD_TO = 81;
    public static final short CLOSE = 90;
// Methods
    public abstract int getNumberOfSegments();
    public abstract short getSegment(int arg1)
		throws org.w3c.dom.DOMException;
    public abstract float getSegmentParam(int arg1, int arg2)
		throws org.w3c.dom.DOMException;
    public abstract void moveTo(float arg1, float arg2);
    public abstract void lineTo(float arg1, float arg2);
    public abstract void quadTo(float arg1, float arg2, float arg3, float arg4);
    public abstract void curveTo(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6);
    public abstract void close();
}
