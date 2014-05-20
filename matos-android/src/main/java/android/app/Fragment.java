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
@com.francetelecom.rd.stubs.annotation.Accumulator("stubAccumulator")
@com.francetelecom.rd.stubs.annotation.DumpHierarchy(value = "android.hierarchy.Fragment", noAbstract = true)
public class Fragment
  implements android.view.View.OnCreateContextMenuListener, android.content.ComponentCallbacks2
{
  // Classes

  public static class SavedState
    implements android.os.Parcelable
  {
    // Fields

    public static final android.os.Parcelable.ClassLoaderCreator<Fragment.SavedState> CREATOR = null;

    // Constructors

    SavedState(android.os.Bundle arg1){
    }
    SavedState(android.os.Parcel arg1, java.lang.ClassLoader arg2){
    }
    // Methods

    public void writeToParcel(android.os.Parcel arg1, int arg2){
    }
    public int describeContents(){
      return 0;
    }
  }
  public static class InstantiationException
    extends android.util.AndroidRuntimeException  {
    // Constructors

    public InstantiationException(java.lang.String arg1, java.lang.Exception arg2){
      super();
    }
  }
  // Constructors

  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onCreate")
  public Fragment(){
  }
  // Methods

  public final boolean equals(java.lang.Object arg1){
    return false;
  }
  public java.lang.String toString(){
    return (java.lang.String) null;
  }
  public final int hashCode(){
    return 0;
  }
  public final android.content.res.Resources getResources(){
    return (android.content.res.Resources) null;
  }
  public final int getId(){
    return 0;
  }
  public final boolean isHidden(){
    return false;
  }
  public final java.lang.String getString(int arg1){
    return (java.lang.String) null;
  }
  public final java.lang.String getString(int arg1, java.lang.Object [] arg2){
    return (java.lang.String) null;
  }
  public final boolean isVisible(){
    return false;
  }
  public void dump(java.lang.String arg1, java.io.FileDescriptor arg2, java.io.PrintWriter arg3, java.lang.String [] arg4){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCreate(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onResume(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onPause(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDestroy(){
  }
  public LoaderManager getLoaderManager(){
    return (LoaderManager) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onStart(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onSaveInstanceState(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onStop(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onConfigurationChanged(android.content.res.Configuration arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onLowMemory(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onTrimMemory(int arg1){
  }
  public final FragmentManager getFragmentManager(){
    return (FragmentManager) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCreateOptionsMenu(android.view.Menu arg1, android.view.MenuInflater arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onPrepareOptionsMenu(android.view.Menu arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onOptionsItemSelected(android.view.MenuItem arg1){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onOptionsMenuClosed(android.view.Menu arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onCreateContextMenu(android.view.ContextMenu arg1, android.view.View arg2, android.view.ContextMenu.ContextMenuInfo arg3){
  }
  public void registerForContextMenu(android.view.View arg1){
  }
  public void unregisterForContextMenu(android.view.View arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public boolean onContextItemSelected(android.view.MenuItem arg1){
    return false;
  }
  public android.view.LayoutInflater getLayoutInflater(android.os.Bundle arg1){
    return (android.view.LayoutInflater) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBackRegister("onActivityResult")
  public void startActivityForResult(android.content.Intent arg1, int arg2){
  }
  public void startActivity(android.content.Intent arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onActivityResult")
  public void onActivityResult(int arg1, int arg2, android.content.Intent arg3){
  }
  public android.view.View onCreateView(android.view.LayoutInflater arg1, android.view.ViewGroup arg2, android.os.Bundle arg3){
    return (android.view.View) null;
  }
  public final boolean isResumed(){
    return false;
  }
  public final java.lang.CharSequence getText(int arg1){
    return (java.lang.CharSequence) null;
  }
  public final java.lang.String getTag(){
    return (java.lang.String) null;
  }
  public final Activity getActivity(){
    return (Activity) null;
  }
  public android.view.View getView(){
    return (android.view.View) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onActivityCreated(android.os.Bundle arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDestroyView(){
  }
  public static Fragment instantiate(android.content.Context arg1, java.lang.String arg2){
    return (Fragment) null;
  }
  public static Fragment instantiate(android.content.Context arg1, java.lang.String arg2, android.os.Bundle arg3){
    return (Fragment) null;
  }
  @java.lang.Deprecated
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInflate(android.util.AttributeSet arg1, android.os.Bundle arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onInflate(Activity arg1, android.util.AttributeSet arg2, android.os.Bundle arg3){
  }
  public final boolean isAdded(){
    return false;
  }
  public void setArguments(android.os.Bundle arg1){
  }
  public final android.os.Bundle getArguments(){
    return (android.os.Bundle) null;
  }
  public void setInitialSavedState(Fragment.SavedState arg1){
  }
  public void setTargetFragment(Fragment arg1, int arg2){
  }
  public final Fragment getTargetFragment(){
    return (Fragment) null;
  }
  public final int getTargetRequestCode(){
    return 0;
  }
  public final boolean isDetached(){
    return false;
  }
  public final boolean isRemoving(){
    return false;
  }
  public final boolean isInLayout(){
    return false;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onHiddenChanged(boolean arg1){
  }
  public void setRetainInstance(boolean arg1){
  }
  public final boolean getRetainInstance(){
    return false;
  }
  public void setHasOptionsMenu(boolean arg1){
  }
  public void setMenuVisibility(boolean arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onAttach(Activity arg1){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public android.animation.Animator onCreateAnimator(int arg1, boolean arg2, int arg3){
    return (android.animation.Animator) null;
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onViewCreated(android.view.View arg1, android.os.Bundle arg2){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDetach(){
  }
  @com.francetelecom.rd.stubs.annotation.CallBack("onCreate")
  public void onDestroyOptionsMenu(){
  }
}
