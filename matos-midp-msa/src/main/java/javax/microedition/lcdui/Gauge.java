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
import com.francetelecom.rd.stubs.annotation.FieldSet;
@ClassDone
public class Gauge extends Item {
    public static final int INDEFINITE = -1;
    public static final int CONTINUOUS_IDLE = 0;
    public static final int INCREMENTAL_IDLE = 1;
    public static final int CONTINUOUS_RUNNING = 2;
    public static final int INCREMENTAL_UPDATING = 3;
    public Gauge(@FieldSet("this.label")String a0,boolean a1,int a2,int a3){}
    public void setLabel(@FieldSet("this.label")String a0){ return; }
    public void setLayout(int a0){ return; }
    // public void addCommand(Command a0){ return; }
    // public void setItemCommandListener(ItemCommandListener a0){ return; }
    public void setPreferredSize(int a0,int a1){ return; }
    
    public void setDefaultCommand(Command a0){ return; }
    public void setValue(int a0){ return; }
    public int getValue(){ return 0;}
    public void setMaxValue(int a0){ return; }
    public int getMaxValue(){ return 0;}
    public boolean isInteractive(){ return true;}
}

