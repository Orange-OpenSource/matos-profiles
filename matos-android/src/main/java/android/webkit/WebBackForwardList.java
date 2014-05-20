package android.webkit;

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
public class WebBackForwardList
  implements java.io.Serializable, java.lang.Cloneable
{
  // Constructors

  public WebBackForwardList(){
  }
  // Methods

  protected synchronized WebBackForwardList clone(){
    return (WebBackForwardList) null;
  }
  public synchronized int getSize(){
    return 0;
  }
  public synchronized int getCurrentIndex(){
    return 0;
  }
  public synchronized WebHistoryItem getItemAtIndex(int arg1){
    return (WebHistoryItem) null;
  }
  public synchronized WebHistoryItem getCurrentItem(){
    return (WebHistoryItem) null;
  }
}
