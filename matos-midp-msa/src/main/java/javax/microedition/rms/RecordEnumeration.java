package javax.microedition.rms;

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
@Real("com.francetelecom.rd.fakemidp.midp.RecordEnumerationImplem")
public interface RecordEnumeration{
    public abstract int numRecords();
    public abstract byte[] nextRecord() throws InvalidRecordIDException, RecordStoreNotOpenException, RecordStoreException;
    public abstract int nextRecordId() throws InvalidRecordIDException;
    public abstract byte[] previousRecord() throws InvalidRecordIDException, RecordStoreNotOpenException, RecordStoreException;
    public abstract int previousRecordId() throws InvalidRecordIDException;
    public abstract boolean hasNextElement();
    public abstract boolean hasPreviousElement();
    public abstract void reset();
    public abstract void rebuild();
    public abstract void keepUpdated(boolean a0);
    public abstract boolean isKeptUpdated();
    public abstract void destroy();
}

