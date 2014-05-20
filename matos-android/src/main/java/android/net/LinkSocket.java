package android.net;

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

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class LinkSocket
  extends java.net.Socket{
  // Classes

  public static final class LinkRequestReason
  {
    // Fields

    public static final int LINK_PROBLEM_NONE = 0;

    public static final int LINK_PROBLEM_UNKNOWN = 1;

    // Constructors

    private LinkRequestReason(){
    }
  }
  // Constructors

  public LinkSocket(){
    super();
  }
  public LinkSocket(@com.francetelecom.rd.stubs.annotation.CallBackRegister("LinkSocketNotifier") LinkSocketNotifier arg1){
    super();
  }
  public LinkSocket(@com.francetelecom.rd.stubs.annotation.CallBackRegister("LinkSocketNotifier") LinkSocketNotifier arg1, Proxy arg2){
    super();
  }
  // Methods

  protected static void log(java.lang.String arg1){
  }
  public synchronized void close() throws java.io.IOException{
  }
  public void connect(java.lang.String arg1, int arg2, int arg3) throws java.net.UnknownHostException, java.io.IOException, java.net.SocketTimeoutException{
  }
  public void connect(java.lang.String arg1, int arg2) throws java.net.UnknownHostException, java.io.IOException{
  }
  @java.lang.Deprecated
  public void connect(java.net.SocketAddress arg1, int arg2) throws java.io.IOException, java.net.SocketTimeoutException{
  }
  @java.lang.Deprecated
  public void connect(java.net.SocketAddress arg1) throws java.io.IOException{
  }
  public void connect(int arg1) throws java.io.IOException{
  }
  public void connect() throws java.io.IOException{
  }
  @java.lang.Deprecated
  public void bind(java.net.SocketAddress arg1) throws java.lang.UnsupportedOperationException{
  }
  public LinkProperties getLinkProperties(){
    return (LinkProperties) null;
  }
  public boolean setNeededCapabilities(LinkCapabilities arg1){
    return false;
  }
  public LinkCapabilities getNeededCapabilities(){
    return (LinkCapabilities) null;
  }
  public LinkCapabilities getCapabilities(){
    return (LinkCapabilities) null;
  }
  public LinkCapabilities getCapabilities(java.util.Set<java.lang.Integer> arg1){
    return (LinkCapabilities) null;
  }
  public void setTrackedCapabilities(java.util.Set<java.lang.Integer> arg1){
  }
  public java.util.Set<java.lang.Integer> getTrackedCapabilities(){
    return (java.util.Set) null;
  }
  public void requestNewLink(LinkSocket.LinkRequestReason arg1){
  }
}
