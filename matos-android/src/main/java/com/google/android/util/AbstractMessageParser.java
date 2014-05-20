package com.google.android.util;

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


public abstract class AbstractMessageParser
{
  // Classes

  public static interface Resources
  {
    // Methods

    public AbstractMessageParser.TrieNode getSmileys();
    public AbstractMessageParser.TrieNode getAcronyms();
    public AbstractMessageParser.TrieNode getDomainSuffixes();
    public java.util.Set<java.lang.String> getSchemes();
  }
  public abstract static class Token
  {
    // Classes

    public static enum Type
    {
      // Enum Constants

      html((java.lang.String) null)
, format((java.lang.String) null)
, l((java.lang.String) null)
, e((java.lang.String) null)
, a((java.lang.String) null)
, m((java.lang.String) null)
, v((java.lang.String) null)
, yt((java.lang.String) null)
, p((java.lang.String) null)
, f((java.lang.String) null)
;
      // Fields

      // Constructors

      private Type(java.lang.String arg1){
      }
      // Methods

      public java.lang.String toString(){
        return (java.lang.String) null;
      }
    }
    // Fields

    protected AbstractMessageParser.Token.Type type;

    protected java.lang.String text;

    // Constructors

    protected Token(AbstractMessageParser.Token.Type arg1, java.lang.String arg2){
    }
    // Methods

