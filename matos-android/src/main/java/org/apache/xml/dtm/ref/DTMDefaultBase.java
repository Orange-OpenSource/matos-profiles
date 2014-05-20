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


public abstract class DTMDefaultBase
  implements org.apache.xml.dtm.DTM
{
  // Fields

  public static final int ROOTNODE = 0;

  protected int m_size;

  protected org.apache.xml.utils.SuballocatedIntVector m_exptype;

  protected org.apache.xml.utils.SuballocatedIntVector m_firstch;

  protected org.apache.xml.utils.SuballocatedIntVector m_nextsib;

  protected org.apache.xml.utils.SuballocatedIntVector m_prevsib;

  protected org.apache.xml.utils.SuballocatedIntVector m_parent;

  protected java.util.Vector m_namespaceDeclSets;

  protected org.apache.xml.utils.SuballocatedIntVector m_namespaceDeclSetElements;

  protected int [] [] [] m_elemIndexes;

  public static final int DEFAULT_BLOCKSIZE = 512;

  public static final int DEFAULT_NUMBLOCKS = 32;

  public static final int DEFAULT_NUMBLOCKS_SMALL = 4;

  protected static final int NOTPROCESSED = 0;

  public org.apache.xml.dtm.DTMManager m_mgr;

  protected DTMManagerDefault m_mgrDefault;

  protected org.apache.xml.utils.SuballocatedIntVector m_dtmIdent;

  protected java.lang.String m_documentBaseURI;

  protected org.apache.xml.dtm.DTMWSFilter m_wsfilter;

  protected boolean m_shouldStripWS;

  protected org.apache.xml.utils.BoolStack m_shouldStripWhitespaceStack;

  protected org.apache.xml.utils.XMLStringFactory m_xstrf;

  protected ExpandedNameTable m_expandedNameTable;

  protected boolean m_indexing;

  protected org.apache.xml.dtm.DTMAxisTraverser [] m_traversers;

  // Constructors

  public DTMDefaultBase(org.apache.xml.dtm.DTMManager arg1, javax.xml.transform.Source arg2, int arg3, org.apache.xml.dtm.DTMWSFilter arg4, org.apache.xml.utils.XMLStringFactory arg5, boolean arg6){
  }
  public DTMDefaultBase(org.apache.xml.dtm.DTMManager arg1, javax.xml.transform.Source arg2, int arg3, org.apache.xml.dtm.DTMWSFilter arg4, org.apache.xml.utils.XMLStringFactory arg5, boolean arg6, int arg7, boolean arg8, boolean arg9){
  }
  // Methods

  public int getParent(int arg1){
    return 0;
  }
  public boolean isSupported(java.lang.String arg1, java.lang.String arg2){
    return false;
  }
  protected void error(java.lang.String arg1){
  }
  public abstract org.apache.xml.utils.XMLString getStringValue(int arg1);
  protected abstract boolean nextNode();
  public short getLevel(int arg1){
    return (short) 0;
  }
  public abstract java.lang.String getLocalName(int arg1);
  public int getNextSibling(int arg1){
    return 0;
  }
  public abstract java.lang.String getNodeName(int arg1);
  public short getNodeType(int arg1){
    return (short) 0;
  }
  public void appendChild(int arg1, boolean arg2, boolean arg3){
  }
  public int getLastChild(int arg1){
    return 0;
  }
  public boolean hasChildNodes(int arg1){
    return false;
  }
  public int getOwnerDocument(int arg1){
    return 0;
  }
  public int getPreviousSibling(int arg1){
    return 0;
  }
  public int getFirstChild(int arg1){
    return 0;
  }
  public abstract java.lang.String getNamespaceURI(int arg1);
  public abstract int getAttributeNode(int arg1, java.lang.String arg2, java.lang.String arg3);
  public abstract java.lang.String getNodeValue(int arg1);
  public abstract java.lang.String getPrefix(int arg1);
  public abstract int getElementById(java.lang.String arg1);
  public void setFeature(java.lang.String arg1, boolean arg2){
  }
  public abstract void dispatchCharactersEvents(int arg1, org.xml.sax.ContentHandler arg2, boolean arg3) throws org.xml.sax.SAXException;
  public org.apache.xml.dtm.DTMManager getManager(){
    return (org.apache.xml.dtm.DTMManager) null;
  }
  public org.w3c.dom.Node getNode(int arg1){
    return (org.w3c.dom.Node) null;
  }
  protected int _exptype(int arg1){
    return 0;
  }
  protected int getTypedAttribute(int arg1, int arg2){
    return 0;
  }
  protected int getFirstAttributeIdentity(int arg1){
    return 0;
  }
  protected int getNextAttributeIdentity(int arg1){
    return 0;
  }
  public int getFirstAttribute(int arg1){
    return 0;
  }
  public java.lang.String getNodeNameX(int arg1){
    return (java.lang.String) null;
  }
  public abstract java.lang.String getUnparsedEntityURI(java.lang.String arg1);
  public abstract boolean isAttributeSpecified(int arg1);
  public abstract java.lang.String getDocumentTypeDeclarationSystemIdentifier();
  protected abstract int getNextNodeIdentity(int arg1);
  public abstract void dispatchToEvents(int arg1, org.xml.sax.ContentHandler arg2) throws org.xml.sax.SAXException;
  protected abstract int getNumberOfNodes();
  public void migrateTo(org.apache.xml.dtm.DTMManager arg1){
  }
  public abstract java.lang.String getDocumentTypeDeclarationPublicIdentifier();
  public final int makeNodeIdentity(int arg1){
    return 0;
  }
  public final int makeNodeHandle(int arg1){
    return 0;
  }
  protected int _parent(int arg1){
    return 0;
  }
  protected short _type(int arg1){
    return (short) 0;
  }
  public void documentRegistration(){
  }
  public org.apache.xml.utils.SuballocatedIntVector getDTMIDs(){
    return (org.apache.xml.utils.SuballocatedIntVector) null;
  }
  public void documentRelease(){
  }
  public int getDocument(){
    return 0;
  }
  public int getFirstNamespaceNode(int arg1, boolean arg2){
    return 0;
  }
  public int getNextNamespaceNode(int arg1, int arg2, boolean arg3){
    return 0;
  }
  public int getExpandedTypeID(int arg1){
    return 0;
  }
  public int getExpandedTypeID(java.lang.String arg1, java.lang.String arg2, int arg3){
    return 0;
  }
  protected int _firstch(int arg1){
    return 0;
  }
  public int getDocumentRoot(int arg1){
    return 0;
  }
  protected int _nextsib(int arg1){
    return 0;
  }
  public void appendTextChild(java.lang.String arg1){
  }
  public boolean isNodeAfter(int arg1, int arg2){
    return false;
  }
  public int getNamespaceType(int arg1){
    return 0;
  }
  protected void indexNode(int arg1, int arg2){
  }
  protected boolean getShouldStripWhitespace(){
    return false;
  }
  protected void pushShouldStripWhitespace(boolean arg1){
  }
  protected void popShouldStripWhitespace(){
  }
  protected void declareNamespaceInContext(int arg1, int arg2){
  }
  protected org.apache.xml.utils.SuballocatedIntVector findNamespaceContext(int arg1){
    return (org.apache.xml.utils.SuballocatedIntVector) null;
  }
  public int getNextAttribute(int arg1){
    return 0;
  }
  public java.lang.String getDocumentBaseURI(){
    return (java.lang.String) null;
  }
  protected void ensureSizeOfIndex(int arg1, int arg2){
  }
  protected int findGTE(int [] arg1, int arg2, int arg3, int arg4){
    return 0;
  }
  protected int _level(int arg1){
    return 0;
  }
  protected int _prevsib(int arg1){
    return 0;
  }
  public void dumpDTM(java.io.OutputStream arg1){
  }
  public java.lang.String dumpNode(int arg1){
    return (java.lang.String) null;
  }
  public int getTypedFirstChild(int arg1, int arg2){
    return 0;
  }
  public int getTypedNextSibling(int arg1, int arg2){
    return 0;
  }
  protected int findInSortedSuballocatedIntVector(org.apache.xml.utils.SuballocatedIntVector arg1, int arg2){
    return 0;
  }
  public int getStringValueChunkCount(int arg1){
    return 0;
  }
  public char [] getStringValueChunk(int arg1, int arg2, int [] arg3){
    return (char []) null;
  }
  public java.lang.String getLocalNameFromExpandedNameID(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getNamespaceFromExpandedNameID(int arg1){
    return (java.lang.String) null;
  }
  public int getNodeIdent(int arg1){
    return 0;
  }
  public int getNodeHandle(int arg1){
    return 0;
  }
  public void setDocumentBaseURI(java.lang.String arg1){
  }
  public java.lang.String getDocumentSystemIdentifier(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getDocumentEncoding(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getDocumentStandalone(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String getDocumentVersion(int arg1){
    return (java.lang.String) null;
  }
  public boolean getDocumentAllDeclarationsProcessed(){
    return false;
  }
  public boolean supportsPreStripping(){
    return false;
  }
  public boolean isCharacterElementContentWhitespace(int arg1){
    return false;
  }
  public boolean isDocumentAllDeclarationsProcessed(int arg1){
    return false;
  }
  protected void setShouldStripWhitespace(boolean arg1){
  }
}
