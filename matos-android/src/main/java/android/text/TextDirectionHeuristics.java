package android.text;

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


public class TextDirectionHeuristics
{
  // Classes

  public abstract static class TextDirectionHeuristicImpl
    implements TextDirectionHeuristic
  {
    // Constructors

    public TextDirectionHeuristicImpl(TextDirectionHeuristics.TextDirectionAlgorithm arg1){
    }
    // Methods

    protected abstract boolean defaultIsRtl();
    public boolean isRtl(char [] arg1, int arg2, int arg3){
      return false;
    }
  }
  public static interface TextDirectionAlgorithm
  {
  }
  public static class FirstStrong
    implements TextDirectionHeuristics.TextDirectionAlgorithm
  {
    // Fields

    public static final TextDirectionHeuristics.FirstStrong INSTANCE = null;

    // Constructors

    private FirstStrong(){
    }
  }
  public static class AnyStrong
    implements TextDirectionHeuristics.TextDirectionAlgorithm
  {
    // Fields

    public static final TextDirectionHeuristics.AnyStrong INSTANCE_RTL = null;

    public static final TextDirectionHeuristics.AnyStrong INSTANCE_LTR = null;

    // Constructors

    private AnyStrong(boolean arg1){
    }
  }
  public static class TextDirectionHeuristicLocale
    extends TextDirectionHeuristics.TextDirectionHeuristicImpl  {
    // Fields

    public static final TextDirectionHeuristics.TextDirectionHeuristicLocale INSTANCE = null;

    // Constructors

    public TextDirectionHeuristicLocale(){
      super((TextDirectionHeuristics.TextDirectionAlgorithm) null);
    }
    // Methods

    protected boolean defaultIsRtl(){
      return false;
    }
  }
  // Fields

  public static final TextDirectionHeuristic LTR = null;

  public static final TextDirectionHeuristic RTL = null;

  public static final TextDirectionHeuristic FIRSTSTRONG_LTR = null;

  public static final TextDirectionHeuristic FIRSTSTRONG_RTL = null;

  public static final TextDirectionHeuristic ANYRTL_LTR = null;

  public static final TextDirectionHeuristic LOCALE = null;

  // Constructors

  public TextDirectionHeuristics(){
  }
}
