/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 19:40:47 GMT 2019
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OOPExample_ESTest extends OOPExample_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = OOPExample.ifPositive(0);
      assertEquals("Non-positive", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OOPExample oOPExample0 = new OOPExample(0, (-1610), (-2479));
      OOPExample.InnerClass oOPExample_InnerClass0 = oOPExample0.new InnerClass((-1610));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = OOPExample.ifPositive(709);
      assertEquals("Positive", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = OOPExample.ifPositive((-1935));
      assertEquals("Non-positive", string0);
  }
}