    public boolean isArray(){
      return false;
    }
    public AbstractMessageParser.Token.Type getType(){
      return (AbstractMessageParser.Token.Type) null;
    }
    public java.lang.String getRawText(){
      return (java.lang.String) null;
    }
    public java.lang.String toHtml(boolean arg1){
      return (java.lang.String) null;
    }
    public boolean isMedia(){
      return false;
    }
    public abstract boolean isHtml();
    public java.util.List<java.lang.String> getInfo(){
      return (java.util.List) null;
    }
    public boolean controlCaps(){
      return false;
    }
    public boolean setCaps(){
      return false;
    }
  }
  public static class Html
    extends AbstractMessageParser.Token  {
    // Constructors

    public Html(java.lang.String arg1, java.lang.String arg2){
      super((AbstractMessageParser.Token.Type) null, (java.lang.String) null);
    }
    // Methods

    public java.lang.String toHtml(boolean arg1){
      return (java.lang.String) null;
    }
    public boolean isHtml(){
      return false;
    }
    public java.util.List<java.lang.String> getInfo(){
      return (java.util.List) null;
    }
    public void trimLeadingWhitespace(){
    }
    public void trimTrailingWhitespace(){
    }
    public static java.lang.String trimTrailingWhitespace(java.lang.String arg1){
      return (java.lang.String) null;
    }
  }
  public static class MusicTrack
    extends AbstractMessageParser.Token  {
    // Constructors

    public MusicTrack(java.lang.String arg1){
      super((AbstractMessageParser.Token.Type) null, (java.lang.String) null);
    }
    // Methods

    public boolean isHtml(){
      return false;
    }
    public java.util.List<java.lang.String> getInfo(){
      return (java.util.List) null;
    }
    public java.lang.String getTrack(){
      return (java.lang.String) null;
    }
  }
  public static class Link
    extends AbstractMessageParser.Token  {
    // Constructors

    public Link(java.lang.String arg1, java.lang.String arg2){
      super((AbstractMessageParser.Token.Type) null, (java.lang.String) null);
    }
    // Methods

    public java.lang.String getURL(){
      return (java.lang.String) null;
    }
    public boolean isHtml(){
      return false;
    }
    public java.util.List<java.lang.String> getInfo(){
      return (java.util.List) null;
    }
  }
  public static class Video
    extends AbstractMessageParser.Token  {
    // Constructors

    public Video(java.lang.String arg1, java.lang.String arg2){
      super((AbstractMessageParser.Token.Type) null, (java.lang.String) null);
    }
    // Methods

    public static java.lang.String getURL(java.lang.String arg1){
      return (java.lang.String) null;
    }
    public static java.lang.String getURL(java.lang.String arg1, java.lang.String arg2){
      return (java.lang.String) null;
    }
    public boolean isMedia(){
      return false;
    }
    public boolean isHtml(){
      return false;
    }
    public static AbstractMessageParser.Video matchURL(java.lang.String arg1, java.lang.String arg2){
      return (AbstractMessageParser.Video) null;
    }
    public java.lang.String getDocID(){
      return (java.lang.String) null;
    }
    public java.util.List<java.lang.String> getInfo(){
      return (java.util.List) null;
    }
    public static java.lang.String getRssUrl(java.lang.String arg1){
      return (java.lang.String) null;
    }
  }
  public static class YouTubeVideo
    extends AbstractMessageParser.Token  {
    // Constructors

    public YouTubeVideo(java.lang.String arg1, java.lang.String arg2){
      super((AbstractMessageParser.Token.Type) null, (java.lang.String) null);
    }
    // Methods

    public static java.lang.String getURL(java.lang.String arg1){
      return (java.lang.String) null;
    }
    public static java.lang.String getURL(java.lang.String arg1, java.lang.String arg2){
      return (java.lang.String) null;
    }
    public boolean isMedia(){
      return false;
    }
    public boolean isHtml(){
      return false;
    }
    public static AbstractMessageParser.YouTubeVideo matchURL(java.lang.String arg1, java.lang.String arg2){
      return (AbstractMessageParser.YouTubeVideo) null;
    }
    public java.lang.String getDocID(){
      return (java.lang.String) null;
    }
    public java.util.List<java.lang.String> getInfo(){
      return (java.util.List) null;
    }
    public static java.lang.String getRssUrl(java.lang.String arg1){
      return (java.lang.String) null;
    }
    public static java.lang.String getPrefixedURL(boolean arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4){
      return (java.lang.String) null;
    }
  }
  public static class Photo
    extends AbstractMessageParser.Token  {
    // Constructors

    public Photo(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4){
      super((AbstractMessageParser.Token.Type) null, (java.lang.String) null);
    }
    // Methods

    public boolean isMedia(){
      return false;
    }
    public boolean isHtml(){
      return false;
    }
    public static AbstractMessageParser.Photo matchURL(java.lang.String arg1, java.lang.String arg2){
      return (AbstractMessageParser.Photo) null;
    }
    public java.util.List<java.lang.String> getInfo(){
      return (java.util.List) null;
    }
    public static java.lang.String getRssUrl(java.lang.String arg1){
      return (java.lang.String) null;
    }
    public java.lang.String getUser(){
      return (java.lang.String) null;
    }
    public java.lang.String getAlbum(){
      return (java.lang.String) null;
    }
    public static java.lang.String getAlbumURL(java.lang.String arg1, java.lang.String arg2){
      return (java.lang.String) null;
    }
    public java.lang.String getPhoto(){
      return (java.lang.String) null;
    }
    public static java.lang.String getPhotoURL(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3){
      return (java.lang.String) null;
    }
  }
  public static class FlickrPhoto
    extends AbstractMessageParser.Token  {
    // Constructors

    public FlickrPhoto(java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5){
      super((AbstractMessageParser.Token.Type) null, (java.lang.String) null);
    }
    // Methods

    public java.lang.String getUrl(){
      return (java.lang.String) null;
    }
    public boolean isMedia(){
      return false;
    }
    public boolean isHtml(){
      return false;
    }
    public static AbstractMessageParser.FlickrPhoto matchURL(java.lang.String arg1, java.lang.String arg2){
      return (AbstractMessageParser.FlickrPhoto) null;
    }
    public java.util.List<java.lang.String> getInfo(){
      return (java.util.List) null;
    }
    public static java.lang.String getRssUrl(java.lang.String arg1){
      return (java.lang.String) null;
    }
    public java.lang.String getUser(){
      return (java.lang.String) null;
    }
    public java.lang.String getPhoto(){
      return (java.lang.String) null;
    }
    public static java.lang.String getPhotoURL(java.lang.String arg1, java.lang.String arg2){
      return (java.lang.String) null;
    }
    public java.lang.String getGrouping(){
      return (java.lang.String) null;
    }
    public java.lang.String getGroupingId(){
      return (java.lang.String) null;
    }
    public static java.lang.String getTagsURL(java.lang.String arg1){
      return (java.lang.String) null;
    }
    public static java.lang.String getUserURL(java.lang.String arg1){
      return (java.lang.String) null;
    }
    public static java.lang.String getUserTagsURL(java.lang.String arg1, java.lang.String arg2){
      return (java.lang.String) null;
    }
    public static java.lang.String getUserSetsURL(java.lang.String arg1, java.lang.String arg2){
      return (java.lang.String) null;
    }
  }
  public static class Smiley
    extends AbstractMessageParser.Token  {
    // Constructors

    public Smiley(java.lang.String arg1){
      super((AbstractMessageParser.Token.Type) null, (java.lang.String) null);
    }
    // Methods

    public boolean isHtml(){
      return false;
    }
    public java.util.List<java.lang.String> getInfo(){
      return (java.util.List) null;
    }
  }
  public static class Acronym
    extends AbstractMessageParser.Token  {
    // Constructors

    public Acronym(java.lang.String arg1, java.lang.String arg2){
      super((AbstractMessageParser.Token.Type) null, (java.lang.String) null);
    }
    // Methods

    public java.lang.String getValue(){
      return (java.lang.String) null;
    }
    public boolean isHtml(){
      return false;
    }
    public java.util.List<java.lang.String> getInfo(){
      return (java.util.List) null;
    }
  }
  public static class Format
    extends AbstractMessageParser.Token  {
    // Constructors

    public Format(char arg1, boolean arg2){
      super((AbstractMessageParser.Token.Type) null, (java.lang.String) null);
    }
    // Methods

    public java.lang.String toHtml(boolean arg1){
      return (java.lang.String) null;
    }
    public boolean isHtml(){
      return false;
    }
    public java.util.List<java.lang.String> getInfo(){
      return (java.util.List) null;
    }
    public boolean controlCaps(){
      return false;
    }
    public boolean setCaps(){
      return false;
    }
    public void setMatched(boolean arg1){
    }
  }
  public static class TrieNode
  {
    // Constructors

