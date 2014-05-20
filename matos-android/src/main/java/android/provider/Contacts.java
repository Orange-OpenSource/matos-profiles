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
public class Contacts
{
  // Classes

  public static interface SettingsColumns
  {
    // Fields

    public static final java.lang.String _SYNC_ACCOUNT = "_sync_account";

    public static final java.lang.String _SYNC_ACCOUNT_TYPE = "_sync_account_type";

    public static final java.lang.String KEY = "key";

    public static final java.lang.String VALUE = "value";

  }
  public static final class Settings
    implements BaseColumns, Contacts.SettingsColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsSettingsURI")
    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String CONTENT_DIRECTORY = "settings";

    public static final java.lang.String DEFAULT_SORT_ORDER = "key ASC";

    public static final java.lang.String SYNC_EVERYTHING = "syncEverything";

    // Constructors

    private Settings(){
    }
    // Methods

    public static java.lang.String getSetting(android.content.ContentResolver arg1, java.lang.String arg2, java.lang.String arg3){
      return (java.lang.String) null;
    }
    public static void setSetting(android.content.ContentResolver arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4){
    }
  }
  public static interface PeopleColumns
  {
    // Fields

    public static final java.lang.String NAME = "name";

    public static final java.lang.String PHONETIC_NAME = "phonetic_name";

    public static final java.lang.String DISPLAY_NAME = "display_name";

    public static final java.lang.String SORT_STRING = "sort_string";

    public static final java.lang.String NOTES = "notes";

    public static final java.lang.String TIMES_CONTACTED = "times_contacted";

    public static final java.lang.String LAST_TIME_CONTACTED = "last_time_contacted";

    public static final java.lang.String CUSTOM_RINGTONE = "custom_ringtone";

    public static final java.lang.String SEND_TO_VOICEMAIL = "send_to_voicemail";

    public static final java.lang.String STARRED = "starred";

    public static final java.lang.String PHOTO_VERSION = "photo_version";

  }
  public static final class People
    implements SyncConstValue, BaseColumns, Contacts.PhonesColumns, Contacts.PresenceColumns, Contacts.PeopleColumns
  {
    // Classes

    public static final class Phones
      implements BaseColumns, Contacts.PhonesColumns, Contacts.PeopleColumns
    {
      // Fields

      public static final java.lang.String CONTENT_DIRECTORY = "phones";

      public static final java.lang.String DEFAULT_SORT_ORDER = "number ASC";

      // Constructors

      private Phones(){
      }
    }
    public static final class ContactMethods
      implements BaseColumns, Contacts.ContactMethodsColumns, Contacts.PeopleColumns
    {
      // Fields

      public static final java.lang.String CONTENT_DIRECTORY = "contact_methods";

      public static final java.lang.String DEFAULT_SORT_ORDER = "data ASC";

      // Constructors

      private ContactMethods(){
      }
    }
    public static class Extensions
      implements BaseColumns, Contacts.ExtensionsColumns
    {
      // Fields

      public static final java.lang.String CONTENT_DIRECTORY = "extensions";

      public static final java.lang.String DEFAULT_SORT_ORDER = "name ASC";

      public static final java.lang.String PERSON_ID = "person";

      // Constructors

      private Extensions(){
      }
    }
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsPeopleURI")
    public static final android.net.Uri CONTENT_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsPeopleFilterURI")
    public static final android.net.Uri CONTENT_FILTER_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsPeopleDeletedURI")
    public static final android.net.Uri DELETED_CONTENT_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsPeopleEmailIMFilterURI")
    public static final android.net.Uri WITH_EMAIL_OR_IM_FILTER_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/person";

    public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/person";

    public static final java.lang.String DEFAULT_SORT_ORDER = "name ASC";

    public static final java.lang.String PRIMARY_PHONE_ID = "primary_phone";

    public static final java.lang.String PRIMARY_EMAIL_ID = "primary_email";

    public static final java.lang.String PRIMARY_ORGANIZATION_ID = "primary_organization";

    // Constructors

    private People(){
    }
    // Methods

    public static void markAsContacted(android.content.ContentResolver arg1, long arg2){
    }
    public static java.io.InputStream openContactPhotoInputStream(android.content.ContentResolver arg1, android.net.Uri arg2){
      return (java.io.InputStream) null;
    }
    public static long tryGetMyContactsGroupId(android.content.ContentResolver arg1){
      return 0l;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Contacts.People.addToMyContactsGroup", pos = -1, report = "-")
    public static android.net.Uri addToMyContactsGroup(android.content.ContentResolver arg1, long arg2){
      return (android.net.Uri) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Contacts.People.addToGroup-1", pos = {-1, 3}, report = "-")
    public static android.net.Uri addToGroup(android.content.ContentResolver arg1, long arg2, java.lang.String arg3){
      return (android.net.Uri) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Contacts.People.addToGroup-2", pos = -1, report = "-")
    public static android.net.Uri addToGroup(android.content.ContentResolver arg1, long arg2, long arg3){
      return (android.net.Uri) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Contacts.People.createPersonInMyContactsGroup", pos = -1, report = "-")
    public static android.net.Uri createPersonInMyContactsGroup(android.content.ContentResolver arg1, android.content.ContentValues arg2){
      return (android.net.Uri) null;
    }
    @com.francetelecom.rd.stubs.annotation.UseRule(value = "Contacts.People.queryGroups", report = "-")
    public static android.database.Cursor queryGroups(android.content.ContentResolver arg1, long arg2){
      return (android.database.Cursor) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Contacts.People.setPhotoData", pos = 2, report = "-")
    public static void setPhotoData(android.content.ContentResolver arg1, android.net.Uri arg2, byte [] arg3){
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Contacts.People.loadContactPhoto", pos = 2, report = "-")
    public static android.graphics.Bitmap loadContactPhoto(android.content.Context arg1, android.net.Uri arg2, int arg3, android.graphics.BitmapFactory.Options arg4){
      return (android.graphics.Bitmap) null;
    }
  }
  public static interface GroupsColumns
  {
    // Fields

    public static final java.lang.String NAME = "name";

    public static final java.lang.String NOTES = "notes";

    public static final java.lang.String SHOULD_SYNC = "should_sync";

    public static final java.lang.String SYSTEM_ID = "system_id";

  }
  public static final class Groups
    implements SyncConstValue, BaseColumns, Contacts.GroupsColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsGroupsURI")
    public static final android.net.Uri CONTENT_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsGroupsDeletedURI")
    public static final android.net.Uri DELETED_CONTENT_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/contactsgroup";

    public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contactsgroup";

    public static final java.lang.String DEFAULT_SORT_ORDER = "name ASC";

    public static final java.lang.String GROUP_ANDROID_STARRED = "Starred in Android";

    public static final java.lang.String GROUP_MY_CONTACTS = "Contacts";

    // Constructors

    private Groups(){
    }
  }
  public static interface PhonesColumns
  {
    // Fields

    public static final java.lang.String TYPE = "type";

    public static final int TYPE_CUSTOM = 0;

    public static final int TYPE_HOME = 1;

    public static final int TYPE_MOBILE = 2;

    public static final int TYPE_WORK = 3;

    public static final int TYPE_FAX_WORK = 4;

    public static final int TYPE_FAX_HOME = 5;

    public static final int TYPE_PAGER = 6;

    public static final int TYPE_OTHER = 7;

    public static final java.lang.String LABEL = "label";

    public static final java.lang.String NUMBER = "number";

    public static final java.lang.String NUMBER_KEY = "number_key";

    public static final java.lang.String ISPRIMARY = "isprimary";

  }
  public static final class Phones
    implements BaseColumns, Contacts.PhonesColumns, Contacts.PeopleColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsPhonesURI")
    public static final android.net.Uri CONTENT_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsPhonesFilterURI")
    public static final android.net.Uri CONTENT_FILTER_URL = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/phone";

    public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/phone";

    public static final java.lang.String DEFAULT_SORT_ORDER = "name ASC";

    public static final java.lang.String PERSON_ID = "person";

    // Constructors

    private Phones(){
    }
    // Methods

    public static final java.lang.CharSequence getDisplayLabel(android.content.Context arg1, int arg2, java.lang.CharSequence arg3, java.lang.CharSequence [] arg4){
      return (java.lang.CharSequence) null;
    }
    public static final java.lang.CharSequence getDisplayLabel(android.content.Context arg1, int arg2, java.lang.CharSequence arg3){
      return (java.lang.CharSequence) null;
    }
  }
  public static final class GroupMembership
    implements BaseColumns, Contacts.GroupsColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsGroupMembershipURI")
    public static final android.net.Uri CONTENT_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsGroupMembershipRawURI")
    public static final android.net.Uri RAW_CONTENT_URI = null;

    public static final java.lang.String CONTENT_DIRECTORY = "groupmembership";

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/contactsgroupmembership";

    public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contactsgroupmembership";

    public static final java.lang.String DEFAULT_SORT_ORDER = "group_id ASC";

    public static final java.lang.String GROUP_ID = "group_id";

    public static final java.lang.String GROUP_SYNC_ID = "group_sync_id";

    public static final java.lang.String GROUP_SYNC_ACCOUNT = "group_sync_account";

    public static final java.lang.String GROUP_SYNC_ACCOUNT_TYPE = "group_sync_account_type";

    public static final java.lang.String PERSON_ID = "person";

    // Constructors

    private GroupMembership(){
    }
  }
  public static interface ContactMethodsColumns
  {
    // Fields

    public static final java.lang.String KIND = "kind";

    public static final java.lang.String TYPE = "type";

    public static final int TYPE_CUSTOM = 0;

    public static final int TYPE_HOME = 1;

    public static final int TYPE_WORK = 2;

    public static final int TYPE_OTHER = 3;

    public static final int MOBILE_EMAIL_TYPE_INDEX = 2;

    public static final java.lang.String MOBILE_EMAIL_TYPE_NAME = "_AUTO_CELL";

    public static final java.lang.String LABEL = "label";

    public static final java.lang.String DATA = "data";

    public static final java.lang.String AUX_DATA = "aux_data";

    public static final java.lang.String ISPRIMARY = "isprimary";

  }
  public static final class ContactMethods
    implements BaseColumns, Contacts.ContactMethodsColumns, Contacts.PeopleColumns
  {
    // Fields

    public static final java.lang.String POSTAL_LOCATION_LATITUDE = "data";

    public static final java.lang.String POSTAL_LOCATION_LONGITUDE = "aux_data";

    public static final int PROTOCOL_AIM = 0;

    public static final int PROTOCOL_MSN = 1;

    public static final int PROTOCOL_YAHOO = 2;

    public static final int PROTOCOL_SKYPE = 3;

    public static final int PROTOCOL_QQ = 4;

    public static final int PROTOCOL_GOOGLE_TALK = 5;

    public static final int PROTOCOL_ICQ = 6;

    public static final int PROTOCOL_JABBER = 7;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContactMethodsURI")
    public static final android.net.Uri CONTENT_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContactMethodsEmailURI")
    public static final android.net.Uri CONTENT_EMAIL_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/contact-methods";

    public static final java.lang.String CONTENT_EMAIL_TYPE = "vnd.android.cursor.dir/email";

    public static final java.lang.String CONTENT_POSTAL_TYPE = "vnd.android.cursor.dir/postal-address";

    public static final java.lang.String CONTENT_EMAIL_ITEM_TYPE = "vnd.android.cursor.item/email";

    public static final java.lang.String CONTENT_POSTAL_ITEM_TYPE = "vnd.android.cursor.item/postal-address";

    public static final java.lang.String CONTENT_IM_ITEM_TYPE = "vnd.android.cursor.item/jabber-im";

    public static final java.lang.String DEFAULT_SORT_ORDER = "name ASC";

    public static final java.lang.String PERSON_ID = "person";

    // Constructors

    private ContactMethods(){
    }
    // Methods

    public static final java.lang.CharSequence getDisplayLabel(android.content.Context arg1, int arg2, int arg3, java.lang.CharSequence arg4){
      return (java.lang.CharSequence) null;
    }
    public static java.lang.String encodePredefinedImProtocol(int arg1){
      return (java.lang.String) null;
    }
    public static java.lang.String encodeCustomImProtocol(java.lang.String arg1){
      return (java.lang.String) null;
    }
    public static java.lang.Object decodeImProtocol(java.lang.String arg1){
      return (java.lang.Object) null;
    }
    public static java.lang.String lookupProviderNameFromId(int arg1){
      return (java.lang.String) null;
    }
    public void addPostalLocation(android.content.Context arg1, long arg2, double arg3, double arg4){
    }
  }
  public static interface PresenceColumns
  {
    // Fields

    public static final java.lang.String PRIORITY = "priority";

    public static final java.lang.String PRESENCE_STATUS = "mode";

    public static final int OFFLINE = 0;

    public static final int INVISIBLE = 1;

    public static final int AWAY = 2;

    public static final int IDLE = 3;

    public static final int DO_NOT_DISTURB = 4;

    public static final int AVAILABLE = 5;

    public static final java.lang.String PRESENCE_CUSTOM_STATUS = "status";

    public static final java.lang.String IM_PROTOCOL = "im_protocol";

    public static final java.lang.String IM_HANDLE = "im_handle";

    public static final java.lang.String IM_ACCOUNT = "im_account";

  }
  public static final class Presence
    implements BaseColumns, Contacts.PresenceColumns, Contacts.PeopleColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsPresenceURI")
    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String PERSON_ID = "person";

    // Constructors

    public Presence(){
    }
    // Methods

    public static final int getPresenceIconResourceId(int arg1){
      return 0;
    }
    public static final void setPresenceIcon(android.widget.ImageView arg1, int arg2){
    }
  }
  public static interface OrganizationColumns
  {
    // Fields

    public static final java.lang.String TYPE = "type";

    public static final int TYPE_CUSTOM = 0;

    public static final int TYPE_WORK = 1;

    public static final int TYPE_OTHER = 2;

    public static final java.lang.String LABEL = "label";

    public static final java.lang.String COMPANY = "company";

    public static final java.lang.String TITLE = "title";

    public static final java.lang.String PERSON_ID = "person";

    public static final java.lang.String ISPRIMARY = "isprimary";

  }
  public static final class Organizations
    implements Contacts.OrganizationColumns, BaseColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsOrganizationsURI")
    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String CONTENT_DIRECTORY = "organizations";

    public static final java.lang.String DEFAULT_SORT_ORDER = "company, title, isprimary ASC";

    // Constructors

    private Organizations(){
    }
    // Methods

    public static final java.lang.CharSequence getDisplayLabel(android.content.Context arg1, int arg2, java.lang.CharSequence arg3){
      return (java.lang.CharSequence) null;
    }
  }
  public static interface PhotosColumns
  {
    // Fields

    public static final java.lang.String LOCAL_VERSION = "local_version";

    public static final java.lang.String PERSON_ID = "person";

    public static final java.lang.String DOWNLOAD_REQUIRED = "download_required";

    public static final java.lang.String EXISTS_ON_SERVER = "exists_on_server";

    public static final java.lang.String SYNC_ERROR = "sync_error";

    public static final java.lang.String DATA = "data";

  }
  public static final class Photos
    implements SyncConstValue, Contacts.PhotosColumns, BaseColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsPhotosURI")
    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String CONTENT_DIRECTORY = "photo";

    public static final java.lang.String DEFAULT_SORT_ORDER = "person ASC";

    // Constructors

    private Photos(){
    }
  }
  public static interface ExtensionsColumns
  {
    // Fields

    public static final java.lang.String NAME = "name";

    public static final java.lang.String VALUE = "value";

  }
  public static final class Extensions
    implements BaseColumns, Contacts.ExtensionsColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsExtensionsURI")
    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/contact_extensions";

    public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_extensions";

    public static final java.lang.String DEFAULT_SORT_ORDER = "person, name ASC";

    public static final java.lang.String PERSON_ID = "person";

    // Constructors

    private Extensions(){
    }
  }
  public static final class Intents
  {
    // Classes

    public static final class UI
    {
      // Fields

      public static final java.lang.String LIST_DEFAULT = "com.android.contacts.action.LIST_DEFAULT";

      public static final java.lang.String LIST_GROUP_ACTION = "com.android.contacts.action.LIST_GROUP";

      public static final java.lang.String GROUP_NAME_EXTRA_KEY = "com.android.contacts.extra.GROUP";

      public static final java.lang.String LIST_ALL_CONTACTS_ACTION = "com.android.contacts.action.LIST_ALL_CONTACTS";

      public static final java.lang.String LIST_CONTACTS_WITH_PHONES_ACTION = "com.android.contacts.action.LIST_CONTACTS_WITH_PHONES";

      public static final java.lang.String LIST_STARRED_ACTION = "com.android.contacts.action.LIST_STARRED";

      public static final java.lang.String LIST_FREQUENT_ACTION = "com.android.contacts.action.LIST_FREQUENT";

      public static final java.lang.String LIST_STREQUENT_ACTION = "com.android.contacts.action.LIST_STREQUENT";

      public static final java.lang.String TITLE_EXTRA_KEY = "com.android.contacts.extra.TITLE_EXTRA";

      public static final java.lang.String FILTER_CONTACTS_ACTION = "com.android.contacts.action.FILTER_CONTACTS";

      public static final java.lang.String FILTER_TEXT_EXTRA_KEY = "com.android.contacts.extra.FILTER_TEXT";

      // Constructors

      public UI(){
      }
    }
    public static final class Insert
    {
      // Fields

      public static final java.lang.String ACTION = "android.intent.action.INSERT";

      public static final java.lang.String FULL_MODE = "full_mode";

      public static final java.lang.String NAME = "name";

      public static final java.lang.String PHONETIC_NAME = "phonetic_name";

      public static final java.lang.String COMPANY = "company";

      public static final java.lang.String JOB_TITLE = "job_title";

      public static final java.lang.String NOTES = "notes";

      public static final java.lang.String PHONE = "phone";

      public static final java.lang.String PHONE_TYPE = "phone_type";

      public static final java.lang.String PHONE_ISPRIMARY = "phone_isprimary";

      public static final java.lang.String SECONDARY_PHONE = "secondary_phone";

      public static final java.lang.String SECONDARY_PHONE_TYPE = "secondary_phone_type";

      public static final java.lang.String TERTIARY_PHONE = "tertiary_phone";

      public static final java.lang.String TERTIARY_PHONE_TYPE = "tertiary_phone_type";

      public static final java.lang.String EMAIL = "email";

      public static final java.lang.String EMAIL_TYPE = "email_type";

      public static final java.lang.String EMAIL_ISPRIMARY = "email_isprimary";

      public static final java.lang.String SECONDARY_EMAIL = "secondary_email";

      public static final java.lang.String SECONDARY_EMAIL_TYPE = "secondary_email_type";

      public static final java.lang.String TERTIARY_EMAIL = "tertiary_email";

      public static final java.lang.String TERTIARY_EMAIL_TYPE = "tertiary_email_type";

      public static final java.lang.String POSTAL = "postal";

      public static final java.lang.String POSTAL_TYPE = "postal_type";

      public static final java.lang.String POSTAL_ISPRIMARY = "postal_isprimary";

      public static final java.lang.String IM_HANDLE = "im_handle";

      public static final java.lang.String IM_PROTOCOL = "im_protocol";

      public static final java.lang.String IM_ISPRIMARY = "im_isprimary";

      // Constructors

      public Insert(){
      }
    }
    // Fields

    public static final java.lang.String SEARCH_SUGGESTION_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CLICKED";

    public static final java.lang.String SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED";

    public static final java.lang.String SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED";

    public static final java.lang.String ATTACH_IMAGE = "com.android.contacts.action.ATTACH_IMAGE";

    public static final java.lang.String SHOW_OR_CREATE_CONTACT = "com.android.contacts.action.SHOW_OR_CREATE_CONTACT";

    public static final java.lang.String EXTRA_FORCE_CREATE = "com.android.contacts.action.FORCE_CREATE";

    public static final java.lang.String EXTRA_CREATE_DESCRIPTION = "com.android.contacts.action.CREATE_DESCRIPTION";

    public static final java.lang.String EXTRA_TARGET_RECT = "target_rect";

    // Constructors

    public Intents(){
    }
  }
  // Fields

  public static final java.lang.String AUTHORITY = "contacts";

  @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContactsURI")
  public static final android.net.Uri CONTENT_URI = null;

  public static final int KIND_EMAIL = 1;

  public static final int KIND_POSTAL = 2;

  public static final int KIND_IM = 3;

  public static final int KIND_ORGANIZATION = 4;

  public static final int KIND_PHONE = 5;

  // Constructors

  private Contacts(){
  }
}
