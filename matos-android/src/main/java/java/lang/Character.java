package java.lang;

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


public final class Character
  implements Comparable<Character>, java.io.Serializable
{
  // Classes

  public static class Subset
  {
    // Constructors

    protected Subset(String arg1){
    }
    // Methods

    public final boolean equals(Object arg1){
      return false;
    }
    public final String toString(){
      return (String) null;
    }
    public final int hashCode(){
      return 0;
    }
  }
  public static final class UnicodeBlock
    extends Character.Subset  {
    // Fields

    public static final Character.UnicodeBlock SURROGATES_AREA = null;

    public static final Character.UnicodeBlock BASIC_LATIN = null;

    public static final Character.UnicodeBlock LATIN_1_SUPPLEMENT = null;

    public static final Character.UnicodeBlock LATIN_EXTENDED_A = null;

    public static final Character.UnicodeBlock LATIN_EXTENDED_B = null;

    public static final Character.UnicodeBlock IPA_EXTENSIONS = null;

    public static final Character.UnicodeBlock SPACING_MODIFIER_LETTERS = null;

    public static final Character.UnicodeBlock COMBINING_DIACRITICAL_MARKS = null;

    public static final Character.UnicodeBlock GREEK = null;

    public static final Character.UnicodeBlock CYRILLIC = null;

    public static final Character.UnicodeBlock CYRILLIC_SUPPLEMENTARY = null;

    public static final Character.UnicodeBlock ARMENIAN = null;

    public static final Character.UnicodeBlock HEBREW = null;

    public static final Character.UnicodeBlock ARABIC = null;

    public static final Character.UnicodeBlock SYRIAC = null;

    public static final Character.UnicodeBlock THAANA = null;

    public static final Character.UnicodeBlock DEVANAGARI = null;

    public static final Character.UnicodeBlock BENGALI = null;

    public static final Character.UnicodeBlock GURMUKHI = null;

    public static final Character.UnicodeBlock GUJARATI = null;

    public static final Character.UnicodeBlock ORIYA = null;

    public static final Character.UnicodeBlock TAMIL = null;

    public static final Character.UnicodeBlock TELUGU = null;

    public static final Character.UnicodeBlock KANNADA = null;

    public static final Character.UnicodeBlock MALAYALAM = null;

    public static final Character.UnicodeBlock SINHALA = null;

    public static final Character.UnicodeBlock THAI = null;

    public static final Character.UnicodeBlock LAO = null;

    public static final Character.UnicodeBlock TIBETAN = null;

    public static final Character.UnicodeBlock MYANMAR = null;

    public static final Character.UnicodeBlock GEORGIAN = null;

    public static final Character.UnicodeBlock HANGUL_JAMO = null;

    public static final Character.UnicodeBlock ETHIOPIC = null;

    public static final Character.UnicodeBlock CHEROKEE = null;

    public static final Character.UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS = null;

    public static final Character.UnicodeBlock OGHAM = null;

    public static final Character.UnicodeBlock RUNIC = null;

    public static final Character.UnicodeBlock TAGALOG = null;

    public static final Character.UnicodeBlock HANUNOO = null;

    public static final Character.UnicodeBlock BUHID = null;

    public static final Character.UnicodeBlock TAGBANWA = null;

    public static final Character.UnicodeBlock KHMER = null;

    public static final Character.UnicodeBlock MONGOLIAN = null;

    public static final Character.UnicodeBlock LIMBU = null;

    public static final Character.UnicodeBlock TAI_LE = null;

    public static final Character.UnicodeBlock KHMER_SYMBOLS = null;

    public static final Character.UnicodeBlock PHONETIC_EXTENSIONS = null;

    public static final Character.UnicodeBlock LATIN_EXTENDED_ADDITIONAL = null;

    public static final Character.UnicodeBlock GREEK_EXTENDED = null;

    public static final Character.UnicodeBlock GENERAL_PUNCTUATION = null;

    public static final Character.UnicodeBlock SUPERSCRIPTS_AND_SUBSCRIPTS = null;

    public static final Character.UnicodeBlock CURRENCY_SYMBOLS = null;

    public static final Character.UnicodeBlock COMBINING_MARKS_FOR_SYMBOLS = null;

    public static final Character.UnicodeBlock LETTERLIKE_SYMBOLS = null;

    public static final Character.UnicodeBlock NUMBER_FORMS = null;

    public static final Character.UnicodeBlock ARROWS = null;

    public static final Character.UnicodeBlock MATHEMATICAL_OPERATORS = null;

    public static final Character.UnicodeBlock MISCELLANEOUS_TECHNICAL = null;

    public static final Character.UnicodeBlock CONTROL_PICTURES = null;

    public static final Character.UnicodeBlock OPTICAL_CHARACTER_RECOGNITION = null;

    public static final Character.UnicodeBlock ENCLOSED_ALPHANUMERICS = null;

    public static final Character.UnicodeBlock BOX_DRAWING = null;

    public static final Character.UnicodeBlock BLOCK_ELEMENTS = null;

    public static final Character.UnicodeBlock GEOMETRIC_SHAPES = null;

    public static final Character.UnicodeBlock MISCELLANEOUS_SYMBOLS = null;

    public static final Character.UnicodeBlock DINGBATS = null;

    public static final Character.UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A = null;

    public static final Character.UnicodeBlock SUPPLEMENTAL_ARROWS_A = null;

    public static final Character.UnicodeBlock BRAILLE_PATTERNS = null;

    public static final Character.UnicodeBlock SUPPLEMENTAL_ARROWS_B = null;

    public static final Character.UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B = null;

    public static final Character.UnicodeBlock SUPPLEMENTAL_MATHEMATICAL_OPERATORS = null;

    public static final Character.UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_ARROWS = null;

    public static final Character.UnicodeBlock CJK_RADICALS_SUPPLEMENT = null;

    public static final Character.UnicodeBlock KANGXI_RADICALS = null;

    public static final Character.UnicodeBlock IDEOGRAPHIC_DESCRIPTION_CHARACTERS = null;

    public static final Character.UnicodeBlock CJK_SYMBOLS_AND_PUNCTUATION = null;

    public static final Character.UnicodeBlock HIRAGANA = null;

    public static final Character.UnicodeBlock KATAKANA = null;

    public static final Character.UnicodeBlock BOPOMOFO = null;

    public static final Character.UnicodeBlock HANGUL_COMPATIBILITY_JAMO = null;

    public static final Character.UnicodeBlock KANBUN = null;

    public static final Character.UnicodeBlock BOPOMOFO_EXTENDED = null;

    public static final Character.UnicodeBlock KATAKANA_PHONETIC_EXTENSIONS = null;

    public static final Character.UnicodeBlock ENCLOSED_CJK_LETTERS_AND_MONTHS = null;

    public static final Character.UnicodeBlock CJK_COMPATIBILITY = null;

    public static final Character.UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A = null;

    public static final Character.UnicodeBlock YIJING_HEXAGRAM_SYMBOLS = null;

    public static final Character.UnicodeBlock CJK_UNIFIED_IDEOGRAPHS = null;

    public static final Character.UnicodeBlock YI_SYLLABLES = null;

    public static final Character.UnicodeBlock YI_RADICALS = null;

    public static final Character.UnicodeBlock HANGUL_SYLLABLES = null;

    public static final Character.UnicodeBlock HIGH_SURROGATES = null;

    public static final Character.UnicodeBlock HIGH_PRIVATE_USE_SURROGATES = null;

    public static final Character.UnicodeBlock LOW_SURROGATES = null;

    public static final Character.UnicodeBlock PRIVATE_USE_AREA = null;

    public static final Character.UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS = null;

    public static final Character.UnicodeBlock ALPHABETIC_PRESENTATION_FORMS = null;

    public static final Character.UnicodeBlock ARABIC_PRESENTATION_FORMS_A = null;

    public static final Character.UnicodeBlock VARIATION_SELECTORS = null;

    public static final Character.UnicodeBlock COMBINING_HALF_MARKS = null;

    public static final Character.UnicodeBlock CJK_COMPATIBILITY_FORMS = null;

    public static final Character.UnicodeBlock SMALL_FORM_VARIANTS = null;

    public static final Character.UnicodeBlock ARABIC_PRESENTATION_FORMS_B = null;

    public static final Character.UnicodeBlock HALFWIDTH_AND_FULLWIDTH_FORMS = null;

    public static final Character.UnicodeBlock SPECIALS = null;

    public static final Character.UnicodeBlock LINEAR_B_SYLLABARY = null;

    public static final Character.UnicodeBlock LINEAR_B_IDEOGRAMS = null;

    public static final Character.UnicodeBlock AEGEAN_NUMBERS = null;

    public static final Character.UnicodeBlock OLD_ITALIC = null;

    public static final Character.UnicodeBlock GOTHIC = null;

    public static final Character.UnicodeBlock UGARITIC = null;

    public static final Character.UnicodeBlock DESERET = null;

    public static final Character.UnicodeBlock SHAVIAN = null;

    public static final Character.UnicodeBlock OSMANYA = null;

    public static final Character.UnicodeBlock CYPRIOT_SYLLABARY = null;

    public static final Character.UnicodeBlock BYZANTINE_MUSICAL_SYMBOLS = null;

    public static final Character.UnicodeBlock MUSICAL_SYMBOLS = null;

    public static final Character.UnicodeBlock TAI_XUAN_JING_SYMBOLS = null;

    public static final Character.UnicodeBlock MATHEMATICAL_ALPHANUMERIC_SYMBOLS = null;

    public static final Character.UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B = null;

    public static final Character.UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT = null;

    public static final Character.UnicodeBlock TAGS = null;

    public static final Character.UnicodeBlock VARIATION_SELECTORS_SUPPLEMENT = null;

    public static final Character.UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_A = null;

    public static final Character.UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_B = null;

    // Constructors

    private UnicodeBlock(String arg1, int arg2, int arg3){
      super((String) null);
    }
    // Methods

    public static Character.UnicodeBlock forName(String arg1){
      return (Character.UnicodeBlock) null;
    }
    public static Character.UnicodeBlock of(char arg1){
      return (Character.UnicodeBlock) null;
    }
    public static Character.UnicodeBlock of(int arg1){
      return (Character.UnicodeBlock) null;
    }
  }
  // Fields

  public static final char MIN_VALUE = '\u0000';

  public static final char MAX_VALUE = '\uffff';

  public static final int MIN_RADIX = 2;

  public static final int MAX_RADIX = 36;

  public static final Class<Character> TYPE = null;

  public static final byte UNASSIGNED = 0;

  public static final byte UPPERCASE_LETTER = 1;

  public static final byte LOWERCASE_LETTER = 2;

  public static final byte TITLECASE_LETTER = 3;

  public static final byte MODIFIER_LETTER = 4;

  public static final byte OTHER_LETTER = 5;

  public static final byte NON_SPACING_MARK = 6;

  public static final byte ENCLOSING_MARK = 7;

  public static final byte COMBINING_SPACING_MARK = 8;

  public static final byte DECIMAL_DIGIT_NUMBER = 9;

  public static final byte LETTER_NUMBER = 10;

  public static final byte OTHER_NUMBER = 11;

  public static final byte SPACE_SEPARATOR = 12;

  public static final byte LINE_SEPARATOR = 13;

  public static final byte PARAGRAPH_SEPARATOR = 14;

  public static final byte CONTROL = 15;

  public static final byte FORMAT = 16;

  public static final byte PRIVATE_USE = 18;

  public static final byte SURROGATE = 19;

  public static final byte DASH_PUNCTUATION = 20;

  public static final byte START_PUNCTUATION = 21;

  public static final byte END_PUNCTUATION = 22;

  public static final byte CONNECTOR_PUNCTUATION = 23;

  public static final byte OTHER_PUNCTUATION = 24;

  public static final byte MATH_SYMBOL = 25;

  public static final byte CURRENCY_SYMBOL = 26;

  public static final byte MODIFIER_SYMBOL = 27;

  public static final byte OTHER_SYMBOL = 28;

  public static final byte INITIAL_QUOTE_PUNCTUATION = 29;

  public static final byte FINAL_QUOTE_PUNCTUATION = 30;

  public static final byte DIRECTIONALITY_UNDEFINED = -1;

  public static final byte DIRECTIONALITY_LEFT_TO_RIGHT = 0;

  public static final byte DIRECTIONALITY_RIGHT_TO_LEFT = 1;

  public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC = 2;

  public static final byte DIRECTIONALITY_EUROPEAN_NUMBER = 3;

  public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR = 4;

  public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR = 5;

  public static final byte DIRECTIONALITY_ARABIC_NUMBER = 6;

  public static final byte DIRECTIONALITY_COMMON_NUMBER_SEPARATOR = 7;

  public static final byte DIRECTIONALITY_NONSPACING_MARK = 8;

  public static final byte DIRECTIONALITY_BOUNDARY_NEUTRAL = 9;

  public static final byte DIRECTIONALITY_PARAGRAPH_SEPARATOR = 10;

  public static final byte DIRECTIONALITY_SEGMENT_SEPARATOR = 11;

  public static final byte DIRECTIONALITY_WHITESPACE = 12;

  public static final byte DIRECTIONALITY_OTHER_NEUTRALS = 13;

  public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_EMBEDDING = 14;

  public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_OVERRIDE = 15;

  public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_EMBEDDING = 16;

  public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_OVERRIDE = 17;

  public static final byte DIRECTIONALITY_POP_DIRECTIONAL_FORMAT = 18;

  public static final char MIN_HIGH_SURROGATE = '\ud800';

  public static final char MAX_HIGH_SURROGATE = '\udbff';

  public static final char MIN_LOW_SURROGATE = '\udc00';

  public static final char MAX_LOW_SURROGATE = '\udfff';

  public static final char MIN_SURROGATE = '\ud800';

  public static final char MAX_SURROGATE = '\udfff';

  public static final int MIN_SUPPLEMENTARY_CODE_POINT = 65536;

  public static final int MIN_CODE_POINT = 0;

  public static final int MAX_CODE_POINT = 1114111;

  public static final int SIZE = 16;

  // Constructors

  public Character(char arg1){
  }
  // Methods

  public static boolean isJavaIdentifierStart(char arg1){
    return false;
  }
  public static boolean isJavaIdentifierStart(int arg1){
    return false;
  }
  public static boolean isJavaIdentifierPart(char arg1){
    return false;
  }
  public static boolean isJavaIdentifierPart(int arg1){
    return false;
  }
  public boolean equals(Object arg1){
    return false;
  }
  public String toString(){
    return (String) null;
  }
  public static String toString(char arg1){
    return (String) null;
  }
  public int hashCode(){
    return 0;
  }
  public static char reverseBytes(char arg1){
    return '\u0000';
  }
  public int compareTo(Character arg1){
    return 0;
  }
  public char charValue(){
    return '\u0000';
  }
  public static Character valueOf(char arg1){
    return (Character) null;
  }
  public static String getName(int arg1){
    return (String) null;
  }
  public static int charCount(int arg1){
    return 0;
  }
  public static int codePointAt(CharSequence arg1, int arg2){
    return 0;
  }
  public static int codePointAt(char [] arg1, int arg2){
    return 0;
  }
  public static int codePointAt(char [] arg1, int arg2, int arg3){
    return 0;
  }
  public static int codePointBefore(CharSequence arg1, int arg2){
    return 0;
  }
  public static int codePointBefore(char [] arg1, int arg2){
    return 0;
  }
  public static int codePointBefore(char [] arg1, int arg2, int arg3){
    return 0;
  }
  public static int codePointCount(CharSequence arg1, int arg2, int arg3){
    return 0;
  }
  public static int codePointCount(char [] arg1, int arg2, int arg3){
    return 0;
  }
  public static int compare(char arg1, char arg2){
    return 0;
  }
  public static int offsetByCodePoints(CharSequence arg1, int arg2, int arg3){
    return 0;
  }
  public static int offsetByCodePoints(char [] arg1, int arg2, int arg3, int arg4, int arg5){
    return 0;
  }
  public static int toChars(int arg1, char [] arg2, int arg3){
    return 0;
  }
  public static char [] toChars(int arg1){
    return (char []) null;
  }
  public static char toLowerCase(char arg1){
    return '\u0000';
  }
  public static int toLowerCase(int arg1){
    return 0;
  }
  public static char toUpperCase(char arg1){
    return '\u0000';
  }
  public static int toUpperCase(int arg1){
    return 0;
  }
  public static int getType(char arg1){
    return 0;
  }
  public static int getType(int arg1){
    return 0;
  }
  public static boolean isHighSurrogate(char arg1){
    return false;
  }
  public static boolean isLowSurrogate(char arg1){
    return false;
  }
  public static boolean isValidCodePoint(int arg1){
    return false;
  }
  public static int digit(char arg1, int arg2){
    return 0;
  }
  public static int digit(int arg1, int arg2){
    return 0;
  }
  public static char forDigit(int arg1, int arg2){
    return '\u0000';
  }
  public static byte getDirectionality(char arg1){
    return (byte) 0;
  }
  public static byte getDirectionality(int arg1){
    return (byte) 0;
  }
  public static int getNumericValue(char arg1){
    return 0;
  }
  public static int getNumericValue(int arg1){
    return 0;
  }
  public static boolean isDefined(char arg1){
    return false;
  }
  public static boolean isDefined(int arg1){
    return false;
  }
  public static boolean isDigit(char arg1){
    return false;
  }
  public static boolean isDigit(int arg1){
    return false;
  }
  public static boolean isISOControl(char arg1){
    return false;
  }
  public static boolean isISOControl(int arg1){
    return false;
  }
  public static boolean isIdentifierIgnorable(char arg1){
    return false;
  }
  public static boolean isIdentifierIgnorable(int arg1){
    return false;
  }
  public static boolean isJavaLetter(char arg1){
    return false;
  }
  public static boolean isJavaLetterOrDigit(char arg1){
    return false;
  }
  public static boolean isLetter(char arg1){
    return false;
  }
  public static boolean isLetter(int arg1){
    return false;
  }
  public static boolean isLetterOrDigit(char arg1){
    return false;
  }
  public static boolean isLetterOrDigit(int arg1){
    return false;
  }
  public static boolean isLowerCase(char arg1){
    return false;
  }
  public static boolean isLowerCase(int arg1){
    return false;
  }
  public static boolean isMirrored(char arg1){
    return false;
  }
  public static boolean isMirrored(int arg1){
    return false;
  }
  public static boolean isSpace(char arg1){
    return false;
  }
  public static boolean isSpaceChar(char arg1){
    return false;
  }
  public static boolean isSpaceChar(int arg1){
    return false;
  }
  public static boolean isSupplementaryCodePoint(int arg1){
    return false;
  }
  public static boolean isSurrogatePair(char arg1, char arg2){
    return false;
  }
  public static boolean isTitleCase(char arg1){
    return false;
  }
  public static boolean isTitleCase(int arg1){
    return false;
  }
  public static boolean isUnicodeIdentifierPart(char arg1){
    return false;
  }
  public static boolean isUnicodeIdentifierPart(int arg1){
    return false;
  }
  public static boolean isUnicodeIdentifierStart(char arg1){
    return false;
  }
  public static boolean isUnicodeIdentifierStart(int arg1){
    return false;
  }
  public static boolean isUpperCase(char arg1){
    return false;
  }
  public static boolean isUpperCase(int arg1){
    return false;
  }
  public static boolean isWhitespace(char arg1){
    return false;
  }
  public static boolean isWhitespace(int arg1){
    return false;
  }
  public static int toCodePoint(char arg1, char arg2){
    return 0;
  }
  public static char toTitleCase(char arg1){
    return '\u0000';
  }
  public static int toTitleCase(int arg1){
    return 0;
  }
  public static boolean isSurrogate(char arg1){
    return false;
  }
  public static char highSurrogate(int arg1){
    return '\u0000';
  }
  public static char lowSurrogate(int arg1){
    return '\u0000';
  }
  public static boolean isBmpCodePoint(int arg1){
    return false;
  }
}
