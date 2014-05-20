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


@com.francetelecom.rd.stubs.annotation.ClassDone(0)
public class Script
  extends BaseObj{
  // Classes

  public static class Builder
  {
    // Constructors

    Builder(RenderScript arg1){
    }
  }
  public static class FieldBase
  {
    // Fields

    protected Element mElement;

    protected Allocation mAllocation;

    // Constructors

    protected FieldBase(){
    }
    // Methods

    protected void init(RenderScript arg1, int arg2){
    }
    protected void init(RenderScript arg1, int arg2, int arg3){
    }
    public Type getType(){
      return (Type) null;
    }
    public Element getElement(){
      return (Element) null;
    }
    public Allocation getAllocation(){
      return (Allocation) null;
    }
    public void updateAllocation(){
    }
  }
  // Constructors

  Script(int arg1, RenderScript arg2){
    super(0, (RenderScript) null);
  }
  // Methods

  protected void invoke(int arg1){
  }
  protected void invoke(int arg1, FieldPacker arg2){
  }
  public void setTimeZone(java.lang.String arg1){
  }
  protected void forEach(int arg1, Allocation arg2, Allocation arg3, FieldPacker arg4){
  }
  public void bindAllocation(Allocation arg1, int arg2){
  }
  public void setVar(int arg1, float arg2){
  }
  public void setVar(int arg1, double arg2){
  }
  public void setVar(int arg1, int arg2){
  }
  public void setVar(int arg1, long arg2){
  }
  public void setVar(int arg1, boolean arg2){
  }
  public void setVar(int arg1, BaseObj arg2){
  }
  public void setVar(int arg1, FieldPacker arg2){
  }
}
