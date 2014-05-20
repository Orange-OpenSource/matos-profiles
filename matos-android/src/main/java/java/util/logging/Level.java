package java.util.logging;

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


public class Level
  implements java.io.Serializable
{
  // Fields

  public static final Level OFF = null;

  public static final Level SEVERE = null;

  public static final Level WARNING = null;

  public static final Level INFO = null;

  public static final Level CONFIG = null;

  public static final Level FINE = null;

  public static final Level FINER = null;

  public static final Level FINEST = null;

  public static final Level ALL = null;

  // Constructors

  protected Level(java.lang.String arg1, int arg2){
  }
  protected Level(java.lang.String arg1, int arg2, java.lang.String arg3){
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public final java.lang.String toString(){
    return (java.lang.String) null;
  }
  public int hashCode(){
    return 0;
  }
  public final int intValue(){
    return 0;
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public static Level parse(java.lang.String arg1) throws java.lang.IllegalArgumentException{
    return (Level) null;
  }
  public java.lang.String getResourceBundleName(){
    return (java.lang.String) null;
  }
  public java.lang.String getLocalizedName(){
    return (java.lang.String) null;
  }
}
