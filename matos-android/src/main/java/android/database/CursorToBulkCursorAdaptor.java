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
public final class CursorToBulkCursorAdaptor
  extends BulkCursorNative  implements android.os.IBinder.DeathRecipient
{
  // Constructors
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public CursorToBulkCursorAdaptor(Cursor arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") IContentObserver arg2, java.lang.String arg3){
    super();
  }
  // Methods

  public int count(){
    return 0;
  }
  public void close(){
  }
  public CursorWindow getWindow(int arg1){
    return (CursorWindow) null;
  }
  public int requery(@com.francetelecom.rd.stubs.annotation.CallBackRegister("onChange") IContentObserver arg1){
    return 0;
  }
  public android.os.Bundle getExtras(){
    return (android.os.Bundle) null;
  }
  public void deactivate(){
  }
  public java.lang.String [] getColumnNames(){
    return (java.lang.String []) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onMove(int arg1){
  }
  public boolean getWantsAllOnMoveCalls(){
    return false;
  }
  public android.os.Bundle respond(android.os.Bundle arg1){
    return (android.os.Bundle) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void binderDied(){
  }
}
