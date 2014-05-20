package android.view.textservice;

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
public class SpellCheckerSession
{
  // Classes

  public static interface SpellCheckerSessionListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("SpellCheckerSessionListener")
    public void onGetSuggestions(SuggestionsInfo [] arg1);
  }
  // Fields

  public static final java.lang.String SERVICE_META_DATA = "android.view.textservice.scs";

  // Constructors

  public SpellCheckerSession(SpellCheckerInfo arg1, com.android.internal.textservice.ITextServicesManager arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("SpellCheckerSessionListener") SpellCheckerSession.SpellCheckerSessionListener arg3){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public void close(){
  }
  public void getSuggestions(TextInfo arg1, int arg2){
  }
  public void getSuggestions(TextInfo [] arg1, int arg2, boolean arg3){
  }
  public SpellCheckerInfo getSpellChecker(){
    return (SpellCheckerInfo) null;
  }
  public boolean isSessionDisconnected(){
    return false;
  }
  public com.android.internal.textservice.ITextServicesSessionListener getTextServicesSessionListener(){
    return (com.android.internal.textservice.ITextServicesSessionListener) null;
  }
  public com.android.internal.textservice.ISpellCheckerSessionListener getSpellCheckerSessionListener(){
    return (com.android.internal.textservice.ISpellCheckerSessionListener) null;
  }
}
