package android.database.sqlite;

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
public class SQLiteStatement
  extends SQLiteProgram{
  // Constructors

  SQLiteStatement(SQLiteDatabase arg1, java.lang.String arg2, java.lang.Object [] arg3){
    super((SQLiteDatabase) null, (java.lang.String) null);
  }
  // Methods

  public void execute(){
  }
  public long simpleQueryForLong(){
    return 0l;
  }
  public java.lang.String simpleQueryForString(){
    return (java.lang.String) null;
  }
  public android.os.ParcelFileDescriptor simpleQueryForBlobFileDescriptor(){
    return (android.os.ParcelFileDescriptor) null;
  }
  public int executeUpdateDelete(){
    return 0;
  }
  public long executeInsert(){
    return 0l;
  }
}
