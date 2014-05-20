package org.apache.xml.dtm.ref;

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


public abstract class DTMDefaultBaseTraversers
  extends DTMDefaultBase{
  // Constructors

  public DTMDefaultBaseTraversers(org.apache.xml.dtm.DTMManager arg1, javax.xml.transform.Source arg2, int arg3, org.apache.xml.dtm.DTMWSFilter arg4, org.apache.xml.utils.XMLStringFactory arg5, boolean arg6){
    super((org.apache.xml.dtm.DTMManager) null, (javax.xml.transform.Source) null, 0, (org.apache.xml.dtm.DTMWSFilter) null, (org.apache.xml.utils.XMLStringFactory) null, false);
  }
  public DTMDefaultBaseTraversers(org.apache.xml.dtm.DTMManager arg1, javax.xml.transform.Source arg2, int arg3, org.apache.xml.dtm.DTMWSFilter arg4, org.apache.xml.utils.XMLStringFactory arg5, boolean arg6, int arg7, boolean arg8, boolean arg9){
    super((org.apache.xml.dtm.DTMManager) null, (javax.xml.transform.Source) null, 0, (org.apache.xml.dtm.DTMWSFilter) null, (org.apache.xml.utils.XMLStringFactory) null, false);
  }
  // Methods

  public org.apache.xml.dtm.DTMAxisTraverser getAxisTraverser(int arg1){
    return (org.apache.xml.dtm.DTMAxisTraverser) null;
  }
}
