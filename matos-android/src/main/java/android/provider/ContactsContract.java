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

import com.francetelecom.rd.stubs.annotation.ArgsRule;


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public final class ContactsContract
{
  // Classes

  public static final class Authorization
  {
    // Fields

    public static final java.lang.String AUTHORIZATION_METHOD = "authorize";

    public static final java.lang.String KEY_URI_TO_AUTHORIZE = "uri_to_authorize";

    public static final java.lang.String KEY_AUTHORIZED_URI = "authorized_uri";

    // Constructors

    public Authorization(){
    }
  }
  public static final class Preferences
  {
    // Fields

    public static final java.lang.String SORT_ORDER = "android.contacts.SORT_ORDER";

    public static final int SORT_ORDER_PRIMARY = 1;

    public static final int SORT_ORDER_ALTERNATIVE = 2;

    public static final java.lang.String DISPLAY_ORDER = "android.contacts.DISPLAY_ORDER";

    public static final int DISPLAY_ORDER_PRIMARY = 1;

    public static final int DISPLAY_ORDER_ALTERNATIVE = 2;

    // Constructors

    public Preferences(){
    }
  }
  public static final class Directory
    implements BaseColumns
  {
    // Fields

    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/contact_directories";

    public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_directory";

    public static final long DEFAULT = 0l;

    public static final long LOCAL_INVISIBLE = 1l;

    public static final java.lang.String PACKAGE_NAME = "packageName";

    public static final java.lang.String TYPE_RESOURCE_ID = "typeResourceId";

    public static final java.lang.String DISPLAY_NAME = "displayName";

    public static final java.lang.String DIRECTORY_AUTHORITY = "authority";

    public static final java.lang.String ACCOUNT_TYPE = "accountType";

    public static final java.lang.String ACCOUNT_NAME = "accountName";

    public static final java.lang.String EXPORT_SUPPORT = "exportSupport";

    public static final int EXPORT_SUPPORT_NONE = 0;

    public static final int EXPORT_SUPPORT_SAME_ACCOUNT_ONLY = 1;

    public static final int EXPORT_SUPPORT_ANY_ACCOUNT = 2;

    public static final java.lang.String SHORTCUT_SUPPORT = "shortcutSupport";

    public static final int SHORTCUT_SUPPORT_NONE = 0;

    public static final int SHORTCUT_SUPPORT_DATA_ITEMS_ONLY = 1;

    public static final int SHORTCUT_SUPPORT_FULL = 2;

    public static final java.lang.String PHOTO_SUPPORT = "photoSupport";

    public static final int PHOTO_SUPPORT_NONE = 0;

    public static final int PHOTO_SUPPORT_THUMBNAIL_ONLY = 1;

    public static final int PHOTO_SUPPORT_FULL_SIZE_ONLY = 2;

    public static final int PHOTO_SUPPORT_FULL = 3;

    // Constructors

    private Directory(){
    }
    // Methods

    public static void notifyDirectoryChange(android.content.ContentResolver arg1){
    }
  }
  public static interface SyncStateColumns
    extends SyncStateContract.Columns
  {
  }
  public static final class SyncState
    implements SyncStateContract.Columns
  {
    // Fields

    public static final java.lang.String CONTENT_DIRECTORY = "syncstate";

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractSyncStateURI")
    public static final android.net.Uri CONTENT_URI = null;

    // Constructors

    private SyncState(){
    }
    // Methods

    public static byte [] get(android.content.ContentProviderClient arg1, android.accounts.Account arg2) throws android.os.RemoteException{
      return (byte []) null;
    }
    public static void set(android.content.ContentProviderClient arg1, android.accounts.Account arg2, byte [] arg3) throws android.os.RemoteException{
    }
    public static android.util.Pair<android.net.Uri, byte []> getWithUri(android.content.ContentProviderClient arg1, android.accounts.Account arg2) throws android.os.RemoteException{
      return (android.util.Pair) null;
    }
    public static android.content.ContentProviderOperation newSetOperation(android.accounts.Account arg1, byte [] arg2){
      return (android.content.ContentProviderOperation) null;
    }
  }
  public static final class ProfileSyncState
    implements SyncStateContract.Columns
  {
    // Fields

    public static final java.lang.String CONTENT_DIRECTORY = "syncstate";

    public static final android.net.Uri CONTENT_URI = null;

    // Constructors

    private ProfileSyncState(){
    }
    // Methods

    public static byte [] get(android.content.ContentProviderClient arg1, android.accounts.Account arg2) throws android.os.RemoteException{
      return (byte []) null;
    }
    public static void set(android.content.ContentProviderClient arg1, android.accounts.Account arg2, byte [] arg3) throws android.os.RemoteException{
    }
    public static android.util.Pair<android.net.Uri, byte []> getWithUri(android.content.ContentProviderClient arg1, android.accounts.Account arg2) throws android.os.RemoteException{
      return (android.util.Pair) null;
    }
    public static android.content.ContentProviderOperation newSetOperation(android.accounts.Account arg1, byte [] arg2){
      return (android.content.ContentProviderOperation) null;
    }
  }
  protected static interface BaseSyncColumns
  {
    // Fields

    public static final java.lang.String SYNC1 = "sync1";

    public static final java.lang.String SYNC2 = "sync2";

    public static final java.lang.String SYNC3 = "sync3";

    public static final java.lang.String SYNC4 = "sync4";

  }
  protected static interface SyncColumns
    extends ContactsContract.BaseSyncColumns
  {
    // Fields

    public static final java.lang.String ACCOUNT_NAME = "account_name";

    public static final java.lang.String ACCOUNT_TYPE = "account_type";

    public static final java.lang.String SOURCE_ID = "sourceid";

    public static final java.lang.String VERSION = "version";

    public static final java.lang.String DIRTY = "dirty";

  }
  protected static interface ContactOptionsColumns
  {
    // Fields

    public static final java.lang.String TIMES_CONTACTED = "times_contacted";

    public static final java.lang.String LAST_TIME_CONTACTED = "last_time_contacted";

    public static final java.lang.String STARRED = "starred";

    public static final java.lang.String CUSTOM_RINGTONE = "custom_ringtone";

    public static final java.lang.String SEND_TO_VOICEMAIL = "send_to_voicemail";

  }
  protected static interface ContactsColumns
  {
    // Fields

    public static final java.lang.String DISPLAY_NAME = "display_name";

    public static final java.lang.String NAME_RAW_CONTACT_ID = "name_raw_contact_id";

    public static final java.lang.String PHOTO_ID = "photo_id";

    public static final java.lang.String PHOTO_FILE_ID = "photo_file_id";

    public static final java.lang.String PHOTO_URI = "photo_uri";

    public static final java.lang.String PHOTO_THUMBNAIL_URI = "photo_thumb_uri";

    public static final java.lang.String IN_VISIBLE_GROUP = "in_visible_group";

    public static final java.lang.String IS_USER_PROFILE = "is_user_profile";

    public static final java.lang.String HAS_PHONE_NUMBER = "has_phone_number";

    public static final java.lang.String LOOKUP_KEY = "lookup";

  }
  protected static interface ContactStatusColumns
  {
    // Fields

    public static final java.lang.String CONTACT_PRESENCE = "contact_presence";

    public static final java.lang.String CONTACT_CHAT_CAPABILITY = "contact_chat_capability";

    public static final java.lang.String CONTACT_STATUS = "contact_status";

    public static final java.lang.String CONTACT_STATUS_TIMESTAMP = "contact_status_ts";

    public static final java.lang.String CONTACT_STATUS_RES_PACKAGE = "contact_status_res_package";

    public static final java.lang.String CONTACT_STATUS_LABEL = "contact_status_label";

    public static final java.lang.String CONTACT_STATUS_ICON = "contact_status_icon";

  }
  public static interface FullNameStyle
  {
    // Fields

    public static final int UNDEFINED = 0;

    public static final int WESTERN = 1;

    public static final int CJK = 2;

    public static final int CHINESE = 3;

    public static final int JAPANESE = 4;

    public static final int KOREAN = 5;

  }
  public static interface PhoneticNameStyle
  {
    // Fields

    public static final int UNDEFINED = 0;

    public static final int PINYIN = 3;

    public static final int JAPANESE = 4;

    public static final int KOREAN = 5;

  }
  public static interface DisplayNameSources
  {
    // Fields

    public static final int UNDEFINED = 0;

    public static final int EMAIL = 10;

    public static final int PHONE = 20;

    public static final int ORGANIZATION = 30;

    public static final int NICKNAME = 35;

    public static final int STRUCTURED_NAME = 40;

  }
  protected static interface ContactNameColumns
  {
    // Fields

    public static final java.lang.String DISPLAY_NAME_SOURCE = "display_name_source";

    public static final java.lang.String DISPLAY_NAME_PRIMARY = "display_name";

    public static final java.lang.String DISPLAY_NAME_ALTERNATIVE = "display_name_alt";

    public static final java.lang.String PHONETIC_NAME_STYLE = "phonetic_name_style";

    public static final java.lang.String PHONETIC_NAME = "phonetic_name";

    public static final java.lang.String SORT_KEY_PRIMARY = "sort_key";

    public static final java.lang.String SORT_KEY_ALTERNATIVE = "sort_key_alt";

  }
  public static final class ContactCounts
  {
    // Fields

    public static final java.lang.String ADDRESS_BOOK_INDEX_EXTRAS = "address_book_index_extras";

    public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_TITLES = "address_book_index_titles";

    public static final java.lang.String EXTRA_ADDRESS_BOOK_INDEX_COUNTS = "address_book_index_counts";

    // Constructors

    public ContactCounts(){
    }
  }
  public static class Contacts
    implements ContactsContract.ContactOptionsColumns, ContactsContract.ContactStatusColumns, BaseColumns, ContactsContract.ContactNameColumns, ContactsContract.ContactsColumns
  {
    // Classes

    public static final class Data
      implements BaseColumns, ContactsContract.DataColumns
    {
      // Fields

      public static final java.lang.String CONTENT_DIRECTORY = "data";

      // Constructors

      private Data(){
      }
    }
    public static final class Entity
      implements ContactsContract.ContactOptionsColumns, ContactsContract.ContactStatusColumns, BaseColumns, ContactsContract.SyncColumns, ContactsContract.StatusColumns, ContactsContract.ContactNameColumns, ContactsContract.ContactsColumns, ContactsContract.BaseSyncColumns, ContactsContract.DataColumns, ContactsContract.RawContactsColumns
    {
      // Fields

      public static final java.lang.String CONTENT_DIRECTORY = "entities";

      public static final java.lang.String RAW_CONTACT_ID = "raw_contact_id";

      public static final java.lang.String DATA_ID = "data_id";

      // Constructors

      private Entity(){
      }
    }
    public static final class StreamItems
      implements ContactsContract.StreamItemsColumns
    {
      // Fields

      public static final java.lang.String CONTENT_DIRECTORY = "stream_items";

      // Constructors

      private StreamItems(){
      }
    }
    public static final class AggregationSuggestions
      implements ContactsContract.ContactOptionsColumns, ContactsContract.ContactStatusColumns, BaseColumns, ContactsContract.ContactsColumns
    {
      // Classes

      public static final class Builder
      {
        // Constructors

        public Builder(){
        }
        // Methods

        public android.net.Uri build(){
          return (android.net.Uri) null;
        }
        public ContactsContract.Contacts.AggregationSuggestions.Builder setContactId(long arg1){
          return (ContactsContract.Contacts.AggregationSuggestions.Builder) null;
        }
        public ContactsContract.Contacts.AggregationSuggestions.Builder addParameter(java.lang.String arg1, java.lang.String arg2){
          return (ContactsContract.Contacts.AggregationSuggestions.Builder) null;
        }
        public ContactsContract.Contacts.AggregationSuggestions.Builder setLimit(int arg1){
          return (ContactsContract.Contacts.AggregationSuggestions.Builder) null;
        }
      }
      // Fields

      public static final java.lang.String CONTENT_DIRECTORY = "suggestions";

      public static final java.lang.String PARAMETER_MATCH_NAME = "name";

      public static final java.lang.String PARAMETER_MATCH_EMAIL = "email";

      public static final java.lang.String PARAMETER_MATCH_PHONE = "phone";

      public static final java.lang.String PARAMETER_MATCH_NICKNAME = "nickname";

      // Constructors

      private AggregationSuggestions(){
      }
      // Methods

      public static final ContactsContract.Contacts.AggregationSuggestions.Builder builder(){
        return (ContactsContract.Contacts.AggregationSuggestions.Builder) null;
      }
    }
    public static final class Photo
      implements BaseColumns, ContactsContract.DataColumnsWithJoins
    {
      // Fields

      public static final java.lang.String CONTENT_DIRECTORY = "photo";

      public static final java.lang.String DISPLAY_PHOTO = "display_photo";

      public static final java.lang.String PHOTO_FILE_ID = "data14";

      public static final java.lang.String PHOTO = "data15";

      // Constructors

      private Photo(){
      }
    }
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractContactsURI")
    public static final android.net.Uri CONTENT_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractContactsLookupURI")
    public static final android.net.Uri CONTENT_LOOKUP_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractContactsVcardURI")
    public static final android.net.Uri CONTENT_VCARD_URI = null;

    public static final java.lang.String QUERY_PARAMETER_VCARD_NO_PHOTO = "nophoto";

    public static final android.net.Uri CONTENT_MULTI_VCARD_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractContactsFilterURI")
    public static final android.net.Uri CONTENT_FILTER_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractContactsStrequentURI")
    public static final android.net.Uri CONTENT_STREQUENT_URI = null;

    public static final android.net.Uri CONTENT_FREQUENT_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractContactsStrequentFilterURI")
    public static final android.net.Uri CONTENT_STREQUENT_FILTER_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractContactsGroupURI")
    public static final android.net.Uri CONTENT_GROUP_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/contact";

    public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact";

    public static final java.lang.String CONTENT_VCARD_TYPE = "text/x-vcard";

    // Constructors

    private Contacts(){
    }
    // Methods
    @ArgsRule(value="Contacts.getLookupUri-2", pos={2,-1})
    public static android.net.Uri getLookupUri(android.content.ContentResolver arg1, android.net.Uri arg2){
      return (android.net.Uri) null;
    }
    @ArgsRule(value="Contacts.getLookupUri", pos={1,2,-1})
    public static android.net.Uri getLookupUri(long arg1, java.lang.String arg2){
      return (android.net.Uri) null;
    }
    @ArgsRule(value="Contacts.lookupContact", pos={2,-1})
    public static android.net.Uri lookupContact(android.content.ContentResolver arg1, android.net.Uri arg2){
      return (android.net.Uri) null;
    }
    public static void markAsContacted(android.content.ContentResolver arg1, long arg2){
    }
    @ArgsRule(value="Contacts.openContactPhotoInputStream", pos={2,-1})
    public static java.io.InputStream openContactPhotoInputStream(android.content.ContentResolver arg1, android.net.Uri arg2, boolean arg3){
      return (java.io.InputStream) null;
    }
    public static java.io.InputStream openContactPhotoInputStream(android.content.ContentResolver arg1, android.net.Uri arg2){
      return (java.io.InputStream) null;
    }
  }
  public static final class Profile
    implements ContactsContract.ContactOptionsColumns, ContactsContract.ContactStatusColumns, BaseColumns, ContactsContract.ContactNameColumns, ContactsContract.ContactsColumns
  {
    // Fields

    public static final android.net.Uri CONTENT_URI = null;

    public static final android.net.Uri CONTENT_VCARD_URI = null;

    public static final android.net.Uri CONTENT_RAW_CONTACTS_URI = null;

    public static final long MIN_ID = 9223372034707292160l;

    // Constructors

    private Profile(){
    }
  }
  protected static interface RawContactsColumns
  {
    // Fields

    public static final java.lang.String CONTACT_ID = "contact_id";

    public static final java.lang.String DATA_SET = "data_set";

    public static final java.lang.String ACCOUNT_TYPE_AND_DATA_SET = "account_type_and_data_set";

    public static final java.lang.String AGGREGATION_MODE = "aggregation_mode";

    public static final java.lang.String DELETED = "deleted";

    public static final java.lang.String NAME_VERIFIED = "name_verified";

    public static final java.lang.String RAW_CONTACT_IS_READ_ONLY = "raw_contact_is_read_only";

    public static final java.lang.String RAW_CONTACT_IS_USER_PROFILE = "raw_contact_is_user_profile";

  }
  public static final class RawContacts
    implements ContactsContract.ContactOptionsColumns, BaseColumns, ContactsContract.SyncColumns, ContactsContract.ContactNameColumns, ContactsContract.RawContactsColumns
  {
    // Classes

    public static final class Data
      implements BaseColumns, ContactsContract.DataColumns
    {
      // Fields

      public static final java.lang.String CONTENT_DIRECTORY = "data";

      // Constructors

      private Data(){
      }
    }
    public static final class Entity
      implements BaseColumns, ContactsContract.DataColumns
    {
      // Fields

      public static final java.lang.String CONTENT_DIRECTORY = "entity";

      public static final java.lang.String DATA_ID = "data_id";

      // Constructors

      private Entity(){
      }
    }
    public static final class StreamItems
      implements BaseColumns, ContactsContract.StreamItemsColumns
    {
      // Fields

      public static final java.lang.String CONTENT_DIRECTORY = "stream_items";

      // Constructors

      private StreamItems(){
      }
    }
    public static final class DisplayPhoto
    {
      // Fields

      public static final java.lang.String CONTENT_DIRECTORY = "display_photo";

      // Constructors

      private DisplayPhoto(){
      }
    }
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractRawContactsURI")
    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/raw_contact";

    public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/raw_contact";

    public static final int AGGREGATION_MODE_DEFAULT = 0;

    public static final int AGGREGATION_MODE_IMMEDIATE = 1;

    public static final int AGGREGATION_MODE_SUSPENDED = 2;

    public static final int AGGREGATION_MODE_DISABLED = 3;

    // Constructors

    private RawContacts(){
    }
    // Methods

    public static android.content.EntityIterator newEntityIterator(android.database.Cursor arg1){
      return (android.content.EntityIterator) null;
    }
    public static android.net.Uri getContactLookupUri(android.content.ContentResolver arg1, android.net.Uri arg2){
      return (android.net.Uri) null;
    }
  }
  protected static interface StatusColumns
  {
    // Fields

    public static final java.lang.String PRESENCE = "mode";

    public static final java.lang.String PRESENCE_STATUS = "mode";

    public static final int OFFLINE = 0;

    public static final int INVISIBLE = 1;

    public static final int AWAY = 2;

    public static final int IDLE = 3;

    public static final int DO_NOT_DISTURB = 4;

    public static final int AVAILABLE = 5;

    public static final java.lang.String STATUS = "status";

    public static final java.lang.String PRESENCE_CUSTOM_STATUS = "status";

    public static final java.lang.String STATUS_TIMESTAMP = "status_ts";

    public static final java.lang.String STATUS_RES_PACKAGE = "status_res_package";

    public static final java.lang.String STATUS_LABEL = "status_label";

    public static final java.lang.String STATUS_ICON = "status_icon";

    public static final java.lang.String CHAT_CAPABILITY = "chat_capability";

    public static final int CAPABILITY_HAS_VOICE = 1;

    public static final int CAPABILITY_HAS_VIDEO = 2;

    public static final int CAPABILITY_HAS_CAMERA = 4;

  }
  public static final class StreamItems
    implements BaseColumns, ContactsContract.StreamItemsColumns
  {
    // Classes

    public static final class StreamItemPhotos
      implements BaseColumns, ContactsContract.StreamItemPhotosColumns
    {
      // Fields

      public static final java.lang.String CONTENT_DIRECTORY = "photo";

      public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/stream_item_photo";

      public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/stream_item_photo";

      // Constructors

      private StreamItemPhotos(){
      }
    }
    // Fields

    public static final android.net.Uri CONTENT_URI = null;

    public static final android.net.Uri CONTENT_PHOTO_URI = null;

    public static final android.net.Uri CONTENT_LIMIT_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/stream_item";

    public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/stream_item";

    public static final java.lang.String MAX_ITEMS = "max_items";

    // Constructors

    private StreamItems(){
    }
  }
  protected static interface StreamItemsColumns
  {
    // Fields

    public static final java.lang.String CONTACT_ID = "contact_id";

    public static final java.lang.String CONTACT_LOOKUP_KEY = "contact_lookup";

    public static final java.lang.String RAW_CONTACT_ID = "raw_contact_id";

    public static final java.lang.String RES_PACKAGE = "res_package";

    public static final java.lang.String ACCOUNT_TYPE = "account_type";

    public static final java.lang.String ACCOUNT_NAME = "account_name";

    public static final java.lang.String DATA_SET = "data_set";

    public static final java.lang.String RAW_CONTACT_SOURCE_ID = "raw_contact_source_id";

    public static final java.lang.String RES_ICON = "icon";

    public static final java.lang.String RES_LABEL = "label";

    public static final java.lang.String TEXT = "text";

    public static final java.lang.String TIMESTAMP = "timestamp";

    public static final java.lang.String COMMENTS = "comments";

    public static final java.lang.String SYNC1 = "stream_item_sync1";

    public static final java.lang.String SYNC2 = "stream_item_sync2";

    public static final java.lang.String SYNC3 = "stream_item_sync3";

    public static final java.lang.String SYNC4 = "stream_item_sync4";

  }
  public static final class StreamItemPhotos
    implements BaseColumns, ContactsContract.StreamItemPhotosColumns
  {
    // Fields

    public static final java.lang.String PHOTO = "photo";

    // Constructors

    private StreamItemPhotos(){
    }
  }
  protected static interface StreamItemPhotosColumns
  {
    // Fields

    public static final java.lang.String STREAM_ITEM_ID = "stream_item_id";

    public static final java.lang.String SORT_INDEX = "sort_index";

    public static final java.lang.String PHOTO_FILE_ID = "photo_file_id";

    public static final java.lang.String PHOTO_URI = "photo_uri";

    public static final java.lang.String SYNC1 = "stream_item_photo_sync1";

    public static final java.lang.String SYNC2 = "stream_item_photo_sync2";

    public static final java.lang.String SYNC3 = "stream_item_photo_sync3";

    public static final java.lang.String SYNC4 = "stream_item_photo_sync4";

  }
  public static final class PhotoFiles
    implements BaseColumns, ContactsContract.PhotoFilesColumns
  {
    // Constructors

    private PhotoFiles(){
    }
  }
  protected static interface PhotoFilesColumns
  {
    // Fields

    public static final java.lang.String HEIGHT = "height";

    public static final java.lang.String WIDTH = "width";

    public static final java.lang.String FILESIZE = "filesize";

  }
  protected static interface DataColumns
  {
    // Fields

    public static final java.lang.String RES_PACKAGE = "res_package";

    public static final java.lang.String MIMETYPE = "mimetype";

    public static final java.lang.String RAW_CONTACT_ID = "raw_contact_id";

    public static final java.lang.String IS_PRIMARY = "is_primary";

    public static final java.lang.String IS_SUPER_PRIMARY = "is_super_primary";

    public static final java.lang.String IS_READ_ONLY = "is_read_only";

    public static final java.lang.String DATA_VERSION = "data_version";

    public static final java.lang.String DATA1 = "data1";

    public static final java.lang.String DATA2 = "data2";

    public static final java.lang.String DATA3 = "data3";

    public static final java.lang.String DATA4 = "data4";

    public static final java.lang.String DATA5 = "data5";

    public static final java.lang.String DATA6 = "data6";

    public static final java.lang.String DATA7 = "data7";

    public static final java.lang.String DATA8 = "data8";

    public static final java.lang.String DATA9 = "data9";

    public static final java.lang.String DATA10 = "data10";

    public static final java.lang.String DATA11 = "data11";

    public static final java.lang.String DATA12 = "data12";

    public static final java.lang.String DATA13 = "data13";

    public static final java.lang.String DATA14 = "data14";

    public static final java.lang.String DATA15 = "data15";

    public static final java.lang.String SYNC1 = "data_sync1";

    public static final java.lang.String SYNC2 = "data_sync2";

    public static final java.lang.String SYNC3 = "data_sync3";

    public static final java.lang.String SYNC4 = "data_sync4";

  }
  protected static interface DataColumnsWithJoins
    extends ContactsContract.ContactOptionsColumns, ContactsContract.ContactStatusColumns, BaseColumns, ContactsContract.StatusColumns, ContactsContract.ContactNameColumns, ContactsContract.ContactsColumns, ContactsContract.DataColumns, ContactsContract.RawContactsColumns
  {
  }
  public static final class Data
    implements ContactsContract.DataColumnsWithJoins
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractDataURI")
    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/data";

    // Constructors

    private Data(){
    }
    // Methods

    public static android.net.Uri getContactLookupUri(android.content.ContentResolver arg1, android.net.Uri arg2){
      return (android.net.Uri) null;
    }
  }
  public static final class RawContactsEntity
    implements BaseColumns, ContactsContract.DataColumns, ContactsContract.RawContactsColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractRawContactsEntityURI")
    public static final android.net.Uri CONTENT_URI = null;

    public static final android.net.Uri PROFILE_CONTENT_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/raw_contact_entity";

    public static final java.lang.String FOR_EXPORT_ONLY = "for_export_only";

    public static final java.lang.String DATA_ID = "data_id";

    // Constructors

    private RawContactsEntity(){
    }
  }
  protected static interface PhoneLookupColumns
  {
    // Fields

    public static final java.lang.String NUMBER = "number";

    public static final java.lang.String TYPE = "type";

    public static final java.lang.String LABEL = "label";

    public static final java.lang.String NORMALIZED_NUMBER = "normalized_number";

  }
  public static final class PhoneLookup
    implements ContactsContract.ContactOptionsColumns, BaseColumns, ContactsContract.PhoneLookupColumns, ContactsContract.ContactsColumns
  {
    // Fields

    public static final android.net.Uri CONTENT_FILTER_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/phone_lookup";

    // Constructors

    private PhoneLookup(){
    }
  }
  protected static interface PresenceColumns
  {
    // Fields

    public static final java.lang.String DATA_ID = "presence_data_id";

    public static final java.lang.String PROTOCOL = "protocol";

    public static final java.lang.String CUSTOM_PROTOCOL = "custom_protocol";

    public static final java.lang.String IM_HANDLE = "im_handle";

    public static final java.lang.String IM_ACCOUNT = "im_account";

  }
  public static class StatusUpdates
    implements ContactsContract.PresenceColumns, ContactsContract.StatusColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractStatusUpdatesURI")
    public static final android.net.Uri CONTENT_URI = null;

    public static final android.net.Uri PROFILE_CONTENT_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/status-update";

    public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/status-update";

    // Constructors

    private StatusUpdates(){
    }
    // Methods

    public static final int getPresenceIconResourceId(int arg1){
      return 0;
    }
    public static final int getPresencePrecedence(int arg1){
      return 0;
    }
  }
  public static final class Presence
    extends ContactsContract.StatusUpdates  {
    // Constructors

    public Presence(){
      super();
    }
  }
  public static class SearchSnippetColumns
  {
    // Fields

    public static final java.lang.String SNIPPET = "snippet";

    public static final java.lang.String SNIPPET_ARGS_PARAM_KEY = "snippet_args";

    public static final java.lang.String DEFERRED_SNIPPETING_KEY = "deferred_snippeting";

    // Constructors

    public SearchSnippetColumns(){
    }
  }
  public static final class CommonDataKinds
  {
    // Classes

    public static interface BaseTypes
    {
      // Fields

      public static final int TYPE_CUSTOM = 0;

    }
    protected static interface CommonColumns
      extends ContactsContract.CommonDataKinds.BaseTypes
    {
      // Fields

      public static final java.lang.String DATA = "data1";

      public static final java.lang.String TYPE = "data2";

      public static final java.lang.String LABEL = "data3";

    }
    public static final class StructuredName
      implements ContactsContract.DataColumnsWithJoins
    {
      // Fields

      public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/name";

      public static final java.lang.String DISPLAY_NAME = "data1";

      public static final java.lang.String GIVEN_NAME = "data2";

      public static final java.lang.String FAMILY_NAME = "data3";

      public static final java.lang.String PREFIX = "data4";

      public static final java.lang.String MIDDLE_NAME = "data5";

      public static final java.lang.String SUFFIX = "data6";

      public static final java.lang.String PHONETIC_GIVEN_NAME = "data7";

      public static final java.lang.String PHONETIC_MIDDLE_NAME = "data8";

      public static final java.lang.String PHONETIC_FAMILY_NAME = "data9";

      public static final java.lang.String FULL_NAME_STYLE = "data10";

      public static final java.lang.String PHONETIC_NAME_STYLE = "data11";

      // Constructors

      private StructuredName(){
      }
    }
    public static final class Nickname
      implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
    {
      // Fields

      public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/nickname";

      public static final int TYPE_DEFAULT = 1;

      public static final int TYPE_OTHER_NAME = 2;

      public static final int TYPE_MAIDEN_NAME = 3;

      public static final int TYPE_MAINDEN_NAME = 3;

      public static final int TYPE_SHORT_NAME = 4;

      public static final int TYPE_INITIALS = 5;

      public static final java.lang.String NAME = "data1";

      // Constructors

      private Nickname(){
      }
    }
    public static final class Phone
      implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
    {
      // Fields

      public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/phone_v2";

      public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/phone_v2";

      @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractPhoneURI")
      public static final android.net.Uri CONTENT_URI = null;

      @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractPhoneFilterURI")
      public static final android.net.Uri CONTENT_FILTER_URI = null;

      public static final int TYPE_HOME = 1;

      public static final int TYPE_MOBILE = 2;

      public static final int TYPE_WORK = 3;

      public static final int TYPE_FAX_WORK = 4;

      public static final int TYPE_FAX_HOME = 5;

      public static final int TYPE_PAGER = 6;

      public static final int TYPE_OTHER = 7;

      public static final int TYPE_CALLBACK = 8;

      public static final int TYPE_CAR = 9;

      public static final int TYPE_COMPANY_MAIN = 10;

      public static final int TYPE_ISDN = 11;

      public static final int TYPE_MAIN = 12;

      public static final int TYPE_OTHER_FAX = 13;

      public static final int TYPE_RADIO = 14;

      public static final int TYPE_TELEX = 15;

      public static final int TYPE_TTY_TDD = 16;

      public static final int TYPE_WORK_MOBILE = 17;

      public static final int TYPE_WORK_PAGER = 18;

      public static final int TYPE_ASSISTANT = 19;

      public static final int TYPE_MMS = 20;

      public static final java.lang.String NUMBER = "data1";

      public static final java.lang.String NORMALIZED_NUMBER = "data4";

      // Constructors

      private Phone(){
      }
      // Methods

      public static final java.lang.CharSequence getDisplayLabel(android.content.Context arg1, int arg2, java.lang.CharSequence arg3, java.lang.CharSequence [] arg4){
        return (java.lang.CharSequence) null;
      }
      public static final java.lang.CharSequence getDisplayLabel(android.content.Context arg1, int arg2, java.lang.CharSequence arg3){
        return (java.lang.CharSequence) null;
      }
      public static final int getTypeLabelResource(int arg1){
        return 0;
      }
      public static final java.lang.CharSequence getTypeLabel(android.content.res.Resources arg1, int arg2, java.lang.CharSequence arg3){
        return (java.lang.CharSequence) null;
      }
    }
    public static final class Email
      implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
    {
      // Fields

      public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/email_v2";

      public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/email_v2";

      @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractEmailURI")
      public static final android.net.Uri CONTENT_URI = null;

      @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractEmailLookupURI")
      public static final android.net.Uri CONTENT_LOOKUP_URI = null;

      @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractEmailFilterURI")
      public static final android.net.Uri CONTENT_FILTER_URI = null;

      public static final java.lang.String ADDRESS = "data1";

      public static final int TYPE_HOME = 1;

      public static final int TYPE_WORK = 2;

      public static final int TYPE_OTHER = 3;

      public static final int TYPE_MOBILE = 4;

      public static final java.lang.String DISPLAY_NAME = "data4";

      // Constructors

      private Email(){
      }
      // Methods

      public static final int getTypeLabelResource(int arg1){
        return 0;
      }
      public static final java.lang.CharSequence getTypeLabel(android.content.res.Resources arg1, int arg2, java.lang.CharSequence arg3){
        return (java.lang.CharSequence) null;
      }
    }
    public static final class StructuredPostal
      implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
    {
      // Fields

      public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/postal-address_v2";

      public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/postal-address_v2";

      @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractStructuredPostalURI")
      public static final android.net.Uri CONTENT_URI = null;

      public static final int TYPE_HOME = 1;

      public static final int TYPE_WORK = 2;

      public static final int TYPE_OTHER = 3;

      public static final java.lang.String FORMATTED_ADDRESS = "data1";

      public static final java.lang.String STREET = "data4";

      public static final java.lang.String POBOX = "data5";

      public static final java.lang.String NEIGHBORHOOD = "data6";

      public static final java.lang.String CITY = "data7";

      public static final java.lang.String REGION = "data8";

      public static final java.lang.String POSTCODE = "data9";

      public static final java.lang.String COUNTRY = "data10";

      // Constructors

      private StructuredPostal(){
      }
      // Methods

      public static final int getTypeLabelResource(int arg1){
        return 0;
      }
      public static final java.lang.CharSequence getTypeLabel(android.content.res.Resources arg1, int arg2, java.lang.CharSequence arg3){
        return (java.lang.CharSequence) null;
      }
    }
    public static final class Im
      implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
    {
      // Fields

      public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/im";

      public static final int TYPE_HOME = 1;

      public static final int TYPE_WORK = 2;

      public static final int TYPE_OTHER = 3;

      public static final java.lang.String PROTOCOL = "data5";

      public static final java.lang.String CUSTOM_PROTOCOL = "data6";

      public static final int PROTOCOL_CUSTOM = -1;

      public static final int PROTOCOL_AIM = 0;

      public static final int PROTOCOL_MSN = 1;

      public static final int PROTOCOL_YAHOO = 2;

      public static final int PROTOCOL_SKYPE = 3;

      public static final int PROTOCOL_QQ = 4;

      public static final int PROTOCOL_GOOGLE_TALK = 5;

      public static final int PROTOCOL_ICQ = 6;

      public static final int PROTOCOL_JABBER = 7;

      public static final int PROTOCOL_NETMEETING = 8;

      // Constructors

      private Im(){
      }
      // Methods

      public static final int getTypeLabelResource(int arg1){
        return 0;
      }
      public static final java.lang.CharSequence getTypeLabel(android.content.res.Resources arg1, int arg2, java.lang.CharSequence arg3){
        return (java.lang.CharSequence) null;
      }
      public static final int getProtocolLabelResource(int arg1){
        return 0;
      }
      public static final java.lang.CharSequence getProtocolLabel(android.content.res.Resources arg1, int arg2, java.lang.CharSequence arg3){
        return (java.lang.CharSequence) null;
      }
    }
    public static final class Organization
      implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
    {
      // Fields

      public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/organization";

      public static final int TYPE_WORK = 1;

      public static final int TYPE_OTHER = 2;

      public static final java.lang.String COMPANY = "data1";

      public static final java.lang.String TITLE = "data4";

      public static final java.lang.String DEPARTMENT = "data5";

      public static final java.lang.String JOB_DESCRIPTION = "data6";

      public static final java.lang.String SYMBOL = "data7";

      public static final java.lang.String PHONETIC_NAME = "data8";

      public static final java.lang.String OFFICE_LOCATION = "data9";

      public static final java.lang.String PHONETIC_NAME_STYLE = "data10";

      // Constructors

      private Organization(){
      }
      // Methods

      public static final int getTypeLabelResource(int arg1){
        return 0;
      }
      public static final java.lang.CharSequence getTypeLabel(android.content.res.Resources arg1, int arg2, java.lang.CharSequence arg3){
        return (java.lang.CharSequence) null;
      }
    }
    public static final class Relation
      implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
    {
      // Fields

      public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/relation";

      public static final int TYPE_ASSISTANT = 1;

      public static final int TYPE_BROTHER = 2;

      public static final int TYPE_CHILD = 3;

      public static final int TYPE_DOMESTIC_PARTNER = 4;

      public static final int TYPE_FATHER = 5;

      public static final int TYPE_FRIEND = 6;

      public static final int TYPE_MANAGER = 7;

      public static final int TYPE_MOTHER = 8;

      public static final int TYPE_PARENT = 9;

      public static final int TYPE_PARTNER = 10;

      public static final int TYPE_REFERRED_BY = 11;

      public static final int TYPE_RELATIVE = 12;

      public static final int TYPE_SISTER = 13;

      public static final int TYPE_SPOUSE = 14;

      public static final java.lang.String NAME = "data1";

      // Constructors

      private Relation(){
      }
      // Methods

      public static final int getTypeLabelResource(int arg1){
        return 0;
      }
      public static final java.lang.CharSequence getTypeLabel(android.content.res.Resources arg1, int arg2, java.lang.CharSequence arg3){
        return (java.lang.CharSequence) null;
      }
    }
    public static final class Event
      implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
    {
      // Fields

      public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_event";

      public static final int TYPE_ANNIVERSARY = 1;

      public static final int TYPE_OTHER = 2;

      public static final int TYPE_BIRTHDAY = 3;

      public static final java.lang.String START_DATE = "data1";

      // Constructors

      private Event(){
      }
      // Methods

      public static int getTypeResource(java.lang.Integer arg1){
        return 0;
      }
    }
    public static final class Photo
      implements ContactsContract.DataColumnsWithJoins
    {
      // Fields

      public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/photo";

      public static final java.lang.String PHOTO_FILE_ID = "data14";

      public static final java.lang.String PHOTO = "data15";

      // Constructors

      private Photo(){
      }
    }
    public static final class Note
      implements ContactsContract.DataColumnsWithJoins
    {
      // Fields

      public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/note";

      public static final java.lang.String NOTE = "data1";

      // Constructors

      private Note(){
      }
    }
    public static final class GroupMembership
      implements ContactsContract.DataColumnsWithJoins
    {
      // Fields

      public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/group_membership";

      public static final java.lang.String GROUP_ROW_ID = "data1";

      public static final java.lang.String GROUP_SOURCE_ID = "group_sourceid";

      // Constructors

      private GroupMembership(){
      }
    }
    public static final class Website
      implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
    {
      // Fields

      public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/website";

      public static final int TYPE_HOMEPAGE = 1;

      public static final int TYPE_BLOG = 2;

      public static final int TYPE_PROFILE = 3;

      public static final int TYPE_HOME = 4;

      public static final int TYPE_WORK = 5;

      public static final int TYPE_FTP = 6;

      public static final int TYPE_OTHER = 7;

      public static final java.lang.String URL = "data1";

      // Constructors

      private Website(){
      }
    }
    public static final class SipAddress
      implements ContactsContract.DataColumnsWithJoins, ContactsContract.CommonDataKinds.CommonColumns
    {
      // Fields

      public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/sip_address";

      public static final int TYPE_HOME = 1;

      public static final int TYPE_WORK = 2;

      public static final int TYPE_OTHER = 3;

      public static final java.lang.String SIP_ADDRESS = "data1";

      // Constructors

      private SipAddress(){
      }
      // Methods

      public static final int getTypeLabelResource(int arg1){
        return 0;
      }
      public static final java.lang.CharSequence getTypeLabel(android.content.res.Resources arg1, int arg2, java.lang.CharSequence arg3){
        return (java.lang.CharSequence) null;
      }
    }
    public static final class Identity
      implements ContactsContract.DataColumnsWithJoins
    {
      // Fields

      public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/identity";

      public static final java.lang.String IDENTITY = "data1";

      public static final java.lang.String NAMESPACE = "data2";

      // Constructors

      private Identity(){
      }
    }
    // Fields

    public static final java.lang.String PACKAGE_COMMON = "common";

    // Constructors

    private CommonDataKinds(){
    }
  }
  protected static interface GroupsColumns
  {
    // Fields

    public static final java.lang.String DATA_SET = "data_set";

    public static final java.lang.String ACCOUNT_TYPE_AND_DATA_SET = "account_type_and_data_set";

    public static final java.lang.String TITLE = "title";

    public static final java.lang.String RES_PACKAGE = "res_package";

    public static final java.lang.String TITLE_RES = "title_res";

    public static final java.lang.String NOTES = "notes";

    public static final java.lang.String SYSTEM_ID = "system_id";

    public static final java.lang.String SUMMARY_COUNT = "summ_count";

    public static final java.lang.String PARAM_RETURN_GROUP_COUNT_PER_ACCOUNT = "return_group_count_per_account";

    public static final java.lang.String SUMMARY_GROUP_COUNT_PER_ACCOUNT = "group_count_per_account";

    public static final java.lang.String SUMMARY_WITH_PHONES = "summ_phones";

    public static final java.lang.String GROUP_VISIBLE = "group_visible";

    public static final java.lang.String DELETED = "deleted";

    public static final java.lang.String SHOULD_SYNC = "should_sync";

    public static final java.lang.String AUTO_ADD = "auto_add";

    public static final java.lang.String FAVORITES = "favorites";

    public static final java.lang.String GROUP_IS_READ_ONLY = "group_is_read_only";

  }
  public static final class Groups
    implements BaseColumns, ContactsContract.SyncColumns, ContactsContract.GroupsColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractGroupsURI")
    public static final android.net.Uri CONTENT_URI = null;

    public static final android.net.Uri CONTENT_SUMMARY_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/group";

    public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/group";

    // Constructors

    private Groups(){
    }
    // Methods

    public static android.content.EntityIterator newEntityIterator(android.database.Cursor arg1){
      return (android.content.EntityIterator) null;
    }
  }
  public static final class AggregationExceptions
    implements BaseColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractAggregationExceptionsURI")
    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/aggregation_exception";

    public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/aggregation_exception";

    public static final java.lang.String TYPE = "type";

    public static final int TYPE_AUTOMATIC = 0;

    public static final int TYPE_KEEP_TOGETHER = 1;

    public static final int TYPE_KEEP_SEPARATE = 2;

    public static final java.lang.String RAW_CONTACT_ID1 = "raw_contact_id1";

    public static final java.lang.String RAW_CONTACT_ID2 = "raw_contact_id2";

    // Constructors

    private AggregationExceptions(){
    }
  }
  protected static interface SettingsColumns
  {
    // Fields

    public static final java.lang.String ACCOUNT_NAME = "account_name";

    public static final java.lang.String ACCOUNT_TYPE = "account_type";

    public static final java.lang.String DATA_SET = "data_set";

    public static final java.lang.String SHOULD_SYNC = "should_sync";

    public static final java.lang.String UNGROUPED_VISIBLE = "ungrouped_visible";

    public static final java.lang.String ANY_UNSYNCED = "any_unsynced";

    public static final java.lang.String UNGROUPED_COUNT = "summ_count";

    public static final java.lang.String UNGROUPED_WITH_PHONES = "summ_phones";

  }
  public static final class Settings
    implements ContactsContract.SettingsColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ContactsContractSettingsURI")
    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/setting";

    public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/setting";

    // Constructors

    private Settings(){
    }
  }
  public static final class ProviderStatus
  {
    // Fields

    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/provider_status";

    public static final java.lang.String STATUS = "status";

    public static final int STATUS_NORMAL = 0;

    public static final int STATUS_UPGRADING = 1;

    public static final int STATUS_UPGRADE_OUT_OF_MEMORY = 2;

    public static final int STATUS_CHANGING_LOCALE = 3;

    public static final int STATUS_NO_ACCOUNTS_NO_CONTACTS = 4;

    public static final java.lang.String DATA1 = "data1";

    // Constructors

    private ProviderStatus(){
    }
  }
  public static final class DataUsageFeedback
  {
    // Fields

    public static final android.net.Uri FEEDBACK_URI = null;

    public static final java.lang.String USAGE_TYPE = "type";

    public static final java.lang.String USAGE_TYPE_CALL = "call";

    public static final java.lang.String USAGE_TYPE_LONG_TEXT = "long_text";

    public static final java.lang.String USAGE_TYPE_SHORT_TEXT = "short_text";

    // Constructors

    public DataUsageFeedback(){
    }
  }
  public static final class QuickContact
  {
    // Fields

    public static final java.lang.String ACTION_QUICK_CONTACT = "com.android.contacts.action.QUICK_CONTACT";

    public static final java.lang.String EXTRA_TARGET_RECT = "target_rect";

    public static final java.lang.String EXTRA_MODE = "mode";

    public static final java.lang.String EXTRA_EXCLUDE_MIMES = "exclude_mimes";

    public static final int MODE_SMALL = 1;

    public static final int MODE_MEDIUM = 2;

    public static final int MODE_LARGE = 3;

    // Constructors

    public QuickContact(){
    }
    // Methods

    public static void showQuickContact(android.content.Context arg1, android.view.View arg2, android.net.Uri arg3, int arg4, java.lang.String [] arg5){
    }
    public static void showQuickContact(android.content.Context arg1, android.graphics.Rect arg2, android.net.Uri arg3, int arg4, java.lang.String [] arg5){
    }
  }
  public static final class DisplayPhoto
  {
    // Fields

    public static final android.net.Uri CONTENT_URI = null;

    public static final android.net.Uri CONTENT_MAX_DIMENSIONS_URI = null;

    public static final java.lang.String DISPLAY_MAX_DIM = "display_max_dim";

    public static final java.lang.String THUMBNAIL_MAX_DIM = "thumbnail_max_dim";

    // Constructors

    private DisplayPhoto(){
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

      public static final java.lang.String DATA = "data";

      public static final java.lang.String ACCOUNT = "com.android.contacts.extra.ACCOUNT";

      public static final java.lang.String DATA_SET = "com.android.contacts.extra.DATA_SET";

      // Constructors

      public Insert(){
      }
    }
    // Fields

    public static final java.lang.String SEARCH_SUGGESTION_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CLICKED";

    public static final java.lang.String SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED";

    public static final java.lang.String SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED";

    public static final java.lang.String ATTACH_IMAGE = "com.android.contacts.action.ATTACH_IMAGE";

    public static final java.lang.String INVITE_CONTACT = "com.android.contacts.action.INVITE_CONTACT";

    public static final java.lang.String SHOW_OR_CREATE_CONTACT = "com.android.contacts.action.SHOW_OR_CREATE_CONTACT";

    public static final java.lang.String ACTION_GET_MULTIPLE_PHONES = "com.android.contacts.action.GET_MULTIPLE_PHONES";

    public static final java.lang.String EXTRA_FORCE_CREATE = "com.android.contacts.action.FORCE_CREATE";

    public static final java.lang.String EXTRA_CREATE_DESCRIPTION = "com.android.contacts.action.CREATE_DESCRIPTION";

    public static final java.lang.String EXTRA_PHONE_URIS = "com.android.contacts.extra.PHONE_URIS";

    public static final java.lang.String EXTRA_TARGET_RECT = "target_rect";

    public static final java.lang.String EXTRA_MODE = "mode";

    public static final int MODE_SMALL = 1;

    public static final int MODE_MEDIUM = 2;

    public static final int MODE_LARGE = 3;

    public static final java.lang.String EXTRA_EXCLUDE_MIMES = "exclude_mimes";

    // Constructors

    public Intents(){
    }
  }
  // Fields

  public static final java.lang.String AUTHORITY = "com.android.contacts";

  public static final android.net.Uri AUTHORITY_URI = null;

  public static final java.lang.String CALLER_IS_SYNCADAPTER = "caller_is_syncadapter";

  public static final java.lang.String DIRECTORY_PARAM_KEY = "directory";

  public static final java.lang.String LIMIT_PARAM_KEY = "limit";

  public static final java.lang.String PRIMARY_ACCOUNT_NAME = "name_for_primary_account";

  public static final java.lang.String PRIMARY_ACCOUNT_TYPE = "type_for_primary_account";

  public static final java.lang.String STREQUENT_PHONE_ONLY = "strequent_phone_only";

  public static final java.lang.String DEFERRED_SNIPPETING = "deferred_snippeting";

  public static final java.lang.String DEFERRED_SNIPPETING_QUERY = "deferred_snippeting_query";

  // Constructors

  public ContactsContract(){
  }
  // Methods

  public static boolean isProfileId(long arg1){
    return false;
  }
  public static java.lang.String snippetize(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, char arg4, char arg5, java.lang.String arg6, int arg7){
    return (java.lang.String) null;
  }
}
