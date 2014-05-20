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
public final class CursorJoiner
  implements java.lang.Iterable<CursorJoiner.Result>, java.util.Iterator<CursorJoiner.Result>
{
  // Classes

  public static enum Result
  {
    // Enum Constants

    RIGHT()
, LEFT()
, BOTH()
;
    // Fields

    // Constructors

    private Result(){
    }
    // Methods

  }
  // Constructors

  public CursorJoiner(Cursor arg1, java.lang.String [] arg2, Cursor arg3, java.lang.String [] arg4){
  }
  // Methods

  public boolean hasNext(){
    return false;
  }
  public java.util.Iterator<CursorJoiner.Result> iterator(){
    return (java.util.Iterator) null;
  }
  public CursorJoiner.Result next(){
    return (CursorJoiner.Result) null;
  }
  public void remove(){
  }
}
