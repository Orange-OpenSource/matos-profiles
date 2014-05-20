package java.lang;

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

import java.io.ObjectInputStream;

import com.francetelecom.rd.stubs.Generator;

public abstract class Enum<E extends Enum<E>>  implements Comparable<E>,java.io.Serializable{
	private final String name;
	private final int ordinal;
	public final String name() { return name; }
	public final int ordinal() { return Generator.intValue(); }
	protected Enum(String v, int l) { name = v; ordinal = l; };
	public String toString() { return name; }
	public final boolean equals(Object o) { return Generator.booleanValue(); }
	public final int hashCode() { return Generator.intValue(); }

	public final int compareTo(E e) { return Generator.intValue(); }

	public final Class getDeclaringClass() { return Enum.class; }
	public static <T extends Enum<T>> T valueOf(Class<T> c, String s) { 
		try { return (T) c.newInstance(); } catch (Exception e) { return null;	} 
	}

	private void readObject(ObjectInputStream v) throws java.io.IOException, ClassNotFoundException {};
	private void readObjectNoData() throws java.io.ObjectStreamException {};
	protected final void finalize() {};

}
