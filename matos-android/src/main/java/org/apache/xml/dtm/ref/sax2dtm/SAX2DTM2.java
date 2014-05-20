package org.apache.xml.dtm.ref.sax2dtm;

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


public class SAX2DTM2
  extends SAX2DTM{
  // Classes

  public final class ChildrenIterator
    extends org.apache.xml.dtm.ref.DTMDefaultBaseIterators.InternalAxisIteratorBase  {
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
    extends org.apache.xml.dtm.ref.DTMDefaultBaseIterators.InternalAxisIteratorBase  {
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
    extends org.apache.xml.dtm.ref.DTMDefaultBaseIterators.InternalAxisIteratorBase  {
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
    public int getNodeByPosition(int arg1){
      return 0;
    }
  }
  public class TypedRootIterator
    extends org.apache.xml.dtm.ref.DTMDefaultBaseIterators.RootIterator  {
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
  public class FollowingSiblingIterator
    extends org.apache.xml.dtm.ref.DTMDefaultBaseIterators.InternalAxisIteratorBase  {
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
    extends SAX2DTM2.FollowingSiblingIterator  {
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
    extends org.apache.xml.dtm.ref.DTMDefaultBaseIterators.InternalAxisIteratorBase  {
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
    extends org.apache.xml.dtm.ref.DTMDefaultBaseIterators.InternalAxisIteratorBase  {
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
    extends org.apache.xml.dtm.ref.DTMDefaultBaseIterators.InternalAxisIteratorBase  {
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
    extends SAX2DTM2.PrecedingSiblingIterator  {
    // Fields

    // Constructors

    public TypedPrecedingSiblingIterator(int arg1){
      super();
    }
    // Methods

    public int next(){
      return 0;
    }
    public int getLast(){
      return 0;
    }
  }
  public class PrecedingIterator
    extends org.apache.xml.dtm.ref.DTMDefaultBaseIterators.InternalAxisIteratorBase  {
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
    extends SAX2DTM2.PrecedingIterator  {
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
    extends org.apache.xml.dtm.ref.DTMDefaultBaseIterators.InternalAxisIteratorBase  {
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
    extends SAX2DTM2.FollowingIterator  {
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
    extends org.apache.xml.dtm.ref.DTMDefaultBaseIterators.InternalAxisIteratorBase  {
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
    extends SAX2DTM2.AncestorIterator  {
    // Fields

    // Constructors

    public TypedAncestorIterator(int arg1){
      super();
    }
    // Methods

    public org.apache.xml.dtm.DTMAxisIterator setStartNode(int arg1){
      return (org.apache.xml.dtm.DTMAxisIterator) null;
    }
    public int getLast(){
      return 0;
    }
    public int getNodeByPosition(int arg1){
      return 0;
    }
  }
  public class DescendantIterator
    extends org.apache.xml.dtm.ref.DTMDefaultBaseIterators.InternalAxisIteratorBase  {
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
    protected final boolean isDescendant(int arg1){
      return false;
    }
  }
  public final class TypedDescendantIterator
    extends SAX2DTM2.DescendantIterator  {
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
  public final class TypedSingletonIterator
    extends org.apache.xml.dtm.ref.DTMDefaultBaseIterators.SingletonIterator  {
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
  // Fields

  protected org.apache.xml.dtm.ref.ExtendedType [] m_extendedTypes;

  protected java.util.Vector m_values;

  protected int m_SHIFT;

  protected int m_MASK;

  protected int m_blocksize;

  protected static final int TEXT_LENGTH_BITS = 0;

  protected static final int TEXT_OFFSET_BITS = 0;

  protected static final int TEXT_LENGTH_MAX = 0;

  protected static final int TEXT_OFFSET_MAX = 0;

  protected boolean m_buildIdIndex;

  // Constructors

  public SAX2DTM2(org.apache.xml.dtm.DTMManager arg1, javax.xml.transform.Source arg2, int arg3, org.apache.xml.dtm.DTMWSFilter arg4, org.apache.xml.utils.XMLStringFactory arg5, boolean arg6){
    super((org.apache.xml.dtm.DTMManager) null, (javax.xml.transform.Source) null, 0, (org.apache.xml.dtm.DTMWSFilter) null, (org.apache.xml.utils.XMLStringFactory) null, false);
  }
  public SAX2DTM2(org.apache.xml.dtm.DTMManager arg1, javax.xml.transform.Source arg2, int arg3, org.apache.xml.dtm.DTMWSFilter arg4, org.apache.xml.utils.XMLStringFactory arg5, boolean arg6, int arg7, boolean arg8, boolean arg9, boolean arg10){
    super((org.apache.xml.dtm.DTMManager) null, (javax.xml.transform.Source) null, 0, (org.apache.xml.dtm.DTMWSFilter) null, (org.apache.xml.utils.XMLStringFactory) null, false);
  }
  // Methods

  public void comment(char [] arg1, int arg2, int arg3) throws org.xml.sax.SAXException{
  }
  public org.apache.xml.utils.XMLString getStringValue(int arg1){
    return (org.apache.xml.utils.XMLString) null;
  }
  public java.lang.String getStringValue(){
    return (java.lang.String) null;
  }
  public java.lang.String getLocalName(int arg1){
    return (java.lang.String) null;
  }
  public void startElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, org.xml.sax.Attributes arg4) throws org.xml.sax.SAXException{
  }
  public void endElement(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws org.xml.sax.SAXException{
  }
  public void startDocument() throws org.xml.sax.SAXException{
  }
  public void endDocument() throws org.xml.sax.SAXException{
  }
  public void processingInstruction(java.lang.String arg1, java.lang.String arg2) throws org.xml.sax.SAXException{
  }
  public java.lang.String getNodeName(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getNodeValue(int arg1){
    return (java.lang.String) null;
  }
  public final void dispatchCharactersEvents(int arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("handle") org.xml.sax.ContentHandler arg2, boolean arg3) throws org.xml.sax.SAXException{
  }
  public final int _exptype(int arg1){
    return 0;
  }
  protected final int getTypedAttribute(int arg1, int arg2){
    return 0;
  }
  public final int _firstch2(int arg1){
    return 0;
  }
  public final int _nextsib2(int arg1){
    return 0;
  }
  protected final int addNode(int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6){
    return 0;
  }
  public final int _exptype2(int arg1){
    return 0;
  }
  public final int _type2(int arg1){
    return 0;
  }
  public final int _parent2(int arg1){
    return 0;
  }
  protected int getFirstAttributeIdentity(int arg1){
    return 0;
  }
  protected int getNextAttributeIdentity(int arg1){
    return 0;
  }
  public final int getExpandedTypeID2(int arg1){
    return 0;
  }
  public final int _exptype2Type(int arg1){
    return 0;
  }
  public int getIdForNamespace(java.lang.String arg1){
    return 0;
  }
  protected final void charactersFlush(){
  }
  public final int getFirstAttribute(int arg1){
    return 0;
  }
  public final java.lang.String getNodeNameX(int arg1){
    return (java.lang.String) null;
  }
  public final java.lang.String getStringValueX(int arg1){
    return (java.lang.String) null;
  }
  protected final void copyTextNode(int arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("serializationHandler") org.apache.xml.serializer.SerializationHandler arg2) throws org.xml.sax.SAXException{
  }
  protected final java.lang.String copyElement(int arg1, int arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("serializationHandler") org.apache.xml.serializer.SerializationHandler arg3) throws org.xml.sax.SAXException{
    return (java.lang.String) null;
  }
  protected final void copyNS(int arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("serializationHandler") org.apache.xml.serializer.SerializationHandler arg2, boolean arg3) throws org.xml.sax.SAXException{
  }
  protected final int getNextNamespaceNode2(int arg1){
    return 0;
  }
  protected final void copyAttributes(int arg1, @com.francetelecom.rd.stubs.annotation.CallBackRegister("serializationHandler") org.apache.xml.serializer.SerializationHandler arg2) throws org.xml.sax.SAXException{
  }
  protected final void copyAttribute(int arg1, int arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("serializationHandler") org.apache.xml.serializer.SerializationHandler arg3) throws org.xml.sax.SAXException{
  }
}
