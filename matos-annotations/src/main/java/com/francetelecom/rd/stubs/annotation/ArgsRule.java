package com.francetelecom.rd.stubs.annotation;

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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A matos analysis rule that analyze the potential values of some args in the calls
 * to this method.
 * 
 * Caveat: we could use annotations instead of the args array, but we need base and
 * return value (0 and -1) and we may want to have several rules on the same method.
 * @author Pierre Cregut
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})

public @interface ArgsRule {
	/**
	 * The name of the rule.
	 * @return
	 */
	String value();
	/**
	 * The position of the arguments whose values are analyzed.
	 * @return
	 */
	int [] pos();
	/**
	 * The optional report name.
	 * @return
	 */
	String report() default "-";
}
