package javax.microedition.m2g;

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

import com.francetelecom.rd.stubs.annotation.ArgsRule;
import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;
@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr226.ScalableImageImplem")
abstract public class ScalableImage extends java.lang.Object{
// Fields
// Methods
    protected  ScalableImage(){
        return;
    }
    @ArgsRule(value="ScalableImage-2",pos={1})
    public static javax.microedition.m2g.ScalableImage createImage(java.io.InputStream stream, @CallBackRegister("externalHandler")javax.microedition.m2g.ExternalResourceHandler handler)
		throws java.io.IOException{
        return null;
    }
    @ArgsRule(value="ScalableImage-1",pos={1})
    public static javax.microedition.m2g.ScalableImage createImage(String URL, @CallBackRegister("externalHandler") javax.microedition.m2g.ExternalResourceHandler handler)
		throws java.io.IOException{
    	return null;
    }
    public abstract void setViewportWidth(int arg1);
    public abstract void setViewportHeight(int arg1);
    public abstract int getViewportWidth();
    public abstract int getViewportHeight();
    public abstract void requestCompleted(String arg1, java.io.InputStream arg2)
		throws java.io.IOException;
}
