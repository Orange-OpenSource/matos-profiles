package gov.nist.javax.sip.header.ims;

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


public interface PAccessNetworkInfoHeader
  extends javax.sip.header.Header, javax.sip.header.Parameters
{
  // Fields

  public static final java.lang.String NAME = "P-Access-Network-Info";

  public static final java.lang.String IEEE_802_11 = "IEEE-802.11";

  public static final java.lang.String IEEE_802_11A = "IEEE-802.11a";

  public static final java.lang.String IEEE_802_11B = "IEEE-802.11b";

  public static final java.lang.String IEEE_802_11G = "IEEE-802.11g";

  public static final java.lang.String GGGPP_GERAN = "3GPP-GERAN";

  public static final java.lang.String GGGPP_UTRAN_FDD = "3GPP-UTRAN-FDD";

  public static final java.lang.String GGGPP_UTRAN_TDD = "3GPP-UTRAN-TDD";

  public static final java.lang.String GGGPP_CDMA2000 = "3GPP-CDMA2000";

  public static final java.lang.String ADSL = "ADSL";

  public static final java.lang.String ADSL2 = "ADSL2";

  public static final java.lang.String ADSL2p = "ADSL2+";

  public static final java.lang.String RADSL = "RADSL";

  public static final java.lang.String SDSL = "SDSL";

  public static final java.lang.String HDSL = "HDSL";

  public static final java.lang.String HDSL2 = "HDSL2";

  public static final java.lang.String GSHDSL = "G.SHDSL";

  public static final java.lang.String VDSL = "VDSL";

  public static final java.lang.String IDSL = "IDSL";

  public static final java.lang.String GGGPP2_1X = "3GPP2-1X";

  public static final java.lang.String GGGPP2_1XHRPD = "3GPP2-1XHRPD";

  // Methods

  public void setAccessType(@com.francetelecom.rd.stubs.annotation.FieldSet("accessType") java.lang.String arg1) throws java.text.ParseException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("accessType")
  public java.lang.String getAccessType();
  public void setCGI3GPP(@com.francetelecom.rd.stubs.annotation.FieldSet("CGI3GPP") java.lang.String arg1) throws java.text.ParseException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("CGI3GPP")
  public java.lang.String getCGI3GPP();
  public void setUtranCellID3GPP(@com.francetelecom.rd.stubs.annotation.FieldSet("utranCellID3GPP") java.lang.String arg1) throws java.text.ParseException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("utranCellID3GPP")
  public java.lang.String getUtranCellID3GPP();
  public void setDSLLocation(@com.francetelecom.rd.stubs.annotation.FieldSet("DSLLocation") java.lang.String arg1) throws java.text.ParseException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("DSLLocation")
  public java.lang.String getDSLLocation();
  public void setCI3GPP2(@com.francetelecom.rd.stubs.annotation.FieldSet("CI3GPP2") java.lang.String arg1) throws java.text.ParseException;
  @com.francetelecom.rd.stubs.annotation.FieldGet("CI3GPP2")
  public java.lang.String getCI3GPP2();
  public void setExtensionAccessInfo(java.lang.Object arg1) throws java.text.ParseException;
  public java.lang.Object getExtensionAccessInfo();
}
