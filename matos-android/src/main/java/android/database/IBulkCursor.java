package android.database;

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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public interface IBulkCursor
  extends android.os.IInterface
{
  // Fields

  public static final java.lang.String descriptor = "android.content.IBulkCursor";

  public static final int GET_CURSOR_WINDOW_TRANSACTION = 1;

  public static final int COUNT_TRANSACTION = 2;

  public static final int GET_COLUMN_NAMES_TRANSACTION = 3;

  public static final int DEACTIVATE_TRANSACTION = 6;

  public static final int REQUERY_TRANSACTION = 7;

  public static final int ON_MOVE_TRANSACTION = 8;

  public static final int WANTS_ON_MOVE_TRANSACTION = 9;

  public static final int GET_EXTRAS_TRANSACTION = 10;

  public static final int RESPOND_TRANSACTION = 11;

  public static final int CLOSE_TRANSACTION = 12;

  // Methods

  public int count() throws android.os.RemoteException;
  public void close() throws android.os.RemoteException;
  public CursorWindow getWindow(int arg1) throws android.os.RemoteException;
  public int requery(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") IContentObserver arg1) throws android.os.RemoteException;
  public android.os.Bundle getExtras() throws android.os.RemoteException;
  public void deactivate() throws android.os.RemoteException;
  public java.lang.String [] getColumnNames() throws android.os.RemoteException;
  @com.francetelecom.rd.stubs.annotation.CallBack("IBulkCursor")
  public void onMove(int arg1) throws android.os.RemoteException;
  public boolean getWantsAllOnMoveCalls() throws android.os.RemoteException;
  public android.os.Bundle respond(android.os.Bundle arg1) throws android.os.RemoteException;
}
