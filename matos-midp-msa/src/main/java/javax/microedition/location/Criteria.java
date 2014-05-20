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
@ClassDone
public class Criteria extends java.lang.Object{
// Fields
    public static final int NO_REQUIREMENT = 0;
    public static final int POWER_USAGE_LOW = 1;
    public static final int POWER_USAGE_MEDIUM = 2;
    public static final int POWER_USAGE_HIGH = 3;
// Methods
    public  Criteria(){
        return;
    }
    public int getPreferredPowerConsumption(){
        return 0;
    }
    public boolean isAllowedToCost(){
        return true;
    }
    public int getVerticalAccuracy(){
        return 0;
    }
    public int getHorizontalAccuracy(){
        return 0;
    }
    public int getPreferredResponseTime(){
        return 0;
    }
    public boolean isSpeedAndCourseRequired(){
        return true;
    }
    public boolean isAltitudeRequired(){
        return true;
    }
    public boolean isAddressInfoRequired(){
        return true;
    }
    @ArgsRule(value="Criteria.setHorizontalAccuracy",pos={1})
    public void setHorizontalAccuracy(int accuracy){
        return;
    }
    @ArgsRule(value="Criteria.setVerticalAccuracy",pos={1})
    public void setVerticalAccuracy(int accuracy){
        return;
    }
    public void setPreferredResponseTime(int time){
        return;
    }
    public void setPreferredPowerConsumption(int level){
        return;
    }
    @ArgsRule(value="Criteria.setCostAllowed",pos={1})
    public void setCostAllowed(boolean costAllowed){
        return;
    }
    @ArgsRule(value="Criteria.setSpeedAndCourseRequired",pos={1})
    public void setSpeedAndCourseRequired(boolean speedAndCourseRequired){
        return;
    }
    @ArgsRule(value="Criteria.setAltitudeRequired",pos={1})
    public void setAltitudeRequired(boolean altitudeRequired){
        return;
    }
    @ArgsRule(value="Criteria.setAddressInfoRequired",pos={1})
    public void setAddressInfoRequired(boolean addressInfoRequired){
        return;
    }
}
