package android.renderscript;

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


public class FileA3D
  extends BaseObj{
  // Classes

  public static enum EntryType
  {
    // Enum Constants

    UNKNOWN(0)
, MESH(0)
;
    // Fields

    // Constructors

    private EntryType(int arg1){
    }
    // Methods

  }
  public static class IndexEntry
  {
    // Constructors

    IndexEntry(RenderScript arg1, int arg2, int arg3, java.lang.String arg4, FileA3D.EntryType arg5){
    }
    // Methods

    public BaseObj getObject(){
      return (BaseObj) null;
    }
    public java.lang.String getName(){
      return (java.lang.String) null;
    }
    public FileA3D.EntryType getEntryType(){
      return (FileA3D.EntryType) null;
    }
    public Mesh getMesh(){
      return (Mesh) null;
    }
  }
  // Constructors

  FileA3D(int arg1, RenderScript arg2, java.io.InputStream arg3){
    super(0, (RenderScript) null);
  }
  // Methods

  public static FileA3D createFromResource(RenderScript arg1, android.content.res.Resources arg2, int arg3){
    return (FileA3D) null;
  }
  public int getIndexEntryCount(){
    return 0;
  }
  public FileA3D.IndexEntry getIndexEntry(int arg1){
    return (FileA3D.IndexEntry) null;
  }
  public static FileA3D createFromAsset(RenderScript arg1, android.content.res.AssetManager arg2, java.lang.String arg3){
    return (FileA3D) null;
  }
  public static FileA3D createFromFile(RenderScript arg1, java.lang.String arg2){
    return (FileA3D) null;
  }
  public static FileA3D createFromFile(RenderScript arg1, java.io.File arg2){
    return (FileA3D) null;
  }
}
