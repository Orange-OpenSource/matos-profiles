package javax.microedition.pim;

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
import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;

@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr075.PIMItemImplem")

public interface PIMItem{
// Fields
    public static final int BINARY = 0;
    public static final int BOOLEAN = 1;
    public static final int DATE = 2;
    public static final int INT = 3;
    public static final int STRING = 4;
    public static final int STRING_ARRAY = 5;
    public static final int ATTR_NONE = 0;
    public static final int EXTENDED_FIELD_MIN_VALUE = 16777216;
    public static final int EXTENDED_ATTRIBUTE_MIN_VALUE = 16777216;
// Methods
    public abstract javax.microedition.pim.PIMList getPIMList();
    public abstract void commit()
		throws javax.microedition.pim.PIMException;
    public abstract boolean isModified();
    @ArgsRule(value="PIMItem.getFields",pos={0})
    public abstract int[] getFields();
    @ArgsRule(value="PIMItem.getBinary",pos={0,1,2})
    public abstract byte[] getBinary(int arg1, int arg2);
    @ArgsRule(value="PIMItem.addBinary",pos={0,1,2})
    public abstract void addBinary(int arg1, int arg2, byte[] arg3, int arg4, int arg5);
    @ArgsRule(value="PIMItem.setBinary",pos={0,1,2})
    public abstract void setBinary(int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6);
    @ArgsRule(value="PIMItem.getDate",pos={0,1,2})
    public abstract long getDate(int arg1, int arg2);
    @ArgsRule(value="PIMItem.addDate",pos={0,1,2})
    public abstract void addDate(int arg1, int arg2, long arg3);
    @ArgsRule(value="PIMItem.setDate",pos={0,1,2})
    public abstract void setDate(int arg1, int arg2, int arg3, long arg4);
    @ArgsRule(value="PIMItem.getInt",pos={0,1,2})
    public abstract int getInt(int arg1, int arg2);
    @ArgsRule(value="PIMItem.addInt",pos={0,1,2})
    public abstract void addInt(int arg1, int arg2, int arg3);
    @ArgsRule(value="PIMItem.setInt",pos={0,1,2})
    public abstract void setInt(int arg1, int arg2, int arg3, int arg4);
    @ArgsRule(value="PIMItem.getString",pos={0,1,2})
    public abstract String getString(int arg1, int arg2);
    @ArgsRule(value="PIMItem.addString",pos={0,1,2})
    public abstract void addString(int arg1, int arg2, String arg3);
    @ArgsRule(value="PIMItem.setString",pos={0,1,2})
    public abstract void setString(int arg1, int arg2, int arg3, String arg4);
    @ArgsRule(value="PIMItem.getBoolean",pos={0,1,2})
    public abstract boolean getBoolean(int arg1, int arg2);
    @ArgsRule(value="PIMItem.addBoolean",pos={0,1,2})
    public abstract void addBoolean(int arg1, int arg2, boolean arg3);
    @ArgsRule(value="PIMItem.setBoolean",pos={0,1,2})
    public abstract void setBoolean(int arg1, int arg2, int arg3, boolean arg4);
    @ArgsRule(value="PIMItem.getStringArray",pos={0,1,2})
    public abstract String[] getStringArray(int arg1, int arg2);
    @ArgsRule(value="PIMItem.addStringArray",pos={0,1,2})
    public abstract void addStringArray(int arg1, int arg2, String[] arg3);
    @ArgsRule(value="PIMItem.setStringArray",pos={0,1,2})
    public abstract void setStringArray(int arg1, int arg2, int arg3, String[] arg4);
    public abstract int countValues(int arg1);
    public abstract void removeValue(int arg1, int arg2);
    @ArgsRule(value="PIMItem.getAttributes",pos={0,1,2})
    public abstract int getAttributes(int arg1, int arg2);
    public abstract void addToCategory(String arg1)
		throws javax.microedition.pim.PIMException;
    public abstract void removeFromCategory(String arg1);
    public abstract String[] getCategories();
    public abstract int maxCategories();
}
