package javax.microedition.jcrmi;

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
import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;

@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr177.JavaCardRMIConnectionImplem")
public interface JavaCardRMIConnection extends javax.microedition.io.Connection{
// Fields
    public static final short PINENTRY_CANCELLED = -1;
// Methods
    public abstract java.rmi.Remote getInitialReference();
    @ArgsRule(value="JavaCardRMIConnection.enterPin",pos={1})
    public abstract short enterPin(int arg1)
		throws java.rmi.RemoteException;
    @ArgsRule(value="JavaCardRMIConnection.changePin",pos={1})
    public abstract short changePin(int arg1)
		throws java.rmi.RemoteException;
    @ArgsRule(value="JavaCardRMIConnection.disablePin",pos={1})
    public abstract short disablePin(int arg1)
		throws java.rmi.RemoteException;
    @ArgsRule(value="JavaCardRMIConnection.enablePin",pos={1})
    public abstract short enablePin(int arg1)
		throws java.rmi.RemoteException;
    @ArgsRule(value="JavaCardRMIConnection.unblockPin",pos={1,2})
    public abstract short unblockPin(int arg1, int arg2)
		throws java.rmi.RemoteException;
}
