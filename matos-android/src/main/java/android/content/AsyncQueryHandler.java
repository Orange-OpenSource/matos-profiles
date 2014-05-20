package android.content;

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
public abstract class AsyncQueryHandler
  extends android.os.Handler{
  // Classes

  protected static final class WorkerArgs
  {
    // Fields

    public android.net.Uri uri;

    public android.os.Handler handler;

    public java.lang.String [] projection;

    public java.lang.String selection;

    public java.lang.String [] selectionArgs;

    public java.lang.String orderBy;

    public java.lang.Object result;

    public java.lang.Object cookie;

    public ContentValues values;

    // Constructors

    protected WorkerArgs(){
    }
  }
  protected class WorkerHandler
    extends android.os.Handler  {
    // Fields

    // Constructors

    public WorkerHandler(android.os.Looper arg1){
      super();
    }
    // Methods

    public void handleMessage(android.os.Message arg1){
    }
  }
  // Constructors

  public AsyncQueryHandler(ContentResolver arg1){
    super();
  }
  // Methods

  public void handleMessage(android.os.Message arg1){
  }
  protected android.os.Handler createHandler(android.os.Looper arg1){
    return (android.os.Handler) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onUpdateComplete")
  public final void startUpdate(int arg1, java.lang.Object arg2, android.net.Uri arg3, ContentValues arg4, java.lang.String arg5, java.lang.String [] arg6){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onQueryComplete")
  public void startQuery(int arg1, java.lang.Object arg2, android.net.Uri arg3, java.lang.String [] arg4, java.lang.String arg5, java.lang.String [] arg6, java.lang.String arg7){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onQueryComplete")
  protected void onQueryComplete(int arg1, java.lang.Object arg2, android.database.Cursor arg3){
  }
  public final void cancelOperation(int arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onInsertComplete")
  public final void startInsert(int arg1, java.lang.Object arg2, android.net.Uri arg3, ContentValues arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onDeleteComplete")
  public final void startDelete(int arg1, java.lang.Object arg2, android.net.Uri arg3, java.lang.String arg4, java.lang.String [] arg5){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onInsertComplete")
  protected void onInsertComplete(int arg1, java.lang.Object arg2, android.net.Uri arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onUpdateComplete")
  protected void onUpdateComplete(int arg1, java.lang.Object arg2, int arg3){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onDeleteComplete")
  protected void onDeleteComplete(int arg1, java.lang.Object arg2, int arg3){
  }
}
