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
import com.francetelecom.rd.stubs.annotation.ArgsRule;
import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.ClassDone;

@ClassDone
public class RecordStore{
    public static final int AUTHMODE_PRIVATE = 0;
    public static final int AUTHMODE_ANY = 1;

    private RecordStore() {}
    @ArgsRule(value="RecordStore.deleteRecordStore", pos={1})
    public static void deleteRecordStore(String a0)
	throws RecordStoreException, RecordStoreNotFoundException
    { return; }
    @ArgsRule(value="RecordStore.openRecordStore-1", pos={1,2})
    public static RecordStore openRecordStore(String a0,boolean a1)
	throws RecordStoreException, RecordStoreFullException, 
	       RecordStoreNotFoundException
    {  return new RecordStore(); }
    @ArgsRule(value="RecordStore.openRecordStore-2", pos={1,2,3,4})
    public static RecordStore openRecordStore(String a0,boolean a1,
					      int a2,boolean a3)
	throws RecordStoreException, RecordStoreFullException,
	       RecordStoreNotFoundException 
    {  return new RecordStore(); }
    @ArgsRule(value="RecordStore.openRecordStore-3", pos={1,2,3})
    public static RecordStore openRecordStore(String a0,String a1,String a2)
	throws RecordStoreException, RecordStoreNotFoundException
    { return new RecordStore(); }

    public void setMode(int a0,boolean a1)
	throws RecordStoreException
    { return; }

    public void closeRecordStore()
	throws RecordStoreNotOpenException, RecordStoreException
    { return; }

    public static String[] listRecordStores(){ return new String[0];}

    public String getName() throws RecordStoreNotOpenException
    { return "" + "RecordStore.";}

    public int getVersion() throws RecordStoreNotOpenException
    { return 0;}

    public int getNumRecords() throws RecordStoreNotOpenException
    { return 0;}

    public int getSize() throws RecordStoreNotOpenException
    { return 0;}

    public int getSizeAvailable() throws RecordStoreNotOpenException
    { return 0;}

    public long getLastModified() throws RecordStoreNotOpenException
    { return 0L; }

    public void removeRecordListener(RecordListener a0){ return; }

    public int getNextRecordID()
	throws RecordStoreNotOpenException, RecordStoreException
    { return 0;}

    public int addRecord(byte[] a0,int a1,int a2) 
	throws RecordStoreNotOpenException, RecordStoreException,
	       RecordStoreFullException
    { return 0;}

    public void deleteRecord(int a0) 
	throws RecordStoreNotOpenException, InvalidRecordIDException, 
	       RecordStoreException
    { return; }

    public int getRecordSize(int a0) 
	throws RecordStoreNotOpenException, InvalidRecordIDException,
	       RecordStoreException
    { return 0;}

    public int getRecord(int a0,byte[] a1,int a2) 
	throws RecordStoreNotOpenException, InvalidRecordIDException, 
	       RecordStoreException
    { return 0;}

    public byte[] getRecord(int a0) 
	throws RecordStoreNotOpenException, InvalidRecordIDException,
	       RecordStoreException
    { return new byte[0];}

    public void setRecord(int a0,byte[] a1,int a2,int a3)
	throws RecordStoreNotOpenException, InvalidRecordIDException, 
	       RecordStoreException, RecordStoreFullException
    { return; }

    public RecordEnumeration enumerateRecords(@CallBackRegister("filter") RecordFilter a0,
					      @CallBackRegister("compare") RecordComparator a1,boolean a2)
	throws RecordStoreNotOpenException 
    { return null; }

    public void addRecordListener(@CallBackRegister("rms") RecordListener a0)
    {  } 
}

