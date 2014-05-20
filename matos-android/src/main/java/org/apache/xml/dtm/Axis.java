package org.apache.xml.dtm;

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


public final class Axis
{
  // Fields

  public static final int ANCESTOR = 0;

  public static final int ANCESTORORSELF = 1;

  public static final int ATTRIBUTE = 2;

  public static final int CHILD = 3;

  public static final int DESCENDANT = 4;

  public static final int DESCENDANTORSELF = 5;

  public static final int FOLLOWING = 6;

  public static final int FOLLOWINGSIBLING = 7;

  public static final int NAMESPACEDECLS = 8;

  public static final int NAMESPACE = 9;

  public static final int PARENT = 10;

  public static final int PRECEDING = 11;

  public static final int PRECEDINGSIBLING = 12;

  public static final int SELF = 13;

  public static final int ALLFROMNODE = 14;

  public static final int PRECEDINGANDANCESTOR = 15;

  public static final int ALL = 16;

  public static final int DESCENDANTSFROMROOT = 17;

  public static final int DESCENDANTSORSELFFROMROOT = 18;

  public static final int ROOT = 19;

  public static final int FILTEREDLIST = 20;

  // Constructors

  public Axis(){
  }
  // Methods

  public static boolean isReverse(int arg1){
    return false;
  }
  public static java.lang.String getNames(int arg1){
    return (java.lang.String) null;
  }
  public static int getNamesLength(){
    return 0;
  }
}
