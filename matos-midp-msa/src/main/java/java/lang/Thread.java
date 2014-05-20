package java.lang;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2004 - 2014 Orange SA
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

import com.francetelecom.rd.stubs.annotation.Accumulator;
import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;
@ClassDone
@Accumulator("current")
public class Thread extends Object implements Runnable{
		public static final int MIN_PRIORITY = 1;
		public static final int NORM_PRIORITY = 5;
		public static final int MAX_PRIORITY = 10;
		@Code("return current;")
		public static Thread currentThread() { return (Thread) null;}
		public static native void yield();
		public static native void sleep(long a0) throws InterruptedException;

		@FieldSet("runnable")
		public Thread(){ }
		public Thread(@FieldSet("runnable") Runnable a0){ }
		public Thread(@FieldSet("runnable") Runnable a0, @FieldSet("name") String s0){  }
		public Thread(@FieldSet("name") String s0){ }
		@Code("runnable.run();")
		public void start() { }
		public void run(){ }
		public final boolean isAlive(){ return true;}
		public final void setPriority(int a0){ return; }
		public final int getPriority(){ return 0;}
		@FieldGet("name")
		public String getName() { return (String) null; }
		public static int activeCount(){ return 0;}
		public final void join() throws InterruptedException{ return; }
		public String toString(){ return "";}
		public void interrupt() { return; } //FDUB
}

