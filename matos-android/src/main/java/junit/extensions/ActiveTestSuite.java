package junit.extensions;

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


public class ActiveTestSuite
  extends junit.framework.TestSuite{
  // Constructors

  public ActiveTestSuite(){
    super();
  }
  public ActiveTestSuite(java.lang.Class arg1){
    super();
  }
  public ActiveTestSuite(java.lang.String arg1){
    super();
  }
  public ActiveTestSuite(java.lang.Class arg1, java.lang.String arg2){
    super();
  }
  // Methods

  public void run(junit.framework.TestResult arg1){
  }
  public void runTest(junit.framework.Test arg1, junit.framework.TestResult arg2){
  }
  public synchronized void runFinished(junit.framework.Test arg1){
  }
}
