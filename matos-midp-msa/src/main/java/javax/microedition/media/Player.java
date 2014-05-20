package javax.microedition.media;

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
import com.francetelecom.rd.stubs.annotation.Real;
@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr135.PlayerImplem")
public interface Player extends Controllable {
    public static final int UNREALIZED = 20100;
    public static final int REALIZED = 0;
    public static final int PREFETCHED = 300;
    public static final int STARTED = 400;
    public static final int CLOSED = 0;
    public static final long TIME_UNKNOWN = -1L;
    public abstract void realize() throws MediaException;
    public abstract void prefetch() throws MediaException;
    public abstract void start() throws MediaException;
    public abstract void stop() throws MediaException;
    public abstract void deallocate();
    public abstract void close();
    public abstract void setTimeBase(TimeBase a0) throws MediaException;
    public abstract TimeBase getTimeBase();
    public abstract long setMediaTime(long a0) throws MediaException;
    public abstract long getMediaTime();
    public abstract int getState();
    public abstract long getDuration();
    public abstract String getContentType();
    public abstract void setLoopCount(int a0);
    public abstract void addPlayerListener(@CallBackRegister("player") PlayerListener a0);
    public abstract void removePlayerListener(@CallBackRegister("player") PlayerListener a0);
}

