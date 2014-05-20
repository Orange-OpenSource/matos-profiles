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


public final class TextServicesManager
{
  // Constructors

  private TextServicesManager(){
  }
  // Methods

  public static TextServicesManager getInstance(){
    return (TextServicesManager) null;
  }
  public SpellCheckerInfo getCurrentSpellChecker(){
    return (SpellCheckerInfo) null;
  }
  public SpellCheckerSubtype getCurrentSpellCheckerSubtype(boolean arg1){
    return (SpellCheckerSubtype) null;
  }
  public void setCurrentSpellChecker(SpellCheckerInfo arg1){
  }
  public void setSpellCheckerEnabled(boolean arg1){
  }
  public boolean isSpellCheckerEnabled(){
    return false;
  }
  public SpellCheckerInfo [] getEnabledSpellCheckers(){
    return (SpellCheckerInfo []) null;
  }
  public SpellCheckerSession newSpellCheckerSession(android.os.Bundle arg1, java.util.Locale arg2, SpellCheckerSession.SpellCheckerSessionListener arg3, boolean arg4){
    return (SpellCheckerSession) null;
  }
  public void setSpellCheckerSubtype(SpellCheckerSubtype arg1){
  }
}
