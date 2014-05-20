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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.CursorEntityIteratorImplem", superClass = "")
public abstract class CursorEntityIterator
  implements EntityIterator
{
  // Constructors

  public CursorEntityIterator(android.database.Cursor arg1){
  }
  // Methods

  public final boolean hasNext(){
    return false;
  }
  public Entity next(){
    return (Entity) null;
  }
  public void remove(){
  }
  public final void close(){
  }
  public final void reset(){
  }
  public abstract Entity getEntityAndIncrementCursor(android.database.Cursor arg1) throws android.os.RemoteException;
}
