package javax.microedition.payment;

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
public class TransactionModule extends java.lang.Object{
// Fields
// Methods

    public  TransactionModule(Object object)
		throws javax.microedition.payment.TransactionModuleException{
        return;
    }
    public void setListener(@CallBackRegister("transaction") javax.microedition.payment.TransactionListener listener){
        return;
    }
    @ArgsRule(value="TransactionModule.process-1",pos={1,2,3})
    public int process(int featureID, String featureTitle, String featureDescription)
		throws javax.microedition.payment.TransactionModuleException, javax.microedition.payment.TransactionFeatureException, javax.microedition.payment.TransactionListenerException{
        return 0;
    }
    @ArgsRule(value="TransactionModule.process-2",pos={1,2,3})
    public int process(int featureID, String featureTitle, String featureDescription, byte[] payload)
		throws javax.microedition.payment.TransactionModuleException, javax.microedition.payment.TransactionFeatureException, javax.microedition.payment.TransactionListenerException, javax.microedition.payment.TransactionPayloadException{
        return 0;
    }
    public javax.microedition.payment.TransactionRecord[] getPastTransactions(int max){
    	return null;
    }
    public void deliverMissedTransactions()
		throws javax.microedition.payment.TransactionListenerException{
        return;
    }
// Default constructor
    public TransactionModule(){ super(); }
}
