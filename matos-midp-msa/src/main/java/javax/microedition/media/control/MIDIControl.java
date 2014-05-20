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
@Real("com.francetelecom.rd.fakemidp.jsr135.MidiControlImplem")
public interface MIDIControl extends javax.microedition.media.Control {
    public static final int NOTE_ON = 144;
    public static final int CONTROL_CHANGE = 176;
    public abstract boolean isBankQuerySupported();
    public abstract int[] getProgram(int a0) throws javax.microedition.media.MediaException;
    public abstract int getChannelVolume(int a0);
    public abstract void setProgram(int a0,int a1,int a2);
    public abstract void setChannelVolume(int a0,int a1);
    public abstract int[] getBankList(boolean a0) throws javax.microedition.media.MediaException;
    public abstract int[] getProgramList(int a0) throws javax.microedition.media.MediaException;
    public abstract String getProgramName(int a0,int a1) throws javax.microedition.media.MediaException;
    public abstract String getKeyName(int a0,int a1,int a2) throws javax.microedition.media.MediaException;
    public abstract void shortMidiEvent(int a0,int a1,int a2);
    public abstract int longMidiEvent(byte[] a0,int a1,int a2);
}

