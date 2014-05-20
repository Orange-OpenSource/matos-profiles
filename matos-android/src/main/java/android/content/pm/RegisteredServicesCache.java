package android.content.pm;

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
public abstract class RegisteredServicesCache<V>
{
  // Classes

  public static class ServiceInfo<V>
  {
    // Fields

    public final V type = null;

    public final android.content.ComponentName componentName = (android.content.ComponentName) null;

    public final int uid = 0;

    // Constructors

    public ServiceInfo(V arg1, android.content.ComponentName arg2, int arg3){
    }
    // Methods

    public java.lang.String toString(){
      return (java.lang.String) null;
    }
  }
  // Fields

  public final android.content.Context mContext = (android.content.Context) null;

  // Constructors

  public RegisteredServicesCache(android.content.Context arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, XmlSerializerAndParser<V> arg5){
  }
  // Methods

  protected void finalize() throws java.lang.Throwable{
  }
  public void close(){
  }
  public void dump(java.io.FileDescriptor arg1, java.io.PrintWriter arg2, java.lang.String [] arg3){
  }
  public RegisteredServicesCache.ServiceInfo<V> getServiceInfo(V arg1){
    return (RegisteredServicesCache.ServiceInfo) null;
  }
  public RegisteredServicesCacheListener<V> getListener(){
    return (RegisteredServicesCacheListener) null;
  }
  @com.francetelecom.rd.stubs.annotation.Code({"android.util.AttributeSet att = new com.francetelecom.rd.fakeandroid.AttributeSetImpl(com.francetelecom.rd.stubs.Generator.token);", "arg1.onServiceChanged(parseServiceAttributes(new android.content.res.Resources(com.francetelecom.rd.stubs.Generator.token), com.francetelecom.rd.stubs.Generator.stringValue(), att), com.francetelecom.rd.stubs.Generator.booleanValue());"})
  public void setListener(RegisteredServicesCacheListener<V> arg1, android.os.Handler arg2){
  }
  public java.util.Collection<RegisteredServicesCache.ServiceInfo<V>> getAllServices(){
    return (java.util.Collection) null;
  }
  public abstract V parseServiceAttributes(android.content.res.Resources arg1, java.lang.String arg2, android.util.AttributeSet arg3);
}
