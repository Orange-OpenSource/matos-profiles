package dalvik.system;

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

import com.francetelecom.rd.stubs.annotation.Code;

@Code("private static BlockGuard.Policy mThreadPolicy;")
public final class BlockGuard
{
  // Classes

  @com.francetelecom.rd.stubs.annotation.Real(value = "com.francetelecom.rd.fakeandroid.BlockGuardPolicyImplem", superClass = "")
  public static interface Policy
  {
    // Methods

	@com.francetelecom.rd.stubs.annotation.CallBack("policy")
    public void onNetwork();
	@com.francetelecom.rd.stubs.annotation.CallBack("policy")
    public void onWriteToDisk();
	@com.francetelecom.rd.stubs.annotation.CallBack("policy")
    public void onReadFromDisk();
	@com.francetelecom.rd.stubs.annotation.CallBack("policy")
    public int getPolicyMask();
  }
  public static class BlockGuardPolicyException
    extends java.lang.RuntimeException  {
    // Constructors

    public BlockGuardPolicyException(int arg1, int arg2){
      super();
    }
    public BlockGuardPolicyException(int arg1, int arg2, java.lang.String arg3){
      super();
    }
    // Methods

    public java.lang.String getMessage(){
      return (java.lang.String) null;
    }
    public int getPolicy(){
      return 0;
    }
    public int getPolicyViolation(){
      return 0;
    }
  }
  // Fields

  public static final int DISALLOW_DISK_WRITE = 1;

  public static final int DISALLOW_DISK_READ = 2;

  public static final int DISALLOW_NETWORK = 4;

  public static final int PASS_RESTRICTIONS_VIA_RPC = 8;

  public static final int PENALTY_LOG = 16;

  public static final int PENALTY_DIALOG = 32;

  public static final int PENALTY_DEATH = 64;

  public static final BlockGuard.Policy LAX_POLICY = null;

  // Constructors

  private BlockGuard(){
  }
  // Methods

  @com.francetelecom.rd.stubs.annotation.FieldGet("mThreadPolicy")
  public static BlockGuard.Policy getThreadPolicy(){
    return (BlockGuard.Policy) null;
  }
  public static void setThreadPolicy(@com.francetelecom.rd.stubs.annotation.FieldSet("mThreadPolicy") @com.francetelecom.rd.stubs.annotation.CallBackRegister("policy") BlockGuard.Policy arg1){
  }
}
