package javax.microedition.lcdui;

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
public class StringItem extends Item {
	
    public StringItem(@FieldSet("this.label")String a0,@FieldSet("text")java.lang.String a1){}
    public StringItem(@FieldSet("this.label")String a0,@FieldSet("text")java.lang.String a1,int a2){}
    @FieldGet("text")
    public String getText(){ return "" + "StringItem";}
    public void setText(@FieldSet("text")String a0){ return; }
    public int getAppearanceMode(){ return 0;}
    
    public void setFont(@FieldSet("font")Font a0){}
    @FieldGet("font")
    public Font getFont() { return null; }
    public void setPreferredSize(int a0,int a1){ return; }
}

