package javax.microedition.location;

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
import com.francetelecom.rd.stubs.annotation.UseRule;
@ClassDone
public class Location extends java.lang.Object{
// Fields
    public static final int MTE_SATELLITE = 1;
    public static final int MTE_TIMEDIFFERENCE = 2;
    public static final int MTE_TIMEOFARRIVAL = 4;
    public static final int MTE_CELLID = 8;
    public static final int MTE_SHORTRANGE = 16;
    public static final int MTE_ANGLEOFARRIVAL = 32;
    public static final int MTY_TERMINALBASED = 65536;
    public static final int MTY_NETWORKBASED = 131072;
    public static final int MTA_ASSISTED = 262144;
    public static final int MTA_UNASSISTED = 524288;
// Methods
    protected  Location(){
        return;
    }
    public boolean isValid(){
        return true;
    }
    @UseRule(value="Location.getTimestamp")
    public long getTimestamp(){
        return 0L;
    }
    public javax.microedition.location.QualifiedCoordinates getQualifiedCoordinates(){
        return null;
    }
    @UseRule(value="Location.getSpeed")
    public float getSpeed(){
        return 0.0f;
    }
    @UseRule(value="Location.getCourse")
    public float getCourse(){
        return 0.0f;
    }
    
    public int getLocationMethod(){
        return 0;
    }
    @ArgsRule(value="Location.getAddressInfo",pos={0,-1})
    public javax.microedition.location.AddressInfo getAddressInfo(){
        return new javax.microedition.location.AddressInfo();
    }
    @ArgsRule(value="Location.getExtraInfo",pos={1})
    public String getExtraInfo(String mimetype){
        return "" + "Location.";
    }
}
