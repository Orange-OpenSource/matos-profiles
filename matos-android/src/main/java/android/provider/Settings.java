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
public final class Settings
{
  // Classes

  public static class SettingNotFoundException
    extends android.util.AndroidException  {
    // Constructors

    public SettingNotFoundException(java.lang.String arg1){
      super();
    }
  }
  public static class NameValueTable
    implements BaseColumns
  {
    // Fields

    public static final java.lang.String NAME = "name";

    public static final java.lang.String VALUE = "value";

    // Constructors

    public NameValueTable(){
    }
    // Methods

    protected static boolean putString(android.content.ContentResolver arg1, android.net.Uri arg2, java.lang.String arg3, java.lang.String arg4){
      return false;
    }
    public static android.net.Uri getUriFor(android.net.Uri arg1, java.lang.String arg2){
      return (android.net.Uri) null;
    }
  }
  public static final class System
    extends Settings.NameValueTable  {
    // Fields

    public static final java.lang.String SYS_PROP_SETTING_VERSION = "sys.settings_system_version";

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("SystemURI")
    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String STAY_ON_WHILE_PLUGGED_IN = "stay_on_while_plugged_in";

    public static final java.lang.String END_BUTTON_BEHAVIOR = "end_button_behavior";

    public static final int END_BUTTON_BEHAVIOR_HOME = 1;

    public static final int END_BUTTON_BEHAVIOR_SLEEP = 2;

    public static final int END_BUTTON_BEHAVIOR_DEFAULT = 2;

    public static final java.lang.String ADVANCED_SETTINGS = "advanced_settings";

    public static final int ADVANCED_SETTINGS_DEFAULT = 0;

    public static final java.lang.String AIRPLANE_MODE_ON = "airplane_mode_on";

    public static final java.lang.String RADIO_BLUETOOTH = "bluetooth";

    public static final java.lang.String RADIO_WIFI = "wifi";

    public static final java.lang.String RADIO_CELL = "cell";

    public static final java.lang.String RADIO_NFC = "nfc";

    public static final java.lang.String AIRPLANE_MODE_RADIOS = "airplane_mode_radios";

    public static final java.lang.String AIRPLANE_MODE_TOGGLEABLE_RADIOS = "airplane_mode_toggleable_radios";

    public static final java.lang.String WIFI_SLEEP_POLICY = "wifi_sleep_policy";

    public static final int WIFI_SLEEP_POLICY_DEFAULT = 0;

    public static final int WIFI_SLEEP_POLICY_NEVER_WHILE_PLUGGED = 1;

    public static final int WIFI_SLEEP_POLICY_NEVER = 2;

    public static final java.lang.String WIFI_USE_STATIC_IP = "wifi_use_static_ip";

    public static final java.lang.String WIFI_STATIC_IP = "wifi_static_ip";

    public static final java.lang.String WIFI_STATIC_GATEWAY = "wifi_static_gateway";

    public static final java.lang.String WIFI_STATIC_NETMASK = "wifi_static_netmask";

    public static final java.lang.String WIFI_STATIC_DNS1 = "wifi_static_dns1";

    public static final java.lang.String WIFI_STATIC_DNS2 = "wifi_static_dns2";

    public static final java.lang.String BLUETOOTH_DISCOVERABILITY = "bluetooth_discoverability";

    public static final java.lang.String BLUETOOTH_DISCOVERABILITY_TIMEOUT = "bluetooth_discoverability_timeout";

    public static final java.lang.String LOCK_PATTERN_ENABLED = "lock_pattern_autolock";

    public static final java.lang.String LOCK_PATTERN_VISIBLE = "lock_pattern_visible_pattern";

    public static final java.lang.String LOCK_PATTERN_TACTILE_FEEDBACK_ENABLED = "lock_pattern_tactile_feedback_enabled";

    public static final java.lang.String NEXT_ALARM_FORMATTED = "next_alarm_formatted";

    public static final java.lang.String FONT_SCALE = "font_scale";

    public static final java.lang.String DEBUG_APP = "debug_app";

    public static final java.lang.String WAIT_FOR_DEBUGGER = "wait_for_debugger";

    public static final java.lang.String DIM_SCREEN = "dim_screen";

    public static final java.lang.String SCREEN_OFF_TIMEOUT = "screen_off_timeout";

    public static final java.lang.String COMPATIBILITY_MODE = "compatibility_mode";

    public static final java.lang.String SCREEN_BRIGHTNESS = "screen_brightness";

    public static final java.lang.String SCREEN_BRIGHTNESS_MODE = "screen_brightness_mode";

    public static final int SCREEN_BRIGHTNESS_MODE_MANUAL = 0;

    public static final int SCREEN_BRIGHTNESS_MODE_AUTOMATIC = 1;

    public static final java.lang.String SHOW_PROCESSES = "show_processes";

    public static final java.lang.String ALWAYS_FINISH_ACTIVITIES = "always_finish_activities";

    public static final java.lang.String MODE_RINGER = "mode_ringer";

    public static final java.lang.String MODE_RINGER_STREAMS_AFFECTED = "mode_ringer_streams_affected";

    public static final java.lang.String MUTE_STREAMS_AFFECTED = "mute_streams_affected";

    public static final java.lang.String VIBRATE_ON = "vibrate_on";

    public static final java.lang.String VOLUME_RING = "volume_ring";

    public static final java.lang.String VOLUME_SYSTEM = "volume_system";

    public static final java.lang.String VOLUME_VOICE = "volume_voice";

    public static final java.lang.String VOLUME_MUSIC = "volume_music";

    public static final java.lang.String VOLUME_ALARM = "volume_alarm";

    public static final java.lang.String VOLUME_NOTIFICATION = "volume_notification";

    public static final java.lang.String VOLUME_BLUETOOTH_SCO = "volume_bluetooth_sco";

    public static final java.lang.String NOTIFICATIONS_USE_RING_VOLUME = "notifications_use_ring_volume";

    public static final java.lang.String VIBRATE_IN_SILENT = "vibrate_in_silent";

    public static final java.lang.String [] VOLUME_SETTINGS = null;

    public static final java.lang.String APPEND_FOR_LAST_AUDIBLE = "_last_audible";

    public static final java.lang.String RINGTONE = "ringtone";

    public static final android.net.Uri DEFAULT_RINGTONE_URI = null;

    public static final java.lang.String NOTIFICATION_SOUND = "notification_sound";

    public static final android.net.Uri DEFAULT_NOTIFICATION_URI = null;

    public static final java.lang.String ALARM_ALERT = "alarm_alert";

    public static final android.net.Uri DEFAULT_ALARM_ALERT_URI = null;

    public static final java.lang.String MEDIA_BUTTON_RECEIVER = "media_button_receiver";

    public static final java.lang.String TEXT_AUTO_REPLACE = "auto_replace";

    public static final java.lang.String TEXT_AUTO_CAPS = "auto_caps";

    public static final java.lang.String TEXT_AUTO_PUNCTUATE = "auto_punctuate";

    public static final java.lang.String TEXT_SHOW_PASSWORD = "show_password";

    public static final java.lang.String SHOW_GTALK_SERVICE_STATUS = "SHOW_GTALK_SERVICE_STATUS";

    public static final java.lang.String WALLPAPER_ACTIVITY = "wallpaper_activity";

    public static final java.lang.String AUTO_TIME = "auto_time";

    public static final java.lang.String AUTO_TIME_ZONE = "auto_time_zone";

    public static final java.lang.String TIME_12_24 = "time_12_24";

    public static final java.lang.String DATE_FORMAT = "date_format";

    public static final java.lang.String SETUP_WIZARD_HAS_RUN = "setup_wizard_has_run";

    public static final java.lang.String WINDOW_ANIMATION_SCALE = "window_animation_scale";

    public static final java.lang.String TRANSITION_ANIMATION_SCALE = "transition_animation_scale";

    public static final java.lang.String FANCY_IME_ANIMATIONS = "fancy_ime_animations";

    public static final java.lang.String ACCELEROMETER_ROTATION = "accelerometer_rotation";

    public static final java.lang.String USER_ROTATION = "user_rotation";

    public static final java.lang.String DTMF_TONE_WHEN_DIALING = "dtmf_tone";

    public static final java.lang.String DTMF_TONE_TYPE_WHEN_DIALING = "dtmf_tone_type";

    public static final java.lang.String EMERGENCY_TONE = "emergency_tone";

    public static final java.lang.String CALL_AUTO_RETRY = "call_auto_retry";

    public static final java.lang.String HEARING_AID = "hearing_aid";

    public static final java.lang.String TTY_MODE = "tty_mode";

    public static final java.lang.String SOUND_EFFECTS_ENABLED = "sound_effects_enabled";

    public static final java.lang.String HAPTIC_FEEDBACK_ENABLED = "haptic_feedback_enabled";

    public static final java.lang.String SHOW_WEB_SUGGESTIONS = "show_web_suggestions";

    public static final java.lang.String NOTIFICATION_LIGHT_PULSE = "notification_light_pulse";

    public static final java.lang.String POINTER_LOCATION = "pointer_location";

    public static final java.lang.String SHOW_TOUCHES = "show_touches";

    public static final java.lang.String WINDOW_ORIENTATION_LISTENER_LOG = "window_orientation_listener_log";

    public static final java.lang.String POWER_SOUNDS_ENABLED = "power_sounds_enabled";

    public static final java.lang.String DOCK_SOUNDS_ENABLED = "dock_sounds_enabled";

    public static final java.lang.String LOCKSCREEN_SOUNDS_ENABLED = "lockscreen_sounds_enabled";

    public static final java.lang.String LOW_BATTERY_SOUND = "low_battery_sound";

    public static final java.lang.String DESK_DOCK_SOUND = "desk_dock_sound";

    public static final java.lang.String DESK_UNDOCK_SOUND = "desk_undock_sound";

    public static final java.lang.String CAR_DOCK_SOUND = "car_dock_sound";

    public static final java.lang.String CAR_UNDOCK_SOUND = "car_undock_sound";

    public static final java.lang.String LOCK_SOUND = "lock_sound";

    public static final java.lang.String UNLOCK_SOUND = "unlock_sound";

    public static final java.lang.String SIP_RECEIVE_CALLS = "sip_receive_calls";

    public static final java.lang.String SIP_CALL_OPTIONS = "sip_call_options";

    public static final java.lang.String SIP_ALWAYS = "SIP_ALWAYS";

    public static final java.lang.String SIP_ADDRESS_ONLY = "SIP_ADDRESS_ONLY";

    public static final java.lang.String SIP_ASK_ME_EACH_TIME = "SIP_ASK_ME_EACH_TIME";

    public static final java.lang.String POINTER_SPEED = "pointer_speed";

    public static final java.lang.String [] SETTINGS_TO_BACKUP = null;

    public static final java.lang.String ADB_ENABLED = "adb_enabled";

    public static final java.lang.String ANDROID_ID = "android_id";

    public static final java.lang.String BLUETOOTH_ON = "bluetooth_on";

    public static final java.lang.String DATA_ROAMING = "data_roaming";

    public static final java.lang.String DEVICE_PROVISIONED = "device_provisioned";

    public static final java.lang.String HTTP_PROXY = "http_proxy";

    public static final java.lang.String INSTALL_NON_MARKET_APPS = "install_non_market_apps";

    public static final java.lang.String LOCATION_PROVIDERS_ALLOWED = "location_providers_allowed";

    public static final java.lang.String LOGGING_ID = "logging_id";

    public static final java.lang.String NETWORK_PREFERENCE = "network_preference";

    public static final java.lang.String PARENTAL_CONTROL_ENABLED = "parental_control_enabled";

    public static final java.lang.String PARENTAL_CONTROL_LAST_UPDATE = "parental_control_last_update";

    public static final java.lang.String PARENTAL_CONTROL_REDIRECT_URL = "parental_control_redirect_url";

    public static final java.lang.String SETTINGS_CLASSNAME = "settings_classname";

    public static final java.lang.String USB_MASS_STORAGE_ENABLED = "usb_mass_storage_enabled";

    public static final java.lang.String USE_GOOGLE_MAIL = "use_google_mail";

    public static final java.lang.String WIFI_MAX_DHCP_RETRY_COUNT = "wifi_max_dhcp_retry_count";

    public static final java.lang.String WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS = "wifi_mobile_data_transition_wakelock_timeout_ms";

    public static final java.lang.String WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON = "wifi_networks_available_notification_on";

    public static final java.lang.String WIFI_NETWORKS_AVAILABLE_REPEAT_DELAY = "wifi_networks_available_repeat_delay";

    public static final java.lang.String WIFI_NUM_OPEN_NETWORKS_KEPT = "wifi_num_open_networks_kept";

    public static final java.lang.String WIFI_ON = "wifi_on";

    public static final java.lang.String WIFI_WATCHDOG_ACCEPTABLE_PACKET_LOSS_PERCENTAGE = "wifi_watchdog_acceptable_packet_loss_percentage";

    public static final java.lang.String WIFI_WATCHDOG_AP_COUNT = "wifi_watchdog_ap_count";

    public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_DELAY_MS = "wifi_watchdog_background_check_delay_ms";

    public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_ENABLED = "wifi_watchdog_background_check_enabled";

    public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_TIMEOUT_MS = "wifi_watchdog_background_check_timeout_ms";

    public static final java.lang.String WIFI_WATCHDOG_INITIAL_IGNORED_PING_COUNT = "wifi_watchdog_initial_ignored_ping_count";

    public static final java.lang.String WIFI_WATCHDOG_MAX_AP_CHECKS = "wifi_watchdog_max_ap_checks";

    public static final java.lang.String WIFI_WATCHDOG_ON = "wifi_watchdog_on";

    public static final java.lang.String WIFI_WATCHDOG_PING_COUNT = "wifi_watchdog_ping_count";

    public static final java.lang.String WIFI_WATCHDOG_PING_DELAY_MS = "wifi_watchdog_ping_delay_ms";

    public static final java.lang.String WIFI_WATCHDOG_PING_TIMEOUT_MS = "wifi_watchdog_ping_timeout_ms";

    // Constructors

    public System(){
      super();
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.System.getInt-1", pos = 2, report = "-")
    public static int getInt(android.content.ContentResolver arg1, java.lang.String arg2, int arg3){
      return 0;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.System.getInt-2", pos = 2, report = "-")
    public static int getInt(android.content.ContentResolver arg1, java.lang.String arg2) throws Settings.SettingNotFoundException{
      return 0;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.System.putInt", pos = {2, 3}, report = "-")
    public static boolean putInt(android.content.ContentResolver arg1, java.lang.String arg2, int arg3){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.System.getLong-1", pos = 2, report = "-")
    public static long getLong(android.content.ContentResolver arg1, java.lang.String arg2, long arg3){
      return 0l;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.System.getLong-2", pos = 2, report = "-")
    public static long getLong(android.content.ContentResolver arg1, java.lang.String arg2) throws Settings.SettingNotFoundException{
      return 0l;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.System.putLong", pos = {2, 3}, report = "-")
    public static boolean putLong(android.content.ContentResolver arg1, java.lang.String arg2, long arg3){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.System.getFloat-1", pos = 2, report = "-")
    public static float getFloat(android.content.ContentResolver arg1, java.lang.String arg2, float arg3){
      return 0.0f;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.System.getFloat-2", pos = 2, report = "-")
    public static float getFloat(android.content.ContentResolver arg1, java.lang.String arg2) throws Settings.SettingNotFoundException{
      return 0.0f;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.System.putFloat", pos = {2, 3}, report = "-")
    public static boolean putFloat(android.content.ContentResolver arg1, java.lang.String arg2, float arg3){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.System.getString", pos = 2, report = "-")
    public static synchronized java.lang.String getString(android.content.ContentResolver arg1, java.lang.String arg2){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.System.putString", pos = {2, 3}, report = "-")
    public static boolean putString(android.content.ContentResolver arg1, java.lang.String arg2, java.lang.String arg3){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.System.getUriFor", pos = {1, -1}, report = "-")
    public static android.net.Uri getUriFor(java.lang.String arg1){
      return (android.net.Uri) null;
    }
    @com.francetelecom.rd.stubs.annotation.UseRule(value = "Settings.System.getConfiguration", report = "-")
    public static void getConfiguration(android.content.ContentResolver arg1, android.content.res.Configuration arg2){
    }
    @com.francetelecom.rd.stubs.annotation.UseRule(value = "Settings.System.putConfiguration", report = "-")
    public static boolean putConfiguration(android.content.ContentResolver arg1, android.content.res.Configuration arg2){
      return false;
    }
    public static void clearConfiguration(android.content.res.Configuration arg1){
    }
    public static boolean hasInterestingConfigurationChanges(int arg1){
      return false;
    }
    public static boolean getShowGTalkServiceStatus(android.content.ContentResolver arg1){
      return false;
    }
    public static void setShowGTalkServiceStatus(android.content.ContentResolver arg1, boolean arg2){
    }
  }
  public static final class Secure
    extends Settings.NameValueTable  {
    // Fields

    public static final java.lang.String SYS_PROP_SETTING_VERSION = "sys.settings_secure_version";

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("SecureURI")
    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String ADB_ENABLED = "adb_enabled";

    public static final java.lang.String ALLOW_MOCK_LOCATION = "mock_location";

    public static final java.lang.String ANDROID_ID = "android_id";

    public static final java.lang.String BLUETOOTH_ON = "bluetooth_on";

    public static final java.lang.String DATA_ROAMING = "data_roaming";

    public static final java.lang.String DEFAULT_INPUT_METHOD = "default_input_method";

    public static final java.lang.String SELECTED_INPUT_METHOD_SUBTYPE = "selected_input_method_subtype";

    public static final java.lang.String INPUT_METHODS_SUBTYPE_HISTORY = "input_methods_subtype_history";

    public static final java.lang.String INPUT_METHOD_SELECTOR_VISIBILITY = "input_method_selector_visibility";

    public static final java.lang.String DEVICE_PROVISIONED = "device_provisioned";

    public static final java.lang.String ENABLED_INPUT_METHODS = "enabled_input_methods";

    public static final java.lang.String DISABLED_SYSTEM_INPUT_METHODS = "disabled_system_input_methods";

    public static final java.lang.String HTTP_PROXY = "http_proxy";

    public static final java.lang.String GLOBAL_HTTP_PROXY_HOST = "global_http_proxy_host";

    public static final java.lang.String GLOBAL_HTTP_PROXY_PORT = "global_http_proxy_port";

    public static final java.lang.String GLOBAL_HTTP_PROXY_EXCLUSION_LIST = "global_http_proxy_exclusion_list";

    public static final java.lang.String SET_GLOBAL_HTTP_PROXY = "set_global_http_proxy";

    public static final java.lang.String DEFAULT_DNS_SERVER = "default_dns_server";

    public static final java.lang.String INSTALL_NON_MARKET_APPS = "install_non_market_apps";

    public static final java.lang.String LOCATION_PROVIDERS_ALLOWED = "location_providers_allowed";

    public static final java.lang.String LOCK_PATTERN_ENABLED = "lock_pattern_autolock";

    public static final java.lang.String LOCK_PATTERN_VISIBLE = "lock_pattern_visible_pattern";

    public static final java.lang.String LOCK_PATTERN_TACTILE_FEEDBACK_ENABLED = "lock_pattern_tactile_feedback_enabled";

    public static final java.lang.String LOCK_SCREEN_LOCK_AFTER_TIMEOUT = "lock_screen_lock_after_timeout";

    public static final java.lang.String LOCK_SCREEN_OWNER_INFO = "lock_screen_owner_info";

    public static final java.lang.String LOCK_SCREEN_OWNER_INFO_ENABLED = "lock_screen_owner_info_enabled";

    public static final java.lang.String DISPLAY_SIZE_FORCED = "display_size_forced";

    public static final java.lang.String ASSISTED_GPS_ENABLED = "assisted_gps_enabled";

    public static final java.lang.String LOGGING_ID = "logging_id";

    public static final java.lang.String NETWORK_PREFERENCE = "network_preference";

    public static final java.lang.String TETHER_SUPPORTED = "tether_supported";

    public static final java.lang.String TETHER_DUN_REQUIRED = "tether_dun_required";

    public static final java.lang.String TETHER_DUN_APN = "tether_dun_apn";

    public static final java.lang.String PARENTAL_CONTROL_ENABLED = "parental_control_enabled";

    public static final java.lang.String PARENTAL_CONTROL_LAST_UPDATE = "parental_control_last_update";

    public static final java.lang.String PARENTAL_CONTROL_REDIRECT_URL = "parental_control_redirect_url";

    public static final java.lang.String SAMPLING_PROFILER_MS = "sampling_profiler_ms";

    public static final java.lang.String SETTINGS_CLASSNAME = "settings_classname";

    public static final java.lang.String USB_MASS_STORAGE_ENABLED = "usb_mass_storage_enabled";

    public static final java.lang.String USE_GOOGLE_MAIL = "use_google_mail";

    public static final java.lang.String ACCESSIBILITY_ENABLED = "accessibility_enabled";

    public static final java.lang.String TOUCH_EXPLORATION_ENABLED = "touch_exploration_enabled";

    public static final java.lang.String ENABLED_ACCESSIBILITY_SERVICES = "enabled_accessibility_services";

    public static final java.lang.String ACCESSIBILITY_SCRIPT_INJECTION = "accessibility_script_injection";

    public static final java.lang.String ACCESSIBILITY_WEB_CONTENT_KEY_BINDINGS = "accessibility_web_content_key_bindings";

    public static final java.lang.String LONG_PRESS_TIMEOUT = "long_press_timeout";

    public static final java.lang.String TTS_USE_DEFAULTS = "tts_use_defaults";

    public static final java.lang.String TTS_DEFAULT_RATE = "tts_default_rate";

    public static final java.lang.String TTS_DEFAULT_PITCH = "tts_default_pitch";

    public static final java.lang.String TTS_DEFAULT_SYNTH = "tts_default_synth";

    public static final java.lang.String TTS_DEFAULT_LANG = "tts_default_lang";

    public static final java.lang.String TTS_DEFAULT_COUNTRY = "tts_default_country";

    public static final java.lang.String TTS_DEFAULT_VARIANT = "tts_default_variant";

    public static final java.lang.String TTS_DEFAULT_LOCALE = "tts_default_locale";

    public static final java.lang.String TTS_ENABLED_PLUGINS = "tts_enabled_plugins";

    public static final java.lang.String WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON = "wifi_networks_available_notification_on";

    public static final java.lang.String WIFI_NETWORKS_AVAILABLE_REPEAT_DELAY = "wifi_networks_available_repeat_delay";

    public static final java.lang.String WIFI_COUNTRY_CODE = "wifi_country_code";

    public static final java.lang.String WIFI_NUM_OPEN_NETWORKS_KEPT = "wifi_num_open_networks_kept";

    public static final java.lang.String WIFI_ON = "wifi_on";

    public static final java.lang.String WIFI_SAVED_STATE = "wifi_saved_state";

    public static final java.lang.String WIFI_AP_SSID = "wifi_ap_ssid";

    public static final java.lang.String WIFI_AP_SECURITY = "wifi_ap_security";

    public static final java.lang.String WIFI_AP_PASSWD = "wifi_ap_passwd";

    public static final java.lang.String WIFI_WATCHDOG_ACCEPTABLE_PACKET_LOSS_PERCENTAGE = "wifi_watchdog_acceptable_packet_loss_percentage";

    public static final java.lang.String WIFI_WATCHDOG_AP_COUNT = "wifi_watchdog_ap_count";

    public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_DELAY_MS = "wifi_watchdog_background_check_delay_ms";

    public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_ENABLED = "wifi_watchdog_background_check_enabled";

    public static final java.lang.String WIFI_WATCHDOG_BACKGROUND_CHECK_TIMEOUT_MS = "wifi_watchdog_background_check_timeout_ms";

    public static final java.lang.String WIFI_WATCHDOG_INITIAL_IGNORED_PING_COUNT = "wifi_watchdog_initial_ignored_ping_count";

    public static final java.lang.String WIFI_WATCHDOG_MAX_AP_CHECKS = "wifi_watchdog_max_ap_checks";

    public static final java.lang.String WIFI_WATCHDOG_ON = "wifi_watchdog_on";

    public static final java.lang.String WIFI_WATCHDOG_WATCH_LIST = "wifi_watchdog_watch_list";

    public static final java.lang.String WIFI_WATCHDOG_PING_COUNT = "wifi_watchdog_ping_count";

    public static final java.lang.String WIFI_WATCHDOG_PING_DELAY_MS = "wifi_watchdog_ping_delay_ms";

    public static final java.lang.String WIFI_WATCHDOG_PING_TIMEOUT_MS = "wifi_watchdog_ping_timeout_ms";

    public static final java.lang.String WIFI_WATCHDOG_DNS_CHECK_SHORT_INTERVAL_MS = "wifi_watchdog_dns_check_short_interval_ms";

    public static final java.lang.String WIFI_WATCHDOG_DNS_CHECK_LONG_INTERVAL_MS = "wifi_watchdog_dns_check_long_interval_ms";

    public static final java.lang.String WIFI_WATCHDOG_WALLED_GARDEN_INTERVAL_MS = "wifi_watchdog_walled_garden_interval_ms";

    public static final java.lang.String WIFI_WATCHDOG_MAX_SSID_BLACKLISTS = "wifi_watchdog_max_ssid_blacklists";

    public static final java.lang.String WIFI_WATCHDOG_NUM_DNS_PINGS = "wifi_watchdog_num_dns_pings";

    public static final java.lang.String WIFI_WATCHDOG_MIN_DNS_RESPONSES = "wifi_watchdog_min_dns_responses";

    public static final java.lang.String WIFI_WATCHDOG_DNS_PING_TIMEOUT_MS = "wifi_watchdog_dns_ping_timeout_ms";

    public static final java.lang.String WIFI_WATCHDOG_BLACKLIST_FOLLOWUP_INTERVAL_MS = "wifi_watchdog_blacklist_followup_interval_ms";

    public static final java.lang.String WIFI_WATCHDOG_WALLED_GARDEN_TEST_ENABLED = "wifi_watchdog_walled_garden_test_enabled";

    public static final java.lang.String WIFI_WATCHDOG_WALLED_GARDEN_URL = "wifi_watchdog_walled_garden_url";

    public static final java.lang.String WIFI_WATCHDOG_SHOW_DISABLED_NETWORK_POPUP = "wifi_watchdog_show_disabled_network_popup";

    public static final java.lang.String WIFI_MAX_DHCP_RETRY_COUNT = "wifi_max_dhcp_retry_count";

    public static final java.lang.String WIFI_FREQUENCY_BAND = "wifi_frequency_band";

    public static final java.lang.String WIFI_MOBILE_DATA_TRANSITION_WAKELOCK_TIMEOUT_MS = "wifi_mobile_data_transition_wakelock_timeout_ms";

    public static final java.lang.String BACKGROUND_DATA = "background_data";

    public static final java.lang.String ALLOWED_GEOLOCATION_ORIGINS = "allowed_geolocation_origins";

    public static final java.lang.String MOBILE_DATA = "mobile_data";

    public static final java.lang.String CDMA_ROAMING_MODE = "roaming_settings";

    public static final java.lang.String CDMA_SUBSCRIPTION_MODE = "subscription_mode";

    public static final java.lang.String PREFERRED_NETWORK_MODE = "preferred_network_mode";

    public static final java.lang.String PREFERRED_TTY_MODE = "preferred_tty_mode";

    public static final java.lang.String CDMA_CELL_BROADCAST_SMS = "cdma_cell_broadcast_sms";

    public static final java.lang.String PREFERRED_CDMA_SUBSCRIPTION = "preferred_cdma_subscription";

    public static final java.lang.String ENHANCED_VOICE_PRIVACY_ENABLED = "enhanced_voice_privacy_enabled";

    public static final java.lang.String TTY_MODE_ENABLED = "tty_mode_enabled";

    public static final java.lang.String CONNECTIVITY_CHANGE_DELAY = "connectivity_change_delay";

    public static final int CONNECTIVITY_CHANGE_DELAY_DEFAULT = 3000;

    public static final java.lang.String BACKUP_ENABLED = "backup_enabled";

    public static final java.lang.String BACKUP_AUTO_RESTORE = "backup_auto_restore";

    public static final java.lang.String BACKUP_PROVISIONED = "backup_provisioned";

    public static final java.lang.String BACKUP_TRANSPORT = "backup_transport";

    public static final java.lang.String LAST_SETUP_SHOWN = "last_setup_shown";

    public static final java.lang.String MEMCHECK_INTERVAL = "memcheck_interval";

    public static final java.lang.String MEMCHECK_LOG_REALTIME_INTERVAL = "memcheck_log_realtime_interval";

    public static final java.lang.String MEMCHECK_SYSTEM_ENABLED = "memcheck_system_enabled";

    public static final java.lang.String MEMCHECK_SYSTEM_SOFT_THRESHOLD = "memcheck_system_soft";

    public static final java.lang.String MEMCHECK_SYSTEM_HARD_THRESHOLD = "memcheck_system_hard";

    public static final java.lang.String MEMCHECK_PHONE_SOFT_THRESHOLD = "memcheck_phone_soft";

    public static final java.lang.String MEMCHECK_PHONE_HARD_THRESHOLD = "memcheck_phone_hard";

    public static final java.lang.String MEMCHECK_PHONE_ENABLED = "memcheck_phone_enabled";

    public static final java.lang.String MEMCHECK_EXEC_START_TIME = "memcheck_exec_start_time";

    public static final java.lang.String MEMCHECK_EXEC_END_TIME = "memcheck_exec_end_time";

    public static final java.lang.String MEMCHECK_MIN_SCREEN_OFF = "memcheck_min_screen_off";

    public static final java.lang.String MEMCHECK_MIN_ALARM = "memcheck_min_alarm";

    public static final java.lang.String MEMCHECK_RECHECK_INTERVAL = "memcheck_recheck_interval";

    public static final java.lang.String REBOOT_INTERVAL = "reboot_interval";

    public static final java.lang.String REBOOT_START_TIME = "reboot_start_time";

    public static final java.lang.String REBOOT_WINDOW = "reboot_window";

    public static final java.lang.String BATTERY_DISCHARGE_DURATION_THRESHOLD = "battery_discharge_duration_threshold";

    public static final java.lang.String BATTERY_DISCHARGE_THRESHOLD = "battery_discharge_threshold";

    public static final java.lang.String SEND_ACTION_APP_ERROR = "send_action_app_error";

    public static final java.lang.String WTF_IS_FATAL = "wtf_is_fatal";

    public static final java.lang.String DROPBOX_AGE_SECONDS = "dropbox_age_seconds";

    public static final java.lang.String DROPBOX_MAX_FILES = "dropbox_max_files";

    public static final java.lang.String DROPBOX_QUOTA_KB = "dropbox_quota_kb";

    public static final java.lang.String DROPBOX_QUOTA_PERCENT = "dropbox_quota_percent";

    public static final java.lang.String DROPBOX_RESERVE_PERCENT = "dropbox_reserve_percent";

    public static final java.lang.String DROPBOX_TAG_PREFIX = "dropbox:";

    public static final java.lang.String ERROR_LOGCAT_PREFIX = "logcat_for_";

    public static final java.lang.String SHORT_KEYLIGHT_DELAY_MS = "short_keylight_delay_ms";

    public static final java.lang.String SYS_FREE_STORAGE_LOG_INTERVAL = "sys_free_storage_log_interval";

    public static final java.lang.String DISK_FREE_CHANGE_REPORTING_THRESHOLD = "disk_free_change_reporting_threshold";

    public static final java.lang.String SYS_STORAGE_THRESHOLD_PERCENTAGE = "sys_storage_threshold_percentage";

    public static final java.lang.String SYS_STORAGE_THRESHOLD_MAX_BYTES = "sys_storage_threshold_max_bytes";

    public static final java.lang.String SYS_STORAGE_FULL_THRESHOLD_BYTES = "sys_storage_full_threshold_bytes";

    public static final java.lang.String WIFI_IDLE_MS = "wifi_idle_ms";

    public static final java.lang.String WIFI_FRAMEWORK_SCAN_INTERVAL_MS = "wifi_framework_scan_interval_ms";

    public static final java.lang.String WIFI_SUPPLICANT_SCAN_INTERVAL_MS = "wifi_supplicant_scan_interval_ms";

    public static final java.lang.String PDP_WATCHDOG_POLL_INTERVAL_MS = "pdp_watchdog_poll_interval_ms";

    public static final java.lang.String PDP_WATCHDOG_LONG_POLL_INTERVAL_MS = "pdp_watchdog_long_poll_interval_ms";

    public static final java.lang.String PDP_WATCHDOG_ERROR_POLL_INTERVAL_MS = "pdp_watchdog_error_poll_interval_ms";

    public static final java.lang.String PDP_WATCHDOG_TRIGGER_PACKET_COUNT = "pdp_watchdog_trigger_packet_count";

    public static final java.lang.String PDP_WATCHDOG_ERROR_POLL_COUNT = "pdp_watchdog_error_poll_count";

    public static final java.lang.String PDP_WATCHDOG_MAX_PDP_RESET_FAIL_COUNT = "pdp_watchdog_max_pdp_reset_fail_count";

    public static final java.lang.String GPRS_REGISTER_CHECK_PERIOD_MS = "gprs_register_check_period_ms";

    public static final java.lang.String NITZ_UPDATE_SPACING = "nitz_update_spacing";

    public static final java.lang.String NITZ_UPDATE_DIFF = "nitz_update_diff";

    public static final java.lang.String SYNC_MAX_RETRY_DELAY_IN_SECONDS = "sync_max_retry_delay_in_seconds";

    public static final java.lang.String SMS_OUTGOING_CHECK_INTERVAL_MS = "sms_outgoing_check_interval_ms";

    public static final java.lang.String SMS_OUTGOING_CHECK_MAX_COUNT = "sms_outgoing_check_max_count";

    public static final java.lang.String SEARCH_GLOBAL_SEARCH_ACTIVITY = "search_global_search_activity";

    public static final java.lang.String SEARCH_NUM_PROMOTED_SOURCES = "search_num_promoted_sources";

    public static final java.lang.String SEARCH_MAX_RESULTS_TO_DISPLAY = "search_max_results_to_display";

    public static final java.lang.String SEARCH_MAX_RESULTS_PER_SOURCE = "search_max_results_per_source";

    public static final java.lang.String SEARCH_WEB_RESULTS_OVERRIDE_LIMIT = "search_web_results_override_limit";

    public static final java.lang.String SEARCH_PROMOTED_SOURCE_DEADLINE_MILLIS = "search_promoted_source_deadline_millis";

    public static final java.lang.String SEARCH_SOURCE_TIMEOUT_MILLIS = "search_source_timeout_millis";

    public static final java.lang.String SEARCH_PREFILL_MILLIS = "search_prefill_millis";

    public static final java.lang.String SEARCH_MAX_STAT_AGE_MILLIS = "search_max_stat_age_millis";

    public static final java.lang.String SEARCH_MAX_SOURCE_EVENT_AGE_MILLIS = "search_max_source_event_age_millis";

    public static final java.lang.String SEARCH_MIN_IMPRESSIONS_FOR_SOURCE_RANKING = "search_min_impressions_for_source_ranking";

    public static final java.lang.String SEARCH_MIN_CLICKS_FOR_SOURCE_RANKING = "search_min_clicks_for_source_ranking";

    public static final java.lang.String SEARCH_MAX_SHORTCUTS_RETURNED = "search_max_shortcuts_returned";

    public static final java.lang.String SEARCH_QUERY_THREAD_CORE_POOL_SIZE = "search_query_thread_core_pool_size";

    public static final java.lang.String SEARCH_QUERY_THREAD_MAX_POOL_SIZE = "search_query_thread_max_pool_size";

    public static final java.lang.String SEARCH_SHORTCUT_REFRESH_CORE_POOL_SIZE = "search_shortcut_refresh_core_pool_size";

    public static final java.lang.String SEARCH_SHORTCUT_REFRESH_MAX_POOL_SIZE = "search_shortcut_refresh_max_pool_size";

    public static final java.lang.String SEARCH_THREAD_KEEPALIVE_SECONDS = "search_thread_keepalive_seconds";

    public static final java.lang.String SEARCH_PER_SOURCE_CONCURRENT_QUERY_LIMIT = "search_per_source_concurrent_query_limit";

    public static final java.lang.String MOUNT_PLAY_NOTIFICATION_SND = "mount_play_not_snd";

    public static final java.lang.String MOUNT_UMS_AUTOSTART = "mount_ums_autostart";

    public static final java.lang.String MOUNT_UMS_PROMPT = "mount_ums_prompt";

    public static final java.lang.String MOUNT_UMS_NOTIFY_ENABLED = "mount_ums_notify_enabled";

    public static final java.lang.String ANR_SHOW_BACKGROUND = "anr_show_background";

    public static final java.lang.String VOICE_RECOGNITION_SERVICE = "voice_recognition_service";

    public static final java.lang.String SELECTED_SPELL_CHECKER = "selected_spell_checker";

    public static final java.lang.String SELECTED_SPELL_CHECKER_SUBTYPE = "selected_spell_checker_subtype";

    public static final java.lang.String SPELL_CHECKER_ENABLED = "spell_checker_enabled";

    public static final java.lang.String INCALL_POWER_BUTTON_BEHAVIOR = "incall_power_button_behavior";

    public static final int INCALL_POWER_BUTTON_BEHAVIOR_SCREEN_OFF = 1;

    public static final int INCALL_POWER_BUTTON_BEHAVIOR_HANGUP = 2;

    public static final int INCALL_POWER_BUTTON_BEHAVIOR_DEFAULT = 1;

    public static final java.lang.String UI_NIGHT_MODE = "ui_night_mode";

    public static final java.lang.String SET_INSTALL_LOCATION = "set_install_location";

    public static final java.lang.String DEFAULT_INSTALL_LOCATION = "default_install_location";

    public static final java.lang.String THROTTLE_POLLING_SEC = "throttle_polling_sec";

    public static final java.lang.String THROTTLE_THRESHOLD_BYTES = "throttle_threshold_bytes";

    public static final java.lang.String THROTTLE_VALUE_KBITSPS = "throttle_value_kbitsps";

    public static final java.lang.String THROTTLE_RESET_DAY = "throttle_reset_day";

    public static final java.lang.String THROTTLE_NOTIFICATION_TYPE = "throttle_notification_type";

    public static final java.lang.String THROTTLE_HELP_URI = "throttle_help_uri";

    public static final java.lang.String THROTTLE_MAX_NTP_CACHE_AGE_SEC = "throttle_max_ntp_cache_age_sec";

    public static final java.lang.String DOWNLOAD_MAX_BYTES_OVER_MOBILE = "download_manager_max_bytes_over_mobile";

    public static final java.lang.String DOWNLOAD_RECOMMENDED_MAX_BYTES_OVER_MOBILE = "download_manager_recommended_max_bytes_over_mobile";

    public static final java.lang.String INET_CONDITION_DEBOUNCE_UP_DELAY = "inet_condition_debounce_up_delay";

    public static final java.lang.String INET_CONDITION_DEBOUNCE_DOWN_DELAY = "inet_condition_debounce_down_delay";

    public static final java.lang.String SETUP_PREPAID_DATA_SERVICE_URL = "setup_prepaid_data_service_url";

    public static final java.lang.String SETUP_PREPAID_DETECTION_TARGET_URL = "setup_prepaid_detection_target_url";

    public static final java.lang.String SETUP_PREPAID_DETECTION_REDIR_HOST = "setup_prepaid_detection_redir_host";

    public static final java.lang.String DREAM_COMPONENT = "dream_component";

    public static final java.lang.String DREAM_TIMEOUT = "dream_timeout";

    public static final java.lang.String NETSTATS_ENABLED = "netstats_enabled";

    public static final java.lang.String NETSTATS_POLL_INTERVAL = "netstats_poll_interval";

    public static final java.lang.String NETSTATS_PERSIST_THRESHOLD = "netstats_persist_threshold";

    public static final java.lang.String NETSTATS_NETWORK_BUCKET_DURATION = "netstats_network_bucket_duration";

    public static final java.lang.String NETSTATS_NETWORK_MAX_HISTORY = "netstats_network_max_history";

    public static final java.lang.String NETSTATS_UID_BUCKET_DURATION = "netstats_uid_bucket_duration";

    public static final java.lang.String NETSTATS_UID_MAX_HISTORY = "netstats_uid_max_history";

    public static final java.lang.String NETSTATS_TAG_MAX_HISTORY = "netstats_tag_max_history";

    public static final java.lang.String NTP_SERVER = "ntp_server";

    public static final java.lang.String NTP_TIMEOUT = "ntp_timeout";

    public static final java.lang.String WEB_AUTOFILL_QUERY_URL = "web_autofill_query_url";

    public static final java.lang.String PACKAGE_VERIFIER_ENABLE = "verifier_enable";

    public static final java.lang.String PACKAGE_VERIFIER_TIMEOUT = "verifier_timeout";

    public static final java.lang.String CONTACTS_PREAUTH_URI_EXPIRATION = "contacts_preauth_uri_expiration";

    public static final java.lang.String [] SETTINGS_TO_BACKUP = null;

    // Constructors

    public Secure(){
      super();
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.Secure.getInt-1", pos = 2, report = "-")
    public static int getInt(android.content.ContentResolver arg1, java.lang.String arg2, int arg3){
      return 0;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.Secure.getInt-2", pos = 2, report = "-")
    public static int getInt(android.content.ContentResolver arg1, java.lang.String arg2) throws Settings.SettingNotFoundException{
      return 0;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.Secure.putInt", pos = {2, 3}, report = "-")
    public static boolean putInt(android.content.ContentResolver arg1, java.lang.String arg2, int arg3){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.Secure.getLong-1", pos = 2, report = "-")
    public static long getLong(android.content.ContentResolver arg1, java.lang.String arg2, long arg3){
      return 0l;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.Secure.getLong-2", pos = 2, report = "-")
    public static long getLong(android.content.ContentResolver arg1, java.lang.String arg2) throws Settings.SettingNotFoundException{
      return 0l;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.Secure.putLong", pos = {2, 3}, report = "-")
    public static boolean putLong(android.content.ContentResolver arg1, java.lang.String arg2, long arg3){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.Secure.getFloat-1", pos = 2, report = "-")
    public static float getFloat(android.content.ContentResolver arg1, java.lang.String arg2, float arg3){
      return 0.0f;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.Secure.getFloat-2", pos = 2, report = "-")
    public static float getFloat(android.content.ContentResolver arg1, java.lang.String arg2) throws Settings.SettingNotFoundException{
      return 0.0f;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.Secure.putFloat", pos = {2, 3}, report = "-")
    public static boolean putFloat(android.content.ContentResolver arg1, java.lang.String arg2, float arg3){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.Secure.getString", pos = 2, report = "-")
    public static synchronized java.lang.String getString(android.content.ContentResolver arg1, java.lang.String arg2){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.Secure.putString", pos = 2, report = "-")
    public static boolean putString(android.content.ContentResolver arg1, java.lang.String arg2, java.lang.String arg3){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.Secure.getUriFor", pos = {1, -1}, report = "-")
    public static android.net.Uri getUriFor(java.lang.String arg1){
      return (android.net.Uri) null;
    }
    public static final java.lang.String getBluetoothInputDevicePriorityKey(java.lang.String arg1){
      return (java.lang.String) null;
    }
    public static final java.lang.String getBluetoothHeadsetPriorityKey(java.lang.String arg1){
      return (java.lang.String) null;
    }
    public static final java.lang.String getBluetoothA2dpSinkPriorityKey(java.lang.String arg1){
      return (java.lang.String) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.Secure.isLocationProviderEnabled", pos = 2, report = "-")
    public static final boolean isLocationProviderEnabled(android.content.ContentResolver arg1, java.lang.String arg2){
      return false;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Settings.Secure.setLocationProviderEnabled", pos = 2, report = "-")
    public static final void setLocationProviderEnabled(android.content.ContentResolver arg1, java.lang.String arg2, boolean arg3){
    }
  }
  public static final class Bookmarks
    implements BaseColumns
  {
    // Fields

    @com.francetelecom.rd.stubs.annotation.FieldValueImpl("BookmarksURI")
    public static final android.net.Uri CONTENT_URI = null;

    public static final java.lang.String ID = "_id";

    public static final java.lang.String TITLE = "title";

    public static final java.lang.String FOLDER = "folder";

    public static final java.lang.String INTENT = "intent";

    public static final java.lang.String SHORTCUT = "shortcut";

    public static final java.lang.String ORDERING = "ordering";

    // Constructors

    public Bookmarks(){
    }
    // Methods

    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "Bookmarks.add", pos = -1, report = "-")
    public static android.net.Uri add(android.content.ContentResolver arg1, android.content.Intent arg2, java.lang.String arg3, java.lang.String arg4, char arg5, int arg6){
      return (android.net.Uri) null;
    }
    public static java.lang.CharSequence getTitle(android.content.Context arg1, android.database.Cursor arg2){
      return (java.lang.CharSequence) null;
    }
    @com.francetelecom.rd.stubs.annotation.ArgsRule(value = "getIntentForShortcut", pos = -1, report = "-")
    public static android.content.Intent getIntentForShortcut(android.content.ContentResolver arg1, char arg2){
      return (android.content.Intent) null;
    }
    public static java.lang.CharSequence getLabelForFolder(android.content.res.Resources arg1, java.lang.String arg2){
      return (java.lang.CharSequence) null;
    }
  }
  // Fields

  public static final java.lang.String ACTION_SETTINGS = "android.settings.SETTINGS";

  public static final java.lang.String ACTION_APN_SETTINGS = "android.settings.APN_SETTINGS";

  public static final java.lang.String ACTION_LOCATION_SOURCE_SETTINGS = "android.settings.LOCATION_SOURCE_SETTINGS";

  public static final java.lang.String ACTION_WIRELESS_SETTINGS = "android.settings.WIRELESS_SETTINGS";

  public static final java.lang.String ACTION_AIRPLANE_MODE_SETTINGS = "android.settings.AIRPLANE_MODE_SETTINGS";

  public static final java.lang.String ACTION_ACCESSIBILITY_SETTINGS = "android.settings.ACCESSIBILITY_SETTINGS";

  public static final java.lang.String ACTION_SECURITY_SETTINGS = "android.settings.SECURITY_SETTINGS";

  public static final java.lang.String ACTION_PRIVACY_SETTINGS = "android.settings.PRIVACY_SETTINGS";

  public static final java.lang.String ACTION_WIFI_SETTINGS = "android.settings.WIFI_SETTINGS";

  public static final java.lang.String ACTION_WIFI_IP_SETTINGS = "android.settings.WIFI_IP_SETTINGS";

  public static final java.lang.String ACTION_BLUETOOTH_SETTINGS = "android.settings.BLUETOOTH_SETTINGS";

  public static final java.lang.String ACTION_DATE_SETTINGS = "android.settings.DATE_SETTINGS";

  public static final java.lang.String ACTION_SOUND_SETTINGS = "android.settings.SOUND_SETTINGS";

  public static final java.lang.String ACTION_DISPLAY_SETTINGS = "android.settings.DISPLAY_SETTINGS";

  public static final java.lang.String ACTION_LOCALE_SETTINGS = "android.settings.LOCALE_SETTINGS";

  public static final java.lang.String ACTION_INPUT_METHOD_SETTINGS = "android.settings.INPUT_METHOD_SETTINGS";

  public static final java.lang.String ACTION_INPUT_METHOD_SUBTYPE_SETTINGS = "android.settings.INPUT_METHOD_SUBTYPE_SETTINGS";

  public static final java.lang.String ACTION_SHOW_INPUT_METHOD_PICKER = "android.settings.SHOW_INPUT_METHOD_PICKER";

  public static final java.lang.String ACTION_USER_DICTIONARY_SETTINGS = "android.settings.USER_DICTIONARY_SETTINGS";

  public static final java.lang.String ACTION_USER_DICTIONARY_INSERT = "com.android.settings.USER_DICTIONARY_INSERT";

  public static final java.lang.String ACTION_APPLICATION_SETTINGS = "android.settings.APPLICATION_SETTINGS";

  public static final java.lang.String ACTION_APPLICATION_DEVELOPMENT_SETTINGS = "android.settings.APPLICATION_DEVELOPMENT_SETTINGS";

  public static final java.lang.String ACTION_QUICK_LAUNCH_SETTINGS = "android.settings.QUICK_LAUNCH_SETTINGS";

  public static final java.lang.String ACTION_MANAGE_APPLICATIONS_SETTINGS = "android.settings.MANAGE_APPLICATIONS_SETTINGS";

  public static final java.lang.String ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS = "android.settings.MANAGE_ALL_APPLICATIONS_SETTINGS";

  public static final java.lang.String ACTION_APPLICATION_DETAILS_SETTINGS = "android.settings.APPLICATION_DETAILS_SETTINGS";

  public static final java.lang.String ACTION_SYSTEM_UPDATE_SETTINGS = "android.settings.SYSTEM_UPDATE_SETTINGS";

  public static final java.lang.String ACTION_SYNC_SETTINGS = "android.settings.SYNC_SETTINGS";

  public static final java.lang.String ACTION_ADD_ACCOUNT = "android.settings.ADD_ACCOUNT_SETTINGS";

  public static final java.lang.String ACTION_NETWORK_OPERATOR_SETTINGS = "android.settings.NETWORK_OPERATOR_SETTINGS";

  public static final java.lang.String ACTION_DATA_ROAMING_SETTINGS = "android.settings.DATA_ROAMING_SETTINGS";

  public static final java.lang.String ACTION_INTERNAL_STORAGE_SETTINGS = "android.settings.INTERNAL_STORAGE_SETTINGS";

  public static final java.lang.String ACTION_MEMORY_CARD_SETTINGS = "android.settings.MEMORY_CARD_SETTINGS";

  public static final java.lang.String ACTION_SEARCH_SETTINGS = "android.search.action.SEARCH_SETTINGS";

  public static final java.lang.String ACTION_DEVICE_INFO_SETTINGS = "android.settings.DEVICE_INFO_SETTINGS";

  public static final java.lang.String ACTION_NFCSHARING_SETTINGS = "android.settings.NFCSHARING_SETTINGS";

  public static final java.lang.String CALL_METHOD_GET_SYSTEM = "GET_system";

  public static final java.lang.String CALL_METHOD_GET_SECURE = "GET_secure";

  public static final java.lang.String EXTRA_AUTHORITIES = "authorities";

  public static final java.lang.String EXTRA_INPUT_METHOD_ID = "input_method_id";

  public static final java.lang.String AUTHORITY = "settings";

  // Constructors

  public Settings(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.UseRule(value = "Settings.getGTalkDeviceId", report = "-")
  public static java.lang.String getGTalkDeviceId(long arg1){
    return (java.lang.String) null;
  }
}
