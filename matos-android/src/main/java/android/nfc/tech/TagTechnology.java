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


public interface TagTechnology
  extends java.io.Closeable
{
  // Fields

  public static final int NFC_A = 1;

  public static final int NFC_B = 2;

  public static final int ISO_DEP = 3;

  public static final int NFC_F = 4;

  public static final int NFC_V = 5;

  public static final int NDEF = 6;

  public static final int NDEF_FORMATABLE = 7;

  public static final int MIFARE_CLASSIC = 8;

  public static final int MIFARE_ULTRALIGHT = 9;

  // Methods

  public void close() throws java.io.IOException;
  public void connect() throws java.io.IOException;
  public boolean isConnected();
  public void reconnect() throws java.io.IOException;
  public android.nfc.Tag getTag();
}
