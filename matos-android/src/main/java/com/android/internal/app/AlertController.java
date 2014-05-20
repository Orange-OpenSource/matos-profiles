package com.android.internal.app;

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


public class AlertController
{
  // Classes

  public static class RecycleListView
    extends android.widget.ListView  {
    // Constructors

    public RecycleListView(android.content.Context arg1){
      super((android.content.Context) null);
    }
    public RecycleListView(android.content.Context arg1, android.util.AttributeSet arg2){
      super((android.content.Context) null);
    }
    public RecycleListView(android.content.Context arg1, android.util.AttributeSet arg2, int arg3){
      super((android.content.Context) null);
    }
    // Methods

    protected boolean recycleOnMeasure(){
      return false;
    }
  }
  public static class AlertParams
  {
    // Classes

    public static interface OnPrepareListViewListener
    {
      // Methods

      public void onPrepareListView(android.widget.ListView arg1);
    }
    // Fields

    public final android.content.Context mContext = (android.content.Context) null;

    public final android.view.LayoutInflater mInflater = (android.view.LayoutInflater) null;

    public int mIconId;

    public android.graphics.drawable.Drawable mIcon;

    public java.lang.CharSequence mTitle;

    public android.view.View mCustomTitleView;

    public java.lang.CharSequence mMessage;

    public java.lang.CharSequence mPositiveButtonText;

    public android.content.DialogInterface.OnClickListener mPositiveButtonListener;

    public java.lang.CharSequence mNegativeButtonText;

    public android.content.DialogInterface.OnClickListener mNegativeButtonListener;

    public java.lang.CharSequence mNeutralButtonText;

    public android.content.DialogInterface.OnClickListener mNeutralButtonListener;

    public boolean mCancelable;

    public android.content.DialogInterface.OnCancelListener mOnCancelListener;

    public android.content.DialogInterface.OnKeyListener mOnKeyListener;

    public java.lang.CharSequence [] mItems;

    public android.widget.ListAdapter mAdapter;

    public android.content.DialogInterface.OnClickListener mOnClickListener;

    public android.view.View mView;

    public int mViewSpacingLeft;

    public int mViewSpacingTop;

    public int mViewSpacingRight;

    public int mViewSpacingBottom;

    public boolean mViewSpacingSpecified;

    public boolean [] mCheckedItems;

    public boolean mIsMultiChoice;

    public boolean mIsSingleChoice;

    public int mCheckedItem;

    public android.content.DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;

    public android.database.Cursor mCursor;

    public java.lang.String mLabelColumn;

    public java.lang.String mIsCheckedColumn;

    public boolean mForceInverseBackground;

    public android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;

    public AlertController.AlertParams.OnPrepareListViewListener mOnPrepareListViewListener;

    public boolean mRecycleOnMeasure;

    // Constructors

    public AlertParams(android.content.Context arg1){
    }
    // Methods

    public void apply(AlertController arg1){
    }
  }
  // Constructors

  public AlertController(android.content.Context arg1, android.content.DialogInterface arg2, android.view.Window arg3){
  }
  // Methods

  public void setTitle(java.lang.CharSequence arg1){
  }
  public boolean onKeyDown(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  public boolean onKeyUp(int arg1, android.view.KeyEvent arg2){
    return false;
  }
  public void setIcon(int arg1){
  }
  public void setIcon(android.graphics.drawable.Drawable arg1){
  }
  public void setView(android.view.View arg1){
  }
  public void setView(android.view.View arg1, int arg2, int arg3, int arg4, int arg5){
  }
  public void setMessage(java.lang.CharSequence arg1){
  }
  public android.widget.ListView getListView(){
    return (android.widget.ListView) null;
  }
  public void setCustomTitle(android.view.View arg1){
  }
  public void setButton(int arg1, java.lang.CharSequence arg2, @com.francetelecom.rd.stubs.annotation.CallBackRegister("OnClick") android.content.DialogInterface.OnClickListener arg3, android.os.Message arg4){
  }
  public android.widget.Button getButton(int arg1){
    return (android.widget.Button) null;
  }
  public void setInverseBackgroundForced(boolean arg1){
  }
  public void installContent(){
  }
}
