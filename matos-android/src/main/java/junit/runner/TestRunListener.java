package junit.runner;

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


public interface TestRunListener
{
  // Fields

  public static final int STATUS_ERROR = 1;

  public static final int STATUS_FAILURE = 2;

  // Methods

  public void testStarted(java.lang.String arg1);
  public void testEnded(java.lang.String arg1);
  public void testFailed(int arg1, java.lang.String arg2, java.lang.String arg3);
  public void testRunStarted(java.lang.String arg1, int arg2);
  public void testRunEnded(long arg1);
  public void testRunStopped(long arg1);
}
