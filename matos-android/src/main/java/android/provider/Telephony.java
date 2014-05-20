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
public final class Telephony
{
  // Classes

  public static interface TextBasedSmsColumns
  {
    // Fields

    public static final java.lang.String TYPE = "type";

    public static final int MESSAGE_TYPE_ALL = 0;

    public static final int MESSAGE_TYPE_INBOX = 1;

    public static final int MESSAGE_TYPE_SENT = 2;

    public static final int MESSAGE_TYPE_DRAFT = 3;

    public static final int MESSAGE_TYPE_OUTBOX = 4;

    public static final int MESSAGE_TYPE_FAILED = 5;

    public static final int MESSAGE_TYPE_QUEUED = 6;

    public static final java.lang.String THREAD_ID = "thread_id";

    public static final java.lang.String ADDRESS = "address";

    public static final java.lang.String PERSON_ID = "person";

    public static final java.lang.String DATE = "date";

    public static final java.lang.String DATE_SENT = "date_sent";

    public static final java.lang.String READ = "read";

    public static final java.lang.String SEEN = "seen";

    public static final java.lang.String STATUS = "status";

    public static final int STATUS_NONE = -1;

    public static final int STATUS_COMPLETE = 0;

    public static final int STATUS_PENDING = 32;

    public static final int STATUS_FAILED = 64;

    public static final java.lang.String SUBJECT = "subject";

    public static final java.lang.String BODY = "body";

    public static final java.lang.String PERSON = "person";

    public static final java.lang.String PROTOCOL = "protocol";

    public static final java.lang.String REPLY_PATH_PRESENT = "reply_path_present";

    public static final java.lang.String SERVICE_CENTER = "service_center";

    public static final java.lang.String LOCKED = "locked";

    public static final java.lang.String ERROR_CODE = "error_code";

