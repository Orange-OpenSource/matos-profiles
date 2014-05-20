package java.util;

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

public class Random extends Object{

		public Random(){}

		public Random(long a0){ }

		public synchronized void setSeed(long a0){  return; }

		synchronized protected int next(int bits) { return 0;		}

		public long nextLong() { return 0L;
		}    

		public int nextInt() {  return 0; }
		public int nextInt(int i) {  return 0; } //FDUB

		public float nextFloat(){ return 0.0f;}
		public double nextDouble(){ return 0.0;}

}
