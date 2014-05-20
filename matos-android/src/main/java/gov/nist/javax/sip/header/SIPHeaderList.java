package gov.nist.javax.sip.header;

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


@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.SIPHeaderListImplem", superClass = "")
public abstract class SIPHeaderList<HDR extends SIPHeader>
  extends SIPHeader  implements javax.sip.header.Header, java.util.List<HDR>
{
  // Fields

  protected java.util.List<HDR> hlist;

  // Constructors

  private SIPHeaderList(){
    super((java.lang.String) null);
  }
  protected SIPHeaderList(java.lang.Class<HDR> arg1, java.lang.String arg2){
    super((java.lang.String) null);
  }
  // Methods

  public boolean add(HDR arg1){
    return false;
  }
  public void add(HDR arg1, boolean arg2){
  }
  public void add(int arg1, HDR arg2) throws java.lang.IndexOutOfBoundsException{
  }
  public HDR get(int arg1){
    return null;
  }
  public boolean equals(java.lang.Object arg1){
    return false;
  }
  public int hashCode(){
    return 0;
  }
  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public int indexOf(gov.nist.core.GenericObject arg1){
    return 0;
  }
  public int indexOf(java.lang.Object arg1){
    return 0;
  }
  public void clear(){
  }
  public java.lang.String getName(){
    return (java.lang.String) null;
  }
  public boolean contains(java.lang.Object arg1){
    return false;
  }
  public java.lang.String encode(){
    return (java.lang.String) null;
  }
  public java.lang.StringBuffer encode(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  public boolean isEmpty(){
    return false;
  }
  public int lastIndexOf(java.lang.Object arg1){
    return 0;
  }
  public boolean addAll(java.util.Collection<? extends HDR> arg1){
    return false;
  }
  public boolean addAll(int arg1, java.util.Collection<? extends HDR> arg2){
    return false;
  }
  public java.util.Iterator<HDR> iterator(){
    return (java.util.Iterator) null;
  }
  public int size(){
    return 0;
  }
  public java.lang.Object [] toArray(){
    return (java.lang.Object []) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return hlist.toArray(arg1);")
  public <T>T [] toArray(T [] arg1){
    return (T []) null;
  }
  public boolean remove(HDR arg1){
    return false;
  }
  public boolean remove(java.lang.Object arg1){
    return false;
  }
  public HDR remove(int arg1){
    return null;
  }
  public HDR set(int arg1, HDR arg2){
    return null;
  }
  public java.util.ListIterator<HDR> listIterator(){
    return (java.util.ListIterator) null;
  }
  public java.util.ListIterator<HDR> listIterator(int arg1){
    return (java.util.ListIterator) null;
  }
  public java.util.List<HDR> subList(int arg1, int arg2){
    return (java.util.List) null;
  }
  public boolean containsAll(java.util.Collection<?> arg1){
    return false;
  }
  public boolean removeAll(java.util.Collection<?> arg1){
    return false;
  }
  public boolean retainAll(java.util.Collection<?> arg1){
    return false;
  }
  public boolean match(SIPHeaderList<?> arg1){
    return false;
  }
  public javax.sip.header.Header getFirst(){
    return (javax.sip.header.Header) null;
  }
  public java.lang.String debugDump(int arg1){
    return (java.lang.String) null;
  }
  public java.lang.String debugDump(){
    return (java.lang.String) null;
  }
  public javax.sip.header.Header getLast(){
    return (javax.sip.header.Header) null;
  }
  public java.util.List<HDR> getHeaderList(){
    return (java.util.List) null;
  }
  protected final SIPHeaderList<HDR> clonehlist(java.util.List<HDR> arg1){
    return (SIPHeaderList) null;
  }
  public void addFirst(HDR arg1){
  }
  public void concatenate(SIPHeaderList<HDR> arg1, boolean arg2) throws java.lang.IllegalArgumentException{
  }
  public java.util.List<java.lang.String> getHeadersAsEncodedStrings(){
    return (java.util.List) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code("return (Class<HDR>) hlist.get(0).getClass();")
  public java.lang.Class<HDR> getMyClass(){
    return (java.lang.Class) null;
  }
  public void removeFirst(){
  }
  public void removeLast(){
  }
  protected void setMyClass(java.lang.Class<HDR> arg1){
  }
  public boolean isHeaderList(){
    return false;
  }
  protected java.lang.String encodeBody(){
    return (java.lang.String) null;
  }
  protected java.lang.StringBuffer encodeBody(java.lang.StringBuffer arg1){
    return (java.lang.StringBuffer) null;
  }
  public static void setPrettyEncode(boolean arg1){
  }
}
