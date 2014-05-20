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

import com.francetelecom.rd.stubs.annotation.ArgsRule;
import com.francetelecom.rd.stubs.annotation.UseRule;

@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class VpnService
  extends android.app.Service{
  // Classes

  public class Builder
  {
    // Fields

    // Constructors

    public Builder(){
    }
    // Methods

    @ArgsRule(value="VpnService.Builder.addRoute-1",pos=1)
    public VpnService.Builder addRoute(java.net.InetAddress arg1, int arg2){
      return (VpnService.Builder) null;
    }
    @ArgsRule(value="VpnService.Builder.addRoute-2",pos=1)
    public VpnService.Builder addRoute(java.lang.String arg1, int arg2){
      return (VpnService.Builder) null;
    }
    @ArgsRule(value="VpnService.Builder.setSession",pos=1)
    public VpnService.Builder setSession(java.lang.String arg1){
      return (VpnService.Builder) null;
    }
    @UseRule("VpnService.Builder.establish")
    public android.os.ParcelFileDescriptor establish(){
      return (android.os.ParcelFileDescriptor) null;
    }
    public VpnService.Builder setConfigureIntent(android.app.PendingIntent arg1){
      return (VpnService.Builder) null;
    }
    public VpnService.Builder setMtu(int arg1){
      return (VpnService.Builder) null;
    }
    @ArgsRule(value="VpnService.Builder.addAddress-1",pos=1)
    public VpnService.Builder addAddress(java.net.InetAddress arg1, int arg2){
      return (VpnService.Builder) null;
    }
    @ArgsRule(value="VpnService.Builder.addAddress-2",pos=1)
    public VpnService.Builder addAddress(java.lang.String arg1, int arg2){
      return (VpnService.Builder) null;
    }
    @ArgsRule(value="VpnService.Builder.addDnsServer-1",pos=1)
    public VpnService.Builder addDnsServer(java.net.InetAddress arg1){
      return (VpnService.Builder) null;
    }
    @ArgsRule(value="VpnService.Builder.addDnsServer-2",pos=1)
    public VpnService.Builder addDnsServer(java.lang.String arg1){
      return (VpnService.Builder) null;
    }
    @ArgsRule(value="VpnService.Builder.addSearchDomain",pos=1)
    public VpnService.Builder addSearchDomain(java.lang.String arg1){
      return (VpnService.Builder) null;
    }
  }
  // Fields

  public static final java.lang.String SERVICE_INTERFACE = "android.net.VpnService";

  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public VpnService(){
    super();
  }
  // Methods

  @UseRule("VpnService.prepare")
  public static android.content.Intent prepare(android.content.Context arg1){
    return (android.content.Intent) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.os.IBinder onBind(android.content.Intent arg1){
    return (android.os.IBinder) null;
  }
  public boolean protect(int arg1){
    return false;
  }
  public boolean protect(java.net.Socket arg1){
    return false;
  }
  public boolean protect(java.net.DatagramSocket arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onRevoke(){
  }
}
