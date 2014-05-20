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
public class List extends Screen implements Choice{

    public static final Command SELECT_COMMAND=new Command("",Command.SCREEN,0);;
    public List(@FieldSet("this.title")String a0,int a1){
    }
    @Code("string=arg3[0]; image=arg4[0];")
    public List(@FieldSet("this.title") String a0,int a1,java.lang.String[] a2,Image[] a3){
    }
    public int size(){ return 0;}
    @FieldGet("string")
    public String getString(int a0){ return null;}
    @FieldGet("image")
    public Image getImage(int a0) { return null; }
    public int append(@FieldSet("string")String a0,@FieldSet("image")Image a1){ 
    	return 0;
    }
    public void insert(int a0,@FieldSet("string")String a1,@FieldSet("image")Image a2){
    }
    public void delete(int a0){ return; }
    public void deleteAll(){ return; }
    public void set(int a0,@FieldSet("string")String a1,@FieldSet("image")Image a2){
    }
    public boolean isSelected(int a0){ return true;}
    public int getSelectedIndex(){ return 0;}
    public int getSelectedFlags(boolean[] a0){ return 0;}
    public void setSelectedIndex(int a0,boolean a1){ return; }
    public void setSelectedFlags(boolean[] a0){ return; }
    public void removeCommand(Command a0){ return; }
    public void setSelectCommand(Command a0){ return; }
    public void setFitPolicy(int a0){ return; }
    public int getFitPolicy(){ return 0;}
    public void setFont(int a0,@FieldSet("font")Font a1){ }
    @FieldGet("font")
    public Font getFont(int a0) { return null;}
}

