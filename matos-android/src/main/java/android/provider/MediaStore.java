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
public final class MediaStore
{
  // Classes

  public static interface MediaColumns
    extends BaseColumns
  {
    // Fields

    public static final java.lang.String DATA = "_data";

    public static final java.lang.String SIZE = "_size";

    public static final java.lang.String DISPLAY_NAME = "_display_name";

    public static final java.lang.String TITLE = "title";

    public static final java.lang.String DATE_ADDED = "date_added";

    public static final java.lang.String DATE_MODIFIED = "date_modified";

    public static final java.lang.String MIME_TYPE = "mime_type";

    public static final java.lang.String MEDIA_SCANNER_NEW_OBJECT_ID = "media_scanner_new_object_id";

    public static final java.lang.String IS_DRM = "is_drm";

    public static final java.lang.String WIDTH = "width";

    public static final java.lang.String HEIGHT = "height";

  }
  public static final class Files
  {
    // Classes

    public static interface FileColumns
      extends MediaStore.MediaColumns
    {
      // Fields

      public static final java.lang.String STORAGE_ID = "storage_id";

      public static final java.lang.String FORMAT = "format";

      public static final java.lang.String PARENT = "parent";

      public static final java.lang.String MIME_TYPE = "mime_type";

      public static final java.lang.String TITLE = "title";

      public static final java.lang.String MEDIA_TYPE = "media_type";

      public static final int MEDIA_TYPE_NONE = 0;

      public static final int MEDIA_TYPE_IMAGE = 1;

      public static final int MEDIA_TYPE_AUDIO = 2;

      public static final int MEDIA_TYPE_VIDEO = 3;

      public static final int MEDIA_TYPE_PLAYLIST = 4;

    }
    // Constructors

    public Files(){
    }
    // Methods

    public static android.net.Uri getContentUri(java.lang.String arg1){
      return (android.net.Uri) null;
    }
    public static final android.net.Uri getContentUri(java.lang.String arg1, long arg2){
      return (android.net.Uri) null;
    }
    public static android.net.Uri getMtpObjectsUri(java.lang.String arg1){
      return (android.net.Uri) null;
    }
    public static final android.net.Uri getMtpObjectsUri(java.lang.String arg1, long arg2){
      return (android.net.Uri) null;
    }
    public static final android.net.Uri getMtpReferencesUri(java.lang.String arg1, long arg2){
      return (android.net.Uri) null;
    }
  }
  public static final class Images
  {
    // Classes

