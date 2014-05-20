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
import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;
@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr226.SVGAnimatorImplem")
abstract public class SVGAnimator extends java.lang.Object{
// Fields
// Methods
    public  SVGAnimator(){
        return;
    }
    public static javax.microedition.m2g.SVGAnimator createAnimator(javax.microedition.m2g.SVGImage svgImage){
    	return null;
    }
    public static javax.microedition.m2g.SVGAnimator createAnimator(javax.microedition.m2g.SVGImage svgImage, String componentBaseClass){
    	return null;
    }
    public abstract void setSVGEventListener(@CallBackRegister("animator")javax.microedition.m2g.SVGEventListener arg1);
    public abstract void setTimeIncrement(float arg1);
    public abstract float getTimeIncrement();
    public abstract void play();
    public abstract void pause();
    public abstract void stop();
    public abstract Object getTargetComponent();
    public abstract void invokeAndWait(@CallBackRegister("runnable")Runnable arg1)
		throws java.lang.InterruptedException;
    public abstract void invokeLater(@CallBackRegister("runnable") Runnable arg1);
}
