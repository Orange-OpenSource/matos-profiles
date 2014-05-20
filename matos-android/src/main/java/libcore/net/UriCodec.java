package libcore.net;

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
public abstract class UriCodec
{
  // Constructors

  public UriCodec(){
  }
  // Methods

  public static java.lang.String decode(java.lang.String arg1, boolean arg2, java.nio.charset.Charset arg3){
    return (java.lang.String) null;
  }
  public static java.lang.String decode(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public final java.lang.String encode(java.lang.String arg1, java.nio.charset.Charset arg2){
    return (java.lang.String) null;
  }
  public final void appendEncoded(java.lang.StringBuilder arg1, java.lang.String arg2){
  }
  public final java.lang.String validate(java.lang.String arg1, int arg2, int arg3, java.lang.String arg4) throws java.net.URISyntaxException{
    return (java.lang.String) null;
  }
  public static void validateSimple(java.lang.String arg1, java.lang.String arg2) throws java.net.URISyntaxException{
  }
  public final void appendPartiallyEncoded(java.lang.StringBuilder arg1, java.lang.String arg2){
  }
  protected abstract boolean isRetained(char arg1);
}
