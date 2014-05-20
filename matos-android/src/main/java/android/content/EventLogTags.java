package android.content;

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


public class EventLogTags
{
  // Fields

  public static final int CONTENT_QUERY_SAMPLE = 52002;

  public static final int CONTENT_UPDATE_SAMPLE = 52003;

  public static final int BINDER_SAMPLE = 52004;

  // Constructors

  private EventLogTags(){
  }
  // Methods

  public static void writeContentQuerySample(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, int arg5, java.lang.String arg6, int arg7){
  }
  public static void writeContentUpdateSample(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, int arg4, java.lang.String arg5, int arg6){
  }
  public static void writeBinderSample(java.lang.String arg1, int arg2, int arg3, java.lang.String arg4, int arg5){
  }
}
