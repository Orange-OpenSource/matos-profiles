package android.telephony;

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
public abstract class CellLocation
{
  // Constructors

  public CellLocation(){
  }
  // Methods

  public abstract boolean isEmpty();
  public static CellLocation newFromBundle(android.os.Bundle arg1){
    return (CellLocation) null;
  }
  public abstract void fillInNotifierBundle(android.os.Bundle arg1);
  public static void requestLocationUpdate(){
  }
  public static CellLocation getEmpty(){
    return (CellLocation) null;
  }
}