    public static final java.lang.String META_DATA = "meta_data";

  }
  public static final class Sms
    implements Telephony.TextBasedSmsColumns, BaseColumns
  {
    // Classes

    public static final class Inbox
      implements Telephony.TextBasedSmsColumns, BaseColumns
    {
      // Fields

      @com.francetelecom.rd.stubs.annotation.FieldValueImpl("SmsInboxURI")
      public static final android.net.Uri CONTENT_URI = null;

      public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";

      // Constructors

      public Inbox(){
      }
      // Methods

      @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Telephony.Sms.Inbox.addMessage", pos = {-1, 2, 3, 4}, report = "-")
      public static android.net.Uri addMessage(android.content.ContentResolver arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.Long arg5, boolean arg6){
        return (android.net.Uri) null;
      }
    }
    public static final class Sent
      implements Telephony.TextBasedSmsColumns, BaseColumns
    {
      // Fields

      @com.francetelecom.rd.stubs.annotation.FieldValueImpl("SmsSentURI")
      public static final android.net.Uri CONTENT_URI = null;

      public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";

      // Constructors

      public Sent(){
      }
      // Methods

      @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Telephony.Sms.Sent.addMessage", pos = {-1, 2, 3, 4}, report = "-")
      public static android.net.Uri addMessage(android.content.ContentResolver arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.Long arg5){
        return (android.net.Uri) null;
      }
    }
    public static final class Draft
      implements Telephony.TextBasedSmsColumns, BaseColumns
    {
      // Fields

      @com.francetelecom.rd.stubs.annotation.FieldValueImpl("SmsDraftURI")
      public static final android.net.Uri CONTENT_URI = null;

      public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";

      // Constructors

      public Draft(){
      }
      // Methods

      public static boolean saveMessage(android.content.ContentResolver arg1, android.net.Uri arg2, java.lang.String arg3){
        return false;
      }
      @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Telephony.Sms.Draft.addMessage", pos = {-1, 2, 3, 4}, report = "-")
      public static android.net.Uri addMessage(android.content.ContentResolver arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.Long arg5){
        return (android.net.Uri) null;
      }
    }
    public static final class Outbox
      implements Telephony.TextBasedSmsColumns, BaseColumns
    {
      // Fields

      @com.francetelecom.rd.stubs.annotation.FieldValueImpl("SmsOutboxURI")
      public static final android.net.Uri CONTENT_URI = null;

      public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";

      // Constructors

      public Outbox(){
      }
      // Methods

      @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Telephony.Sms.Outbox.addMessage", pos = {-1, 2, 3, 4}, report = "-")
      public static android.net.Uri addMessage(android.content.ContentResolver arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.Long arg5, boolean arg6, long arg7){
        return (android.net.Uri) null;
      }
    }
    public static final class Conversations
      implements Telephony.TextBasedSmsColumns, BaseColumns
    {
      // Fields

      @com.francetelecom.rd.stubs.annotation.FieldValueImpl("SmsConversationsURI")
      public static final android.net.Uri CONTENT_URI = null;

      public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";

      public static final java.lang.String SNIPPET = "snippet";

      public static final java.lang.String MESSAGE_COUNT = "msg_count";

      // Constructors

      public Conversations(){
      }
    }
    public static final class Intents
    {
      // Fields

      public static final int RESULT_SMS_HANDLED = 1;

      public static final int RESULT_SMS_GENERIC_ERROR = 2;

      public static final int RESULT_SMS_OUT_OF_MEMORY = 3;

      public static final int RESULT_SMS_UNSUPPORTED = 4;

      public static final java.lang.String SMS_RECEIVED_ACTION = "android.provider.Telephony.SMS_RECEIVED";

      public static final java.lang.String DATA_SMS_RECEIVED_ACTION = "android.intent.action.DATA_SMS_RECEIVED";

      public static final java.lang.String WAP_PUSH_RECEIVED_ACTION = "android.provider.Telephony.WAP_PUSH_RECEIVED";

      public static final java.lang.String SMS_CB_RECEIVED_ACTION = "android.provider.Telephony.SMS_CB_RECEIVED";

      public static final java.lang.String SMS_EMERGENCY_CB_RECEIVED_ACTION = "android.provider.Telephony.SMS_EMERGENCY_CB_RECEIVED";

      public static final java.lang.String SIM_FULL_ACTION = "android.provider.Telephony.SIM_FULL";

      public static final java.lang.String SMS_REJECTED_ACTION = "android.provider.Telephony.SMS_REJECTED";

      // Constructors

      public Intents(){
      }
      // Methods

      public static android.telephony.SmsMessage [] getMessagesFromIntent(android.content.Intent arg1){
        return (android.telephony.SmsMessage []) null;
      }
    }
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("SmsURI")
    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";

    // Constructors

    public Sms(){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Telephony.Sms.query-1", pos = {1, 2}, report = "-")
    public static final android.database.Cursor query(android.content.ContentResolver arg1, java.lang.String [] arg2){
      return (android.database.Cursor) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Telephony.Sms.query-2", pos = {1, 2}, report = "-")
    public static final android.database.Cursor query(android.content.ContentResolver arg1, java.lang.String [] arg2, java.lang.String arg3, java.lang.String arg4){
      return (android.database.Cursor) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Telephony.Sms.addMessageToUri-1", pos = {-1, 2, 3, 4, 5}, report = "-")
    public static android.net.Uri addMessageToUri(android.content.ContentResolver arg1, android.net.Uri arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.Long arg6, boolean arg7, boolean arg8){
      return (android.net.Uri) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Telephony.Sms.addMessageToUri-2", pos = {-1, 2, 3, 4, 5}, report = "-")
    public static android.net.Uri addMessageToUri(android.content.ContentResolver arg1, android.net.Uri arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.Long arg6, boolean arg7, boolean arg8, long arg9){
      return (android.net.Uri) null;
    }
    public static boolean moveMessageToFolder(android.content.Context arg1, android.net.Uri arg2, int arg3, int arg4){
      return false;
    }
    public static boolean isOutgoingFolder(int arg1){
      return false;
    }
  }
  public static interface BaseMmsColumns
    extends BaseColumns
  {
    // Fields

    public static final int MESSAGE_BOX_ALL = 0;

    public static final int MESSAGE_BOX_INBOX = 1;

    public static final int MESSAGE_BOX_SENT = 2;

    public static final int MESSAGE_BOX_DRAFTS = 3;

    public static final int MESSAGE_BOX_OUTBOX = 4;

    public static final java.lang.String DATE = "date";

    public static final java.lang.String DATE_SENT = "date_sent";

    public static final java.lang.String MESSAGE_BOX = "msg_box";

    public static final java.lang.String READ = "read";

    public static final java.lang.String SEEN = "seen";

    public static final java.lang.String MESSAGE_ID = "m_id";

    public static final java.lang.String SUBJECT = "sub";

    public static final java.lang.String SUBJECT_CHARSET = "sub_cs";

    public static final java.lang.String CONTENT_TYPE = "ct_t";

    public static final java.lang.String CONTENT_LOCATION = "ct_l";

    public static final java.lang.String FROM = "from";

    public static final java.lang.String TO = "to";

    public static final java.lang.String CC = "cc";

    public static final java.lang.String BCC = "bcc";

    public static final java.lang.String EXPIRY = "exp";

    public static final java.lang.String MESSAGE_CLASS = "m_cls";

    public static final java.lang.String MESSAGE_TYPE = "m_type";

    public static final java.lang.String MMS_VERSION = "v";

    public static final java.lang.String MESSAGE_SIZE = "m_size";

    public static final java.lang.String PRIORITY = "pri";

    public static final java.lang.String READ_REPORT = "rr";

    public static final java.lang.String REPORT_ALLOWED = "rpt_a";

    public static final java.lang.String RESPONSE_STATUS = "resp_st";

    public static final java.lang.String STATUS = "st";

    public static final java.lang.String TRANSACTION_ID = "tr_id";

    public static final java.lang.String RETRIEVE_STATUS = "retr_st";

    public static final java.lang.String RETRIEVE_TEXT = "retr_txt";

    public static final java.lang.String RETRIEVE_TEXT_CHARSET = "retr_txt_cs";

    public static final java.lang.String READ_STATUS = "read_status";

    public static final java.lang.String CONTENT_CLASS = "ct_cls";

    public static final java.lang.String DELIVERY_REPORT = "d_rpt";

    public static final java.lang.String DELIVERY_TIME_TOKEN = "d_tm_tok";

    public static final java.lang.String DELIVERY_TIME = "d_tm";

    public static final java.lang.String RESPONSE_TEXT = "resp_txt";

    public static final java.lang.String SENDER_VISIBILITY = "s_vis";

    public static final java.lang.String REPLY_CHARGING = "r_chg";

    public static final java.lang.String REPLY_CHARGING_DEADLINE_TOKEN = "r_chg_dl_tok";

    public static final java.lang.String REPLY_CHARGING_DEADLINE = "r_chg_dl";

    public static final java.lang.String REPLY_CHARGING_ID = "r_chg_id";

    public static final java.lang.String REPLY_CHARGING_SIZE = "r_chg_sz";

    public static final java.lang.String PREVIOUSLY_SENT_BY = "p_s_by";

    public static final java.lang.String PREVIOUSLY_SENT_DATE = "p_s_d";

    public static final java.lang.String STORE = "store";

    public static final java.lang.String MM_STATE = "mm_st";

    public static final java.lang.String MM_FLAGS_TOKEN = "mm_flg_tok";

    public static final java.lang.String MM_FLAGS = "mm_flg";

    public static final java.lang.String STORE_STATUS = "store_st";

    public static final java.lang.String STORE_STATUS_TEXT = "store_st_txt";

    public static final java.lang.String STORED = "stored";

    public static final java.lang.String TOTALS = "totals";

    public static final java.lang.String MBOX_TOTALS = "mb_t";

    public static final java.lang.String MBOX_TOTALS_TOKEN = "mb_t_tok";

    public static final java.lang.String QUOTAS = "qt";

    public static final java.lang.String MBOX_QUOTAS = "mb_qt";

    public static final java.lang.String MBOX_QUOTAS_TOKEN = "mb_qt_tok";

    public static final java.lang.String MESSAGE_COUNT = "m_cnt";

    public static final java.lang.String START = "start";

    public static final java.lang.String DISTRIBUTION_INDICATOR = "d_ind";

    public static final java.lang.String ELEMENT_DESCRIPTOR = "e_des";

    public static final java.lang.String LIMIT = "limit";

    public static final java.lang.String RECOMMENDED_RETRIEVAL_MODE = "r_r_mod";

    public static final java.lang.String RECOMMENDED_RETRIEVAL_MODE_TEXT = "r_r_mod_txt";

    public static final java.lang.String STATUS_TEXT = "st_txt";

    public static final java.lang.String APPLIC_ID = "apl_id";

    public static final java.lang.String REPLY_APPLIC_ID = "r_apl_id";

    public static final java.lang.String AUX_APPLIC_ID = "aux_apl_id";

    public static final java.lang.String DRM_CONTENT = "drm_c";

    public static final java.lang.String ADAPTATION_ALLOWED = "adp_a";

    public static final java.lang.String REPLACE_ID = "repl_id";

    public static final java.lang.String CANCEL_ID = "cl_id";

    public static final java.lang.String CANCEL_STATUS = "cl_st";

    public static final java.lang.String THREAD_ID = "thread_id";

    public static final java.lang.String LOCKED = "locked";

    public static final java.lang.String META_DATA = "meta_data";

  }
  public static interface CanonicalAddressesColumns
    extends BaseColumns
  {
    // Fields

    public static final java.lang.String ADDRESS = "address";

  }
  public static interface ThreadsColumns
    extends BaseColumns
  {
    // Fields

    public static final java.lang.String DATE = "date";

    public static final java.lang.String RECIPIENT_IDS = "recipient_ids";

    public static final java.lang.String MESSAGE_COUNT = "message_count";

    public static final java.lang.String READ = "read";

    public static final java.lang.String SNIPPET = "snippet";

    public static final java.lang.String SNIPPET_CHARSET = "snippet_cs";

    public static final java.lang.String TYPE = "type";

    public static final java.lang.String ERROR = "error";

    public static final java.lang.String HAS_ATTACHMENT = "has_attachment";

  }
  public static final class Threads
    implements Telephony.ThreadsColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ThreadsURI")
    public static final android.net.Uri CONTENT_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("ObsoleteThreadsURI")
    public static final android.net.Uri OBSOLETE_THREADS_URI = null;

    public static final int COMMON_THREAD = 0;

    public static final int BROADCAST_THREAD = 1;

    // Constructors

    private Threads(){
    }
    // Methods

    public static long getOrCreateThreadId(android.content.Context arg1, java.lang.String arg2){
      return 0l;
    }
    public static long getOrCreateThreadId(android.content.Context arg1, java.util.Set<java.lang.String> arg2){
      return 0l;
    }
  }
  public static final class Mms
    implements Telephony.BaseMmsColumns
  {
    // Classes

    public static final class Inbox
      implements Telephony.BaseMmsColumns
    {
      // Fields

      @com.francetelecom.rd.stubs.annotation.FieldValueImpl("MmsInboxURI")
      public static final android.net.Uri CONTENT_URI = null;

      public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";

      // Constructors

      public Inbox(){
      }
    }
    public static final class Sent
      implements Telephony.BaseMmsColumns
    {
      // Fields

      @com.francetelecom.rd.stubs.annotation.FieldValueImpl("MmsSentURI")
      public static final android.net.Uri CONTENT_URI = null;

      public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";

      // Constructors

      public Sent(){
      }
    }
    public static final class Draft
      implements Telephony.BaseMmsColumns
    {
      // Fields

      @com.francetelecom.rd.stubs.annotation.FieldValueImpl("MmsDraftURI")
      public static final android.net.Uri CONTENT_URI = null;

      public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";

      // Constructors

      public Draft(){
      }
    }
    public static final class Outbox
      implements Telephony.BaseMmsColumns
    {
      // Fields

      @com.francetelecom.rd.stubs.annotation.FieldValueImpl("MmsOutboxURI")
      public static final android.net.Uri CONTENT_URI = null;

      public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";

      // Constructors

      public Outbox(){
      }
    }
    public static final class Addr
      implements BaseColumns
    {
      // Fields

      public static final java.lang.String MSG_ID = "msg_id";

      public static final java.lang.String CONTACT_ID = "contact_id";

      public static final java.lang.String ADDRESS = "address";

      public static final java.lang.String TYPE = "type";

      public static final java.lang.String CHARSET = "charset";

      // Constructors

      public Addr(){
      }
    }
    public static final class Part
      implements BaseColumns
    {
      // Fields

      public static final java.lang.String MSG_ID = "mid";

      public static final java.lang.String SEQ = "seq";

      public static final java.lang.String CONTENT_TYPE = "ct";

      public static final java.lang.String NAME = "name";

      public static final java.lang.String CHARSET = "chset";

      public static final java.lang.String FILENAME = "fn";

      public static final java.lang.String CONTENT_DISPOSITION = "cd";

      public static final java.lang.String CONTENT_ID = "cid";

      public static final java.lang.String CONTENT_LOCATION = "cl";

      public static final java.lang.String CT_START = "ctt_s";

      public static final java.lang.String CT_TYPE = "ctt_t";

      public static final java.lang.String _DATA = "_data";

      public static final java.lang.String TEXT = "text";

      // Constructors

      public Part(){
      }
    }
    public static final class Rate
    {
      // Fields

      @com.francetelecom.rd.stubs.annotation.FieldValueImpl("MmsRateURI")
      public static final android.net.Uri CONTENT_URI = null;

      public static final java.lang.String SENT_TIME = "sent_time";

      // Constructors

      public Rate(){
      }
    }
    public static final class Intents
    {
      // Fields

      public static final java.lang.String EXTRA_CONTENTS = "contents";

      public static final java.lang.String EXTRA_TYPES = "types";

      public static final java.lang.String EXTRA_CC = "cc";

      public static final java.lang.String EXTRA_BCC = "bcc";

      public static final java.lang.String EXTRA_SUBJECT = "subject";

      public static final java.lang.String CONTENT_CHANGED_ACTION = "android.intent.action.CONTENT_CHANGED";

      public static final java.lang.String DELETED_CONTENTS = "deleted_contents";

      // Constructors

      private Intents(){
      }
    }
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("MmsURI")
    public static final android.net.Uri CONTENT_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("MmsReportRequestURI")
    public static final android.net.Uri REPORT_REQUEST_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("MmsReportStatusURI")
    public static final android.net.Uri REPORT_STATUS_URI = null;

    public static final java.lang.String DEFAULT_SORT_ORDER = "date DESC";

    public static final java.util.regex.Pattern NAME_ADDR_EMAIL_PATTERN = null;

    public static final java.util.regex.Pattern QUOTED_STRING_PATTERN = null;

    // Constructors

    public Mms(){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Mms.query-1", pos = {1, 2}, report = "-")
    public static final android.database.Cursor query(android.content.ContentResolver arg1, java.lang.String [] arg2){
      return (android.database.Cursor) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Mms.query-2", pos = {1, 2}, report = "-")
    public static final android.database.Cursor query(android.content.ContentResolver arg1, java.lang.String [] arg2, java.lang.String arg3, java.lang.String arg4){
      return (android.database.Cursor) null;
    }
    public static boolean isEmailAddress(java.lang.String arg1){
      return false;
    }
    public static final java.lang.String getMessageBoxName(int arg1){
      return (java.lang.String) null;
    }
    public static java.lang.String extractAddrSpec(java.lang.String arg1){
      return (java.lang.String) null;
    }
    public static boolean isPhoneNumber(java.lang.String arg1){
      return false;
    }
  }
  public static final class MmsSms
    implements BaseColumns
  {
    // Classes

    public static final class PendingMessages
      implements BaseColumns
    {
      // Fields

      @com.francetelecom.rd.stubs.annotation.FieldValueImpl("PendingMessagesURI")
      public static final android.net.Uri CONTENT_URI = null;

      public static final java.lang.String PROTO_TYPE = "proto_type";

      public static final java.lang.String MSG_ID = "msg_id";

      public static final java.lang.String MSG_TYPE = "msg_type";

      public static final java.lang.String ERROR_TYPE = "err_type";

      public static final java.lang.String ERROR_CODE = "err_code";

      public static final java.lang.String RETRY_INDEX = "retry_index";

      public static final java.lang.String DUE_TIME = "due_time";

      public static final java.lang.String LAST_TRY = "last_try";

      // Constructors

      public PendingMessages(){
      }
    }
    public static final class WordsTable
    {
      // Fields

      public static final java.lang.String ID = "_id";

      public static final java.lang.String SOURCE_ROW_ID = "source_id";

      public static final java.lang.String TABLE_ID = "table_to_use";

      public static final java.lang.String INDEXED_TEXT = "index_text";

      // Constructors

      public WordsTable(){
      }
    }
    // Fields

    public static final java.lang.String TYPE_DISCRIMINATOR_COLUMN = "transport_type";

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("MmsSmsURI")
    public static final android.net.Uri CONTENT_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("MmsSmsConversationsURI")
    public static final android.net.Uri CONTENT_CONVERSATIONS_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("MmsSmsFilterByPhoneURI")
    public static final android.net.Uri CONTENT_FILTER_BYPHONE_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("MmsSmsUndeliveredURI")
    public static final android.net.Uri CONTENT_UNDELIVERED_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("MmsSmsDraftURI")
    public static final android.net.Uri CONTENT_DRAFT_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("MmsSmsLockedURI")
    public static final android.net.Uri CONTENT_LOCKED_URI = null;

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("MmsSmsSearchURI")
    public static final android.net.Uri SEARCH_URI = null;

    public static final int SMS_PROTO = 0;

    public static final int MMS_PROTO = 1;

    public static final int NO_ERROR = 0;

    public static final int ERR_TYPE_GENERIC = 1;

    public static final int ERR_TYPE_SMS_PROTO_TRANSIENT = 2;

    public static final int ERR_TYPE_MMS_PROTO_TRANSIENT = 3;

    public static final int ERR_TYPE_TRANSPORT_FAILURE = 4;

    public static final int ERR_TYPE_GENERIC_PERMANENT = 10;

    public static final int ERR_TYPE_SMS_PROTO_PERMANENT = 11;

    public static final int ERR_TYPE_MMS_PROTO_PERMANENT = 12;

    // Constructors

    public MmsSms(){
    }
  }
  public static final class Carriers
    implements BaseColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("CarriersURI")
    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String DEFAULT_SORT_ORDER = "name ASC";

    public static final java.lang.String NAME = "name";

    public static final java.lang.String APN = "apn";

    public static final java.lang.String PROXY = "proxy";

    public static final java.lang.String PORT = "port";

    public static final java.lang.String MMSPROXY = "mmsproxy";

    public static final java.lang.String MMSPORT = "mmsport";

    public static final java.lang.String SERVER = "server";

    public static final java.lang.String USER = "user";

    public static final java.lang.String PASSWORD = "password";

    public static final java.lang.String MMSC = "mmsc";

    public static final java.lang.String MCC = "mcc";

    public static final java.lang.String MNC = "mnc";

    public static final java.lang.String NUMERIC = "numeric";

    public static final java.lang.String AUTH_TYPE = "authtype";

    public static final java.lang.String TYPE = "type";

    public static final java.lang.String INACTIVE_TIMER = "inactivetimer";

    public static final java.lang.String ENABLED = "enabled";

    public static final java.lang.String CLASS = "class";

    public static final java.lang.String PROTOCOL = "protocol";

    public static final java.lang.String ROAMING_PROTOCOL = "roaming_protocol";

    public static final java.lang.String CURRENT = "current";

    public static final java.lang.String CARRIER_ENABLED = "carrier_enabled";

    public static final java.lang.String BEARER = "bearer";

    // Constructors

    public Carriers(){
    }
  }
  public static final class Intents
  {
    // Fields

    public static final java.lang.String SECRET_CODE_ACTION = "android.provider.Telephony.SECRET_CODE";

    public static final java.lang.String SPN_STRINGS_UPDATED_ACTION = "android.provider.Telephony.SPN_STRINGS_UPDATED";

    public static final java.lang.String EXTRA_SHOW_PLMN = "showPlmn";

    public static final java.lang.String EXTRA_PLMN = "plmn";

    public static final java.lang.String EXTRA_SHOW_SPN = "showSpn";

    public static final java.lang.String EXTRA_SPN = "spn";

    // Constructors

    private Intents(){
    }
  }
  // Constructors

  public Telephony(){
  }
}
