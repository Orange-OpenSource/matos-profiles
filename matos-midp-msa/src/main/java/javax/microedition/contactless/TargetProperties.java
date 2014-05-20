package javax.microedition.contactless;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2004 - 2014 Orange SA
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

import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;

@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr257.TargetPropertiesImplem")
public interface TargetProperties {
	public java.lang.Class[] getConnectionNames();
	public java.lang.String	getMapping();
	public java.lang.String getProperty(java.lang.String name);
	public TargetType[]	getTargetTypes();
	public java.lang.String getUid();
	public java.lang.String getUrl();
	public java.lang.String getUrl(java.lang.Class connectionName);
	public boolean hasTargetType(TargetType type); 
}
