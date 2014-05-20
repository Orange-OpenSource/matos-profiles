package javax.microedition.m3g;

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
import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;
@ClassDone
public class Appearance extends javax.microedition.m3g.Object3D{
// Fields
    static javax.microedition.m3g.Appearance appearance ;
// Methods
    public  Appearance(){
        return;
    }
    public int getLayer(){
        return 0;
    }
    @FieldGet("material")
    public javax.microedition.m3g.Material getMaterial(){
        return new javax.microedition.m3g.Material();
    }
    @FieldGet("fog")
    public javax.microedition.m3g.Fog getFog(){
        return new javax.microedition.m3g.Fog();
    }
    @FieldGet("compositing")
    public javax.microedition.m3g.CompositingMode getCompositingMode(){
        return new javax.microedition.m3g.CompositingMode();
    }
    @FieldGet("polygonmode")
    public javax.microedition.m3g.PolygonMode getPolygonMode(){
        return new javax.microedition.m3g.PolygonMode();
    }
    
    public void setLayer(int arg1){
        return;
    }
    
    public void setMaterial(@FieldSet("material")javax.microedition.m3g.Material Material){
        return;
    }
    public void setFog(@FieldSet("fog") javax.microedition.m3g.Fog Fog){
        return;
    }
    public void setCompositingMode(@FieldSet("compositing")javax.microedition.m3g.CompositingMode CompositingMode){
        return;
    }
    public void setPolygonMode(@FieldSet("polygonmode") javax.microedition.m3g.PolygonMode PolygonMode){
        return;
    }
    @FieldGet("texture")
    public javax.microedition.m3g.Texture2D getTexture(int index){
        return new javax.microedition.m3g.Texture2D(new javax.microedition.m3g.Image2D(0, new java.lang.Object()));
    }
    public void setTexture(int index, @FieldSet("texture") javax.microedition.m3g.Texture2D texture){
        return;
    }
}
