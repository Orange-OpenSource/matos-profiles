package javax.microedition.media.control;

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
@Real("com.francetelecom.rd.fakemidp.jsr135.VideoControlImplem")
public interface VideoControl extends GUIControl {
    public static final int USE_DIRECT_VIDEO = 1;
    public abstract Object initDisplayMode(int a0,java.lang.Object a1);
    public abstract void setDisplayLocation(int a0,int a1);
    public abstract int getDisplayX();
    public abstract int getDisplayY();
    public abstract void setVisible(boolean a0);
    public abstract void setDisplaySize(int a0,int a1) throws javax.microedition.media.MediaException;
    public abstract void setDisplayFullScreen(boolean a0) throws javax.microedition.media.MediaException;
    public abstract int getSourceWidth();
    public abstract int getSourceHeight();
    public abstract int getDisplayWidth();
    public abstract int getDisplayHeight();
    public abstract byte[] getSnapshot(String a0) throws javax.microedition.media.MediaException;
}

