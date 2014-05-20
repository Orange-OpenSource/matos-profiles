package android.util;

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

import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.FieldNoValue;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class Pair<F, S>
{
  // Fields
	@FieldNoValue
  public final F first = null;
	@FieldNoValue
  public final S second = null;

  // Constructors

  public Pair(@com.francetelecom.rd.stubs.annotation.FieldSet("first") F arg1, @com.francetelecom.rd.stubs.annotation.FieldSet("second") S arg2){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  @Code("return new Pair(arg1,arg2);")
  public static <A, B>Pair<A, B> create(A arg1,B arg2){
    return (Pair) null;
  }
}
