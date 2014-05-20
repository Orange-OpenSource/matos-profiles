package javax.microedition.global;

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
final public class Formatter extends java.lang.Object{
// Fields
    public static final int TIME_LONG = 3;
    public static final int TIME_SHORT = 2;
    public static final int DATE_LONG = 1;
    public static final int DATE_SHORT = 0;
    public static final int DATETIME_LONG = 5;
    public static final int DATETIME_SHORT = 4;
// Methods
    public  Formatter()
		throws javax.microedition.global.UnsupportedLocaleException{
        return;
    }
    public  Formatter(String locale)
		throws javax.microedition.global.UnsupportedLocaleException, java.lang.IllegalArgumentException{
        return;
    }
    public static String formatMessage(String template, String[] params){
        return "" + "Formatter.";
    }
    public String formatDateTime(java.util.Calendar dateTime, int style){
        return "" + "Formatter.";
    }
    public String formatCurrency(double number){
        return "" + "Formatter.";
    }
    public String formatCurrency(double number, String currencyCode)
		throws java.lang.IllegalArgumentException{
        return "" + "Formatter.";
    }
    public String formatNumber(double number){
        return "" + "Formatter.";
    }
    public String formatNumber(double number, int decimals)
		throws java.lang.IllegalArgumentException{
        return "" + "Formatter.";
    }
    public String formatNumber(long number){
        return "" + "Formatter.";
    }
    public String formatPercentage(long number){
        return "" + "Formatter.";
    }
    public String formatPercentage(float number, int decimals)
		throws java.lang.IllegalArgumentException{
        return "" + "Formatter.";
    }
    public static String[] getSupportedLocales(){
    	java.lang.String[] str = new java.lang.String[1];
    	str[0] = "" + "Formatter.";
        return str;
    }
    public String getLocale(){
        return "" + "Formatter.";
    }
}
