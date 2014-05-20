package android.app;

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
public class FragmentBreadCrumbs
  extends android.view.ViewGroup  implements FragmentManager.OnBackStackChangedListener
{
  // Classes

  public static interface OnBreadCrumbClickListener
  {
    // Methods
	@com.francetelecom.rd.stubs.annotation.CallBack("OnBreadCrumbClick")
    public boolean onBreadCrumbClick(FragmentManager.BackStackEntry arg1, int arg2);
  }
  // Constructors

  public FragmentBreadCrumbs(android.content.Context arg1){
    super((android.content.Context) null);
  }
  public FragmentBreadCrumbs(android.content.Context arg1, android.util.AttributeSet arg2){
    super((android.content.Context) null);
  }
  public FragmentBreadCrumbs(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
    super((android.content.Context) null);
  }
  // Methods

  public void setTitle(java.lang.CharSequence arg1, java.lang.CharSequence arg2){
  }
  protected void onMeasure(int arg1, int arg2){
  }
  protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public void setActivity(Activity arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onBackStackChanged")
  public void onBackStackChanged(){
  }
  public void setParentTitle(java.lang.CharSequence arg1, java.lang.CharSequence arg2, android.view.View.OnClickListener arg3){
  }
  public void setMaxVisible(int arg1){
  }
  public void setOnBreadCrumbClickListener(@com.francetelecom.rd.stubs.annotation.CallBackRegister("OnBreadCrumbClick") FragmentBreadCrumbs.OnBreadCrumbClickListener arg1){
  }
}