    public static interface ImageColumns
      extends MediaStore.MediaColumns
    {
      // Fields

      public static final java.lang.String DESCRIPTION = "description";

      public static final java.lang.String PICASA_ID = "picasa_id";

      public static final java.lang.String IS_PRIVATE = "isprivate";

      public static final java.lang.String LATITUDE = "latitude";

      public static final java.lang.String LONGITUDE = "longitude";

      public static final java.lang.String DATE_TAKEN = "datetaken";

      public static final java.lang.String ORIENTATION = "orientation";

      public static final java.lang.String MINI_THUMB_MAGIC = "mini_thumb_magic";

      public static final java.lang.String BUCKET_ID = "bucket_id";

      public static final java.lang.String BUCKET_DISPLAY_NAME = "bucket_display_name";

    }
    public static final class Media
      implements MediaStore.Images.ImageColumns
    {
      // Fields

      public static final android.net.Uri INTERNAL_CONTENT_URI = null;

      public static final android.net.Uri EXTERNAL_CONTENT_URI = null;

      public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/image";

      public static final java.lang.String DEFAULT_SORT_ORDER = "bucket_display_name";

      // Constructors

      public Media(){
      }
      // Methods

      @ArgsRule(value="MediaStore.query-1",pos={2,3})
      public static final android.database.Cursor query(android.content.ContentResolver arg1, android.net.Uri arg2, java.lang.String [] arg3){
        return (android.database.Cursor) null;
      }
      @ArgsRule(value="MediaStore.query-2",pos={2,3,4,5})
      public static final android.database.Cursor query(android.content.ContentResolver arg1, android.net.Uri arg2, java.lang.String [] arg3, java.lang.String arg4, java.lang.String arg5){
        return (android.database.Cursor) null;
      }
      @ArgsRule(value="MediaStore.query-3",pos={2,3,4,5,6})
      public static final android.database.Cursor query(android.content.ContentResolver arg1, android.net.Uri arg2, java.lang.String [] arg3, java.lang.String arg4, java.lang.String [] arg5, java.lang.String arg6){
        return (android.database.Cursor) null;
      }
      public static android.net.Uri getContentUri(java.lang.String arg1){
        return (android.net.Uri) null;
      }
      public static final android.graphics.Bitmap getBitmap(android.content.ContentResolver arg1, android.net.Uri arg2) throws java.io.FileNotFoundException, java.io.IOException{
        return (android.graphics.Bitmap) null;
      }
      
      public static final java.lang.String insertImage(android.content.ContentResolver arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.io.FileNotFoundException{
        return (java.lang.String) null;
      }
      public static final java.lang.String insertImage(android.content.ContentResolver arg1, android.graphics.Bitmap arg2, java.lang.String arg3, java.lang.String arg4){
        return (java.lang.String) null;
      }
    }
    public static class Thumbnails
      implements BaseColumns
    {
      // Fields

      public static final android.net.Uri INTERNAL_CONTENT_URI = null;

      public static final android.net.Uri EXTERNAL_CONTENT_URI = null;

      public static final java.lang.String DEFAULT_SORT_ORDER = "image_id ASC";

      public static final java.lang.String DATA = "_data";

      public static final java.lang.String IMAGE_ID = "image_id";

      public static final java.lang.String KIND = "kind";

      public static final int MINI_KIND = 1;

      public static final int FULL_SCREEN_KIND = 2;

      public static final int MICRO_KIND = 3;

      public static final java.lang.String THUMB_DATA = "thumb_data";

      public static final java.lang.String WIDTH = "width";

      public static final java.lang.String HEIGHT = "height";

      // Constructors

      public Thumbnails(){
      }
      // Methods

      public static final android.database.Cursor query(android.content.ContentResolver arg1, android.net.Uri arg2, java.lang.String [] arg3){
        return (android.database.Cursor) null;
      }
      public static android.graphics.Bitmap getThumbnail(android.content.ContentResolver arg1, long arg2, int arg3, android.graphics.BitmapFactory.Options arg4){
        return (android.graphics.Bitmap) null;
      }
      public static android.graphics.Bitmap getThumbnail(android.content.ContentResolver arg1, long arg2, long arg3, int arg4, android.graphics.BitmapFactory.Options arg5){
        return (android.graphics.Bitmap) null;
      }
      public static android.net.Uri getContentUri(java.lang.String arg1){
        return (android.net.Uri) null;
      }
      public static void cancelThumbnailRequest(android.content.ContentResolver arg1, long arg2){
      }
      public static void cancelThumbnailRequest(android.content.ContentResolver arg1, long arg2, long arg3){
      }
      public static final android.database.Cursor queryMiniThumbnails(android.content.ContentResolver arg1, android.net.Uri arg2, int arg3, java.lang.String [] arg4){
        return (android.database.Cursor) null;
      }
      public static final android.database.Cursor queryMiniThumbnail(android.content.ContentResolver arg1, long arg2, int arg3, java.lang.String [] arg4){
        return (android.database.Cursor) null;
      }
    }
    // Constructors

    public Images(){
    }
  }
  public static final class Audio
  {
    // Classes

    public static interface AudioColumns
      extends MediaStore.MediaColumns
    {
      // Fields

      public static final java.lang.String TITLE_KEY = "title_key";

      public static final java.lang.String DURATION = "duration";

      public static final java.lang.String BOOKMARK = "bookmark";

      public static final java.lang.String ARTIST_ID = "artist_id";

      public static final java.lang.String ARTIST = "artist";

      public static final java.lang.String ALBUM_ARTIST = "album_artist";

      public static final java.lang.String COMPILATION = "compilation";

      public static final java.lang.String ARTIST_KEY = "artist_key";

      public static final java.lang.String COMPOSER = "composer";

      public static final java.lang.String ALBUM_ID = "album_id";

      public static final java.lang.String ALBUM = "album";

      public static final java.lang.String ALBUM_KEY = "album_key";

      public static final java.lang.String TRACK = "track";

      public static final java.lang.String YEAR = "year";

      public static final java.lang.String IS_MUSIC = "is_music";

      public static final java.lang.String IS_PODCAST = "is_podcast";

      public static final java.lang.String IS_RINGTONE = "is_ringtone";

      public static final java.lang.String IS_ALARM = "is_alarm";

      public static final java.lang.String IS_NOTIFICATION = "is_notification";

      public static final java.lang.String GENRE = "genre";

    }
    public static final class Media
      implements MediaStore.Audio.AudioColumns
    {
      // Fields

      public static final android.net.Uri INTERNAL_CONTENT_URI = null;

      public static final android.net.Uri EXTERNAL_CONTENT_URI = null;

      public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/audio";

      public static final java.lang.String DEFAULT_SORT_ORDER = "title_key";

      public static final java.lang.String RECORD_SOUND_ACTION = "android.provider.MediaStore.RECORD_SOUND";

      public static final java.lang.String EXTRA_MAX_BYTES = "android.provider.MediaStore.extra.MAX_BYTES";

      // Constructors

      public Media(){
      }
      // Methods

      public static android.net.Uri getContentUri(java.lang.String arg1){
        return (android.net.Uri) null;
      }
      public static android.net.Uri getContentUriForPath(java.lang.String arg1){
        return (android.net.Uri) null;
      }
    }
    public static interface GenresColumns
    {
      // Fields

