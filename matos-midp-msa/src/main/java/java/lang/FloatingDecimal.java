package java.lang;

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
public class FloatingDecimal extends Object {
    public FloatingDecimal(double a0){}
    public FloatingDecimal(float a0){}
    public String toString(){ return "" + "FloatingDecimal";}
    public String toJavaFormatString(){ return "" + "FloatingDecimal";}
    public static FloatingDecimal readJavaFormatString(String a0) throws NumberFormatException { return null;}
    public double doubleValue(){ return 0.0;}
    public float floatValue(){ return 0.0f;}
}

