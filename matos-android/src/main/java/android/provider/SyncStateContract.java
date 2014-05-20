package android.provider;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2010 - 2014 Orange SA
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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class SyncStateContract
{
  // Classes

  public static interface Columns
    extends BaseColumns
  {
    // Fields

    public static final java.lang.String ACCOUNT_NAME = "account_name";

    public static final java.lang.String ACCOUNT_TYPE = "account_type";

    public static final java.lang.String DATA = "data";

  }
  public static class Constants
    implements SyncStateContract.Columns
  {
    // Fields

    public static final java.lang.String CONTENT_DIRECTORY = "syncstate";

    // Constructors

    public Constants(){
    }
  }
  public static final class Helpers
  {
    // Constructors

    public Helpers(){
    }
    // Methods
    @ArgsRule(value="SyncStateContract.get",pos={2,3})
    public static byte [] get(android.content.ContentProviderClient arg1, android.net.Uri arg2, android.accounts.Account arg3) throws android.os.RemoteException{
      return (byte []) null;
    }
    @ArgsRule(value="SyncStateContract.set",pos={2,3})
    public static void set(android.content.ContentProviderClient arg1, android.net.Uri arg2, android.accounts.Account arg3, byte [] arg4) throws android.os.RemoteException{
    }
    @ArgsRule(value="SyncStateContract.insert",pos={2,3})
    public static android.net.Uri insert(android.content.ContentProviderClient arg1, android.net.Uri arg2, android.accounts.Account arg3, byte [] arg4) throws android.os.RemoteException{
      return (android.net.Uri) null;
    }
    @ArgsRule(value="SyncStateContract.update",pos={2})
    public static void update(android.content.ContentProviderClient arg1, android.net.Uri arg2, byte [] arg3) throws android.os.RemoteException{
    }
    @ArgsRule(value="SyncStateContract.getWithUri",pos={2,3})
    public static android.util.Pair<android.net.Uri, byte []> getWithUri(android.content.ContentProviderClient arg1, android.net.Uri arg2, android.accounts.Account arg3) throws android.os.RemoteException{
      return (android.util.Pair) null;
    }
    @ArgsRule(value="SyncStateContract.newSetOperation",pos={1,2})
    public static android.content.ContentProviderOperation newSetOperation(android.net.Uri arg1, android.accounts.Account arg2, byte [] arg3){
      return (android.content.ContentProviderOperation) null;
    }
    @ArgsRule(value="SyncStateContract.newUpdateOperation",pos={1})
    public static android.content.ContentProviderOperation newUpdateOperation(android.net.Uri arg1, byte [] arg2){
      return (android.content.ContentProviderOperation) null;
    }
  }
  // Constructors

  public SyncStateContract(){
  }
}
