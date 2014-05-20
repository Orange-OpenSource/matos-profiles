package android.provider;

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
public final class CalendarContract
{
  // Classes

  protected static interface CalendarSyncColumns
  {
    // Fields

    public static final java.lang.String CAL_SYNC1 = "cal_sync1";

    public static final java.lang.String CAL_SYNC2 = "cal_sync2";

    public static final java.lang.String CAL_SYNC3 = "cal_sync3";

    public static final java.lang.String CAL_SYNC4 = "cal_sync4";

    public static final java.lang.String CAL_SYNC5 = "cal_sync5";

    public static final java.lang.String CAL_SYNC6 = "cal_sync6";

    public static final java.lang.String CAL_SYNC7 = "cal_sync7";

    public static final java.lang.String CAL_SYNC8 = "cal_sync8";

    public static final java.lang.String CAL_SYNC9 = "cal_sync9";

    public static final java.lang.String CAL_SYNC10 = "cal_sync10";

  }
  protected static interface SyncColumns
    extends CalendarContract.CalendarSyncColumns
  {
    // Fields

    public static final java.lang.String ACCOUNT_NAME = "account_name";

    public static final java.lang.String ACCOUNT_TYPE = "account_type";

    public static final java.lang.String _SYNC_ID = "_sync_id";

    public static final java.lang.String DIRTY = "dirty";

    public static final java.lang.String DELETED = "deleted";

    public static final java.lang.String CAN_PARTIALLY_UPDATE = "canPartiallyUpdate";

  }
  protected static interface CalendarColumns
  {
    // Fields

    public static final java.lang.String CALENDAR_COLOR = "calendar_color";

    public static final java.lang.String CALENDAR_DISPLAY_NAME = "calendar_displayName";

    public static final java.lang.String CALENDAR_ACCESS_LEVEL = "calendar_access_level";

    public static final int CAL_ACCESS_NONE = 0;

    public static final int CAL_ACCESS_FREEBUSY = 100;

    public static final int CAL_ACCESS_READ = 200;

    public static final int CAL_ACCESS_RESPOND = 300;

    public static final int CAL_ACCESS_OVERRIDE = 400;

    public static final int CAL_ACCESS_CONTRIBUTOR = 500;

    public static final int CAL_ACCESS_EDITOR = 600;

    public static final int CAL_ACCESS_OWNER = 700;

    public static final int CAL_ACCESS_ROOT = 800;

    public static final java.lang.String VISIBLE = "visible";

    public static final java.lang.String CALENDAR_TIME_ZONE = "calendar_timezone";

    public static final java.lang.String SYNC_EVENTS = "sync_events";

    public static final java.lang.String OWNER_ACCOUNT = "ownerAccount";

    public static final java.lang.String CAN_ORGANIZER_RESPOND = "canOrganizerRespond";

    public static final java.lang.String CAN_MODIFY_TIME_ZONE = "canModifyTimeZone";

    public static final java.lang.String MAX_REMINDERS = "maxReminders";

    public static final java.lang.String ALLOWED_REMINDERS = "allowedReminders";

  }
  public static final class CalendarEntity
    implements CalendarContract.SyncColumns, BaseColumns, CalendarContract.CalendarColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("CalendarCalendarEntityURI")
    public static final android.net.Uri CONTENT_URI = null;

    // Constructors

    private CalendarEntity(){
    }
    // Methods

