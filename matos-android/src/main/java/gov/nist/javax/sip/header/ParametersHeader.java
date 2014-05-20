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


public abstract class ParametersHeader
  extends SIPHeader  implements java.io.Serializable, javax.sip.header.Parameters
{
  // Fields

  protected gov.nist.core.NameValueList parameters;

  protected gov.nist.core.DuplicateNameValueList duplicates;

  // Constructors

  protected ParametersHeader(){
    super((java.lang.String) null);
  }
  protected ParametersHeader(java.lang.String arg1){
    super((java.lang.String) null);
  }
  protected ParametersHeader(java.lang.String arg1, boolean arg2){
    super((java.lang.String) null);
  }
  // Methods

  public java.lang.Object clone(){
    return (java.lang.Object) null;
  }
  public gov.nist.core.NameValueList getParameters(){
    return (gov.nist.core.NameValueList) null;
  }
  public java.lang.String getParameter(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void setParameter(java.lang.String arg1, java.lang.String arg2) throws java.text.ParseException{
  }
  protected void setParameter(java.lang.String arg1, int arg2){
  }
  protected void setParameter(java.lang.String arg1, boolean arg2){
  }
  protected void setParameter(java.lang.String arg1, float arg2){
  }
  protected void setParameter(java.lang.String arg1, java.lang.Object arg2){
  }
  public void setParameter(gov.nist.core.NameValue arg1){
  }
  public java.util.Iterator<java.lang.String> getParameterNames(){
    return (java.util.Iterator) null;
  }
  public void removeParameter(java.lang.String arg1){
  }
  protected abstract java.lang.String encodeBody();
  public void removeParameters(){
  }
  public boolean hasParameter(java.lang.String arg1){
    return false;
  }
  public void setParameters(gov.nist.core.NameValueList arg1){
  }
  public gov.nist.core.NameValue getNameValue(java.lang.String arg1){
    return (gov.nist.core.NameValue) null;
  }
  protected gov.nist.javax.sip.address.GenericURI getParameterAsURI(java.lang.String arg1){
    return (gov.nist.javax.sip.address.GenericURI) null;
  }
  protected boolean getParameterAsBoolean(java.lang.String arg1){
    return false;
  }
  protected int getParameterAsHexInt(java.lang.String arg1){
    return 0;
  }
  public java.lang.Object getParameterValue(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public boolean hasParameters(){
    return false;
  }
  public void setQuotedParameter(java.lang.String arg1, java.lang.String arg2) throws java.text.ParseException{
  }
  protected int getParameterAsInt(java.lang.String arg1){
    return 0;
  }
  protected float getParameterAsFloat(java.lang.String arg1){
    return 0.0f;
  }
  protected long getParameterAsLong(java.lang.String arg1){
    return 0l;
  }
  public void setMultiParameter(java.lang.String arg1, java.lang.String arg2){
  }
  public void setMultiParameter(gov.nist.core.NameValue arg1){
  }
  public java.lang.String getMultiParameter(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public gov.nist.core.DuplicateNameValueList getMultiParameters(){
    return (gov.nist.core.DuplicateNameValueList) null;
  }
  public java.lang.Object getMultiParameterValue(java.lang.String arg1){
    return (java.lang.Object) null;
  }
  public java.util.Iterator<java.lang.String> getMultiParameterNames(){
    return (java.util.Iterator) null;
  }
  public boolean hasMultiParameters(){
    return false;
  }
  public void removeMultiParameter(java.lang.String arg1){
  }
  public boolean hasMultiParameter(java.lang.String arg1){
    return false;
  }
  public void removeMultiParameters(){
  }
  protected final boolean equalParameters(javax.sip.header.Parameters arg1){
    return false;
  }
}
