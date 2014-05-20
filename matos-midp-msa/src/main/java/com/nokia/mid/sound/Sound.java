package com.nokia.mid.sound;

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

import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.ClassDone;

@ClassDone
public class Sound extends Object {
    public static final int SOUND_PLAYING = 0;
    public static final int SOUND_STOPPED = 0;
    public static final int SOUND_UNINITIALIZED = 0;
    public static final int FORMAT_TONE = 0;
    public static final int FORMAT_WAV = 0;
    public Sound(int a,long b) {};
    public Sound(byte[] a,int b) {};
    public void init(int a, long b) {};
    public void init(byte[] a , int b) {};
    public void play(int i) {};
    public void release() {};
    public void resume() {};
    public void setGain(int i) {};
    public void stop() {};
    public int getState() { return 0; };
    public int getGain() { return 0; };
    public static int getConcurrentSoundCount(int a) { return 0;};
    public static int [] getSupportedFormats() {return new int [2]; };
    public void setSoundListener(@CallBackRegister("sound") SoundListener a) {};
}
