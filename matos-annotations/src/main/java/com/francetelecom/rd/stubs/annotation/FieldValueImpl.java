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
 * Annotation that tells that the value contained in this field is implemented
 * with a specific class that extends the declared type. This class is unique to
 * the field and so identifies its content during points-to analysis.
 * 
 * @author piac6784
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})

public @interface FieldValueImpl {
	/**
	 * The name of the class.
	 * @return
	 */
	String value();
}
