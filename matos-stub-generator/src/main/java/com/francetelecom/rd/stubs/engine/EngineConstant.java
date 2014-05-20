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

/**
 * Various string constants.
 * 
 * @author piac6784
 *
 */
public class EngineConstant {

	/**
	 * Field annotation name
	 */
	public static final String FIELD_ANNOT = "Field";
	
	/**
	 * Container for field annotations.
	 */
	public static final String FIELD_ARRAY_ANNOT = "Fields";

	/**
	 * FieldSet annotation name
	 */
	public static final String FIELD_SET_ANNOT = "FieldSet";
	/**
	 * FieldGet annotation name
	 */
	public static final String FIELD_GET_ANNOT = "FieldGet";
	/**
	 * Annotation : Specific class for a field value.
	 */
	public static final String FIELD_VALUE_IMPL_ANNOT = "FieldValueImpl";
	
	/**
	 * Annotation : no definition for the field.
	 */
	public static final String FIELD_NO_VALUE_ANNOT = "FieldNoValue";
	/**
	 * Callback annotation name
	 */
	public static final String CALLBACK_ANNOT = "CallBack";
	/**
	 * MayBe annotation name
	 */
	public static final String MAY_BE_ANNOT = "MayBe";
	/**
	 * Real annotation name
	 */
	public static final String REAL_ANNOT = "Real";
	/**
	 * Code annotation name
	 */
	public static final String CODE_ANNOT = "Code";
	/**
	 * Super annotation name
	 */
	public static final String SUPER_ANNOT = "UseSuper";
	/**
	 * CallbackRegister annotation name
	 */
	public static final String CALLBACK_REGISTER_ANNOT = "CallBackRegister";
	/**
	 * ClassDone annotation name
	 */
	public static final String CLASSDONE_ANNOT = "ClassDone";

	/**
	 * ArgsRule annotation name
	 */
	public final static String ARG_RULE_ANNOT = "ArgsRule";
	
	/**
	 * ArgsRule annotation name
	 */
	public final static String ARG_RULE_ARRAY_ANNOT = "ArgsRules";

	/**
	 * ReturnRule annotation name
	 */
	public final static String RETURN_RULE_ANNOT = "ReturnRule";
	/**
	 * FieldRule annotation name
	 */
	public final static String FIELD_RULE_ANNOT = "FieldRule";
	/**
	 * UseRule annotation name
	 */
	public final static String USE_RULE_ANNOT = "UseRule";
	
	/**
	 * Annotation to request all the implementers of a class.
	 */
	public final static String DUMP_HIERARCHY_ANNOT = "DumpHierarchy";
	/**
	 * Accumulator annotation name
	 */
	public static final String ACCUMULATOR_ANNOT = "Accumulator";


	/**
	 * Annotation field "value"
	 */
	public static final String VALUE_FIELD = "value";
	/**
	 * Annotation field "report" (Rules)
	 */
	public final static String REPORT_FIELD = "report";
	/**
	 * Annotation field "pos" (ArgsRule only)
	 */
	public final static String ARGS_FIELD = "pos";
	/**
	 * Annotation field "modifier" (Field)
	 */
	public static final String MODIFIER_FIELD = "modifier";
	/**
	 * Annotation field "type" (Field)
	 */
	public static final String TYPE_FIELD = "type";

	/**
	 * Annotation field "super" (Real)
	 */
	public static final String SUPER_FIELD = "superClass";

	/**
	 * Annotation field "noAbstract" in DumpHierarchy
	 */
	public static final String NO_ABSTRACT_FIELD = "noAbstract";
	
}
