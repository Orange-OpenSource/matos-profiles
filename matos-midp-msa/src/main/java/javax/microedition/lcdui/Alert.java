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
public class Alert extends Screen {
    
    public static final int FOREVER = -2;
    public static final Command DISMISS_COMMAND=new Command("",Command.OK,0);
    public Alert(@FieldSet("this.title") String a0){}
    public Alert(@FieldSet("this.title") String a0, @FieldSet("string") java.lang.String a1, @FieldSet("image") Image a2,@FieldSet("type") AlertType a3){}
    
    public int getDefaultTimeout(){ return 0;}
    public int getTimeout(){ return 0;}
    public void setTimeout(int a0){ }

    @FieldGet("type") 
    public AlertType getType() { return null; } 
    public void setType(@FieldSet("type")AlertType a0){  }
    
    @FieldGet("string")
    public String getString(){ return null;}
    public void setString(@FieldSet("string") String a0){ }
    
    @FieldGet("image")
    public Image getImage() { return null; }
    public void setImage(@FieldSet("image") Image a0){ }
    
    public void setIndicator(@FieldSet("gauge")Gauge a0){ }
    @FieldGet("gauge")
    public Gauge getIndicator() { return null; }
    // public void addCommand(Command a0){ return; }
    // public void removeCommand(Command a0){ return; }
    // public void setCommandListener(CommandListener a0){ return; }
}

