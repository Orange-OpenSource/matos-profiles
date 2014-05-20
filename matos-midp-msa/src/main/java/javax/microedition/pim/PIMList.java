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

import com.francetelecom.rd.stubs.annotation.ClassDone;
import com.francetelecom.rd.stubs.annotation.Real;

@ClassDone
@Real("com.francetelecom.rd.fakemidp.jsr075.PIMListImplem")
public interface PIMList{
// Fields
    public static final String UNCATEGORIZED = null;
// Methods
    public abstract String getName();
    public abstract void close()
		throws javax.microedition.pim.PIMException;
    public abstract java.util.Enumeration items()
		throws javax.microedition.pim.PIMException;
    public abstract java.util.Enumeration items(javax.microedition.pim.PIMItem arg1)
		throws javax.microedition.pim.PIMException;
    public abstract java.util.Enumeration items(String arg1)
		throws javax.microedition.pim.PIMException;
    public abstract java.util.Enumeration itemsByCategory(String arg1)
		throws javax.microedition.pim.PIMException;
    public abstract String[] getCategories()
		throws javax.microedition.pim.PIMException;
    public abstract boolean isCategory(String arg1)
		throws javax.microedition.pim.PIMException;
    public abstract void addCategory(String arg1)
		throws javax.microedition.pim.PIMException;
    public abstract void deleteCategory(String arg1, boolean arg2)
		throws javax.microedition.pim.PIMException;
    public abstract void renameCategory(String arg1, String arg2)
		throws javax.microedition.pim.PIMException;
    public abstract int maxCategories();
    public abstract boolean isSupportedField(int arg1);
    public abstract int[] getSupportedFields();
    public abstract boolean isSupportedAttribute(int arg1, int arg2);
    public abstract int[] getSupportedAttributes(int arg1);
    public abstract boolean isSupportedArrayElement(int arg1, int arg2);
    public abstract int[] getSupportedArrayElements(int arg1);
    public abstract int getFieldDataType(int arg1);
    public abstract String getFieldLabel(int arg1);
    public abstract String getAttributeLabel(int arg1);
    public abstract String getArrayElementLabel(int arg1, int arg2);
    public abstract int maxValues(int arg1);
    public abstract int stringArraySize(int arg1);
}
