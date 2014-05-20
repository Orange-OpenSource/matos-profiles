package javax.microedition.contactless.visual;

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
@Real("com.francetelecom.rd.fakemidp.jsr257.ImagePropertiesImplem")
public interface ImageProperties {
	public static final int PHYSICAL_SIZE_UNIT_INCH = 2;
	public static final int PHYSICAL_SIZE_UNIT_MILLIMETER = 3;
	public static final int PHYSICAL_SIZE_UNIT_PIXEL = 1;

	public int getLogicalUnitSize();

	public double getPhysicalHeigth();

	public int getPhysicalSizeUnit();

	public double getPhysicalWidth();

	public java.lang.Object getProperty(int key);

	public int[] getPropertyKeys();

	public double getResolution();

	public java.lang.String getSymbology();

	public void setLogicalUnitSize(int size);

	public void setPhysicalHeight(double height);

	public void setPhysicalSizeUnit(int sizeUnit);

	public void setPhysicalWidth(double width);

	public void setProperty(int key, java.lang.Object value);

	public void setResolution(double resolution);

	public void setSymbology(java.lang.String symbology);
    
}