    public TrieNode(){
    }
    public TrieNode(java.lang.String arg1){
    }
    // Methods

    public final java.lang.String getValue(){
      return (java.lang.String) null;
    }
    public final boolean exists(){
      return false;
    }
    public void setValue(java.lang.String arg1){
    }
    public final java.lang.String getText(){
      return (java.lang.String) null;
    }
    public AbstractMessageParser.TrieNode getChild(char arg1){
      return (AbstractMessageParser.TrieNode) null;
    }
    public AbstractMessageParser.TrieNode getOrCreateChild(char arg1){
      return (AbstractMessageParser.TrieNode) null;
    }
    public static void addToTrie(AbstractMessageParser.TrieNode arg1, java.lang.String arg2, java.lang.String arg3){
    }
  }
  public static class Part
  {
    // Constructors

    public Part(){
    }
    // Methods

    public void add(AbstractMessageParser.Token arg1){
    }
    public java.lang.String getType(boolean arg1){
      return (java.lang.String) null;
    }
    public java.lang.String getRawText(){
      return (java.lang.String) null;
    }
    public boolean isMedia(){
      return false;
    }
    public java.util.ArrayList<AbstractMessageParser.Token> getTokens(){
      return (java.util.ArrayList) null;
    }
    public void setMeText(java.lang.String arg1){
    }
    public AbstractMessageParser.Token getMediaToken(){
      return (AbstractMessageParser.Token) null;
    }
  }
  // Fields

  public static final java.lang.String musicNote = "\u266b ";

  // Constructors

  public AbstractMessageParser(java.lang.String arg1){
  }
  public AbstractMessageParser(java.lang.String arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7){
  }
  // Methods

  protected abstract AbstractMessageParser.Resources getResources();
  protected static java.lang.String reverse(java.lang.String arg1){
    return (java.lang.String) null;
  }
  public void parse(){
  }
  public final AbstractMessageParser.Part getPart(int arg1){
    return (AbstractMessageParser.Part) null;
  }
  public final int getPartCount(){
    return 0;
  }
  public final java.lang.String getRawText(){
    return (java.lang.String) null;
  }
  public final java.util.List<AbstractMessageParser.Part> getParts(){
    return (java.util.List) null;
  }
  public static AbstractMessageParser.Token tokenForUrl(java.lang.String arg1, java.lang.String arg2){
    return (AbstractMessageParser.Token) null;
  }
  public java.lang.String toHtml(){
    return (java.lang.String) null;
  }
}
