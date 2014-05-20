package com.francetelecom.rd.fakeandroid.android;

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

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;

import com.francetelecom.rd.stubs.annotation.CallBackRegister;

public class Runtime {

	public static void runActivity( Activity a) {
	}

	public static void runApplication(Application app) {

	}

	public static void runService( Service s) {

	}

	public static void runProvider(ContentProvider p) {
	}
	
	public static void runReceiver(BroadcastReceiver r) {
	}
}
