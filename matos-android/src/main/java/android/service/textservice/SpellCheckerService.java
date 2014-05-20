package android.service.textservice;

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
public abstract class SpellCheckerService
  extends android.app.Service{
  // Classes

  public abstract static class Session
  {
    // Constructors
	@com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreateSession")
    public Session(){
    }
    // Methods

    public android.os.Bundle getBundle(){
      return (android.os.Bundle) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreateSession")
    public abstract void onCreate();
    public java.lang.String getLocale(){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreateSession")
    public void onCancel(){
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreateSession")
    public android.view.textservice.SuggestionsInfo [] onGetSuggestionsMultiple(android.view.textservice.TextInfo [] arg1, int arg2, boolean arg3){
      return (android.view.textservice.SuggestionsInfo []) null;
    }
    @com.francetelecom.rd.stubs.annotation.CallBack("onCreateSession")
    public abstract android.view.textservice.SuggestionsInfo onGetSuggestions(android.view.textservice.TextInfo arg1, int arg2);
  }
  // Fields

  public static final java.lang.String SERVICE_INTERFACE = "android.service.textservice.SpellCheckerService";

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public SpellCheckerService(){
    super();
  }
  // Methods

  public abstract SpellCheckerService.Session createSession();
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public final android.os.IBinder onBind(android.content.Intent arg1){
    return (android.os.IBinder) null;
  }
}
