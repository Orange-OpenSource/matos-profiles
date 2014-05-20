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
@com.francetelecom.rd.stubs.annotation.Fields({@com.francetelecom.rd.stubs.annotation.Field(type = "Params[]", value = "params", modifier = 2), @com.francetelecom.rd.stubs.annotation.Field(type = "Result", value = "result", modifier = 2), @com.francetelecom.rd.stubs.annotation.Field(type = "Progress[]", value = "progress", modifier = 2)})
@com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.AsyncTaskImplem", superClass = "")
public abstract class AsyncTask<Params, Progress, Result>
{
  // Classes

  public static enum Status
  {
    // Enum Constants

    PENDING()
, RUNNING()
, FINISHED()
;
    // Fields

    // Constructors

    private Status(){
    }
    // Methods

  }
  // Fields

  public static final java.util.concurrent.Executor THREAD_POOL_EXECUTOR = null;

  public static final java.util.concurrent.Executor SERIAL_EXECUTOR = null;

  // Constructors
  public AsyncTask(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("result")
  public final Result get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException{
    return null;
  }
  @com.francetelecom.rd.stubs.annotation.FieldGet("result")
  public final Result get(long arg1, java.util.concurrent.TimeUnit arg2) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException{
    return null;
  }
  public static void init(){
  }
  @com.francetelecom.rd.stubs.annotation.Code({"params = arg1;", "onPreExecute();", "onProgressUpdate(progress);", "result = doInBackground(params);", "onPostExecute(result);", "onCancelled();", "return this;"})
  public final AsyncTask<Params, Progress, Result> execute(Params [] arg1){
    return (AsyncTask) null;
  }
  public static void execute(@com.francetelecom.rd.stubs.annotation.CallBackRegister("run") java.lang.Runnable arg1){
  }
  public final boolean cancel(boolean arg1){
    return false;
  }
  public final AsyncTask.Status getStatus(){
    return (AsyncTask.Status) null;
  }
  public final boolean isCancelled(){
    return false;
  }
  protected abstract Result doInBackground(Params [] arg1);
  public static void setDefaultExecutor(@com.francetelecom.rd.stubs.annotation.CallBackRegister("execute") java.util.concurrent.Executor arg1){
  }
  protected void onPreExecute(){
  }
  protected void onPostExecute(Result arg1){
  }
  protected void onProgressUpdate(Progress [] arg1){
  }
  protected void onCancelled(Result arg1){
  }
  protected void onCancelled(){
  }
  public final AsyncTask<Params, Progress, Result> executeOnExecutor(@com.francetelecom.rd.stubs.annotation.CallBackRegister("execute") java.util.concurrent.Executor arg1, Params [] arg2){
    return (AsyncTask) null;
  }
  protected final void publishProgress(@com.francetelecom.rd.stubs.annotation.FieldSet("progress") Progress [] arg1){
  }
}
