package com.francetelecom.rd.stubs.engine;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2008 - 2014 Orange SA
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

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Alternative annotations where we add a new annotation if the element is found in the alternative
 * implementation. 
 * @author piac6784
 *
 */
public class AlternativeCompletedAnnotations  implements AlternativeAnnotations{
	final AlternativeImplementation altImplem;
	final private Annotation added;
	
	/**
	 * Builds an annotation replacer from a loaded alternative implementations of methods.
	 * @param altImplem
	 */
	public AlternativeCompletedAnnotations(AlternativeImplementation altImplem, Annotation added) {
		this.altImplem = altImplem;
		this.added = added;
	}
	
	@Override
	public Annotation [] getDeclaredAnnotations(Method m) {
		if (altImplem == null) return m.getDeclaredAnnotations();
		else {
			Method altM = altImplem.findEquivalent(m);
			if (altM == null) return m.getDeclaredAnnotations();
			else return complete(m.getDeclaredAnnotations());
		}
	}
	
	@Override
	public Annotation [] getDeclaredAnnotations(Class<?> c) {
		if (altImplem == null) return c.getDeclaredAnnotations();
		else {
			Class<?> altC = altImplem.findEquivalent(c);
			if (altC == null) return c.getDeclaredAnnotations();
			else return complete(c.getDeclaredAnnotations());
		}
	}

	@Override
	public Annotation [] getDeclaredAnnotations(Constructor<?> c) {
		if (altImplem == null) return c.getDeclaredAnnotations();
		else {
			Constructor<?> altC = altImplem.findEquivalent(c);
			if (altC == null) return c.getDeclaredAnnotations();
			else return complete(c.getDeclaredAnnotations());
		}
	}

	@Override
	public Annotation [] getDeclaredAnnotations(Field f) {
		if (altImplem == null) return f.getDeclaredAnnotations();
		else {
			Field altF = altImplem.findEquivalent(f);
			if (altF == null) return f.getDeclaredAnnotations();
			else return complete(f.getDeclaredAnnotations());
		}
	}

	private Annotation[] complete(Annotation[] annotations) {
		Annotation [] newAnnots = Arrays.copyOf(annotations, annotations.length + 1);
		newAnnots[annotations.length] = added;
		return newAnnots;
	}

	@Override
	public Annotation[][] getParameterAnnotations(Method m) {
		return m.getParameterAnnotations();
	}

	@Override
	public Annotation[][] getParameterAnnotations(Constructor<?> co) {
		return co.getParameterAnnotations();
	}

}
