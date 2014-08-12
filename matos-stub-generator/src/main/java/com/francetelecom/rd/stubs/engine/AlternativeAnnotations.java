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

/**
 * This interface describes an annotation translater. 
 * @author Pierre Cregut
 *
 */
public interface AlternativeAnnotations {
	/**
	 * Gives back the set of annotation to display for a class.
	 * @param c the original class object
	 * @return an array of annotations. May be the original annotations.
	 */
	public Annotation [] getDeclaredAnnotations(Class<?> c);

	/**
	 * Gives back the set of annotation to display for a method.
	 * @param m the original reflexive method object
	 * @return an array of annotations. May be the original annotations.
	 */
	public Annotation [] getDeclaredAnnotations(Method m);
	/**
	 * Gives back the set of annotation to display for the parameters of a method
	 * @param m the original reflexive method object
	 * @return a matrix of annotations. May be the original annotations.
	 */
	public Annotation [][] getParameterAnnotations(Method m);
	
	/**
	 * Gives back the set of annotation to display for a constructor.
	 * @param co the original constructor
	 * @return an array of annotations. May be the original annotations.
	 */
	public Annotation [] getDeclaredAnnotations(Constructor<?> co);
	/**
	 * Gives back the set of annotation to display for the parameters of a method
	 * @param co the original reflexive method object
	 * @return a matrix of annotations. May be the original annotations.
	 */	
	public Annotation [][] getParameterAnnotations(Constructor<?> co);
	
	/**
	 * Gives back the set of annotation to display for a field.
	 * @param f the original field
	 * @return an array of annotations. May be the original annotations.
	 */
	public Annotation [] getDeclaredAnnotations(Field f);
	
}
