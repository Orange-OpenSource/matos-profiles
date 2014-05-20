package java.security.cert;

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


public interface PolicyNode
{
  // Methods

  public PolicyNode getParent();
  public int getDepth();
  public java.util.Iterator<? extends PolicyNode> getChildren();
  public boolean isCritical();
  public java.util.Set<java.lang.String> getExpectedPolicies();
  public java.lang.String getValidPolicy();
  public java.util.Set<? extends PolicyQualifierInfo> getPolicyQualifiers();
}
