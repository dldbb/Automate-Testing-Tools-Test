/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 04:15:03 GMT 2019
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BreakContinueExample_ESTest extends BreakContinueExample_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BreakContinueExample breakContinueExample0 = new BreakContinueExample();
      int int0 = breakContinueExample0.operation(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BreakContinueExample breakContinueExample0 = new BreakContinueExample();
      int int0 = breakContinueExample0.operation(79);
      assertEquals(80, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BreakContinueExample breakContinueExample0 = new BreakContinueExample();
      int int0 = breakContinueExample0.operation(4728);
      assertEquals(100, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BreakContinueExample breakContinueExample0 = new BreakContinueExample();
      int int0 = breakContinueExample0.operation((-45));
      assertEquals((-100), int0);
  }
}
