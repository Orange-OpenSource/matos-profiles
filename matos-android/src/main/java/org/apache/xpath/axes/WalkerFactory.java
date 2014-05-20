package org.apache.xpath.axes;

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


public class WalkerFactory
{
  // Fields

  public static final int BITS_COUNT = 255;

  public static final int BITS_RESERVED = 3840;

  public static final int BIT_PREDICATE = 4096;

  public static final int BIT_ANCESTOR = 8192;

  public static final int BIT_ANCESTOR_OR_SELF = 16384;

  public static final int BIT_ATTRIBUTE = 32768;

  public static final int BIT_CHILD = 65536;

  public static final int BIT_DESCENDANT = 131072;

  public static final int BIT_DESCENDANT_OR_SELF = 262144;

  public static final int BIT_FOLLOWING = 524288;

  public static final int BIT_FOLLOWING_SIBLING = 1048576;

  public static final int BIT_NAMESPACE = 2097152;

  public static final int BIT_PARENT = 4194304;

  public static final int BIT_PRECEDING = 8388608;

  public static final int BIT_PRECEDING_SIBLING = 16777216;

  public static final int BIT_SELF = 33554432;

  public static final int BIT_FILTER = 67108864;

  public static final int BIT_ROOT = 134217728;

  public static final int BITMASK_TRAVERSES_OUTSIDE_SUBTREE = 234381312;

  public static final int BIT_BACKWARDS_SELF = 268435456;

  public static final int BIT_ANY_DESCENDANT_FROM_ROOT = 536870912;

  public static final int BIT_NODETEST_ANY = 1073741824;

  public static final int BIT_MATCH_PATTERN = -2147483648;

  // Constructors

  public WalkerFactory(){
  }
  // Methods

  public static boolean isAbsolute(int arg1){
    return false;
  }
  public static boolean isSet(int arg1, int arg2){
    return false;
  }
  public static int getAnalysisBitFromAxes(int arg1){
    return 0;
  }
  public static void diagnoseIterator(java.lang.String arg1, int arg2, org.apache.xpath.compiler.Compiler arg3){
  }
  public static org.apache.xml.dtm.DTMIterator newDTMIterator(org.apache.xpath.compiler.Compiler arg1, int arg2, boolean arg3) throws javax.xml.transform.TransformerException{
    return (org.apache.xml.dtm.DTMIterator) null;
  }
  public static boolean isOneStep(int arg1){
    return false;
  }
  public static int getAxisFromStep(org.apache.xpath.compiler.Compiler arg1, int arg2) throws javax.xml.transform.TransformerException{
    return 0;
  }
  public static boolean mightBeProximate(org.apache.xpath.compiler.Compiler arg1, int arg2, int arg3) throws javax.xml.transform.TransformerException{
    return false;
  }
  public static boolean isDownwardAxisOfMany(int arg1){
    return false;
  }
  public static java.lang.String getAnalysisString(int arg1){
    return (java.lang.String) null;
  }
  public static boolean hasPredicate(int arg1){
    return false;
  }
  public static boolean isWild(int arg1){
    return false;
  }
  public static boolean walksAncestors(int arg1){
    return false;
  }
  public static boolean walksAttributes(int arg1){
    return false;
  }
  public static boolean walksNamespaces(int arg1){
    return false;
  }
  public static boolean walksChildren(int arg1){
    return false;
  }
  public static boolean walksDescendants(int arg1){
    return false;
  }
  public static boolean walksSubtree(int arg1){
    return false;
  }
  public static boolean walksSubtreeOnlyMaybeAbsolute(int arg1){
    return false;
  }
  public static boolean walksSubtreeOnly(int arg1){
    return false;
  }
  public static boolean walksFilteredList(int arg1){
    return false;
  }
  public static boolean walksSubtreeOnlyFromRootOrContext(int arg1){
    return false;
  }
  public static boolean walksInDocOrder(int arg1){
    return false;
  }
  public static boolean walksFollowingOnlyMaybeAbsolute(int arg1){
    return false;
  }
  public static boolean walksUp(int arg1){
    return false;
  }
  public static boolean walksSideways(int arg1){
    return false;
  }
  public static boolean walksExtraNodes(int arg1){
    return false;
  }
  public static boolean walksExtraNodesOnly(int arg1){
    return false;
  }
  public static boolean walksChildrenOnly(int arg1){
    return false;
  }
  public static boolean walksChildrenAndExtraAndSelfOnly(int arg1){
    return false;
  }
  public static boolean walksDescendantsAndExtraAndSelfOnly(int arg1){
    return false;
  }
  public static boolean walksSelfOnly(int arg1){
    return false;
  }
  public static boolean walksUpOnly(int arg1){
    return false;
  }
  public static boolean walksDownOnly(int arg1){
    return false;
  }
  public static boolean walksDownExtraOnly(int arg1){
    return false;
  }
  public static boolean canSkipSubtrees(int arg1){
    return false;
  }
  public static boolean canCrissCross(int arg1){
    return false;
  }
  public static boolean isNaturalDocOrder(int arg1){
    return false;
  }
  public static int getStepCount(int arg1){
    return 0;
  }
}
