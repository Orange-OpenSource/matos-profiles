package javax.annotation;

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


@javax.annotation.meta.TypeQualifier(applicableTo = java.lang.String.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface MatchesPattern
{
  // Classes

  public static class Checker
    implements javax.annotation.meta.TypeQualifierValidator<MatchesPattern>
  {
    // Constructors

    public Checker(){
    }
    // Methods

    public javax.annotation.meta.When forConstantValue(MatchesPattern arg1, java.lang.Object arg2){
      return (javax.annotation.meta.When) null;
    }
  }
  // Methods

  @RegEx(when = javax.annotation.meta.When.ALWAYS)
  public java.lang.String value();
  public int flags();
}
