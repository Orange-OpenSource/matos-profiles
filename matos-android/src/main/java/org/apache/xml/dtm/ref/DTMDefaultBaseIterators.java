package org.apache.xml.dtm.ref;

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


public abstract class DTMDefaultBaseIterators
  extends DTMDefaultBaseTraversers{
  // Classes

  public abstract class InternalAxisIteratorBase
    extends DTMAxisIteratorBase  {
    // Fields

    protected int _currentNode;

    // Constructors

    public InternalAxisIteratorBase(){
      super();
    }
    // Methods

    public void setMark(){
    }
    public void gotoMark(){
    }
  }
  public final class ChildrenIterator
    extends DTMDefaultBaseIterators.InternalAxisIteratorBase  {
    // Fields

    // Constructors

    public ChildrenIterator(){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
    public org.apache.xml.dtm.DTMAxisIterator setStartNode(int arg1){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
  }
  public final class ParentIterator
    extends DTMDefaultBaseIterators.InternalAxisIteratorBase  {
    // Fields

    // Constructors

    public ParentIterator(){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
    public org.apache.xml.dtm.DTMAxisIterator setStartNode(int arg1){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
    public org.apache.xml.dtm.DTMAxisIterator setNodeType(int arg1){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
  }
  public final class TypedChildrenIterator
    extends DTMDefaultBaseIterators.InternalAxisIteratorBase  {
    // Fields

    // Constructors

    public TypedChildrenIterator(int arg1){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
    public org.apache.xml.dtm.DTMAxisIterator setStartNode(int arg1){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
  }
  public final class NamespaceChildrenIterator
    extends DTMDefaultBaseIterators.InternalAxisIteratorBase  {
    // Fields

    // Constructors

    public NamespaceChildrenIterator(int arg1){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
    public org.apache.xml.dtm.DTMAxisIterator setStartNode(int arg1){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
  }
  public class NamespaceIterator
    extends DTMDefaultBaseIterators.InternalAxisIteratorBase  {
    // Fields

    // Constructors

    public NamespaceIterator(){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
    public org.apache.xml.dtm.DTMAxisIterator setStartNode(int arg1){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
  }
  public class TypedNamespaceIterator
    extends DTMDefaultBaseIterators.NamespaceIterator  {
    // Fields

    // Constructors

    public TypedNamespaceIterator(int arg1){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
  }
  public class RootIterator
    extends DTMDefaultBaseIterators.InternalAxisIteratorBase  {
    // Fields

    // Constructors

    public RootIterator(){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
    public org.apache.xml.dtm.DTMAxisIterator setStartNode(int arg1){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
  }
  public class TypedRootIterator
    extends DTMDefaultBaseIterators.RootIterator  {
    // Fields

    // Constructors

    public TypedRootIterator(int arg1){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
  }
  public final class NamespaceAttributeIterator
    extends DTMDefaultBaseIterators.InternalAxisIteratorBase  {
    // Fields

    // Constructors

    public NamespaceAttributeIterator(int arg1){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
    public org.apache.xml.dtm.DTMAxisIterator setStartNode(int arg1){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
  }
  public class FollowingSiblingIterator
    extends DTMDefaultBaseIterators.InternalAxisIteratorBase  {
    // Fields

    // Constructors

    public FollowingSiblingIterator(){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
    public org.apache.xml.dtm.DTMAxisIterator setStartNode(int arg1){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
  }
  public final class TypedFollowingSiblingIterator
    extends DTMDefaultBaseIterators.FollowingSiblingIterator  {
    // Fields

    // Constructors

    public TypedFollowingSiblingIterator(int arg1){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
  }
  public final class AttributeIterator
    extends DTMDefaultBaseIterators.InternalAxisIteratorBase  {
    // Fields

    // Constructors

    public AttributeIterator(){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
    public org.apache.xml.dtm.DTMAxisIterator setStartNode(int arg1){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
  }
  public final class TypedAttributeIterator
    extends DTMDefaultBaseIterators.InternalAxisIteratorBase  {
    // Fields

    // Constructors

    public TypedAttributeIterator(int arg1){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
    public org.apache.xml.dtm.DTMAxisIterator setStartNode(int arg1){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
  }
  public class PrecedingSiblingIterator
    extends DTMDefaultBaseIterators.InternalAxisIteratorBase  {
    // Fields

    protected int _startNodeID;

    // Constructors

    public PrecedingSiblingIterator(){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
    public org.apache.xml.dtm.DTMAxisIterator setStartNode(int arg1){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
    public boolean isReverse(){
      return false;
    }
  }
  public final class TypedPrecedingSiblingIterator
    extends DTMDefaultBaseIterators.PrecedingSiblingIterator  {
    // Fields

    // Constructors

    public TypedPrecedingSiblingIterator(int arg1){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
  }
  public class PrecedingIterator
    extends DTMDefaultBaseIterators.InternalAxisIteratorBase  {
    // Fields

    protected int [] _stack;

    protected int _sp;

    protected int _oldsp;

    protected int _markedsp;

    protected int _markedNode;

    protected int _markedDescendant;

    // Constructors

    public PrecedingIterator(){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
    public org.apache.xml.dtm.DTMAxisIterator reset(){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
    public org.apache.xml.dtm.DTMAxisIterator setStartNode(int arg1){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
    public void setMark(){
    }
    public void gotoMark(){
    }
    public boolean isReverse(){
      return false;
    }
    public org.apache.xml.dtm.DTMAxisIterator cloneIterator(){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
  }
  public final class TypedPrecedingIterator
    extends DTMDefaultBaseIterators.PrecedingIterator  {
    // Fields

    // Constructors

    public TypedPrecedingIterator(int arg1){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
  }
  public class FollowingIterator
    extends DTMDefaultBaseIterators.InternalAxisIteratorBase  {
    // Fields

    // Constructors

    public FollowingIterator(){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
    public org.apache.xml.dtm.DTMAxisIterator setStartNode(int arg1){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
  }
  public final class TypedFollowingIterator
    extends DTMDefaultBaseIterators.FollowingIterator  {
    // Fields

    // Constructors

    public TypedFollowingIterator(int arg1){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
  }
  public class AncestorIterator
    extends DTMDefaultBaseIterators.InternalAxisIteratorBase  {
    // Fields

    // Constructors

    public AncestorIterator(){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
    public org.apache.xml.dtm.DTMAxisIterator reset(){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
    public org.apache.xml.dtm.DTMAxisIterator setStartNode(int arg1){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
    public void setMark(){
    }
    public void gotoMark(){
    }
    public int getStartNode(){
      return 0;
    }
    public final boolean isReverse(){
      return false;
    }
    public org.apache.xml.dtm.DTMAxisIterator cloneIterator(){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
  }
  public final class TypedAncestorIterator
    extends DTMDefaultBaseIterators.AncestorIterator  {
    // Fields

    // Constructors

    public TypedAncestorIterator(int arg1){
      super();
    }
    // Methods

    public org.apache.xml.dtm.DTMAxisIterator setStartNode(int arg1){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
  }
  public class DescendantIterator
    extends DTMDefaultBaseIterators.InternalAxisIteratorBase  {
    // Fields

    // Constructors

    public DescendantIterator(){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
    public org.apache.xml.dtm.DTMAxisIterator reset(){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
    public org.apache.xml.dtm.DTMAxisIterator setStartNode(int arg1){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
    protected boolean isDescendant(int arg1){
      return false;
    }
  }
  public final class TypedDescendantIterator
    extends DTMDefaultBaseIterators.DescendantIterator  {
    // Fields

    // Constructors

    public TypedDescendantIterator(int arg1){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
  }
  public class NthDescendantIterator
    extends DTMDefaultBaseIterators.DescendantIterator  {
    // Fields

    // Constructors

    public NthDescendantIterator(int arg1){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
  }
  public class SingletonIterator
    extends DTMDefaultBaseIterators.InternalAxisIteratorBase  {
    // Fields

    // Constructors

    public SingletonIterator(){
      super();
    }
    public SingletonIterator(int arg1){
      super();
    }
    public SingletonIterator(int arg1, boolean arg2){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
    public org.apache.xml.dtm.DTMAxisIterator reset(){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
    public org.apache.xml.dtm.DTMAxisIterator setStartNode(int arg1){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
  }
  public final class TypedSingletonIterator
    extends DTMDefaultBaseIterators.SingletonIterator  {
    // Fields

    // Constructors

    public TypedSingletonIterator(int arg1){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
  }
  // Constructors

  public DTMDefaultBaseIterators(org.apache.xml.dtm.DTMManager arg1, javax.xml.transform.Source arg2, int arg3, org.apache.xml.dtm.DTMWSFilter arg4, org.apache.xml.utils.XMLStringFactory arg5, boolean arg6){
    super((org.apache.xml.dtm.DTMManager) null, (javax.xml.transform.Source) null, 0, (org.apache.xml.dtm.DTMWSFilter) null, (org.apache.xml.utils.XMLStringFactory) null, false);
  }
  public DTMDefaultBaseIterators(org.apache.xml.dtm.DTMManager arg1, javax.xml.transform.Source arg2, int arg3, org.apache.xml.dtm.DTMWSFilter arg4, org.apache.xml.utils.XMLStringFactory arg5, boolean arg6, int arg7, boolean arg8, boolean arg9){
    super((org.apache.xml.dtm.DTMManager) null, (javax.xml.transform.Source) null, 0, (org.apache.xml.dtm.DTMWSFilter) null, (org.apache.xml.utils.XMLStringFactory) null, false);
  }
  // Methods

  public org.apache.xml.dtm.DTMAxisIterator getTypedAxisIterator(int arg1, int arg2){
    return (org.apache.xml.dtm.DTMAxisIterator) null;
  }
  public org.apache.xml.dtm.DTMAxisIterator getAxisIterator(int arg1){
    return (org.apache.xml.dtm.DTMAxisIterator) null;
  }
}