      public static final java.lang.String NAME = "name";

    }
    public static final class Genres
      implements BaseColumns, MediaStore.Audio.GenresColumns
    {
      // Classes

      public static final class Members
        implements MediaStore.Audio.AudioColumns
      {
        // Fields

        public static final java.lang.String CONTENT_DIRECTORY = "members";

        public static final java.lang.String DEFAULT_SORT_ORDER = "title_key";

        public static final java.lang.String AUDIO_ID = "audio_id";

        public static final java.lang.String GENRE_ID = "genre_id";

        // Constructors

        public Members(){
        }
        // Methods

        public static final android.net.Uri getContentUri(java.lang.String arg1, long arg2){
          return (android.net.Uri) null;
        }
      }
      // Fields

      public static final android.net.Uri INTERNAL_CONTENT_URI = null;

      public static final android.net.Uri EXTERNAL_CONTENT_URI = null;

      public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/genre";

      public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/genre";

      public static final java.lang.String DEFAULT_SORT_ORDER = "name";

      // Constructors

      public Genres(){
      }
      // Methods

      public static android.net.Uri getContentUri(java.lang.String arg1){
        return (android.net.Uri) null;
      }
      public static android.net.Uri getContentUriForAudioId(java.lang.String arg1, int arg2){
        return (android.net.Uri) null;
      }
    }
    public static interface PlaylistsColumns
    {
      // Fields

      public static final java.lang.String NAME = "name";

      public static final java.lang.String DATA = "_data";

      public static final java.lang.String DATE_ADDED = "date_added";

      public static final java.lang.String DATE_MODIFIED = "date_modified";

    }
    public static final class Playlists
      implements BaseColumns, MediaStore.Audio.PlaylistsColumns
    {
      // Classes

      public static final class Members
        implements MediaStore.Audio.AudioColumns
      {
        // Fields

        public static final java.lang.String _ID = "_id";

        public static final java.lang.String CONTENT_DIRECTORY = "members";

        public static final java.lang.String AUDIO_ID = "audio_id";

        public static final java.lang.String PLAYLIST_ID = "playlist_id";

        public static final java.lang.String PLAY_ORDER = "play_order";

        public static final java.lang.String DEFAULT_SORT_ORDER = "play_order";

        // Constructors

        public Members(){
        }
        // Methods

        public static final android.net.Uri getContentUri(java.lang.String arg1, long arg2){
          return (android.net.Uri) null;
        }
        public static final boolean moveItem(android.content.ContentResolver arg1, long arg2, int arg3, int arg4){
          return false;
        }
      }
      // Fields

      public static final android.net.Uri INTERNAL_CONTENT_URI = null;

      public static final android.net.Uri EXTERNAL_CONTENT_URI = null;

      public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/playlist";

      public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/playlist";

      public static final java.lang.String DEFAULT_SORT_ORDER = "name";

      // Constructors

      public Playlists(){
      }
      // Methods

      public static android.net.Uri getContentUri(java.lang.String arg1){
        return (android.net.Uri) null;
      }
    }
    public static interface ArtistColumns
    {
      // Fields

      public static final java.lang.String ARTIST = "artist";

      public static final java.lang.String ARTIST_KEY = "artist_key";

      public static final java.lang.String NUMBER_OF_ALBUMS = "number_of_albums";

