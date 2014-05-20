package org.apache.http.conn.routing;

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
public interface RouteInfo
{
  // Classes

  public static enum TunnelType
  {
    // Enum Constants

    PLAIN()
, TUNNELLED()
;
    // Fields

    // Constructors

    private TunnelType(){
    }
    // Methods

  }
  public static enum LayerType
  {
    // Enum Constants

    PLAIN()
, LAYERED()
;
    // Fields

    // Constructors

    private LayerType(){
    }
    // Methods

  }
  // Methods

  public java.net.InetAddress getLocalAddress();
  public boolean isSecure();
  public RouteInfo.LayerType getLayerType();
  public org.apache.http.HttpHost getTargetHost();
  public int getHopCount();
  public org.apache.http.HttpHost getHopTarget(int arg1);
  public org.apache.http.HttpHost getProxyHost();
  public RouteInfo.TunnelType getTunnelType();
  public boolean isTunnelled();
  public boolean isLayered();
}