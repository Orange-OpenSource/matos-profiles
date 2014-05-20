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
public final class BulkCursorToCursorAdaptor
  extends AbstractWindowedCursor{
  // Constructors

  public BulkCursorToCursorAdaptor(){
    super();
  }
  // Methods

  public void close(){
  }
  public void initialize(IBulkCursor arg1, int arg2, int arg3, boolean arg4){
  }
  public int getCount(){
    return 0;
  }
  public boolean requery(){
    return false;
  }
  public android.os.Bundle getExtras(){
    return (android.os.Bundle) null;
  }
  public void deactivate(){
  }
  public java.lang.String [] getColumnNames(){
    return (java.lang.String []) null;
  }
  public boolean onMove(int arg1, int arg2){
    return false;
  }
  public android.os.Bundle respond(android.os.Bundle arg1){
    return (android.os.Bundle) null;
  }
  public static int findRowIdColumnIndex(java.lang.String [] arg1){
    return 0;
  }
  public IContentObserver getObserver(){
    return (IContentObserver) null;
  }
}
