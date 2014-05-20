package org.ccil.cowan.tagsoup;

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
public interface ScanHandler
{
  // Methods

  @com.francetelecom.rd.stubs.annotation.CallBack("scan")
  public void eof(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException;
  @com.francetelecom.rd.stubs.annotation.CallBack("scan")
  public int getEntity();
  @com.francetelecom.rd.stubs.annotation.CallBack("scan")
  public void entity(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException;
  @com.francetelecom.rd.stubs.annotation.CallBack("scan")
  public void cdsect(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException;
  @com.francetelecom.rd.stubs.annotation.CallBack("scan")
  public void pi(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException;
  @com.francetelecom.rd.stubs.annotation.CallBack("scan")
  public void decl(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException;
  @com.francetelecom.rd.stubs.annotation.CallBack("scan")
  public void stagc(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException;
  @com.francetelecom.rd.stubs.annotation.CallBack("scan")
  public void gi(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException;
  @com.francetelecom.rd.stubs.annotation.CallBack("scan")
  public void etag(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException;
  @com.francetelecom.rd.stubs.annotation.CallBack("scan")
  public void aname(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException;
  @com.francetelecom.rd.stubs.annotation.CallBack("scan")
  public void aval(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException;
  @com.francetelecom.rd.stubs.annotation.CallBack("scan")
  public void pcdata(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException;
  @com.francetelecom.rd.stubs.annotation.CallBack("scan")
  public void adup(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException;
  @com.francetelecom.rd.stubs.annotation.CallBack("scan")
  public void cmnt(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException;
  @com.francetelecom.rd.stubs.annotation.CallBack("scan")
  public void pitarget(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException;
  @com.francetelecom.rd.stubs.annotation.CallBack("scan")
  public void stage(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException;
}
