package android.nfc.tech;

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


public final class NdefFormatable
  extends BasicTagTechnology{
  // Constructors

  public NdefFormatable(android.nfc.Tag arg1) throws android.os.RemoteException{
    super((android.nfc.Tag) null, 0);
  }
  // Methods

  public static NdefFormatable get(android.nfc.Tag arg1){
    return (NdefFormatable) null;
  }
  @com.francetelecom.rd.stubs.annotation.UseRule(value = "NdefFormatable.format", report = "-")
  public void format(android.nfc.NdefMessage arg1) throws java.io.IOException, android.nfc.FormatException{
  }
  public void formatReadOnly(android.nfc.NdefMessage arg1) throws java.io.IOException, android.nfc.FormatException{
  }
}
