package java.util;

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
import com.francetelecom.rd.stubs.annotation.ArgsRule;
import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.ClassDone;

@ClassDone
public class Timer extends Object{
    public Timer(){}
    @ArgsRule(value="Timer.schedule-1", pos={1})
    public void schedule(@CallBackRegister("run") TimerTask a0,long a1){ return; }
    @ArgsRule(value="Timer.schedule-2", pos={1})
    public void schedule(@CallBackRegister("run") TimerTask a0,Date a1){ return; }
    @ArgsRule(value="Timer.schedule-3", pos={1,2})
    public void schedule(@CallBackRegister("run") TimerTask a0,long a1,long a2){ return; }
    @ArgsRule(value="Timer.schedule-4", pos={1,2})
    public void schedule(@CallBackRegister("run") TimerTask a0,Date a1,long a2){ return; }
    @ArgsRule(value="Timer.scheduleAtFixedRate-1", pos={1,2})
    public void scheduleAtFixedRate(@CallBackRegister("run") TimerTask a0,long a1,long a2){ return; }
    @ArgsRule(value="Timer.scheduleAtFixedRate-2", pos={1,2})
    public void scheduleAtFixedRate(@CallBackRegister("run") TimerTask a0,Date a1,long a2){ return; }
    public void cancel(){ return; }
}