      public static final java.lang.String NUMBER_OF_TRACKS = "number_of_tracks";

    }
    public static final class Artists
      implements MediaStore.Audio.ArtistColumns, BaseColumns
    {
      // Classes

      public static final class Albums
        implements MediaStore.Audio.AlbumColumns
      {
        // Constructors

        public Albums(){
        }
        // Methods

        public static final android.net.Uri getContentUri(java.lang.String arg1, long arg2){
          return (android.net.Uri) null;
        }
      }
      // Fields

      public static final android.net.Uri INTERNAL_CONTENT_URI = null;

      public static final android.net.Uri EXTERNAL_CONTENT_URI = null;

      public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/artists";

      public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/artist";

      public static final java.lang.String DEFAULT_SORT_ORDER = "artist_key";

      // Constructors

      public Artists(){
      }
      // Methods

      public static android.net.Uri getContentUri(java.lang.String arg1){
        return (android.net.Uri) null;
      }
    }
    public static interface AlbumColumns
    {
      // Fields

      public static final java.lang.String ALBUM_ID = "album_id";

      public static final java.lang.String ALBUM = "album";

      public static final java.lang.String ARTIST = "artist";

      public static final java.lang.String NUMBER_OF_SONGS = "numsongs";

      public static final java.lang.String NUMBER_OF_SONGS_FOR_ARTIST = "numsongs_by_artist";

      public static final java.lang.String FIRST_YEAR = "minyear";

      public static final java.lang.String LAST_YEAR = "maxyear";

      public static final java.lang.String ALBUM_KEY = "album_key";

      public static final java.lang.String ALBUM_ART = "album_art";

    }
    public static final class Albums
      implements MediaStore.Audio.AlbumColumns, BaseColumns
    {
      // Fields

      public static final android.net.Uri INTERNAL_CONTENT_URI = null;

      public static final android.net.Uri EXTERNAL_CONTENT_URI = null;

      public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/albums";

      public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/album";

      public static final java.lang.String DEFAULT_SORT_ORDER = "album_key";

      // Constructors

      public Albums(){
      }
      // Methods

      public static android.net.Uri getContentUri(java.lang.String arg1){
        return (android.net.Uri) null;
      }
    }
    // Constructors

    public Audio(){
    }
    // Methods

    public static java.lang.String keyFor(java.lang.String arg1){
      return (java.lang.String) null;
    }
  }
  public static final class Video
  {
    // Classes

    public static interface VideoColumns
      extends MediaStore.MediaColumns
    {
      // Fields

      public static final java.lang.String DURATION = "duration";

      public static final java.lang.String ARTIST = "artist";

      public static final java.lang.String ALBUM = "album";

      public static final java.lang.String RESOLUTION = "resolution";

      public static final java.lang.String DESCRIPTION = "description";

      public static final java.lang.String IS_PRIVATE = "isprivate";

      public static final java.lang.String TAGS = "tags";

      public static final java.lang.String CATEGORY = "category";

      public static final java.lang.String LANGUAGE = "language";

      public static final java.lang.String LATITUDE = "latitude";

      public static final java.lang.String LONGITUDE = "longitude";

      public static final java.lang.String DATE_TAKEN = "datetaken";

      public static final java.lang.String MINI_THUMB_MAGIC = "mini_thumb_magic";

      public static final java.lang.String BUCKET_ID = "bucket_id";

      public static final java.lang.String BUCKET_DISPLAY_NAME = "bucket_display_name";

      public static final java.lang.String BOOKMARK = "bookmark";

    }
    public static final class Media
      implements MediaStore.Video.VideoColumns
    {
      // Fields

      public static final android.net.Uri INTERNAL_CONTENT_URI = null;

      public static final android.net.Uri EXTERNAL_CONTENT_URI = null;

      public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/video";

      public static final java.lang.String DEFAULT_SORT_ORDER = "title";

      // Constructors

      public Media(){
      }
      // Methods

      public static android.net.Uri getContentUri(java.lang.String arg1){
        return (android.net.Uri) null;
      }
    }
    public static class Thumbnails
      implements BaseColumns
    {
      // Fields

      public static final android.net.Uri INTERNAL_CONTENT_URI = null;

      public static final android.net.Uri EXTERNAL_CONTENT_URI = null;

      public static final java.lang.String DEFAULT_SORT_ORDER = "video_id ASC";

      public static final java.lang.String DATA = "_data";

      public static final java.lang.String VIDEO_ID = "video_id";

      public static final java.lang.String KIND = "kind";

      public static final int MINI_KIND = 1;

      public static final int FULL_SCREEN_KIND = 2;

      public static final int MICRO_KIND = 3;

      public static final java.lang.String WIDTH = "width";

      public static final java.lang.String HEIGHT = "height";

      // Constructors

      public Thumbnails(){
      }
      // Methods

      public static android.graphics.Bitmap getThumbnail(android.content.ContentResolver arg1, long arg2, int arg3, android.graphics.BitmapFactory.Options arg4){
        return (android.graphics.Bitmap) null;
      }
      public static android.graphics.Bitmap getThumbnail(android.content.ContentResolver arg1, long arg2, long arg3, int arg4, android.graphics.BitmapFactory.Options arg5){
        return (android.graphics.Bitmap) null;
      }
      public static android.net.Uri getContentUri(java.lang.String arg1){
        return (android.net.Uri) null;
      }
      public static void cancelThumbnailRequest(android.content.ContentResolver arg1, long arg2){
      }
      public static void cancelThumbnailRequest(android.content.ContentResolver arg1, long arg2, long arg3){
      }
    }
    // Fields

