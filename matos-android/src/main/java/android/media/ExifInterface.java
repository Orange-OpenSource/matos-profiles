package android.media;

/*
 * #%L
 * Matos
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2010 - 2014 Orange SA
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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class ExifInterface
{
  // Fields

  public static final java.lang.String TAG_ORIENTATION = "Orientation";

  public static final java.lang.String TAG_DATETIME = "DateTime";

  public static final java.lang.String TAG_MAKE = "Make";

  public static final java.lang.String TAG_MODEL = "Model";

  public static final java.lang.String TAG_FLASH = "Flash";

  public static final java.lang.String TAG_IMAGE_WIDTH = "ImageWidth";

  public static final java.lang.String TAG_IMAGE_LENGTH = "ImageLength";

  public static final java.lang.String TAG_GPS_LATITUDE = "GPSLatitude";

  public static final java.lang.String TAG_GPS_LONGITUDE = "GPSLongitude";

  public static final java.lang.String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";

  public static final java.lang.String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";

  public static final java.lang.String TAG_EXPOSURE_TIME = "ExposureTime";

  public static final java.lang.String TAG_APERTURE = "FNumber";

  public static final java.lang.String TAG_ISO = "ISOSpeedRatings";

  public static final java.lang.String TAG_GPS_ALTITUDE = "GPSAltitude";

  public static final java.lang.String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";

  public static final java.lang.String TAG_GPS_TIMESTAMP = "GPSTimeStamp";

  public static final java.lang.String TAG_GPS_DATESTAMP = "GPSDateStamp";

  public static final java.lang.String TAG_WHITE_BALANCE = "WhiteBalance";

  public static final java.lang.String TAG_FOCAL_LENGTH = "FocalLength";

  public static final java.lang.String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";

  public static final int ORIENTATION_UNDEFINED = 0;

  public static final int ORIENTATION_NORMAL = 1;

  public static final int ORIENTATION_FLIP_HORIZONTAL = 2;

  public static final int ORIENTATION_ROTATE_180 = 3;

  public static final int ORIENTATION_FLIP_VERTICAL = 4;

  public static final int ORIENTATION_TRANSPOSE = 5;

  public static final int ORIENTATION_ROTATE_90 = 6;

  public static final int ORIENTATION_TRANSVERSE = 7;

  public static final int ORIENTATION_ROTATE_270 = 8;

  public static final int WHITEBALANCE_AUTO = 0;

  public static final int WHITEBALANCE_MANUAL = 1;

  // Constructors

  public ExifInterface(java.lang.String arg1) throws java.io.IOException{
  }
  // Methods

  public java.lang.String getAttribute(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public byte [] getThumbnail(){
    return (byte []) null;
  }
  public void setAttribute(java.lang.String arg1, java.lang.String arg2){
  }
  public int getAttributeInt(java.lang.String arg1, int arg2){
    return 0;
  }
  public double getAttributeDouble(java.lang.String arg1, double arg2){
    return 0.0d;
  }
  public void saveAttributes() throws java.io.IOException{
  }
  public boolean hasThumbnail(){
    return false;
  }
  public boolean getLatLong(float [] arg1){
    return false;
  }
  public double getAltitude(double arg1){
    return 0.0d;
  }
  public long getDateTime(){
    return 0l;
  }
  public long getGpsDateTime(){
    return 0l;
  }
}
