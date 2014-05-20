package javax.microedition.midlet;

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
import com.francetelecom.rd.stubs.annotation.CallBack;
import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.ClassDone;
@ClassDone
public abstract class MIDlet {
	@CallBackRegister("midlet")
    protected MIDlet(){}
	@CallBack("midlet")
    protected abstract void startApp() throws MIDletStateChangeException;
	@CallBack("midlet")
    protected abstract void pauseApp();
	@CallBack("midlet")
    protected abstract void destroyApp(boolean a0) throws MIDletStateChangeException;
    @ArgsRule(value="MIDlet.getAppProperty",pos={1})
    public final String getAppProperty(java.lang.String a0){ return "" + "MIDlet.";}
    public final void resumeRequest(){ return; }
    @ArgsRule(value="MIDlet.platformRequest",pos={1})
    public final boolean platformRequest(String a0) throws javax.microedition.io.ConnectionNotFoundException{ return true;}
    @ArgsRule(value="MIDlet.checkPermission",pos={1})
    public final int checkPermission(String a0){ return 0;}

    public final void notifyDestroyed(){ }
    public final void notifyPaused(){  }

}

