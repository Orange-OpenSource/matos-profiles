package android.appwidget;

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
public class AppWidgetHost
{
  // Constructors

  public AppWidgetHost(android.content.Context arg1, int arg2){
  }
  // Methods

  protected AppWidgetHostView onCreateView(android.content.Context arg1, int arg2, AppWidgetProviderInfo arg3){
    return (AppWidgetHostView) null;
  }
  public void startListening(){
  }
  public void stopListening(){
  }
  public int allocateAppWidgetId(){
    return 0;
  }
  public void deleteAppWidgetId(int arg1){
  }
  public void deleteHost(){
  }
  public static void deleteAllHosts(){
  }
  public final AppWidgetHostView createView(android.content.Context arg1, int arg2, AppWidgetProviderInfo arg3){
    return (AppWidgetHostView) null;
  }
  protected void onProviderChanged(int arg1, AppWidgetProviderInfo arg2){
  }
  protected void clearViews(){
  }
}
