package java.lang;

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
public class Throwable extends Object {
    private Throwable cause;
	private StackTraceElement[] ste;
	public Throwable(){}
    public Throwable(String a0){}
    public Throwable(String arg1, Throwable arg2){ cause = arg2;}
    public Throwable(Throwable arg1){ cause = arg1;}
    public String getMessage(){ return "[stubs: Throwable.getMessage]";}
    public String getLocalizedMessage(){ return "[stubs: Throwable.getLocalizedMessage]";}
    public Throwable getCause(){ return cause;}
    public synchronized Throwable initCause(Throwable arg1){ cause=arg1; return cause;}
    public String toString(){return "[stubs: Throwable.toString]";}
    public void printStackTrace(){}
    public void printStackTrace(java.io.PrintStream arg1){}
    public void printStackTrace(java.io.PrintWriter arg1){}
    public synchronized Throwable fillInStackTrace(){ return new Throwable(); }
    public StackTraceElement[] getStackTrace(){ return ste;}
    public void setStackTrace(StackTraceElement[] arg1){ ste = arg1;}
}

