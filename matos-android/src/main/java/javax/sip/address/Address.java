package javax.sip.address;

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


public interface Address
  extends java.io.Serializable, java.lang.Cloneable
{
  // Methods

  public boolean equals(java.lang.Object arg1);
  public int hashCode();
  public java.lang.Object clone();
  public java.lang.String getHost();
  public int getPort();
  public java.lang.String getDisplayName();
  public URI getURI();
  public void setURI(URI arg1);
  public void setWildCardFlag();
  public void setDisplayName(java.lang.String arg1) throws java.text.ParseException;
  public boolean isWildcard();
  public java.lang.String getUserAtHostPort();
  public boolean hasDisplayName();
  public boolean isSIPAddress();
}