    public static final java.lang.String DEFAULT_SORT_ORDER = "_display_name";

    // Constructors

    public Video(){
    }
    // Methods

    public static final android.database.Cursor query(android.content.ContentResolver arg1, android.net.Uri arg2, java.lang.String [] arg3){
      return (android.database.Cursor) null;
    }
  }
  // Fields

  public static final java.lang.String AUTHORITY = "media";

  public static final java.lang.String ACTION_MTP_SESSION_END = "android.provider.action.MTP_SESSION_END";

  public static final java.lang.String INTENT_ACTION_MUSIC_PLAYER = "android.intent.action.MUSIC_PLAYER";

  public static final java.lang.String INTENT_ACTION_MEDIA_SEARCH = "android.intent.action.MEDIA_SEARCH";

  public static final java.lang.String INTENT_ACTION_MEDIA_PLAY_FROM_SEARCH = "android.media.action.MEDIA_PLAY_FROM_SEARCH";

  public static final java.lang.String EXTRA_MEDIA_ARTIST = "android.intent.extra.artist";

  public static final java.lang.String EXTRA_MEDIA_ALBUM = "android.intent.extra.album";

  public static final java.lang.String EXTRA_MEDIA_TITLE = "android.intent.extra.title";

  public static final java.lang.String EXTRA_MEDIA_FOCUS = "android.intent.extra.focus";

  public static final java.lang.String EXTRA_SCREEN_ORIENTATION = "android.intent.extra.screenOrientation";

  public static final java.lang.String EXTRA_FULL_SCREEN = "android.intent.extra.fullScreen";

  public static final java.lang.String EXTRA_SHOW_ACTION_ICONS = "android.intent.extra.showActionIcons";

  public static final java.lang.String EXTRA_FINISH_ON_COMPLETION = "android.intent.extra.finishOnCompletion";

  public static final java.lang.String INTENT_ACTION_STILL_IMAGE_CAMERA = "android.media.action.STILL_IMAGE_CAMERA";

  public static final java.lang.String INTENT_ACTION_VIDEO_CAMERA = "android.media.action.VIDEO_CAMERA";

  public static final java.lang.String ACTION_IMAGE_CAPTURE = "android.media.action.IMAGE_CAPTURE";

  public static final java.lang.String ACTION_VIDEO_CAPTURE = "android.media.action.VIDEO_CAPTURE";

  public static final java.lang.String EXTRA_VIDEO_QUALITY = "android.intent.extra.videoQuality";

  public static final java.lang.String EXTRA_SIZE_LIMIT = "android.intent.extra.sizeLimit";

  public static final java.lang.String EXTRA_DURATION_LIMIT = "android.intent.extra.durationLimit";

  public static final java.lang.String EXTRA_OUTPUT = "output";

  public static final java.lang.String UNKNOWN_STRING = "<unknown>";

  public static final java.lang.String MEDIA_SCANNER_VOLUME = "volume";

  public static final java.lang.String MEDIA_IGNORE_FILENAME = ".nomedia";

  // Constructors

  public MediaStore(){
  }
  // Methods

  public static java.lang.String getVersion(android.content.Context arg1){
    return (java.lang.String) null;
  }
  public static android.net.Uri getMediaScannerUri(){
    return (android.net.Uri) null;
  }
}