    public static android.content.EntityIterator newEntityIterator(android.database.Cursor arg1){
      return (android.content.EntityIterator) null;
    }
  }
  public static final class Calendars
    implements CalendarContract.SyncColumns, BaseColumns, CalendarContract.CalendarColumns
  {
    // Fields
	            
	@com.francetelecom.rd.stubs.annotation.FieldValueImpl("CalendarCalendarsURI")
    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String DEFAULT_SORT_ORDER = "calendar_displayName";

    public static final java.lang.String NAME = "name";

    public static final java.lang.String CALENDAR_LOCATION = "calendar_location";

    public static final java.lang.String [] SYNC_WRITABLE_COLUMNS = null;

    // Constructors

    private Calendars(){
    }
  }
  protected static interface AttendeesColumns
  {
    // Fields

    public static final java.lang.String EVENT_ID = "event_id";

    public static final java.lang.String ATTENDEE_NAME = "attendeeName";

    public static final java.lang.String ATTENDEE_EMAIL = "attendeeEmail";

    public static final java.lang.String ATTENDEE_RELATIONSHIP = "attendeeRelationship";

    public static final int RELATIONSHIP_NONE = 0;

    public static final int RELATIONSHIP_ATTENDEE = 1;

    public static final int RELATIONSHIP_ORGANIZER = 2;

    public static final int RELATIONSHIP_PERFORMER = 3;

    public static final int RELATIONSHIP_SPEAKER = 4;

    public static final java.lang.String ATTENDEE_TYPE = "attendeeType";

    public static final int TYPE_NONE = 0;

    public static final int TYPE_REQUIRED = 1;

    public static final int TYPE_OPTIONAL = 2;

    public static final java.lang.String ATTENDEE_STATUS = "attendeeStatus";

    public static final int ATTENDEE_STATUS_NONE = 0;

    public static final int ATTENDEE_STATUS_ACCEPTED = 1;

    public static final int ATTENDEE_STATUS_DECLINED = 2;

    public static final int ATTENDEE_STATUS_INVITED = 3;

    public static final int ATTENDEE_STATUS_TENTATIVE = 4;

  }
  public static final class Attendees
    implements CalendarContract.EventsColumns, BaseColumns, CalendarContract.AttendeesColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("CalendarAttendeesURI")
    public static final android.net.Uri CONTENT_URI = null;

    // Constructors

    private Attendees(){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Calendar.Attendees.query", pos = {3}, report = "-")
    public static final android.database.Cursor query(android.content.ContentResolver arg1, long arg2, java.lang.String [] arg3){
      return (android.database.Cursor) null;
    }
  }
  protected static interface EventsColumns
  {
    // Fields

    public static final java.lang.String CALENDAR_ID = "calendar_id";

    public static final java.lang.String TITLE = "title";

    public static final java.lang.String DESCRIPTION = "description";

    public static final java.lang.String EVENT_LOCATION = "eventLocation";

    public static final java.lang.String EVENT_COLOR = "eventColor";

    public static final java.lang.String STATUS = "eventStatus";

    public static final int STATUS_TENTATIVE = 0;

    public static final int STATUS_CONFIRMED = 1;

    public static final int STATUS_CANCELED = 2;

    public static final java.lang.String SELF_ATTENDEE_STATUS = "selfAttendeeStatus";

    public static final java.lang.String SYNC_DATA1 = "sync_data1";

    public static final java.lang.String SYNC_DATA2 = "sync_data2";

    public static final java.lang.String SYNC_DATA3 = "sync_data3";

    public static final java.lang.String SYNC_DATA4 = "sync_data4";

    public static final java.lang.String SYNC_DATA5 = "sync_data5";

    public static final java.lang.String SYNC_DATA6 = "sync_data6";

    public static final java.lang.String SYNC_DATA7 = "sync_data7";

    public static final java.lang.String SYNC_DATA8 = "sync_data8";

    public static final java.lang.String SYNC_DATA9 = "sync_data9";

    public static final java.lang.String SYNC_DATA10 = "sync_data10";

    public static final java.lang.String LAST_SYNCED = "lastSynced";

    public static final java.lang.String DTSTART = "dtstart";

    public static final java.lang.String DTEND = "dtend";

    public static final java.lang.String DURATION = "duration";

    public static final java.lang.String EVENT_TIMEZONE = "eventTimezone";

    public static final java.lang.String EVENT_END_TIMEZONE = "eventEndTimezone";

    public static final java.lang.String ALL_DAY = "allDay";

    public static final java.lang.String ACCESS_LEVEL = "accessLevel";

    public static final int ACCESS_DEFAULT = 0;

    public static final int ACCESS_CONFIDENTIAL = 1;

    public static final int ACCESS_PRIVATE = 2;

    public static final int ACCESS_PUBLIC = 3;

    public static final java.lang.String AVAILABILITY = "availability";

    public static final int AVAILABILITY_BUSY = 0;

    public static final int AVAILABILITY_FREE = 1;

    public static final java.lang.String HAS_ALARM = "hasAlarm";

    public static final java.lang.String HAS_EXTENDED_PROPERTIES = "hasExtendedProperties";

    public static final java.lang.String RRULE = "rrule";

    public static final java.lang.String RDATE = "rdate";

    public static final java.lang.String EXRULE = "exrule";

    public static final java.lang.String EXDATE = "exdate";

    public static final java.lang.String ORIGINAL_ID = "original_id";

    public static final java.lang.String ORIGINAL_SYNC_ID = "original_sync_id";

    public static final java.lang.String ORIGINAL_INSTANCE_TIME = "originalInstanceTime";

    public static final java.lang.String ORIGINAL_ALL_DAY = "originalAllDay";

    public static final java.lang.String LAST_DATE = "lastDate";

    public static final java.lang.String HAS_ATTENDEE_DATA = "hasAttendeeData";

    public static final java.lang.String GUESTS_CAN_MODIFY = "guestsCanModify";

    public static final java.lang.String GUESTS_CAN_INVITE_OTHERS = "guestsCanInviteOthers";

    public static final java.lang.String GUESTS_CAN_SEE_GUESTS = "guestsCanSeeGuests";

    public static final java.lang.String ORGANIZER = "organizer";

    public static final java.lang.String CAN_INVITE_OTHERS = "canInviteOthers";

  }
  public static final class EventsEntity
    implements CalendarContract.EventsColumns, CalendarContract.SyncColumns, BaseColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("CalendarEventsEntityURI")
    public static final android.net.Uri CONTENT_URI = null;

    // Constructors

    private EventsEntity(){
    }
    // Methods

    public static android.content.EntityIterator newEntityIterator(android.database.Cursor arg1, android.content.ContentResolver arg2){
      return (android.content.EntityIterator) null;
    }
    public static android.content.EntityIterator newEntityIterator(android.database.Cursor arg1, android.content.ContentProviderClient arg2){
      return (android.content.EntityIterator) null;
    }
  }
  public static final class Events
    implements CalendarContract.EventsColumns, CalendarContract.SyncColumns, BaseColumns, CalendarContract.CalendarColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("CalendarEventsURI")
    public static final android.net.Uri CONTENT_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("CalendarExceptionURI")
    public static final android.net.Uri CONTENT_EXCEPTION_URI = null;

    public static java.lang.String [] PROVIDER_WRITABLE_COLUMNS;

    public static final java.lang.String [] SYNC_WRITABLE_COLUMNS = null;

    // Constructors

    private Events(){
    }
  }
  public static final class Instances
    implements CalendarContract.EventsColumns, BaseColumns, CalendarContract.CalendarColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("CalendarInstancesURI")
    public static final android.net.Uri CONTENT_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("CalendarInstancesByDayURI")
    public static final android.net.Uri CONTENT_BY_DAY_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("CalendarInstancesSearchURI")
    public static final android.net.Uri CONTENT_SEARCH_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("CalendarInstancesSearchByDayURI")
    public static final android.net.Uri CONTENT_SEARCH_BY_DAY_URI = null;

    public static final java.lang.String BEGIN = "begin";

    public static final java.lang.String END = "end";

    public static final java.lang.String EVENT_ID = "event_id";

    public static final java.lang.String START_DAY = "startDay";

    public static final java.lang.String END_DAY = "endDay";

    public static final java.lang.String START_MINUTE = "startMinute";

    public static final java.lang.String END_MINUTE = "endMinute";

    // Constructors

    private Instances(){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Calendar.Instances.query1", pos = {2}, report = "-")
    public static final android.database.Cursor query(android.content.ContentResolver arg1, java.lang.String [] arg2, long arg3, long arg4){
      return (android.database.Cursor) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Calendar.Instances.query2", pos = {2, 5}, report = "-")
    public static final android.database.Cursor query(android.content.ContentResolver arg1, java.lang.String [] arg2, long arg3, long arg4, java.lang.String arg5){
      return (android.database.Cursor) null;
    }
  }
  protected static interface CalendarCacheColumns
  {
    // Fields

    public static final java.lang.String KEY = "key";

    public static final java.lang.String VALUE = "value";

  }
  public static final class CalendarCache
    implements CalendarContract.CalendarCacheColumns
  {
    // Fields

    public static final android.net.Uri URI = null;

    public static final java.lang.String KEY_TIMEZONE_TYPE = "timezoneType";

    public static final java.lang.String KEY_TIMEZONE_INSTANCES = "timezoneInstances";

    public static final java.lang.String KEY_TIMEZONE_INSTANCES_PREVIOUS = "timezoneInstancesPrevious";

    public static final java.lang.String TIMEZONE_TYPE_AUTO = "auto";

    public static final java.lang.String TIMEZONE_TYPE_HOME = "home";

    // Constructors

    private CalendarCache(){
    }
  }
  protected static interface CalendarMetaDataColumns
  {
    // Fields

    public static final java.lang.String LOCAL_TIMEZONE = "localTimezone";

    public static final java.lang.String MIN_INSTANCE = "minInstance";

    public static final java.lang.String MAX_INSTANCE = "maxInstance";

    public static final java.lang.String MIN_EVENTDAYS = "minEventDays";

    public static final java.lang.String MAX_EVENTDAYS = "maxEventDays";

  }
  public static final class CalendarMetaData
    implements CalendarContract.CalendarMetaDataColumns, BaseColumns
  {
    // Constructors

    private CalendarMetaData(){
    }
  }
  protected static interface EventDaysColumns
  {
    // Fields

    public static final java.lang.String STARTDAY = "startDay";

    public static final java.lang.String ENDDAY = "endDay";

  }
  public static final class EventDays
    implements CalendarContract.EventDaysColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("CalendarEventDaysURI")
    public static final android.net.Uri CONTENT_URI = null;

    // Constructors

    private EventDays(){
    }
    // Methods

   @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Calendar.EventDays.query", pos = {4}, report = "-")
   public static final android.database.Cursor query(android.content.ContentResolver arg1, int arg2, int arg3, java.lang.String [] arg4){
      return (android.database.Cursor) null;
    }
  }
  protected static interface RemindersColumns
  {
    // Fields

    public static final java.lang.String EVENT_ID = "event_id";

    public static final java.lang.String MINUTES = "minutes";

    public static final int MINUTES_DEFAULT = -1;

    public static final java.lang.String METHOD = "method";

    public static final int METHOD_DEFAULT = 0;

    public static final int METHOD_ALERT = 1;

    public static final int METHOD_EMAIL = 2;

    public static final int METHOD_SMS = 3;

  }
  public static final class Reminders
    implements CalendarContract.EventsColumns, BaseColumns, CalendarContract.RemindersColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("CalendarRemindersURI")
    public static final android.net.Uri CONTENT_URI = null;

    // Constructors

    private Reminders(){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Calendar.Reminders.query", pos = {3}, report = "-")
    public static final android.database.Cursor query(android.content.ContentResolver arg1, long arg2, java.lang.String [] arg3){
      return (android.database.Cursor) null;
    }
  }
  protected static interface CalendarAlertsColumns
  {
    // Fields

    public static final java.lang.String EVENT_ID = "event_id";

    public static final java.lang.String BEGIN = "begin";

    public static final java.lang.String END = "end";

    public static final java.lang.String ALARM_TIME = "alarmTime";

    public static final java.lang.String CREATION_TIME = "creationTime";

    public static final java.lang.String RECEIVED_TIME = "receivedTime";

    public static final java.lang.String NOTIFY_TIME = "notifyTime";

    public static final java.lang.String STATE = "state";

    public static final int STATE_SCHEDULED = 0;

    public static final int STATE_FIRED = 1;

    public static final int STATE_DISMISSED = 2;

    public static final java.lang.String MINUTES = "minutes";

    public static final java.lang.String DEFAULT_SORT_ORDER = "begin ASC,title ASC";

  }
  public static final class CalendarAlerts
    implements CalendarContract.CalendarAlertsColumns, CalendarContract.EventsColumns, BaseColumns, CalendarContract.CalendarColumns
  {
    // Fields

    public static final java.lang.String TABLE_NAME = "CalendarAlerts";

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("CalendarCalendarAlertsURI")
    public static final android.net.Uri CONTENT_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("CalendarCalendarAlertsByInstanceURI")
    public static final android.net.Uri CONTENT_URI_BY_INSTANCE = null;

    // Constructors

    private CalendarAlerts(){
    }
    // Methods

    public static final android.net.Uri insert(android.content.ContentResolver arg1, long arg2, long arg3, long arg4, long arg5, int arg6){
      return (android.net.Uri) null;
    }
    public static final long findNextAlarmTime(android.content.ContentResolver arg1, long arg2){
      return 0l;
    }
    public static final void rescheduleMissedAlarms(android.content.ContentResolver arg1, android.content.Context arg2, android.app.AlarmManager arg3){
    }
    public static void scheduleAlarm(android.content.Context arg1, android.app.AlarmManager arg2, long arg3){
    }
    public static final boolean alarmExists(android.content.ContentResolver arg1, long arg2, long arg3, long arg4){
      return false;
    }
  }
  protected static interface ExtendedPropertiesColumns
  {
    // Fields

    public static final java.lang.String EVENT_ID = "event_id";

    public static final java.lang.String NAME = "name";

    public static final java.lang.String VALUE = "value";

  }
  public static final class ExtendedProperties
    implements CalendarContract.EventsColumns, BaseColumns, CalendarContract.ExtendedPropertiesColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("CalendarExtendedPropertiesURI")
    public static final android.net.Uri CONTENT_URI = null;

    // Constructors

    private ExtendedProperties(){
    }
  }
  public static final class SyncState
    implements SyncStateContract.Columns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("CalendarSyncStateURI")
    public static final android.net.Uri CONTENT_URI = null;

    // Constructors

    private SyncState(){
    }
  }
  protected static interface EventsRawTimesColumns
  {
    // Fields

    public static final java.lang.String EVENT_ID = "event_id";

    public static final java.lang.String DTSTART_2445 = "dtstart2445";

    public static final java.lang.String DTEND_2445 = "dtend2445";

    public static final java.lang.String ORIGINAL_INSTANCE_TIME_2445 = "originalInstanceTime2445";

    public static final java.lang.String LAST_DATE_2445 = "lastDate2445";

  }
  public static final class EventsRawTimes
    implements BaseColumns, CalendarContract.EventsRawTimesColumns
  {
    // Constructors

    private EventsRawTimes(){
    }
  }
  // Fields

  public static final java.lang.String ACTION_EVENT_REMINDER = "android.intent.action.EVENT_REMINDER";

  public static final java.lang.String EXTRA_EVENT_BEGIN_TIME = "beginTime";

  public static final java.lang.String EXTRA_EVENT_END_TIME = "endTime";

  public static final java.lang.String EXTRA_EVENT_ALL_DAY = "allDay";

  public static final java.lang.String AUTHORITY = "com.android.calendar";

  @com.francetelecom.rd.stubs.annotation.FieldValueImpl("CalendarURI")
  public static final android.net.Uri CONTENT_URI = null;

  public static final java.lang.String CALLER_IS_SYNCADAPTER = "caller_is_syncadapter";

  public static final java.lang.String ACCOUNT_TYPE_LOCAL = "LOCAL";

  // Constructors

  private CalendarContract(){
  }
}
