package android.view;

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
public class ViewDebug
{
  // Classes

  public static @interface ExportedProperty
  {
    // Methods

    public java.lang.String prefix();
    public java.lang.String category();
    public ViewDebug.IntToString [] mapping();
    public boolean resolveId();
    public ViewDebug.FlagToString [] flagMapping();
    public boolean deepExport();
    public ViewDebug.IntToString [] indexMapping();
  }
  public static @interface IntToString
  {
    // Methods

    public int from();
    public java.lang.String to();
  }
  public static @interface FlagToString
  {
    // Methods

    public java.lang.String name();
    public int equals();
    public int mask();
    public boolean outputIf();
  }
  public static @interface CapturedViewProperty
  {
    // Methods

    public boolean retrieveReturn();
  }
  public static enum HierarchyTraceType
  {
    // Enum Constants

    INVALIDATE()
, INVALIDATE_CHILD()
, INVALIDATE_CHILD_IN_PARENT()
, REQUEST_LAYOUT()
, ON_LAYOUT()
, ON_MEASURE()
, DRAW()
, BUILD_CACHE()
;
    // Fields

    // Constructors

    private HierarchyTraceType(){
    }
    // Methods

  }
  public static enum RecyclerTraceType
  {
    // Enum Constants

    NEW_VIEW()
, BIND_VIEW()
, RECYCLE_FROM_ACTIVE_HEAP()
, RECYCLE_FROM_SCRAP_HEAP()
, MOVE_TO_SCRAP_HEAP()
, MOVE_FROM_ACTIVE_TO_SCRAP_HEAP()
;
    // Fields

    // Constructors

    private RecyclerTraceType(){
    }
    // Methods

  }
  // Fields

  public static final java.lang.String CONSISTENCY_LOG_TAG = "ViewConsistency";

  public static final int CONSISTENCY_LAYOUT = 1;

  public static final int CONSISTENCY_DRAWING = 2;

  public static final boolean TRACE_HIERARCHY = false;

  public static final boolean TRACE_RECYCLER = false;

  public static final boolean DEBUG_PROFILE_DRAWING = false;

  public static final boolean DEBUG_PROFILE_LAYOUT = false;

  public static final boolean DEBUG_DRAG = false;

  public static final boolean DEBUG_LATENCY = false;

  public static boolean consistencyCheckEnabled;

  // Constructors

  public ViewDebug(){
  }
  // Methods

  public static void trace(View arg1, ViewDebug.RecyclerTraceType arg2, int [] arg3){
  }
  public static void trace(View arg1, ViewDebug.HierarchyTraceType arg2){
  }
  public static void startLooperProfiling(java.lang.String arg1, java.io.FileDescriptor arg2){
  }
  public static void stopLooperProfiling(){
  }
  public static long getViewInstanceCount(){
    return 0l;
  }
  public static long getViewRootImplCount(){
    return 0l;
  }
  public static void startRecyclerTracing(java.lang.String arg1, View arg2){
  }
  public static void stopRecyclerTracing(){
  }
  public static void startHierarchyTracing(java.lang.String arg1, View arg2){
  }
  public static void stopHierarchyTracing(){
  }
  public static void dumpCapturedView(java.lang.String arg1, java.lang.Object arg2){
  }
}
