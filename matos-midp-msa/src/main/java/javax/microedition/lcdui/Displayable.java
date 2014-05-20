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
import com.francetelecom.rd.stubs.annotation.Accumulator;
import com.francetelecom.rd.stubs.annotation.CallBack;
import com.francetelecom.rd.stubs.annotation.CallBackRegister;
import com.francetelecom.rd.stubs.annotation.Field;
import com.francetelecom.rd.stubs.annotation.FieldGet;
import com.francetelecom.rd.stubs.annotation.FieldSet;
@Field(value="title",type="String",modifier=4)
@Accumulator("displayable")
public abstract class Displayable {
	@CallBackRegister("displayable")
	protected Displayable() {}
	@FieldGet("title")
    public String getTitle(){ return null;}
    
    public void setTitle(@FieldSet("this.title") String a0){  return; }
    @FieldGet("ticker")
    public Ticker getTicker() { return null; }
    public void setTicker(@FieldSet("ticker")Ticker a0){  }
    public boolean isShown(){ return true;}

    public int getWidth(){ return 0;}
    public int getHeight(){ return 0;}

    public void addCommand(@FieldSet("command") Command a0){  }
    public void removeCommand(Command a0){  }
    @CallBack("displayable")
    protected void sizeChanged(int a0,int a1){  }
    public void setCommandListener(@CallBackRegister("listener")CommandListener a0){ 
	
    }
}

