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

@ClassDone
public interface Choice{
    public static final int EXCLUSIVE = 1;
    public static final int MULTIPLE = 2;
    public static final int IMPLICIT = 3;
    public static final int POPUP = 4;
    public static final int TEXT_WRAP_DEFAULT = 0;
    public static final int TEXT_WRAP_ON = 1;
    public static final int TEXT_WRAP_OFF = 2;
    public abstract int size();

    public abstract String getString(int a0);
   
    public abstract Image getImage(int a0);
    
    public abstract int append(String a0,Image a1);
    public abstract void insert(int a0,String a1,Image a2);
    public abstract void set(int a0,String a1,Image a2);
    
    public abstract void delete(int a0);
    public abstract void deleteAll();

    
    public abstract boolean isSelected(int a0);
    public abstract int getSelectedIndex();
    public abstract int getSelectedFlags(boolean[] a0);
    public abstract void setSelectedIndex(int a0,boolean a1);
    public abstract void setSelectedFlags(boolean[] a0);
    public abstract void setFitPolicy(int a0);
    public abstract int getFitPolicy();
    public abstract void setFont(int a0,Font a1);
    public abstract Font getFont(int a0);
}

