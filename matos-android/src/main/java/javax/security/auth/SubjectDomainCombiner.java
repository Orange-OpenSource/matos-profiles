package javax.security.auth;

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


public class SubjectDomainCombiner
  implements java.security.DomainCombiner
{
  // Constructors

  public SubjectDomainCombiner(Subject arg1){
  }
  // Methods

  public java.security.ProtectionDomain [] combine(java.security.ProtectionDomain [] arg1, java.security.ProtectionDomain [] arg2){
    return (java.security.ProtectionDomain []) null;
  }
  public Subject getSubject(){
    return (Subject) null;
  }
}
