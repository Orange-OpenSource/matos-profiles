package android.os;

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
public class PerformanceCollector
{
  // Classes

  public static interface PerformanceResultsWriter
  {
    // Methods

    public void writeBeginSnapshot(java.lang.String arg1);
    public void writeEndSnapshot(Bundle arg1);
    public void writeStartTiming(java.lang.String arg1);
    public void writeStopTiming(Bundle arg1);
    public void writeMeasurement(java.lang.String arg1, long arg2);
    public void writeMeasurement(java.lang.String arg1, float arg2);
    public void writeMeasurement(java.lang.String arg1, java.lang.String arg2);
  }
  // Fields

  public static final java.lang.String METRIC_KEY_ITERATIONS = "iterations";

  public static final java.lang.String METRIC_KEY_LABEL = "label";

  public static final java.lang.String METRIC_KEY_CPU_TIME = "cpu_time";

  public static final java.lang.String METRIC_KEY_EXECUTION_TIME = "execution_time";

  public static final java.lang.String METRIC_KEY_PRE_RECEIVED_TRANSACTIONS = "pre_received_transactions";

  public static final java.lang.String METRIC_KEY_PRE_SENT_TRANSACTIONS = "pre_sent_transactions";

  public static final java.lang.String METRIC_KEY_RECEIVED_TRANSACTIONS = "received_transactions";

  public static final java.lang.String METRIC_KEY_SENT_TRANSACTIONS = "sent_transactions";

  public static final java.lang.String METRIC_KEY_GC_INVOCATION_COUNT = "gc_invocation_count";

  public static final java.lang.String METRIC_KEY_JAVA_ALLOCATED = "java_allocated";

  public static final java.lang.String METRIC_KEY_JAVA_FREE = "java_free";

  public static final java.lang.String METRIC_KEY_JAVA_PRIVATE_DIRTY = "java_private_dirty";

  public static final java.lang.String METRIC_KEY_JAVA_PSS = "java_pss";

  public static final java.lang.String METRIC_KEY_JAVA_SHARED_DIRTY = "java_shared_dirty";

  public static final java.lang.String METRIC_KEY_JAVA_SIZE = "java_size";

  public static final java.lang.String METRIC_KEY_NATIVE_ALLOCATED = "native_allocated";

  public static final java.lang.String METRIC_KEY_NATIVE_FREE = "native_free";

  public static final java.lang.String METRIC_KEY_NATIVE_PRIVATE_DIRTY = "native_private_dirty";

  public static final java.lang.String METRIC_KEY_NATIVE_PSS = "native_pss";

  public static final java.lang.String METRIC_KEY_NATIVE_SHARED_DIRTY = "native_shared_dirty";

  public static final java.lang.String METRIC_KEY_NATIVE_SIZE = "native_size";

  public static final java.lang.String METRIC_KEY_GLOBAL_ALLOC_COUNT = "global_alloc_count";

  public static final java.lang.String METRIC_KEY_GLOBAL_ALLOC_SIZE = "global_alloc_size";

  public static final java.lang.String METRIC_KEY_GLOBAL_FREED_COUNT = "global_freed_count";

  public static final java.lang.String METRIC_KEY_GLOBAL_FREED_SIZE = "global_freed_size";

  public static final java.lang.String METRIC_KEY_OTHER_PRIVATE_DIRTY = "other_private_dirty";

  public static final java.lang.String METRIC_KEY_OTHER_PSS = "other_pss";

  public static final java.lang.String METRIC_KEY_OTHER_SHARED_DIRTY = "other_shared_dirty";

  // Constructors

  public PerformanceCollector(){
  }
  public PerformanceCollector(PerformanceCollector.PerformanceResultsWriter arg1){
  }
  // Methods

  public void setPerformanceResultsWriter(PerformanceCollector.PerformanceResultsWriter arg1){
  }
  public void startTiming(java.lang.String arg1){
  }
  public void beginSnapshot(java.lang.String arg1){
  }
  public Bundle endSnapshot(){
    return (Bundle) null;
  }
  public Bundle stopTiming(java.lang.String arg1){
    return (Bundle) null;
  }
  public Bundle addIteration(java.lang.String arg1){
    return (Bundle) null;
  }
  public void addMeasurement(java.lang.String arg1, long arg2){
  }
  public void addMeasurement(java.lang.String arg1, float arg2){
  }
  public void addMeasurement(java.lang.String arg1, java.lang.String arg2){
  }
}
