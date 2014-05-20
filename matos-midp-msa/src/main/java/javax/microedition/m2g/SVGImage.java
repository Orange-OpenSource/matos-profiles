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
import com.francetelecom.rd.stubs.annotation.Real;
@Real("com.francetelecom.rd.fakemidp.jsr226.SVGImageImplem")
public class SVGImage extends javax.microedition.m2g.ScalableImage{
// Fields
// Methods
    protected  SVGImage(){
       super();
        return;
    }
    public org.w3c.dom.Document getDocument(){
    	return null;
    }
    public static javax.microedition.m2g.SVGImage createEmptyImage(javax.microedition.m2g.ExternalResourceHandler handler){
        return null;
    }
    public void dispatchMouseEvent(String type, int x, int y)
		throws org.w3c.dom.DOMException{
        return;
    }
    public void activate(){
        return;
    }
    public void focusOn(org.w3c.dom.svg.SVGElement element)
		throws org.w3c.dom.DOMException{
        return;
    }
    public void incrementTime(float seconds){
        return;
    }
    @ArgsRule(value="ScalableImage.createImage-2", pos={1})
    public static javax.microedition.m2g.ScalableImage createImage(java.io.InputStream stream, @CallBackRegister("externalHandler")javax.microedition.m2g.ExternalResourceHandler handler)   
		throws java.io.IOException{
    	return null;
    }
    @ArgsRule(value="ScalableImage.createImage-1", pos={1})
    public static javax.microedition.m2g.ScalableImage createImage(String URL, @CallBackRegister("externalHandler") javax.microedition.m2g.ExternalResourceHandler handler)
		throws java.io.IOException{
    	return null;
    }
    public void setViewportWidth(int width){
        return;
    }
    public void setViewportHeight(int height){
        return;
    }
    public int getViewportWidth(){
        return 0;
    }
    public int getViewportHeight(){
        return 0;
    }
    
    public void requestCompleted(String URI, java.io.InputStream resourceData)
		throws java.io.IOException{
        return;
    }
}
