package java.util.jar;

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


public abstract class Pack200
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.Pack200packerImpl", superClass = "")
  public static interface Packer
  {
    // Fields

    public static final java.lang.String CLASS_ATTRIBUTE_PFX = "pack.class.attribute.";

    public static final java.lang.String CODE_ATTRIBUTE_PFX = "pack.code.attribute.";

    public static final java.lang.String DEFLATE_HINT = "pack.deflate.hint";

    public static final java.lang.String EFFORT = "pack.effort";

    public static final java.lang.String ERROR = "error";

    public static final java.lang.String FALSE = "false";

    public static final java.lang.String FIELD_ATTRIBUTE_PFX = "pack.field.attribute.";

    public static final java.lang.String KEEP = "keep";

    public static final java.lang.String KEEP_FILE_ORDER = "pack.keep.file.order";

    public static final java.lang.String LATEST = "latest";

    public static final java.lang.String METHOD_ATTRIBUTE_PFX = "pack.method.attribute.";

    public static final java.lang.String MODIFICATION_TIME = "pack.modification.time";

    public static final java.lang.String PASS = "pass";

    public static final java.lang.String PASS_FILE_PFX = "pack.pass.file.";

    public static final java.lang.String PROGRESS = "pack.progress";

    public static final java.lang.String SEGMENT_LIMIT = "pack.segment.limit";

    public static final java.lang.String STRIP = "strip";

    public static final java.lang.String TRUE = "true";

    public static final java.lang.String UNKNOWN_ATTRIBUTE = "pack.unknown.attribute";

    // Methods

    public java.util.SortedMap<java.lang.String, java.lang.String> properties();
    public void pack(JarFile arg1, java.io.OutputStream arg2) throws java.io.IOException;
    public void pack(JarInputStream arg1, java.io.OutputStream arg2) throws java.io.IOException;
    public void addPropertyChangeListener(java.beans.PropertyChangeListener arg1);
    public void removePropertyChangeListener(java.beans.PropertyChangeListener arg1);
  }
  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.Pack200UnpackerImpl", superClass = "")
  public static interface Unpacker
  {
    // Fields

    public static final java.lang.String DEFLATE_HINT = "unpack.deflate.hint";

    public static final java.lang.String FALSE = "false";

    public static final java.lang.String KEEP = "keep";

    public static final java.lang.String PROGRESS = "unpack.progress";

    public static final java.lang.String TRUE = "true";

    // Methods

    public java.util.SortedMap<java.lang.String, java.lang.String> properties();
    public void addPropertyChangeListener(java.beans.PropertyChangeListener arg1);
    public void removePropertyChangeListener(java.beans.PropertyChangeListener arg1);
    public void unpack(java.io.InputStream arg1, JarOutputStream arg2) throws java.io.IOException;
    public void unpack(java.io.File arg1, JarOutputStream arg2) throws java.io.IOException;
  }
  // Constructors

  private Pack200(){
  }
  // Methods

  public static Pack200.Packer newPacker(){
    return (Pack200.Packer) null;
  }
  public static Pack200.Unpacker newUnpacker(){
    return (Pack200.Unpacker) null;
  }
}
