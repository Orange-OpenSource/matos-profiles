package android.drm;

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

import com.francetelecom.rd.stubs.annotation.ArgsRule;
import com.francetelecom.rd.stubs.annotation.UseRule;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class DrmManagerClient
{
  // Classes

  public static interface OnInfoListener
  {
    // Methods

	@com.francetelecom.rd.stubs.annotation.CallBack("OnInfoListener") 
	public void onInfo(DrmManagerClient arg1, DrmInfoEvent arg2);
  }
  public static interface OnEventListener
  {
    // Methods

	@com.francetelecom.rd.stubs.annotation.CallBack("OnEventListener") 
	public void onEvent(DrmManagerClient arg1, DrmEvent arg2);
  }
  public static interface OnErrorListener
  {
    // Methods

	  @com.francetelecom.rd.stubs.annotation.CallBack("OnErrorListener") 
    public void onError(DrmManagerClient arg1, DrmErrorEvent arg2);
  }
  // Fields

  public static final int ERROR_NONE = 0;

  public static final int ERROR_UNKNOWN = -2000;

  // Constructors

  public DrmManagerClient(android.content.Context arg1){
  }
  // Methods

  protected void finalize(){
  }
  public static void notify(java.lang.Object arg1, int arg2, int arg3, java.lang.String arg4){
  }
  public synchronized void setOnErrorListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnErrorListener") DrmManagerClient.OnErrorListener arg1){
  }
  public synchronized void setOnInfoListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnInfoListener") DrmManagerClient.OnInfoListener arg1){
  }
  public android.content.ContentValues getMetadata(java.lang.String arg1){
    return (android.content.ContentValues) null;
  }
  public android.content.ContentValues getMetadata(android.net.Uri arg1){
    return (android.content.ContentValues) null;
  }
  public boolean canHandle(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  public boolean canHandle(android.net.Uri arg1, java.lang.String arg2){
    return false;
  }
  public synchronized void setOnEventListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnEventListener") DrmManagerClient.OnEventListener arg1){
  }
  public java.lang.String [] getAvailableDrmEngines(){
    return (java.lang.String []) null;
  }
  public android.content.ContentValues getConstraints(java.lang.String arg1, int arg2){
    return (android.content.ContentValues) null;
  }
  public android.content.ContentValues getConstraints(android.net.Uri arg1, int arg2){
    return (android.content.ContentValues) null;
  }
  public int saveRights(DrmRights arg1, java.lang.String arg2, java.lang.String arg3) throws java.io.IOException{
    return 0;
  }
  public void installDrmEngine(java.lang.String arg1){
  }
  public int processDrmInfo(DrmInfo arg1){
    return 0;
  }
  @ArgsRule(value="DrmManagerClient.acquireDrmInfo", pos={1})
  public DrmInfo acquireDrmInfo(DrmInfoRequest arg1){
    return (DrmInfo) null;
  }
  @ArgsRule(value="DrmManagerClient.acquireRights", pos={1})
  public int acquireRights(DrmInfoRequest arg1){
    return 0;
  }
  public int getDrmObjectType(java.lang.String arg1, java.lang.String arg2){
    return 0;
  }
  public int getDrmObjectType(android.net.Uri arg1, java.lang.String arg2){
    return 0;
  }
  public java.lang.String getOriginalMimeType(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getOriginalMimeType(android.net.Uri arg1){
    return (java.lang.String) null;
  }
  public int checkRightsStatus(java.lang.String arg1){
    return 0;
  }
  public int checkRightsStatus(android.net.Uri arg1){
    return 0;
  }
  public int checkRightsStatus(java.lang.String arg1, int arg2){
    return 0;
  }
  public int checkRightsStatus(android.net.Uri arg1, int arg2){
    return 0;
  }
  @ArgsRule(value="DrmManagerClient.removeRights-1",pos=1)
  public int removeRights(java.lang.String arg1){
    return 0;
  }
  @ArgsRule(value="DrmManagerClient.removeRights-2",pos=1)
  public int removeRights(android.net.Uri arg1){
    return 0;
  }
  @UseRule("DrmManagerClient.removeAllRights")
  public int removeAllRights(){
    return 0;
  }
  public int openConvertSession(java.lang.String arg1){
    return 0;
  }
  public DrmConvertedStatus convertData(int arg1, byte [] arg2){
    return (DrmConvertedStatus) null;
  }
  public DrmConvertedStatus closeConvertSession(int arg1){
    return (DrmConvertedStatus) null;
  }
}
