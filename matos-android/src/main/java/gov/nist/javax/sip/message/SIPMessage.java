package gov.nist.javax.sip.message;

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


public abstract class SIPMessage
  extends MessageObject  implements MessageExt, javax.sip.message.Message
{
  // Fields

  protected boolean nullRequest;

  protected java.util.LinkedList<java.lang.String> unrecognizedHeaders;

  protected java.util.concurrent.ConcurrentLinkedQueue<gov.nist.javax.sip.header.SIPHeader> headers;

  protected gov.nist.javax.sip.header.From fromHeader;

  protected gov.nist.javax.sip.header.To toHeader;

  protected gov.nist.javax.sip.header.CSeq cSeqHeader;

  protected gov.nist.javax.sip.header.CallID callIdHeader;

  protected gov.nist.javax.sip.header.ContentLength contentLengthHeader;

  protected gov.nist.javax.sip.header.MaxForwards maxForwardsHeader;

  protected int size;

  protected java.lang.Object applicationData;

  // Constructors

  public SIPMessage(){
    super();
  }
  // Methods

  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public abstract java.lang.String toString();
  public int hashCode(){
    return 0;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  public int getSize(){
    return 0;
  }
  public void setSize(int arg1){
  }
  public java.lang.Object getContent(){
    return (java.lang.Object) null;
  }
  public boolean match(java.lang.Object arg1){
    return false;
  }
  public void merge(java.lang.Object arg1){
  }
  public javax.sip.header.ContentLengthHeader getContentLength(){
    return (javax.sip.header.ContentLengthHeader) null;
  }
  public void setContentLength(javax.sip.header.ContentLengthHeader arg1){
  }
  public javax.sip.header.ContentEncodingHeader getContentEncoding(){
    return (javax.sip.header.ContentEncodingHeader) null;
  }
  public java.util.Iterator<gov.nist.javax.sip.header.SIPHeader> getHeaders(){
    return (java.util.Iterator) null;
  }
  public java.util.ListIterator<gov.nist.javax.sip.header.SIPHeader> getHeaders(java.lang.String arg1){
    return (java.util.ListIterator) null;
  }
  public java.lang.String debugDump(){
    return (java.lang.String) null;
  }
  public void addFirst(javax.sip.header.Header arg1) throws javax.sip.SipException, java.lang.NullPointerException{
  }
  public void removeFirst(java.lang.String arg1) throws java.lang.NullPointerException{
  }
  public void removeLast(java.lang.String arg1){
  }
  public void setContentEncoding(javax.sip.header.ContentEncodingHeader arg1){
  }
  public javax.sip.header.ContentLanguageHeader getContentLanguage(){
    return (javax.sip.header.ContentLanguageHeader) null;
  }
  public void setContentLanguage(javax.sip.header.ContentLanguageHeader arg1){
  }
  public void setTo(javax.sip.header.ToHeader arg1){
  }
  public javax.sip.header.FromHeader getFrom(){
    return (javax.sip.header.FromHeader) null;
  }
  public javax.sip.header.ToHeader getTo(){
    return (javax.sip.header.ToHeader) null;
  }
  public void setFrom(javax.sip.header.FromHeader arg1){
  }
  public void setHeader(javax.sip.header.Header arg1){
  }
  public void setHeader(gov.nist.javax.sip.header.SIPHeaderList<gov.nist.javax.sip.header.Via> arg1){
  }
  public void setHeaders(java.util.List<gov.nist.javax.sip.header.SIPHeader> arg1){
  }
  public void addHeader(javax.sip.header.Header arg1){
  }
  public void addHeader(java.lang.String arg1){
  }
  public void removeHeader(java.lang.String arg1, boolean arg2){
  }
  public void removeHeader(java.lang.String arg1){
  }
  public void setExpires(javax.sip.header.ExpiresHeader arg1){
  }
  public javax.sip.header.ExpiresHeader getExpires(){
    return (javax.sip.header.ExpiresHeader) null;
  }
  public abstract java.lang.String getFirstLine();
  public void setApplicationData(java.lang.Object arg1){
  }
  public java.lang.Object getApplicationData(){
    return (java.lang.Object) null;
  }
  public MultipartMimeContent getMultipartMimeContent() throws java.text.ParseException{
    return (MultipartMimeContent) null;
  }
  public javax.sip.header.ViaHeader getTopmostViaHeader(){
    return (javax.sip.header.ViaHeader) null;
  }
  public javax.sip.header.FromHeader getFromHeader(){
    return (javax.sip.header.FromHeader) null;
  }
  public javax.sip.header.ToHeader getToHeader(){
    return (javax.sip.header.ToHeader) null;
  }
  public javax.sip.header.CallIdHeader getCallIdHeader(){
    return (javax.sip.header.CallIdHeader) null;
  }
  public javax.sip.header.CSeqHeader getCSeqHeader(){
    return (javax.sip.header.CSeqHeader) null;
  }
  public gov.nist.javax.sip.header.ContentType getContentTypeHeader(){
    return (gov.nist.javax.sip.header.ContentType) null;
  }
  public javax.sip.header.ContentLengthHeader getContentLengthHeader(){
    return (javax.sip.header.ContentLengthHeader) null;
  }
  public javax.sip.header.Header getHeader(java.lang.String arg1){
    return (javax.sip.header.Header) null;
  }
  public void setContentDisposition(javax.sip.header.ContentDispositionHeader arg1){
  }
  public void setContent(java.lang.Object arg1, javax.sip.header.ContentTypeHeader arg2) throws java.text.ParseException{
  }
  public java.util.ListIterator<java.lang.String> getHeaderNames(){
    return (java.util.ListIterator) null;
  }
  public byte [] getRawContent(){
    return (byte []) null;
  }
  public void addLast(javax.sip.header.Header arg1) throws javax.sip.SipException, java.lang.NullPointerException{
  }
  public java.util.ListIterator<java.lang.String> getUnrecognizedHeaders(){
    return (java.util.ListIterator) null;
  }
  public javax.sip.header.ContentDispositionHeader getContentDisposition(){
    return (javax.sip.header.ContentDispositionHeader) null;
  }
  public void removeContent(){
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("SIPVersion")
  public abstract java.lang.String getSIPVersion();
  public abstract void setSIPVersion(@com.francetelecom.rd.stubs.annotation.FieldSet("SIPVersion") java.lang.String arg1) throws java.text.ParseException;
  protected final java.lang.String getCharset(){
    return (java.lang.String) null;
  }
  public byte [] encodeAsBytes(java.lang.String arg1){
    return (byte []) null;
  }
  public abstract java.lang.String getDialogId(boolean arg1);
  public abstract java.lang.String encodeMessage();
  public java.util.LinkedList<java.lang.String> getMessageAsEncodedStrings(){
    return (java.util.LinkedList) null;
  }
  public java.lang.String getTransactionId(){
    return (java.lang.String) null;
  }
  public void addUnparsed(java.lang.String arg1){
  }
  public javax.sip.header.CallIdHeader getCallId(){
    return (javax.sip.header.CallIdHeader) null;
  }
  public javax.sip.header.CSeqHeader getCSeq(){
    return (javax.sip.header.CSeqHeader) null;
  }
  public gov.nist.javax.sip.header.ViaList getViaHeaders(){
    return (gov.nist.javax.sip.header.ViaList) null;
  }
  public gov.nist.javax.sip.header.ContactList getContactHeaders(){
    return (gov.nist.javax.sip.header.ContactList) null;
  }
  public void setCallId(javax.sip.header.CallIdHeader arg1){
  }
  public void setCallId(java.lang.String arg1) throws java.text.ParseException{
  }
  public gov.nist.javax.sip.header.Authorization getAuthorization(){
    return (gov.nist.javax.sip.header.Authorization) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("toTag")
  public java.lang.String getToTag(){
    return (java.lang.String) null;
  }
  public gov.nist.javax.sip.header.RouteList getRouteHeaders(){
    return (gov.nist.javax.sip.header.RouteList) null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("fromTag")
  public java.lang.String getFromTag(){
    return (java.lang.String) null;
  }
  public void setNullRequest(){
  }
  public gov.nist.javax.sip.header.Via getTopmostVia(){
    return (gov.nist.javax.sip.header.Via) null;
  }
  public void setMaxForwards(javax.sip.header.MaxForwardsHeader arg1){
  }
  protected java.lang.String encodeSIPHeaders(){
    return (java.lang.String) null;
  }
  public static boolean isResponseHeader(gov.nist.javax.sip.header.SIPHeader arg1){
    return false;
  }
  public void attachHeader(gov.nist.javax.sip.header.SIPHeader arg1, boolean arg2) throws SIPDuplicateHeaderException{
  }
  public void attachHeader(gov.nist.javax.sip.header.SIPHeader arg1, boolean arg2, boolean arg3) throws SIPDuplicateHeaderException{
  }
  public static boolean isRequestHeader(gov.nist.javax.sip.header.SIPHeader arg1){
    return false;
  }
  public boolean hasContent(){
    return false;
  }
  public gov.nist.javax.sip.header.ErrorInfoList getErrorInfoHeaders(){
    return (gov.nist.javax.sip.header.ErrorInfoList) null;
  }
  public gov.nist.javax.sip.header.Contact getContactHeader(){
    return (gov.nist.javax.sip.header.Contact) null;
  }
  public void setVia(java.util.List arg1){
  }
  public javax.sip.header.MaxForwardsHeader getMaxForwards(){
    return (javax.sip.header.MaxForwardsHeader) null;
  }
  public gov.nist.javax.sip.header.RecordRouteList getRecordRouteHeaders(){
    return (gov.nist.javax.sip.header.RecordRouteList) null;
  }
  public java.lang.String getMessageContent() throws java.io.UnsupportedEncodingException{
    return (java.lang.String) null;
  }
  public void setMessageContent(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
  }
  public void setMessageContent(java.lang.String arg1, java.lang.String arg2, byte [] arg3){
  }
  public void setMessageContent(java.lang.String arg1, boolean arg2, boolean arg3, int arg4) throws java.text.ParseException{
  }
  public void setMessageContent(byte [] arg1){
  }
  public void setMessageContent(byte [] arg1, boolean arg2, int arg3) throws java.text.ParseException{
  }
  public java.lang.String getHeaderAsFormattedString(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public boolean hasHeader(java.lang.String arg1){
    return false;
  }
  public boolean hasFromTag(){
    return false;
  }
  public boolean hasToTag(){
    return false;
  }
  public void setFromTag(@com.francetelecom.rd.stubs.annotation.FieldSet("fromTag") java.lang.String arg1){
  }
  public void setToTag(@com.francetelecom.rd.stubs.annotation.FieldSet("toTag") java.lang.String arg1){
  }
  public void setCSeq(javax.sip.header.CSeqHeader arg1){
  }
  public boolean isNullRequest(){
    return false;
  }
}
