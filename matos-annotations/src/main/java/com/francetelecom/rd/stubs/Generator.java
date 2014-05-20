package com.francetelecom.rd.stubs;

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
 * Generator for primitive values. Use native methods so that 
 * the static analysis does not believe it knows the value.
 * @author piac6784
 *
 */
public class Generator {
	/**
	 * The token.
	 */
	public static Token token = new Token();
    /**
     * integer value generator
     * @return
     */
    public static native int intValue();
    /**
     * byte value generator
     * @return
     */
    public static native byte byteValue();
    /**
     * short value generator
     * @return
     */
    public static native short shortValue();
    /**
     * char value generator
     * @return
     */
    public static native char charValue();
    /**
     * boolean value generator
     * @return
     */
    public static native boolean booleanValue();
    /**
     * float value generator
     * @return
     */
    public static native float floatValue();
    /**
     * double value generator
     * @return
     */
    public static native double doubleValue();
    /**
     * long value generator
     * @return
     */
    public static native long longValue();
    
    /**
     * String when we do not want to see it resolved. Only for Buffers.
     * @return
     */
    public static native String stringValue();
    
}
