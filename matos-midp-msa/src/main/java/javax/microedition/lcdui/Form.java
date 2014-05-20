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
import com.francetelecom.rd.stubs.annotation.Code;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;
@ClassDone
public class Form extends Screen {
	public Form(@FieldSet("this.title") String title) {}
	public Form(@FieldSet("this.title") String title, Item[] items) {} 
    public int append(@FieldSet("item")Item a0){  return 0;}
    public int append(String a0){ return 0;}
    public int append(Image a0){ return 0;}
    public void insert(int a0,@FieldSet("item")Item a1){  }
    public void delete(int a0){ }
    public void deleteAll(){  }
    public void set(int a0,@FieldSet("item")Item a1){  return; }
    @FieldGet("item")
    public Item get(int a0) { return null; }
    
    @Code("arg1.itemStateChanged(item);")
    public void setItemStateListener(ItemStateListener a0){  }
    public int size(){ return 0;}
    public int getWidth(){ return 0;}
    public int getHeight(){ return 0;}
}

