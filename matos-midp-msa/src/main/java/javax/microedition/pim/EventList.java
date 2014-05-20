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
@Real("com.francetelecom.rd.fakemidp.jsr075.EventListImplem")
public interface EventList extends javax.microedition.pim.PIMList{
// Fields
    public static final int STARTING = 0;
    public static final int ENDING = 1;
    public static final int OCCURRING = 2;
// Methods
	@ArgsRule(value="EventList.createEvent",pos={0})
    public abstract javax.microedition.pim.Event createEvent();
	@ArgsRule(value="EventList.importEvent",pos={0})
    public abstract javax.microedition.pim.Event importEvent(javax.microedition.pim.Event arg1);
    public abstract void removeEvent(javax.microedition.pim.Event arg1)
		throws javax.microedition.pim.PIMException;
    @ArgsRule(value="EventList.items",pos={0,1,2,3})
    public abstract java.util.Enumeration items(int arg1, long arg2, long arg4, boolean arg6)
		throws javax.microedition.pim.PIMException;
    public abstract int[] getSupportedRepeatRuleFields(int arg1);
}
